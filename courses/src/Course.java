//import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public String getCourseName() { return courseName; }
    public String[] getStudents() { return students; }
    public int getNumberOfStudents() { return numberOfStudents; }

    public Course(String courseName) {
        numberOfStudents = 0;
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        numberOfStudents++;
        students = new String[numberOfStudents];
        List<String> studs = new ArrayList<String>(Arrays.asList(students));
        studs.add(student);
        students = studs.toArray();
    }
    public void dropStudent(String student) { }
}
