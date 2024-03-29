package section14_Generics_Set_Map.model.service;

import java.util.List;

public class CalculationService {

	public static <S extends Comparable<? super S>> S max(List<S> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		
		S max = list.get(0);
		for (S item : list) {
			
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
