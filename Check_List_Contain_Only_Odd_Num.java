import java.util.ArrayList;
import java.util.List;

public class Check_List_Contain_Only_Odd_Num {
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(11);
		lst.add(23);
		lst.add(35);
		lst.add(44);

		for (int i : lst) {
			if (i % 2 == 0) {
				System.out.println("False");
				return;
			}
		}
		System.out.println("True");

	}

}
