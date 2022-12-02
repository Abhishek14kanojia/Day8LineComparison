package com.day8LineCom;

public class LineComparison {
	int x1;
	int x2;
	int y1;
	int y2;
	
	LineComparison(int x1, int x2, int y1, int y2){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	void lineComparison() {
		float line = (float)Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Length of first Line : " + line);
	}
	
	
	
	public static void main(String[] args) {
		LineComparison lc = new LineComparison(5, 10, 20, 15);
		lc.lineComparison();
	
	}

}
