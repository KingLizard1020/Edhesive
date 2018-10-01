
import java.util.Scanner;
import java.lang.Math;

class Lesson_9_Activity_Two {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("input an integer for time since unix epoch");
    int userIn = scan.nextInt();
    int years = userIn / 31104000;
    int months =  (userIn / 2592000 ) % 12;
    int days = (userIn / 86400) % 30;
    int hours = (userIn / 3600) % 24;
    int min = (userIn / 60) % 60;
    int sec = userIn % 60;
    
    int yearsS = years + 1970;
    
    System.out.println("Year: " + yearsS);
    System.out.println("Month:" + months);
    System.out.println("day: " + days);
    System.out.println("Hour: " + hours);
    System.out.println("Min: " + min);
    System.out.println("Sec: " + sec);
    
    }
}
