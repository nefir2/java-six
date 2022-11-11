public class Main {
    public static void main(String[] args) {
        Course course = new Course("\"основы программирования\"");
        course.addStudent("какой-та нн", "какой-та второй нн", "очередной нн");
        course.dropStudent("какой-та второй нн");
        System.out.println(course);
    }
}