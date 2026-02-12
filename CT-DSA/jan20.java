import java.util.*;
public class jan20 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int dummy = n;
        while(n > 0){
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }

        //x == 0,  sum==5
        if(dummy % sum == 0){
            System.out.println(sum);
        } else { 
            System.out.println(-1);
        }
    }
}

 