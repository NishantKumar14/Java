public class ConstructorChain {
	int ID;
	String name, city, branch, university;

	ConstructorChain(int Id) {
		ID = Id;
	}

	ConstructorChain(int Id, String nm) {
		this(Id);
		name = nm;
	}

	ConstructorChain(int Id, String nm, String bran) {
		this(Id, nm);
		branch = bran;
	}

	ConstructorChain(int Id, String nm, String bran, String City) {
		this(Id, nm, bran);
		city = City;
	}

	ConstructorChain(int Id, String nm, String bran, String City, String University) {
		this(Id, nm, bran, City);
		university = University;
	}

	public void Display() {
		System.out.println("ID : " +ID);
		System.out.println("Name : " +name);
		System.out.println("Branch : " +branch);
		System.out.println("City : " +city);
		System.out.println("University : " +university);
	}

	public static void main(String[] args) {
		ConstructorChain ConC = new ConstructorChain(20011940, "Nishan Kumar", "CSE", "Dehradun", "GEHU");
		ConC.Display();
	}
}