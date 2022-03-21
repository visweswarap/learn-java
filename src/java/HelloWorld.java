import java.io.IOException;

public class HelloWorld{

    static int a;

    public static void main(String args[]) throws IOException {

        Shirt xyzShirt = new HoodieShirt();

        Shirt abc = new TShirt() ;

        xyzShirt.produceShirt();
        abc.produceShirt();


    }
}
