
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        double h;
        double imchomem;
        double imcmulher;
        Scanner teclado = new Scanner(System.in);
        System.out.println("qual sua altura");
        h = teclado.nextDouble();
        imchomem = (72.7 * h) - 58;
        imcmulher = (62.1 * h) - 44.7;
        System.out.println("se vc for homem seu peso ideal é " + imchomem + " mas se for mulher é" + imcmulher);
        teclado.close();
    }
}
