package interfaces;

public class ElectronicsSale extends AbstractSale implements Abc, Xyz {

    @Override
    public void printSaleAmount() {
        System.out.println("$100.00");
    }

    @Override
    public void printRandomMessage() {

    }

    @Override
    public void printXyz() {

    }
}
