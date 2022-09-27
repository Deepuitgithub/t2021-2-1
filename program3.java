import java.util.Scanner;
public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("1");
        if(a%2==0){
            a--;
        }
        for (int i = 2; i <= 2 * a; i++) {
            if (i % 2 == 0) {
            } else
                System.out.print(", " + i);
        }
    }
}