public class Main {
	public static void main(String[] args) {
		Course course = new Course("\"основы программирования\"");

		Student first = new shkalyar("какой-та", "нн", 16, 3, null);
		Student second = new shkalyar("нн", null, null, null, null);
		Student third = new shkalyar("очередной", "нн", 135, 1, null);

		course.addStudent(first, second, third); //"какой-та нн", "какой-та второй нн", "очередной нн"

		course.dropStudent(second); //"какой-та второй нн"

		System.out.println(course);
	}
}