class Append {
	public void app() {
		StringBuffer Sb = new StringBuffer("Hello");
		Sb.append("Java");
		System.out.println(Sb);
	}
}

class Insert {
	public void ins() {
		StringBuffer Sb = new StringBuffer("Hello");
		Sb.insert(1, "JAVA");
		System.out.println(Sb);
	}
}

class Replace {
	public void rep() {
		StringBuffer Sb = new StringBuffer("Hello");
		Sb.replace(1, 3, "JAVA");
		System.out.println(Sb);
	}
}

class Delete {
	public void del() {
		StringBuffer Sb = new StringBuffer("Hello");
		Sb.delete(1, 3);
		System.out.println(Sb);
	}
}

class Reverse {
	public void rev() {
		StringBuffer Sb = new StringBuffer("Hello");
		Sb.reverse();
		System.out.println(Sb);
	}
}

public class Main {
	public static void main(String[] args) {
		Append Ap = new Append();
		Ap.app();

		Insert In = new Insert();
		In.ins();

		Replace Rp = new Replace();
		Rp.rep();

		Delete De = new Delete();
		De.del();

		Reverse Re = new Reverse();
		Re.rev();
	}
}