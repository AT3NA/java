import java.util.*;
public class arraygreat{
    public static void main(String[]args){
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        int max=a[0];
        System.out.println("enter the value of array: ");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
    for (int i=0;i<5;i++){
        if(max<=a[i]){
            max=a[i];
        }
    }
            System.out.println("maximum value of array is: "+max);

    }
}