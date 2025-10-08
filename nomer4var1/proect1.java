public class proect1{
    public static void main(String[] args) {
        double x = 2.0;  
        double y = 1.0;  
        
        
        double c = Math.pow((y * Math.pow(x, 2) - 1), 2)/ 2 * (Math.pow(Math.cos(y), 2) - Math.pow(Math.sin(x), 2));
       
        
        System.out.println("Результат: " + c);
    }
}