package Student;
import java.util.Scanner;

class Student {
    public String Studentcode;
    public float Mediumscore;
    public int Age;
    public String Class;

    public void inputInfo() {
        Scanner add = new Scanner(System.in);
        System.out.println("Student code: ");
        Studentcode = add.nextLine();

        System.out.println("DiemTB: ");
        Mediumscore = add.nextFloat();

        System.out.println("Age: ");
        Age = add.nextInt();
        Class = add.nextLine();
        System.out.println("Class: ");
        Class = add.nextLine();
    }
    public void showInfo () {
        System.out.println("Student Information");
        System.out.println("Student code: " + Studentcode);
        System.out.println("DiemTB: " + Mediumscore);
        System.out.println("Age: " + Age);
        System.out.println("Class: " + Class);
    }
    public void xetHB () {
        if (Mediumscore > 8.0) {
            System.out.println("Dat hoc bong");
        } else {
            System.out.println("Khong dat hoc bong");
        }
    }

    public static void main(String[]agrs){
        Student HocSinh = new Student();
        HocSinh.inputInfo();
        HocSinh.showInfo();
        HocSinh.xetHB();

    }
}
