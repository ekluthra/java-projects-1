import java.util.Scanner;

public class DivAndMod {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.print("Enter an integer: ");
        num1 = scan.nextInt();
        System.out.print("Enter another integer: ");
        num2 = scan.nextInt();
        
        //"%n" can be used in place of "/n"
        System.out.format("%d / %d = %d%n", num1, num2, (num1/num2));
        //you have to write "%%" for one percent sign to show up. otherwise an error will occur. The same goes for "/"
        System.out.format("%d %% %d = %d%n", num1, num2, (num1%num2)); 
        System.out.format("%d / %d = %d%n", num2, num1, (num2/num1));
        System.out.format("%d %% %d = %d%n", num2, num1, (num2%num1));
        
        scan.close();
        
    }
}
