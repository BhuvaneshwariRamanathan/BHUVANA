package guvi;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeArr {
public static void main(String[] args) {
	ArrayList a=new ArrayList<>();
	ArrayList b=new ArrayList<>();
	ArrayList c=new ArrayList<>();
	a.add(4);
	a.add(5);
	b.add(2);
	b.add(3);
	c.addAll(a);
	c.addAll(b);
	int num[]=new int[c.size()];
	for(int i=0;i<c.size();i++){
		num[i]=(int) c.get(i);
	}
	Arrays.sort(num);
	//Equal length of arrays-middle element
	int len=num.length/2;
	float middle=(num[len]+num[len-1]);
	System.out.println(middle);
}
	
}

