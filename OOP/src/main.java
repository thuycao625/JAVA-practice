import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static ArrayList<Giangvien> listGiangvien = new ArrayList<>();
//    public static void main(String [] args){
//        nhapThongtin();
//        nhapThongtin();
//        xuatThongtin();
//    }

    public static Giangvien nhapThongtin(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ten: ");
        String name = scanner.nextLine();
        System.out.print("Khoa: ");
        String khoa = scanner.nextLine();
        System.out.print("Phu cap: ");
        float phucap = scanner.nextFloat();
        System.out.print("So tiet: ");
        float sotiet = scanner.nextFloat();
        System.out.print("He so luong: ");
        float hesoluong = scanner.nextFloat();

        Giangvien giangvien = new Giangvien(name,khoa,phucap,sotiet,hesoluong);
        listGiangvien.add(giangvien);
        return giangvien;
    }

    public static void xuatThongtin(){

        System.out.println("---------------THONG TIN GIANG VIEN ------------------");
        for(Giangvien giangvien: listGiangvien){
            System.out.print("Ho ten:  " + giangvien.getHoTen() + "\t" );
            System.out.print("Khoa:  " + giangvien.getKhoa()+ "\t");
            System.out.print("Phu cap:  " + giangvien.getPhucap()+ "\t");
            System.out.print("So tiet:  " + giangvien.getSotiet()+ "\t");
            System.out.print("He so luong:  " + giangvien.getHesoluong()+ "\t");
            System.out.println("LUONG: " + giangvien.tinhluong() + "VND");
        }

    }




    public static void main(String[] args)
    {
        C c = new C();

    }

}
class A
{
    public A()
    {
        System.out.println("Class A Constructor");
    }
}

class B extends A
{
    public B()
    {
        System.out.println(super.toString());
//        System.out.println("Class B Constructor");
    }
}

class C extends B
{
    public C()
    {
        System.out.println("Class C Constructor");
    }
}

