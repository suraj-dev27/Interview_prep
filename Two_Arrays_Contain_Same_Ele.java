import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Two_Arrays_Contain_Same_Ele {

	public static void main(String[] args) {
		Integer[] a1 = { 12, 15, 34, 46, 52, 60 };
		Integer[] a2 = { 13, 25, 35, 47, 53, 70 };
		System.out.println(sameElements(a1, a2));
	}

	static boolean sameElements(Object[] a1, Object[] a2) {
		Set<Object> uniqueSet1 = new HashSet<Object>(Arrays.asList(a1));
		Set<Object> uniqueSet2 = new HashSet<Object>(Arrays.asList(a2));

		if (uniqueSet1.size() != uniqueSet2.size()) {
			return false;
		}

		for (Object obj : uniqueSet1) {
			if (uniqueSet2.contains(obj)) {
				return true;
			}
		}
		return false;
	}
}
