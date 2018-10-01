
import java.util.Scanner;
import java.lang.Math;

class Lesson_9_Activity_Two {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("input an integer for time since unix epoch");
    int userIn = scan.nextInt();
    int years = userIn / 31556926;
    int months = (userIn / 2629743.83) % 12;
    int days = (userIn / 86400) % 30;
    int hours = (userIn / 3600) % 24;
    int min = (userIn / 60) % 60;
    int sec = userIn % 60;
    
    int yearsS;
    
    System.out.println(years);
    System.out.println(months);
    System.out.println(days);
    System.out.println(hours);
    System.out.println(min);
    System.out.println(sec);
    
    }
}
