//write a java program that ask the user for hi sname and prints out hello and his name
import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name +" have a nice day");
    }
}
