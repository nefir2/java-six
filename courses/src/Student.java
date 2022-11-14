abstract public class Student {
	private String name;
	private String surname;
	private Integer age;
	private Integer grade;

	public String getName()     { return name;    }
	public String getSurname()  { return surname; }
	public Integer getAge()     { return age;     }
	public Integer getGrade()   { return grade;   }

	public Student() {
	    name = null;
	    surname = null;
	    age = null;
	    grade = null;
	}

	public Student(String name, String surname, Integer age, Integer grade) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return
			(name == null ? "-" : name) +
			" " +
			(surname == null ? "-" : surname) +
			". возраст: " +
			(age == null ? "-" : age) +
			". курс: " +
			(grade == null ? "-" : grade);
	}
}