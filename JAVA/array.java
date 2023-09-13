import java.util.*;
 class insert {
     public static void main(String arg[])
     {
        int a[]=new int[10],i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        System.out.println("Enter the elements of array");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the position of element to be inserted");
        int pos=sc.nextInt();
        System.out.println("Enter the element to be inserted");
        int ele=sc.nextInt();
        for(i=n-1;i>=pos;i--)
        {
            a[i+1]=a[i];
        }
        a[pos]=ele;
        System.out.println("The array after insertion is");
        int x=sc.nextInt();
        for(i=(n+1);i>=0;i--)
        {
            a[i+1]=a[i];
        }
        a[i+1]=x;
        System.out.println("The array after insertion is");
        for(i=0;i<n+2;i++)
        {
            System.out.println(a[i]);
        }
    }
}