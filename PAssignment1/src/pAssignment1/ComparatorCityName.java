package pAssignment1;

import java.util.Comparator;

public class ComparatorCityName  implements Comparator<Celebrant>{
//comparator, meant to order the data, not positive if it works correctly
		public int compare(Celebrant m1, Celebrant m2) {
			if (m1.getResadentualcity().equals(m2.getResadentualcity())){
				if(m1.getLname().equals(m2.getLname())) {
					if(m1.getFname().equals(m2.getFname())) {					
						return(m1.getAge() - m2.getAge());					
					}
					else {
						return m1.getFname().compareTo(m2.getFname());
					}
				}
				else {
					return m1.getLname().compareTo(m2.getLname());
				}			
			}
			else {
				return m1.getResadentualcity().compareTo(m2.getResadentualcity());
			}		
		}
	}

