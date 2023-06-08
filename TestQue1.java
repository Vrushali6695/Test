package java;

import java.util.ArrayList;
import java.util.List;


//Maximum number in Array
public class TestQue1 {
	public static void main(String[] args) {
		List<Object> input=new ArrayList();
		input.add(2);
		input.add(4);
		input.add(10);
		List<Object>nested1=new ArrayList();
		nested1.add(12);
		nested1.add(4);
		List<Object>nested2=new ArrayList();
		nested2.add(100);
		nested2.add(99);
		nested1.add (nested2);
		nested1.add(4);
		input.add(nested1);
		List<Object>nested3=new ArrayList<>();
		nested3.add(3);
		nested3.add(2);
		nested3.add(99);
		input.add(nested3);
		input.add(0);
		int maxNumber=findMaxNumber(input);
		System.out.println("The Maximum Number In The Array is:"+maxNumber);
	
		
		
	}

	private static int findMaxNumber(List<Object> input) {
		int max=Integer.MIN_VALUE;
		for (Object object : input) {
		
			if(object instanceof Integer){
				int num=(Integer)object;
				
				max=Math.max(max,num);
				
			}else if(object instanceof List){
				int nestedMax=findMaxNumber((List<Object>)object);
				max=Math.max(max,nestedMax);
			}
		}
		return max;
	}

}
