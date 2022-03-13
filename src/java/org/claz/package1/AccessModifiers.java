package org.claz.package1;

public class AccessModifiers {

    protected int a = 10;
    public String x = "asdfasdf";

    /*
    public
    private
    protected
     */

    public void abc(){
        int aaa = 10;
        String x = "asdfasdf";

    }

    public void xyz(){
        System.out.println(a);
        abc();
    }

}
