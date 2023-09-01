package Factory;

import Product.Product;
import Product.ProductB;

public class America implements Factory{
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
