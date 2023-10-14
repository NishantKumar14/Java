import java.util.*;
class Exam {
    int rollNumber;
    int subject1, subject2, subject3, total;

    Exam(int rollNumber, int subject1, int subject2, int subject3) {
        this.rollNumber = rollNumber;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        total = this.subject1 + this.subject2 + this.subject3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfExams = 100;
        Exam[] std = new Exam[numberOfExams];
        for (int i = 0; i < numberOfExams; i++) {
            System.out.println("Enter Roll Number and Marks of 3 subjects for student number " + (i + 1) + " : ");
            int rollNumber = sc.nextInt();
            int subject1 = sc.nextInt();
            int subject2 = sc.nextInt();
            int subject3 = sc.nextInt();
            std[i] = new Exam(rollNumber, subject1, subject2, subject3);
        }
        for (int i = 0; i < numberOfExams; i++) {
            System.out.println("Total Marks of Exam Number " + i + " is " + std[i].total);
        }

        for (int i = 0; i < numberOfExams; i++) {
            if (std[i].subject1 > std[i].subject2 && std[i].subject1 > std[i].subject2) {
                System.out.println("Maximum Marks is " + std[i].subject1 + " of Roll Number " + std[i].rollNumber);
            } else if (std[i].subject2 > std[i].subject1 && std[i].subject2 > std[i].subject3) {
                System.out.println("Maximum Marks is " + std[i].subject2 + " of Roll Number " + std[i].rollNumber);
            } else {
                System.out.println("Maximum Marks is " + std[i].subject3 + " of Roll Number " + std[i].rollNumber);
            }
        }

        int maxMarksRoll = -1, maxMarks = -1;
        for (int i = 0; i < numberOfExams; i++) {
            if (maxMarks < std[i].total) {
                maxMarks = std[i].total;
                maxMarksRoll = std[i].rollNumber;
            }
        }
        System.out.println(maxMarksRoll + " scored the highest marks " + maxMarks);

        sc.close();

    }
}