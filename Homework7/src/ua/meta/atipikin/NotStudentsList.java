package ua.meta.atipikin;

public class NotStudentsList { // клас, який замінює чорний список
	private static Class[] arr = new Class[10];
	
	public static Class[] getArr() {
		return arr;
	}
	public static void addArr(Class cl) {
		int i = 0;
		while(arr[i] != null) {
			i += 1;
		}
		arr[i] = cl;
	}
}