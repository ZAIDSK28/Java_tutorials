package one;

import java.util.Scanner;

public class UniqueCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.next();
		StringBuffer sb= new StringBuffer();
		sb.append(str);
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(!(str.charAt(i)==str.charAt(j))) {
					sb.replace(i, j, "");
				}
			}
		}
		System.out.println(sb);
	}	
}
		
	

