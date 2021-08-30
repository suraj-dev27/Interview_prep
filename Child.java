import java.util.ArrayList;

class Parent {
	int i = 10;
	
	//public void setInt()
	
	public void car(String model) {
		System.out.println(model);
	}
}

class Child extends Parent{
	
	int i = 20;
	
	
	public void car(String model) {
		model = "Honda City";
		System.out.println(model);
	}
	
	public static void main(String[] args) {
		
		//int i = 1l;
		//int j = 0;
		//j += 1l;
		
		Parent parent = new Parent();
		parent.car("honda Accord");
		Child childEg = new Child();
		childEg.car("honda Accord");
		System.out.println(childEg.i);
		
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<= 10; i++) {
			list.add(i+10);
		}
		list.remove(4);
		
		
		
	}
}
