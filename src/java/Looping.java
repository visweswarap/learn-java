public class Looping {
    public static void main(String[] args) {
        // while,
        // Do-while,
        // for,
        // for-each
//        int i = 0;
//        while(i < 10 ){
//            System.out.println(i);
//            i++;
//        }
//
//        for(int a = 0; a < 100; a++){
//            // for(variable ; condition ; incremental)
//            System.out.println(a);
//            System.out.println("Odd number");
//            System.out.println("Prime number as well");
//            // All odd number 1,3,5,7
//            // All prime numbers
//        }
//
//        String abc[] = new String[10];
//        abc[0] = "Zero";
//        abc[1] = "one";
//        abc[2] = "two";
//        abc[3] = "three";
//        abc[4] = "four";
//        abc[5] = "five";
//        abc[6] = "six";
//        abc[7] = "seven";
//
//        for(int a = 0; a < abc.length; a++){
//            // for(variable ; condition ; incremental)
//            System.out.println("position is " + a);
//            System.out.println(abc[a]);
//        }
//
//        System.out.println("=============================================");
//        for (String x : abc){
//            System.out.println(x);
//            // Statements
//        }

        String emails[] = new String[5];
        emails[0] = "test@test.com";

        Looping looing = new Looping();
        looing.sendNotificationsToEmployees(emails);
    }

    void sendNotificationsToEmployees(String[] emails){
        for(String email: emails){
            notifyEmployee(email);
        }
    }

    void notifyEmployee(String email){
        // Some other logic
        System.out.println("Email sent to: " + email);
    }
}
