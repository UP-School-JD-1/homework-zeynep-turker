public class Operators {
	static int a = 5, b = 2;
	static boolean temp1 = true, temp2 = false;
	static boolean temp3;
	static boolean temp4;

	public static void main(String[] args) {
		process1();
		//normal ve kısa devre haliyle şartlı işlemciler
		process2();
		process3();
	}
	static void process1() {
		System.out.println("a: " + a + " b:" + b);
		b += a;
		a -= 1;
		System.out.println("a: " + a + " b:" + b);
		--b;
		a++;
		System.out.println("a: " + a + " b:" + b);
		b++;
		--a;
		System.out.println("a: " + a + " b:" + b);
	}
	static void process2() {
		temp3 = temp1 & temp2;
		temp4 = temp1 | temp2;
		System.out.println("\ntemp1 : " +temp1 + ", temp2 : "+temp2+ ", temp3: "+temp3 + ", temp4: "+temp4);
	}
	static void process3() {
		if (temp1 && temp2) System.out.println("temp1 and temp2 are true");
		if (temp1 || temp2) System.out.println("temp1 or temp2 are true");
		if (temp3 & temp4) System.out.println("temp3 and temp4 are true");
		if (temp3 | temp4) System.out.println("temp3 or temp4 are true");
	}
}
