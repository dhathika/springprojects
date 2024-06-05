package com.rohan.util;

import java.util.Comparator;

import com.rohan.pojo.Aadhar;

public class IncomeHighToLowComparator implements Comparator<Aadhar>{

	@Override
	public int compare(Aadhar o1, Aadhar o2) {
		if(o1.getIncome()<o2.getIncome())
			return 1;
		else if(o1.getIncome()>o2.getIncome())
			return -1;
		else
		return 0;
	}

}
