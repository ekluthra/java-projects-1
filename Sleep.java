import java.util.Scanner;

public class Sleep {
    public static void main(String[] args) { 
        
        Scanner scan = new Scanner(System.in);
        
        int birthYear, birthMonth, birthDay;
        int nowYear, nowMonth, nowDay;
        
        System.out.println("Enter your birthdate:");
        
        System.out.print("Year: ");
        birthYear = scan.nextInt();
        
        System.out.print("Month: ");
        birthMonth = scan.nextInt();
        
        System.out.print("Day: ");
        birthDay = scan.nextInt();
        
        System.out.println("Enter today's date: ");
        
        System.out.print("Year: ");
        nowYear = scan.nextInt();
        
        System.out.print("Month: ");
        nowMonth = scan.nextInt();
        
        System.out.print("Day: ");
        nowDay = scan.nextInt();
        
        int nowNum = (nowYear * 365) + (nowMonth * 30) + nowDay;
        int birthNum = (birthYear * 365) + (birthMonth * 30) + birthDay;
        System.out.format("You have been alive for %d days%n", (nowNum - birthNum));
        
        int timeSlept = (nowNum-birthNum) * 8;
        System.out.format("You have slept for %d hours", timeSlept);
        
        scan.close();
    }
}
