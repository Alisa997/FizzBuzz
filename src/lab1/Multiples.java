package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 3, 5));
    }

    public static int multiples(int n, int a, int b) {
        int res = 0;

        res += (n-1) / a;
        if (a != b) {
            res += (n-1) / b;
            res -= (n-1) / (a*b);
        }


        return res;
    }
}
