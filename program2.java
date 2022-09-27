import java.util.Scanner;
public class program2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("1");
        for(int i=2;i<=2*a;i++)
        {
            if(i%2 == 0) {
            }
            else
                System.out.print(", "+i);
        }
    }
    }
