import java.math.BigDecimal;
import java.util.Formatter.BigDecimalLayoutForm;


public class NumbersOfPi {
    public static double digits(double n){
        return (1/Math.pow(16, n))*(4/(8*n + 1) - 2/(8*n + 4) - 1/(8*n + 5)- 1/(8*n + 6));
    }

    public static void main(String[] args){
        double pi = 0;
        for(int i = 0; i < 100; i++){
            pi += digits(i);
        }
        System.out.println(pi);
        System.out.print(Math.PI);
    }
}
