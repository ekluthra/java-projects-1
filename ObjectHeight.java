import java.util.Scanner;

public class ObjectHeight {
    public static void main(String[] args) { 
        
        Scanner scan = new Scanner(System.in);
        double height;
        double time;
        
        System.out.print("Enter a time less than 4.5 seconds: ");
        
        time = scan.nextDouble();
        height = 100 - (4.9 * time * time);
        
        System.out.println("The height of the object is " + height + " meters");
        
        scan.close();
    }
}
