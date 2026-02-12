import java.util.*;
public class practice1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int fact = 1;
        // for(int i=n; i>=1; i--){
        //     fact *= i;
        // }
        // System.out.println(fact);

        for(int i=1; i<=10; i++){
            System.out.println(n + "*" + i + "=" + " " + n*i);
        }
    }
}
