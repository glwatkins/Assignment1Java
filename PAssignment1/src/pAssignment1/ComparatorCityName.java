package pAssignment1;

import java.util.Comparator;

public class ComparatorCityName  implements Comparator<Celebrant>{
//comparator, meant to order the data, not positive if it works correctly
		@Override
		public int compare(Celebrant m1, Celebrant m2) {
								
						return(m1.getAge() - m2.getAge());					
							
		}
	}

