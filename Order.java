import java.util.Scanner;
import java.text.NumberFormat;

public class Order {    
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        int burgers, fries, sodas;
        
        System.out.print("Enter the number of burgers: ");
        burgers = scan.nextInt();
        System.out.print("Enter the number of fries: ");
        fries = scan.nextInt();
        System.out.print("Enter the number of sodas: ");
        sodas = scan.nextInt();
        
        double costPreTax = ((double)burgers*1.69) + ((double)fries*1.09) + ((double)sodas*0.99);
        System.out.println("Total before tax: " + money.format(costPreTax));
        
        double tax = 0.065 * costPreTax;
        System.out.println("Tax: " + money.format(tax));
        
        double costPostTax = costPreTax + tax;
        System.out.println("Final total: " + money.format(costPostTax));
        
        scan.close();
    }
}
