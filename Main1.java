package p2;
import P1.*;
public class Main1 extends Main implements Main3 {
	public int multi(int a, int b) {
		return a * b;
	}
	public static void main(String[] args) {
		Main Mn = new Main();
		Main1 Mn1 = new Main1();
		System.out.println("Sum : " +Mn.sum(2, 3));
		System.out.println("Division : " +Mn.div(4, 2));
		System.out.println("Multiple : " +Mn1.multi(3, 5));
	}
}