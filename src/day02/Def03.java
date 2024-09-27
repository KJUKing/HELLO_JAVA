package day02;

public class Def02 {
    static void showDan(int dan) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " * " + dan + " = " + dan * i);
        }
    }

    public static void main(String[] args) {
        showDan(5);
    }
}
