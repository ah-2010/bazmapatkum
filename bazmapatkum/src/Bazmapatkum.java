import java.util.Scanner;

public class Bazmapatkum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nermutceq 2 hat tiv ev es kasem dra gumarumy");
        int mytiv = sc.nextInt();
        int mysecondtiv = sc.nextInt();
        gumarum(mytiv, mysecondtiv);
    }

    public static void gumarum(int tiv1, int tiv2) {
        int patasxan = tiv1 + tiv2;
        System.out.println("gumarman patasxany: " + patasxan);
    }
}
