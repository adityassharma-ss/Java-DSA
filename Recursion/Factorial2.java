
public class Fact {
    public static void main(String[] args) {
        long ans = fact(34);
        System.out.println(ans);
    }

    static long fact(long n) {
        if (n <= 1) {
            return 1;
        }

        return n * fact(n-1);
    }
}
