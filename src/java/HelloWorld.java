import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HelloWorld{

    static int a;

    public static void main(String args[]) throws IOException {

        String[] userDetails = new String[10];
        BufferedInputStream strm = new BufferedInputStream(System.in);
        InputStreamReader reader = new InputStreamReader(strm);

        System.out.println("Please enter name: ");
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        userDetails[0] = name;

        System.out.println("Hello " + name);

        System.out.println("Please enter email: ");
        String email = sc.nextLine();
        userDetails[1] = email;

        System.out.println("Your details are: ");

        for(String str : userDetails){
            if(str != null) {
                System.out.println(str);
            }
        }
    }
}
