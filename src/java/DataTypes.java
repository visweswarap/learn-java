import java.math.BigDecimal;
import java.util.ArrayList;

public class DataTypes {
    public static void main(String[] args) {
        String name = "abc";
        String n = new String("abc");
        if(name.equals(n)){
            System.out.println("Same....");
        }

        int a = 10;
        float b = 10.5F;
        long c = 123123L;
        char d = 'a';
        boolean bool = true;

        Integer aa = 10;
        Float f = 10.5F;
        Long ll = 1231234123452345L;
        Character ch = 'a';
        Boolean bln = true;

        //Array
        String[] abc = new String[10];
        abc[1] = "asdfas";
        abc[2] = "123";
        int[] values = new int[10];

        System.out.println(abc[0]);
        System.out.println(abc[1]);
        System.out.println(abc[2]);
        System.out.println(abc[3]);
        System.out.println(abc[9]);
        System.out.println(f);

        Employee emp = new Employee();

        Employee[] empArray = new Employee[10];
        empArray[0] = emp;
        empArray[0] = null;

        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(emp);




    }
}
