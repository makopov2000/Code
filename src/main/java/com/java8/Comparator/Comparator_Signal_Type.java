package com.java8.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang3.builder.CompareToBuilder;



public class Comparator_Signal_Type {
	private int				sortIndex;
	private String			name;
	private String			signalRole;
	private String			signalGroupType;
	
	

	public Comparator_Signal_Type(int sortIndex, String name, String signalRole, String signalGroupType) {
		super();
		this.sortIndex = sortIndex;
		this.name = name;
		this.signalRole = signalRole;
		this.signalGroupType = signalGroupType;
	}
	public String getName() {return name;}
	public String getSignalRole() {	return signalRole;	}
	public String getSignalGroupType() {return signalGroupType;	}

	@Override
	public String toString() {
		return "ComparatorSignalType [sortIndex=" + sortIndex + ", name=" + name + ", signalRole=" + signalRole
				+ ", signalGroupType=" + signalGroupType + "]";
	}

	public static void main(String[] args) {
		List<Comparator_Signal_Type> VALUES = new ArrayList<Comparator_Signal_Type>();
		VALUES.add(new Comparator_Signal_Type(2, "mike", "dev", "1"));
		VALUES.add(new Comparator_Signal_Type(4, "alex", "dev", "7"));
		VALUES.add(new Comparator_Signal_Type(1, "binna", "dev", "9"));
		VALUES.add(new Comparator_Signal_Type(5, "innel", "dev", "8"));
		VALUES.add(new Comparator_Signal_Type(3, "boris", "dev", "1"));
		VALUES.add(new Comparator_Signal_Type(2, "amike", "deva", "4"));
		VALUES.add(new Comparator_Signal_Type(4, "zalex", "dev", "1"));
		VALUES.add(new Comparator_Signal_Type(1, "inna", "dev", "2"));
		VALUES.add(new Comparator_Signal_Type(5, "zinnel", "dev", "2"));
		VALUES.add(new Comparator_Signal_Type(3, "boris", "dev", "7"));
		
		System.out.println("Before Sort:");
		VALUES.stream().forEach(r -> System.out.println(r));
		
		Collections.sort(VALUES, new Comparator<Comparator_Signal_Type>() {
			@Override
			public int compare(Comparator_Signal_Type o1, Comparator_Signal_Type o2) {
				int sort1 = o1.getSortIndex();
				int sort2 = o2.getSortIndex();
				return sort1 - sort2;
			}
		});
		
		
		System.out.println("");
		System.out.println("After Sort:");
		VALUES.stream().forEach(r -> System.out.println(r));
		
		
		System.out.println("");
		System.out.println("After Sort With Multiple Fileds:");
		Collections.sort(VALUES, new Comparator<Comparator_Signal_Type>() {
			@Override
			public int compare(Comparator_Signal_Type o1, Comparator_Signal_Type o2) {
				int n;			
				n = o1.sortIndex - o2.sortIndex;
				if (n != 0) {return n;}
				n = o1.name.compareTo(o2.name);
				if (n != 0) return n; 
				n = o1.signalRole.compareTo(o2.signalRole);
				if (n != 0) return n; 
				return o1.signalGroupType.compareTo(o1.signalGroupType);	
			}
		});
		
		VALUES.stream().forEach(r -> System.out.println(r));
		
		System.out.println("");
		System.out.println("After BINARY Sort With Multiple Fileds:");
		Collections.sort(VALUES, new Comparator<Comparator_Signal_Type>() {
			@Override
			public int compare(Comparator_Signal_Type o1, Comparator_Signal_Type o2) {
				return new CompareToBuilder()
						.append(o1.signalGroupType, o2.signalGroupType)
//						.append(o1.sortIndex, o2.sortIndex)
						.append(o1.name, o2.name)
						.append(o1.signalRole, o2.signalRole)
//						.append(o1.signalGroupType, o2.signalGroupType)
						.toComparison();
			}
		});
		
		VALUES.stream().forEach(r -> System.out.println(r));

	}
	
	public int getSortIndex() {
		return sortIndex;
	}

}
