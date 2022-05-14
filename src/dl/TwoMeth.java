package dl;

public class TwoMeth {
    public static void main(String[] args) {
        System.out.println(sum(5, 6));
    }

    public static int sum(int a, int b) {
        if (a!= 0) {
            return (sum(a-1, b+1));}
        return b;

    }

}
