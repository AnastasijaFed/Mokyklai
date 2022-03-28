import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1, y1, x2, y2, x3, y3;
        x1 = in.nextInt();
        y1 = in.nextInt();
        x2 = in.nextInt();
        y2 = in.nextInt();
        x3 = in.nextInt();
        y3 = in.nextInt();
       double a = distance(x1, y1, x2, y2);
       double b = distance(x2, y2, x3, y3);
       double c = distance(x3, y3, x1, y1);
       double s = area(a,b, c);
        System.out.println(String.format("%.2f \n", s));

    }
    private static double distance(int x1, int y1, int x2, int y2){
        double dis,dx, dy;
        dx = Math.pow(x2 - x1, 2);
        dy = Math.pow(y2 - y1, 2);
        dis = Math.sqrt(dx + dy);
        return dis;
    }
    private static double area(double a, double b, double c){
        double p = (a + b + c) / 2;
        double ar= Math.sqrt(p*(p - a)*(p-b)*(p-c));
        return ar;
    }

}
