import java.util.Scanner;

public class Change {
    public static void main(String[] args) { 
        
        Scanner scan = new Scanner(System.in);
        
        double change;
        int quarters = 0;
        int nickels = 0;
        int dimes = 0;
        int pennies = 0;
        
        System.out.print("Enter an amount less than $1 (in cents): ");
        change = scan.nextDouble();
        
        while(change >= 25){
            change -=25;
            quarters++;
        }
        while(change>=10){
            change-=10;
            dimes++;
        }
        while(change>=5){
            change-=5;
            nickels++;
        }
        while(change>=1){
            change-=1;
            pennies++;
        }
        
        System.out.println("quarters: " + quarters + ", dimes: " + dimes + ", nickels: " + nickels + ", pennies: " + pennies);
        
        scan.close();
    }
}

