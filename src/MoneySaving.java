import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class MoneySaving {
    public static void main(String[] args) throws FileNotFoundException {
        File f1 = new File("data.in");
        Scanner in = new Scanner(f1);
        int k = in.nextInt();
        double[] simas = new double[k];
        double[] linas = new double[k];
        double[] mantas = new double[k];
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
       double suma1 = 0, suma2 = 0, suma3 = 0;
        for (int i = 0; i < k; i++) {
            simas[i] = in.nextDouble();
            linas[i] = in.nextDouble();
            mantas[i] = in.nextDouble();
            a -=simas[i];
            suma1 = spent(simas);
            b -= linas[i];
            suma2 = spent(linas);
            c -= mantas[i];
            suma3 = spent(mantas);
        }

        double avrg1 = average(suma1, k);
        double avrg2 = average(suma2, k);
        double avrg3 = average(suma3, k);
        double m1 = moreThanAverage( avrg1, simas);
        double m2 = moreThanAverage( avrg2, linas);
        double m3 = moreThanAverage( avrg3, mantas);
        double m4 = m1 + m2 + m3;
        int m5 = (int) m4;
        System.out.println("The costs of guys: " +String.format("%.2f", suma1)+" "+String.format("%.2f", suma2)+" "+String.format("%.2f",suma3));
        System.out.println("Daily average cocts: "+String.format("%.2f", avrg1)+" "+String.format("%.2f", avrg2)+" "+String.format("%.2f",avrg3));
        System.out.println("Balance of money: " +a+ " "+b+" "+c);
        System.out.println("Number of days boys spent more than their daily average: "+m5);
    }
    private static double spent(double [] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
           sum += a[i];
        }
        return sum;
    }
    private static double average(double sum, int k){
        double av = sum/k;
        return av;
    }
    private static int moreThanAverage(double av, double[] a){
        int moreAv = 0;
        for(int i = 0; i<a.length; i++){

           if(a[i] > av){
               moreAv++;
           }
           else moreAv = moreAv;

       }
       return moreAv;

    }
}
