import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Pumpkin {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.in");
        Scanner in = new Scanner(file);
        int k = in.nextInt();
        double nuo = in.nextDouble();
        double iki = in.nextDouble();
        double [] w = new double[k];
        double [] sp = new double [k];
        int x = 0;
        double sumw = 0, sums = 0;
        double av1, av2;
        for(int i = 0; i < w.length; i++){
            w[i] = in.nextDouble();
            if(w[i] < iki && w[i] > nuo){
                sp[x] = w[i];
                x++;

            }
            sums = totalWeight(sp);
            sumw = totalWeight(w);
        }
        av1 = sums / x;
        av2 = sumw / k;
        System.out.println("Average weight of all pumpkins: " +String.format("%.3f", av2)+ " kg");
       if(x > 0){
           System.out.println("Average weight of selected pumpkins: "+String.format("%.3f", av1)+" kg");
           System.out.println("Number of selected pumpkins: " +x);
           System.out.print("Selected pumpkin weights:");
           for(Double weight: sp){
               if(weight > 0)
                   System.out.print(" "+weight);
           }
       }
       else{
           System.out.println("There are no selected pumpkins.");
       }




    }
    public static double totalWeight(double [] a){
        double sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }
}
