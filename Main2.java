package P1.P3;

import P1.*;
import p2.*;

public class Main2 extends Main1{
	int a, b;
	public int subtract(int a, int b) {
		return (a - b);
	}
	public static void main(String[] args) {
		Main Mn = new Main();
		Main1 Mn1 = new Main1();
		Main2 Mn2 = new Main2();
		System.out.println("Sum : " +Mn.sum(2, 3));
		System.out.println("Division : " +Mn.div(4, 2));
		System.out.println("Multiple : " +Mn1.multi(3, 5));
		System.out.println("Substract : " +Mn2.subtract(6, 2));
	}
}