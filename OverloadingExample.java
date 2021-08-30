public class OverloadingExample {
	
	public static void student(int id) {
		System.out.println(id);
	}
	static void student(String name) {
		System.out.println(name);
	}
	static void student(Object o) {
		System.out.println("Object" + o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student(10);
		student("Suraj");
		Object object = new String("ABC");
		student(object);
	}

}
