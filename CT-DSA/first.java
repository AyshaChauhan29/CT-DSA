import java.util.*;
public class first {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

        int oddSum = 0;
        for(int i=1; i<=n; i++){
            int oddNum = 2 * i - 1;
            oddSum += oddNum; 
        }
        System.out.print(oddSum + " , ");

        int evenSum = 0;
        for(int i=1; i<=n; i++){
            int evenNum = 2 * i;
            evenSum = evenNum;
        }
        System.out.println(evenSum);

        int min = Math.min(oddSum, evenSum);
        int gcd = 1;
        for(int i=min; i>=n; i--){
            if(evenSum%i == 0 && oddSum%i == 0){
                gcd = i;
                break;
            }
        }
         System.out.println(gcd);
    }
}
