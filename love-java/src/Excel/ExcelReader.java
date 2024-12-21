package Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static HashMap<String, String> readData(String site) {
		HashMap<String, String> resultMap = new HashMap<>();

		try (FileInputStream fis = new FileInputStream("srcs/test/resoucres/test.xlsx");
				Workbook workbook = new XSSFWorkbook(fis)) {

			Sheet sheet = workbook.getSheetAt(0);
			Row headerRow = sheet.getRow(0);
//			System.out.println(headerRow);
			for (int i = 0; i < sheet.getLastRowNum(); i++) {
				Row row = sheet.getRow(i);
				if (row != null) {
					String currentSite = getCellValue(row.getCell(0));
					if (currentSite.equals(site)) {
						for (int j = 0; j < headerRow.getLastCellNum(); j++) {
							String key = getCellValue(headerRow.getCell(j));
							String value = getCellValue(row.getCell(j));

							resultMap.put(key, value);
						}
					}
				}
			}

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return resultMap;
	}

	private static String getCellValue(Cell cell) {

		if (cell == null) {
			return "";
		}

		switch (cell.getCellType()) {
		case STRING:
			return cell.getStringCellValue();
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				return new DataFormatter().formatCellValue(cell);
			} else {
				if (cell.getNumericCellValue() == Math.floor(cell.getNumericCellValue())) {
					return String.valueOf((int) cell.getNumericCellValue());
				}
				return String.valueOf(cell.getNumericCellValue());
			}
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());

		default:
			return "";
		}

	}
}
