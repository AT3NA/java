import java.util.*;

class Employee {
    String e_name, e_code;
    int b_pay;

    void getData() {
        System.out.println("Enter the e_name, e_code, and b_pay");
        Scanner sc = new Scanner(System.in);
        e_name = sc.next();
        e_code = sc.next();
        b_pay = sc.nextInt();
    }
}

class Allowances extends Employee {
    int hr_a, d_a, t_a, g_pay;

    void calculation() {
        hr_a = b_pay * 10 / 100;
        d_a = b_pay * 12 / 100;
        t_a = b_pay * 5 / 100;
        g_pay = b_pay + hr_a + d_a + t_a;
        System.out.println("Gross amount: " + g_pay);
    }
}

class EmpMain extends Allowances {
    int p_f;

    EmpMain() {
        p_f = (b_pay + 15 * 500);
    }

    public static void main(String arg[]) {
        EmpMain c = new EmpMain();
        c.getData();
        c.calculation();
        System.out.println("Net pay=" + (c.g_pay - c.p_f));
    }
}