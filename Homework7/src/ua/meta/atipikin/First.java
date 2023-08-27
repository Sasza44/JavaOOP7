package ua.meta.atipikin;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class First {

	public static void main(String[] args) throws ClassNotFoundException { // Класи "Student" та "Group" узяті зі змінами з 3-го завдання
		Student tipikin = new Student(); // створення студента
		tipikin.setName("Oleksandr");
		tipikin.setLastName("Tipikin");
		tipikin.setId(7217);
		Student nikolaev = new Student();
		nikolaev.setName("Ivan");
		nikolaev.setLastName("Nikolaev");
		nikolaev.setId(7227);
		Student melnikov = new Student();
		melnikov.setName("Evgen");
		melnikov.setLastName("Melnikov");
		melnikov.setId(7226);
		
		Group em72 = new Group(); // створення групи (у якій я навчався в КПІ)
		em72.setGroupName("EM-72");
		em72.addStudent(tipikin); // додавання студента в групу
		em72.addStudent(melnikov);
		em72.addStudent(nikolaev);
//		System.out.println(em72);
		serializeOut(em72, "1.txt");
		Group em72Copy = null;
		em72Copy = serializeIn(em72Copy, "1.txt");
		System.out.println(em72Copy);
	}
	
	public static void serializeOut (Group group, String fileName) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			oos.writeObject(group);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Group serializeIn (Group group, String fileName) throws ClassNotFoundException {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			group = (Group) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return group;
	}
}