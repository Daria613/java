    public class drei {  
    public static void main(String[] args) {
        double x = 1;
        double y = 2;
        double c = 1;  
        double d = 1;  
        double e = 0;  
        
        
        
        if (x * y > 3) {
            e = Math.max(Math.pow(x, 3), Math.pow(x * y, c * d));
            System.out.println("1" + e);
        }
        //напечатай перейди на новую строку
        if (x * y >= 0 && x * y <= 3) {
            
            double minXY = Math.min(x, y);
            double maxCD = Math.max(c * x, d * y);
            e = Math.min(3, Math.min(minXY, maxCD));
            System.out.println("2 " + e);
        }
        
        if (x * y < 0) {
            e = Math.pow(2, c * d) - x;
            System.out.println("3- " + e);
        }
        
        System.out.println("4-" + e);
    }
}