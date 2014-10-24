import java.util.Scanner;

//**Next Prime Number** - Have the program find prime numbers until the user chooses to stop asking for the next one.


public class NextPrime {

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main (String[] args){
        Scanner n = new Scanner (System.in);
        int i = 1;
        System.out.println("Enter 1 for a new Prime, any other key to stop");
        while(true){
            if(n.nextInt() == 1){
                while(!isPrime(i)){
                    i++;
                }
                System.out.println(i);
                i++;
            }
            else {
                break;
            }
        }
    }
}
