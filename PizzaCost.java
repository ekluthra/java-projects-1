import java.util.Scanner;
import java.text.NumberFormat;

public class PizzaCost {   
    public static void main(String[] args) { 
        
        Scanner scan = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        double pizzaDiameter;
        double costPizza;        
        final double LABOUR_COST = .75;
        final double RENT = 1.00;
        final double MATERIALS_COST = .05;
        
        System.out.print("Enter the diameter of the pizza: ");
        pizzaDiameter = scan.nextDouble();
        
        costPizza = LABOUR_COST + RENT + (MATERIALS_COST * pizzaDiameter * pizzaDiameter);
        
        System.out.println("The cost of the pizza is " + money.format(costPizza));
        
        scan.close();
        
    }
}
