import Factory.Factory;
import Factory.India;
import Factory.America;
import Product.Product;

public class Main {
    public static void main(String[] args) {
        Factory india = new India();
        Factory america = new America();

        Product productA = india.createProduct();
        Product productB = america.createProduct();

        productA.sales();
        productB.sales();
    }
}