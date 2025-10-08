import java.util.Scanner; 

public class proect{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.print("Введите число: ");
        double num1 = scanner.nextDouble();

        System.out.println("Ваше число: " + num1);
        
        scanner.close();
    }
}