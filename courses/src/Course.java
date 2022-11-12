import java.util.*;
public class Course<T> {
	private String courseName;
    private T[] students;
    private int numberOfStudents;

    public String getCourseName() { return courseName; }
    public T[] getStudents() { return students; }
    public int getNumberOfStudents() { return numberOfStudents; }

    public Course(String courseName) {
		this.courseName = courseName;
        numberOfStudents = 0;
		students = new T[0];
    }

    public void addStudent(T student) {
        numberOfStudents++;
		ArrayList<T> studs = new ArrayList<T>(Arrays.asList(students));
		studs.add(student);
        students = new T[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) students[i] = studs.get(i);
    }
    public void dropStudent(T student) {
		numberOfStudents--;
		ArrayList<T> studs = new ArrayList<T>(Arrays.asList(students));
		studs.remove(student);
		students = new T[numberOfStudents];
		for (int i = 0; i < numberOfStudents; i++) students[i] = studs.get(i);
	}

	public void addStudent(String... students) { for (String student : students) addStudent(student); }
	public void dropStudent(String... students) { for (String student : students) dropStudent(student); }

	public void clear() {
		students = new T[0];
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