package ua.meta.atipikin;

import java.io.Serializable;

public class Student implements Serializable {
	private String name;
	private String lastName;
	private int id;
	private String groupName;
	public Student() {}
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", lastName=" + lastName + ", id=" + id + ", groupName=" + groupName + "]";
	}	
}