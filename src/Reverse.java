import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) throws FileNotFoundException {
        File f1 = new File("data.in");
        Scanner in = new Scanner(f1);
        int k = in.nextInt();
        int [] a = new int[k];
        int [] b = new int [k];
        for(int i = 0; i<a.length; i++){
            a[i] = in.nextInt();
        }
        for(int c: a){


        }

    }
}
