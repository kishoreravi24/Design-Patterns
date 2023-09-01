package Factory;

import Product.Product;
import Product.ProductA;

public class India implements Factory{
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
