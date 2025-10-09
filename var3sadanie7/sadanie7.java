public class sadanie7 {
    
    public static void main(String[] args) {

       double y =1;
       double x =2;
       double h = 0.5;

   
     for (double i = 0; i <= 5; i += 0.5) {
       
       if( y >0 ) {
        y = Math.pow(x, 4)+ Math.pow(x,3) - 10*x - 34 * x - 25;
       }
       System.out.println(i);
    }
 }
}
