public abstract class Shirt {

    // 1. Abstract keyword(Class and method)
    // 2. Child class must implement abstract methods
    // 3. We cannot create objects for Abstract classes
    // 4. If Child class is abstract, then not necessary to implement the abstract methods

    public String color;
    public String size;
    public String fabricType;

    abstract void produceShirt();

    void printMessage() {
        System.out.println("Hello");
    }
}
