public class JavaFun {
	public static void main(String[] args) {
		String s = "Java";
		System.out.println("String after the Concatentation : " +s.concat("Welcome "));
		System.out.println("Character at First Index : " +s.charAt(1));
		System.out.println("Index of First 'a' : " +s.indexOf('a'));
		System.out.println("Index of Second 'a' : " +s.indexOf('a', s.indexOf('a') + 1));
		System.out.println("Compare 'Java' to 'JAVA' : " +s.compareTo("JAVA"));
		System.out.println("Compare 'Java' to 'JAVA' ignoring Case : " +s.equalsIgnoreCase("JAVA"));
		System.out.println("Index of First 'a' from last : " +s.lastIndexOf('a'));
	}
}