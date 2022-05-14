package dl;
import java.util.Scanner;
public class OneMeth {
    public static double dist(int x1, int x2, int y1, int y2) {
        double d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y1) * (y1 - y2));
        return d;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(dist(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()));
    }
}
