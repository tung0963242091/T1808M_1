package session2;

import java.util.Scanner;

public class Nhanvien {
    public String name;
    public int age;
    public String address;
    public double salary;
    public int workingtime;

    public void inputInfo() {
        System.out.print("Nhap ten nhan vien: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        System.out.print("Nhap tuoi: ");
        age = Scanner.nextInt();
        Scanner.nextLine();

        System.out.print("Nhap dia chi: ");
        address = scanner.nextLine();

        System.out.print("Nhap tien luong: ");
        salary = scanner.nextDouble();

        System.out.print("Nhap thoi gian lam: ");
        workingtime = scanner.nextLine();

    }

    public void printInfo() {
        System.out.print("Thong tin nhan vien:");
        System.out.print(name+"-tuoi"+age);
    }

    public double tinhthuong(){
        double thuong = 0;
        if(workingtime >= 200) {
            thuong= salary*20/100;
        }else if (workingtime < 200 && workingtime >=100) {
            thuong = salary*10/100
        }
        return thuong;
    }
}
