package com.day8LineCom;

import java.util.Objects;
import java.util.Scanner;

public class LineComparison {
	public void lineComparison() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the X & Y Co-ordinates for First Point of line 1: ");
			int x1 = sc.nextInt();
			int y1= sc.nextInt();
			
			System.out.println("Enter the X & Y Co-ordinates for Second Point of line 1: ");
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			System.out.println("Enter the X & Y Co-ordinates for First Point of line 2: ");
			int x3 = sc.nextInt();
			int y3 = sc.nextInt();
			
			System.out.println("Enter the X & Y Co-ordinates for Second Point of line 2: ");
			int x4 = sc.nextInt();
			int y4 = sc.nextInt();
			
			float line1 = (float) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
			System.out.println("Length of first line is : " + line1);
			float line2 = (float) Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
			System.out.println("Length of Second line is : " + line2);
			
			
			if(Objects.equals(line1, line2)) {
				System.out.println("first & second Line both are equal ");
			}else {
				System.out.println("Lines are not Equal");
			}
	}
			public static void main(String[] args) {

				LineComparison lc = new LineComparison();
				lc.lineComparison();
	}

}
