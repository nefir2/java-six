public class shkalyar extends Student {
	private String group;
	public shkalyar() {
		super();
		group = null;
	}
	public shkalyar(String name, String surname, Integer age, Integer grade, String group) {
		super(name, surname, age, grade);
		this.group = group;
	}

	@Override
	public String toString() {
		return super.toString() + ". группа: " + (group == null ? "-" : group);
	}
}
