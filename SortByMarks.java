package com.ty.practicesesion;

import java.util.Comparator;

public class SortByMarks implements Comparator<Students> {
	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return (int) (o1.marks - o2.marks);
	}

}
