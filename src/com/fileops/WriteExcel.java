package com.fileops;

import java.util.List;

public class WriteExcel {

	public static void main(String[] args) {
	
		int[] s= {1,2,3,4,5,6,7,7,8};
		
		for (int i = 0; i < s.length; i++) {
			int j;
			for (j = 0; j < i; j++) {
				if(s[i]==s[j])
					break;
			}
			
			if(i==j) {
				System.out.print(s[i]);
			}
				
			
			
		}
	}
	
	public List<String> passingValues(){
		
		
		
		
		return null;
		
	}

}
