import java.util.*;
import java.util.Scanner;
public class Vaccine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // case 1 >= 65
        // หญิง 
        // วันอังคารที่ 10 สิงหาคม พ.ศ.2499
        // case 2 < 65 && > 2
        // ชาย 
        // วันพุธที่ 10 สิงหาคม พ.ศ.2500  วันพุธที่ 24 ตุลาคม พ.ศ.2499
        // case 3 < 2 && > 0
        // หญิง
        // วันจันทร์ที่ 12 สิงหาคม พ.ศ.2562
        // case 4 = 0 month < 2
        // ชาย 
        // วันจันทร์ที่ 29 สิงหาคม พ.ศ.2561
        // case 5 = 0 month > 2
        // หญิง 
        // วันจันทร์ที่ 10 สิงหาคม พ.ศ.2499
        String gender = sc.nextLine();
        String Date_of_Birth = sc.nextLine();
        Person person = new Person(gender, Date_of_Birth);
        System.out.println(person.get_month() + " <- print month");
    }   
}