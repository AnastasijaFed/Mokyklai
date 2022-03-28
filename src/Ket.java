import java.util.Scanner;
public class Ket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, i = 0, best1, maxa=-10000,mina = 10000, maxb=-10000,minb = 10000, maxc=-10000,minc = 10000;
        int n = in.nextInt();

        while(i < n){
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            if(a>maxa) a = maxa;
            else if (a<maxa)a = mina;
            System.out.println(maxa);
            /*if(b>maxb) b = maxb;
            else if(b<minb)b = minb;
            if(c>maxc) c = maxc;
            else if(c<minc) c = minc;*/
            i++;
        }

       // System.out.println(maxb);
        //System.out.println(maxc);


    }
    public static int best(int b,int b2, int b3){


    return b;
    }
}
