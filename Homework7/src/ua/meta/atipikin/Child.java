package ua.meta.atipikin;

public class Child {
	private String lastName;
	private String name;
	private int age;
	public Child(String lastName, String name, int age) {
		super();
		this.lastName = lastName;
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Child [lastName=" + lastName + ", name=" + name + ", age=" + age + "]";
	}
}