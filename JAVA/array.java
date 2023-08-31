import java.util.*;
 class insert {
     public static void main(String arg[]) {

         int i, n;
         Scanner sc = new Scanner(System.in);
         System.out.println("enter  array size");
         n = sc.nextInt();
         int[] a=new int[n+1];
         System.out.println("enter  array value");
         for (i = 0; i < a.length; i++)
             a[i] = sc.nextInt();
         System.out.println("enter position to element to insert");
         int p = sc.nextInt();
         System.out.println("enter element to insert");
         int x = sc.nextInt();
         for (i = (n - 1); i >= (p - 1); i--)
         {
             a[i + 1] = a[i];
             a[n] = x;
         }
         a[i + 1] = x;
         System.out.println("after inserting element");
         for (i = 0; i < n + 1; i++)
         System.out.println(a[i]);
     }
 }