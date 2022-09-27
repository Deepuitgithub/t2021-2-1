import java.util.Scanner;
public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total nimber of elements");
        int size=sc.nextInt();
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        int count6=0;
        int count7=0;
        int count8=0;
        int count9=0;
        int[] array=new int[size];
        for(int i=0; i<size; i++)
        {
            array[i]=sc.nextInt();
        }
        for(int i:array){
            if(i%2==0){
                count2++;
            }
            if(i%3==0){
                count3++;
            }
            if(i%4==0){
                count4++;
            }
            if(i%5==0){
                count5++;
            }
            if(i%6==0){
                count6++;
            }
            if(i%7==0){
                count7++;
            }
            if(i%8==0){
                count8++;
            }
            if(i%9==0){
                count9++;
            }
        }
        System.out.println("{1:"+size+",2:"+count2+",3:"+count3+",4:"+count4+",5:"+count5+",6:"+count6+",7:"+count7+",8:"+count8+",9:"+count9+"}");
    }
}