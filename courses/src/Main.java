public class Main {
    public static void main(String[] args) {
        Class x = new Student().getClass();
        Course<Student> course = new Course<Student>("\"основы программирования\"", x);

        Student first = new Student("какой-та", "нн", "16", 3);
        Student second = new Student("нн", null, null, null);
        Student third = new Student("очередной", "нн", "135", 1);

        course.addStudent(first, second, third); //"какой-та нн", "какой-та второй нн", "очередной нн"

        course.dropStudent(); //"какой-та второй нн"

        System.out.println(course);
    }
}