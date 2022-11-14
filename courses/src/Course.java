import java.util.*;
public class Course {
	private String courseName;
	private Student[] students;
	private int numberOfStudents;

	public String getCourseName() { return courseName; }
	public Student[] getStudents() { return students; }
	public int getNumberOfStudents() { return numberOfStudents; }

	public Course(String courseName) {
		numberOfStudents = 0;
		this.courseName = courseName;
		students = new Student[0];
	}

	public void addStudent(Student student) {
		numberOfStudents++;
		ArrayList<Student> studs = new ArrayList<Student>(Arrays.asList(students));
		studs.add(student);
		students = new Student[numberOfStudents];
		for (int i = 0; i < numberOfStudents; i++) students[i] = studs.get(i);
    }
	public void dropStudent(Student student) {
		numberOfStudents--;
		ArrayList<Student> studs = new ArrayList<Student>(Arrays.asList(students));
		studs.remove(student);
		students = new Student[numberOfStudents];
		for (int i = 0; i < numberOfStudents; i++) students[i] = studs.get(i);
	}

	public void addStudent(Student... students) { for (Student student : students) addStudent(student); }
	public void dropStudent(Student... students) { for (Student student : students) dropStudent(student); }

	public void clear() {
		students = new Student[0];
		numberOfStudents = 0;
	}

	//вывод элементов массива, и установка запятых, после каждого элемента. в конце массива устанавливается точка.
	public void showStudents() { for (int i = 0; i < numberOfStudents; i++) System.out.print(students[i] + (i == numberOfStudents - 1 ? ".\n" : ", ")); }

	@Override
	public String toString() {
		String ret = "Количество студентов по дисциплине " + courseName + ": " + numberOfStudents;
		ret = ret.concat("\nстуденты на курсе: ");
		for (int i = 0; i < numberOfStudents; i++) ret = ret.concat(students[i] + (i == numberOfStudents - 1 ? ".\n" : ", "));
		return ret;
	}
}