package convertexcelcsv;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.File;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.tika.Tika;

public class ConvertExcelToCsv {

	public static void main(String[] args) {
		// String excelFilePath = args[0];
		// String textFilePath = args[1];
		// String excelFilePath =
		// "C:/D_Cube/06.CARA/IMDG2_Parse_pop3/Debug/File/Parse/2023-11-08/kkc.coastal@carrierorchestra.com_1(kkc.coastal20231113112247_1)_1.xlsx";
		// String textFilePath =
		// "C:/D_Cube/06.CARA/IMDG2_Parse_pop3/Debug/File/Parse/2023-11-08/kkc.coastal@carrierorchestra.com_1(kkc.coastal20231113112247_1)_1.csv";

		String excelFilePath = "D:/Learn-java/kkc.coastal@carrierorchestra.com_1(kkc.coastal20240219211314_1)_1.xls";
		String textFilePath = "D:/Learn-java/kkc.coastal@carrierorchestra.com_1(kkc.coastal20240219211314_1)_1.csv";

		String extension = excelFilePath.substring(excelFilePath.lastIndexOf(".") + 1);
		Workbook workbook = null;

		if (extension.equalsIgnoreCase("xls") || extension.equalsIgnoreCase("xlsx")) {
			try {
				FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
				Tika tika = new Tika();
				String fileType = tika.detect(excelFilePath);
				FileWriter writer = new FileWriter(textFilePath);

				if (fileType.equalsIgnoreCase("application/vnd.ms-excel")) { // xls
					workbook = new HSSFWorkbook(inputStream);
				} else if (fileType
						.equalsIgnoreCase("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) { // xlsx
					workbook = new XSSFWorkbook(inputStream);
				} else {
					System.out.println("Unsupported file type: " + fileType);
					return;
				}

				FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
				evaluator.clearAllCachedResultValues(); // Clear any existing cached results

				for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
					Sheet sheet = workbook.getSheetAt(i);
					evaluator.evaluateAll(); // Force recalculation of all formulas
					writeExcelFile(sheet, writer, evaluator);
				}
				writer.close();
				inputStream.close();
				System.out.println("Convert Excel To Csv Successfully!");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Convert Excel To Csv Fail!");
			}
		} else {
			System.out.println("This file is not an Excel file.");
		}
	}

	public static void writeExcelFile(Sheet sheet, FileWriter writer, FormulaEvaluator evaluator) {
		SimpleDateFormat outputDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		DataFormatter dataFormatter = new DataFormatter();
		try {
			for (Row row : sheet) {
				for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
					Cell cell = row.getCell(i);
					// for (Cell cell : row.getPhysicalNumberOfCells()) {
					if (null != cell) {
						CellType cellType = cell.getCellTypeEnum();
						CellValue cellValue = evaluator.evaluate(cell);
						double numericValue;
						switch (cellType) {
						case STRING:
							String stringValue = cell.getStringCellValue();
							if ("KOTA LIMA".equals(stringValue)) {
								System.out.println("trung");
							}
							writer.write(convertToEnglish(stringValue) + ",");
							break;
						case NUMERIC:
							if (DateUtil.isCellDateFormatted(cell)) {
								Date date = cell.getDateCellValue();
								String formattedDate = outputDateFormat.format(date);
								writer.write(formattedDate + ",");
							} else {
								if (cell.getCellTypeEnum() == CellType.FORMULA) {
									numericValue = cellValue.getNumberValue();
								} else {
									numericValue = cell.getNumericCellValue();
								}
								String formattedNumericValue = dataFormatter.formatCellValue(cell);
								writer.write(formattedNumericValue + ",");
							}
							break;
						case FORMULA:
							if (cell.getCellTypeEnum() == CellType.NUMERIC) {
								numericValue = cellValue.getNumberValue();
								String formattedNumericValue = dataFormatter.formatCellValue(cell);
								writer.write(formattedNumericValue + ",");
							} else if (DateUtil.isCellDateFormatted(cell)) {
								Date date = cell.getDateCellValue();
								String formattedDate = outputDateFormat.format(date);
								writer.write(formattedDate + ",");
							} else {
//								Date date = cell.getDateCellValue();
//								String formattedDate = outputDateFormat.format(date);
//								writer.write(formattedDate + ",");							
								if (cell.getCellTypeEnum() == CellType.FORMULA) {
									numericValue = cellValue.getNumberValue();
								} else {
									numericValue = cell.getNumericCellValue();
								}
								String formattedNumericValue = "=" + dataFormatter.formatCellValue(cell);
								writer.write(formattedNumericValue + ",");
							}
							break;
						case BOOLEAN:
							writer.write(cell.getBooleanCellValue() + ",");
							break;
						default:
							writer.write(",");
							break;
						}
					} else {
						writer.write(",");
					}
				}
				writer.write("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String convertToEnglish(String chineseText) {
		if (chineseText.contains("周") && chineseText.contains("班期")) {
			return chineseText.replace("周", "WEEK ").replace("班期", " SERVICE");
		} else if (chineseText.contains("月份船期表")) {
			return chineseText.replace("月份船期表", "MONTHLY SHIPPING SCHEDULE");
		}
		return chineseText;
	}
}
