package ua.meta.atipikin;

public class Container {
	private Object[] obj = new Object[10];

	public Container() {
		super();
	}
	public Object[] getObj() {
		return obj;
	}

	public void addObj(Object object) { // додавання об'єкту до списку
		boolean let1 = true;
		int i = 0;
		while(obj[i] != null) {
			i += 1;
		}
		for(Class e: NotStudentsList.getArr()) {
			if(object == e) {
				System.out.println("The object's class is prohibited");
				let1 = false;
			}
		}
		if(let1 = true) {
			obj[i] = object;
		}
	}
	
	public Object takeLastObj() { // отримання останнього об'єкту зі списку
		int i = 0;
		while(obj[i] != null) {
		i += 1;
		}
		Object x = obj[i - 1];
		obj[i - 1] = null;
		return x;
	}
	
	public Object copyLastObj() { // копіювання останнього об'єкту зі списку
		int i = 0;
		while(obj[i] != null) {
		i += 1;
		}
		return obj[i - 1];
	}
}