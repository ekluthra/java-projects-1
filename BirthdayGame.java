import java.util.Scanner;

public class BirthdayGame {
    public static void main(String[] args) { 
        
        Scanner scan = new Scanner(System.in);
        int number;
        int birthMonth;
        int birthDate;
        
        System.out.println("Using a paper and pencil, perform the following calculations:\n");
        System.out.println("1. Determine your birth month (January = 1, February = 2, and so on).");
        System.out.println("2. Multiply that number by 5");
        System.out.println("3. Add 6 to that number");
        System.out.println("4. Multiply the number by 4");
        System.out.println("5. Add 9 to the number");
        System.out.println("6. Multiply that number by 5");
        System.out.println("7. Add your birth day to the number");
        
        System.out.print("Enter your number:");
        number = scan.nextInt();
        
        scan.close();
        
        birthMonth = (number - 165)/100;
        birthDate = (number - 165)%100;
        
        System.out.println("You were born on " + birthMonth + "/" + birthDate);
        
    }
}
