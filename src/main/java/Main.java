import dev.TestForDev;
import prod.TestForProd;

/**
 * Created by Igor on 11.12.15.
 */
public class Main {


    public static void main(String[] args) {

        (new TestForDev()).printInfo();

        System.out.println("--------TEST2------");
        (new TestForProd()).printInfo();

    }
}
