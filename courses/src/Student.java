public class Student {
	private String name;
	private String surname;
	private String group;
	private Integer grade;

	public String getName() { return name; }
	public String getSurname() { return surname; }
	public String getGroup() { return group; }
	public Integer getGrade() { return grade; }
	public void setName(String name) { this.name = name; }
	public void setSurname(String surname) { this.surname = surname; }
	public void setGroup(String group) { this.group = group; }
	public void setGrade(Integer grade) { this.grade = grade < 1 ? 1 : grade; }

	public Student(String name, String surname, String group, Integer grade) {
		this.name = name;
		this.surname = surname;
		this.group = group;
		this.grade = grade;
	}
	public Student() {
		name = null;
		surname = null;
		group = null;
		grade = null;
	}

	@Override
	public String toString() {
		return
			(name == null ? "-" : name) +
			" " +
			(surname == null ? "-" : surname) +
			". группа: " +
			(group == null ? "-" : group) +
			". курс: " +
			(grade == null ? "-" : grade); //\n
	}
}