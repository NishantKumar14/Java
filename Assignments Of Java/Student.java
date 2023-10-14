class Student{
    int ID;
    String Name;
    String City;
    String Branch;
    String University;

    Student(int Id){
        ID = Id;
    } 
    Student(int Id, String name, String branch, String city) {
        this(Id);
        Name = name;
        Branch = branch;
        City = city;
    }
    Student(int Id, String name, String branch, String city, String univ) {
        this(Id, name, branch, city);
        University = univ;
    }
    void display() {
        System.out.println("Name : " +Name);
        System.out.println("ID : " +ID);
        System.out.println("City : " +City);
        System.out.println("Branch : " +Branch);
        System.out.println("University : " +University);
        
    }
    public static void main (String args[]) {
        Student St = new Student(20011940, "Nishant Kumar", "Muzaffarpur", "CSE", "Graphic Era University");
        St.display();
    }
}


// class Student
// {
//     int ID;
//     String name, city, branch, university; 
//     Student(int id) {
//         ID=id;
//     }
//     Student(int id, String nm, String b, String c) {
//         this(id); 
//         name=nm; 
//         branch=b; 
//         city=c;
//     }
//     Student(int id, String nm, String b, String c, String univ) {
//         this(id,nm,b,c); 
//         university=univ;
//     }
//     void display() {
//         System.out.println("Name of student : "+name); 
//         System.out.println("ID of student : "+ID); 
//         System.out.println("Branch of student : "+branch); 
//         System.out.println("City of student : "+city); 
//         System.out.println("University of student : "+university);
//     }
//     public static void main(String ags[])
//     {
//         Student St = new Student(20011940,"Nishant Kumar","CSE","Muzaffarpur","Graphic Era Hill University"); 
//         St.display();
//     }
// }
