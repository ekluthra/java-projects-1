import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        
        int timeMins;
        int hour;
        int min;
        
        System.out.print("Enter the time in minutes: ");
        timeMins = scan.nextInt();
        
        hour = timeMins/60;
        min = timeMins%60;
        
        //The "%02d" means there should be two place values at least in the number. Ex. 4 will be written as 04, 3 is 03, 9 is 09, etc.
        System.out.format("The time is: %d:%02d%n", hour, min);
        
        scan.close();
    }
}
