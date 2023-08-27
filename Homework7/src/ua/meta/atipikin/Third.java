package ua.meta.atipikin;

public class Third {

	public static void main(String[] args) {
		Child tipikinaVeronika = new Child("Tipikina", "Veronika", 11);
		NotStudentsList.addArr(tipikinaVeronika.getClass()); //  дітей не можна включати в список студентів
		
		Student tipikin = new Student(); // створення студента
		tipikin.setName("Oleksandr");
		tipikin.setLastName("Tipikin");
		tipikin.setId(7217);
		
		Student nikolaev = new Student();
		nikolaev.setName("Ivan");
		nikolaev.setLastName("Nikolaev");
		nikolaev.setId(7227);
		
		Container em72 = new Container(); // створення групи (у якій я навчався в КПІ)
		em72.addObj(tipikin);
		System.out.println(em72.getObj()[0]);
	}
}