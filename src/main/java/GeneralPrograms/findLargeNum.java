package GeneralPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class findLargeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {100,900,220,3,101,2500,221,500,800,600,1000};
		
		int largeNum = 0;
		int seclargenum=0;
		for(int i=0;i<a.length;i++) {
				if(a[i]>largeNum) {
					seclargenum = largeNum;
					largeNum = a[i];
					
				}else if(a[i]>seclargenum && a[i]!=largeNum) {
					seclargenum=a[i];
				}
		}
		
		System.out.println("largest num = "+ largeNum);
		System.out.println("Seclargest num = "+ seclargenum);	
		
		
		TreeSet<Integer> aa = new TreeSet();
		for(int i =0;i<a.length;i++) {
			aa.add(a[i]);
		}
		
		System.out.println(aa.toString());
		System.out.println(aa.first() + " is the minimum number");
		System.out.println(aa.last()  + " is the maximum number");
		

	}

}
