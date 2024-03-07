package Array_List_ArrayList;

public class Student {
	String name = null;
	String id = null;
	int age;
	String email = null;
	String gender = null;
	String addr = null;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String id, int age, String email, String gender, String addr) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.email = email;
		this.gender = gender;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + ", email=" + email + ", gender=" + gender
				+ ", addr=" + addr + "]";
	}

	public void showInfo() {
		System.out.println(toString());
	}
}
