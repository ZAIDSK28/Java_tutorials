package one;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter any strinng");
		String str=sc.nextLine();
			
		StringBuffer sb= new StringBuffer(str);
		StringBuffer rev=sb.reverse();
		System.out.println(rev);
	}

}
