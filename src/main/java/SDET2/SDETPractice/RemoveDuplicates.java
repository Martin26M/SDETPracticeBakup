package SDET2.SDETPractice;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 4, 4, 5, 6 };

		HashSet<Integer> sets = new HashSet<Integer>();

		for (Integer res : arr) {

			sets.add(res);

		}

		Iterator<Integer> it = sets.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}
	}

}
