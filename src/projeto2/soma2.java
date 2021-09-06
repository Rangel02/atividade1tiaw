package projeto2;
import java.util.Scanner;

public class soma2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main (String args[]) {

        int n, n2,somatorio;

        System.out.println("Numero um:");
            n = sc.nextInt();

        System.out.println("Numero dois:");
        n2 = sc.nextInt();


        somatorio = n + n2;

        System.out.println("Sum:"+somatorio);




}
}
