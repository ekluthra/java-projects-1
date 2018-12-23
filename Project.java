import java.util.Scanner;
import java.text.NumberFormat;

public class Project {
    public static void main(String[] args) { 
        
        double designing, coding, debugging, testing;
        double totalTime;
        double percentDesigning, percentCoding, percentDebugging, percentTesting;
        
        Scanner scan = new Scanner(System.in);
        NumberFormat percent = NumberFormat.getPercentInstance();
        
        System.out.print("Designing: ");
        designing = scan.nextInt();
        System.out.print("Coding");
        coding = scan.nextInt();
        System.out.print("Debugging: ");
        debugging = scan.nextInt();
        System.out.print("Testing: ");
        testing = scan.nextInt();
        
        totalTime = designing + coding + debugging + testing;
        percentDesigning = designing/totalTime;
        percentCoding = coding/totalTime;
        percentDebugging = debugging/totalTime;
        percentTesting = testing/totalTime;
        
        //I used %s even though they are integers because the NumberFormat class turns it into a String type
        System.out.format("%s %17s", "Task", "% Time\n" );
        System.out.format("%s %10s\n", "Designing", percent.format(percentDesigning));
        System.out.format("%s %13s\n", "Coding", percent.format(percentCoding));
        System.out.format("%s %10s\n", "Debugging", percent.format(percentDebugging));
        System.out.format("%s %12s\n", "Testing", percent.format(percentTesting));
    }
}
