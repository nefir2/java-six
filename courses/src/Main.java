public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("\"основы программирования\"");
        Course course2 = new Course("\"объектно-ориентированное программирование\"");

        course1.addStudent("Петр Иванович Н.");
        course1.addStudent("Борис Сергеевич П.");
        course1.addStudent("Анна Дмитриевна К.");
        course2.addStudent("Петр Иванович Н.");
        course2.addStudent("Анна Сергеевна Д.");
        System.out.printf("Количество студентов по дисциплине\n%s: %d\n", course1.getCourseName(), course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");

        System.out.println();
        System.out.print("Количество студентов по дисциплине\n" + course2.getCourseName() + ": " + course2.getNumberOfStudents());
    }
}