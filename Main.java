import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scannie = new Scanner(System.in);

        int numFace;

        System.out.println("Make a face with numbers! (0 - 9)");
        numFace = scannie.nextInt();
        if (numFace > 9) {
            System.out.println("ZERO THROUGH NINE ONLY");
            return;
        }
        if (numFace < 0) {
            System.out.println("ZERO THROUGH NINE ONLY");
            return;
        }
        System.out.println(" " + numFace + " " + numFace);
        System.out.println("  " + numFace);
        System.out.println(numFace + " " + numFace + " " + numFace);


    }
}
