public class CoffeeDecorator extends Decorator {

    public CoffeeDecorator(Coffee coffee){
        super(coffee);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "Added coffee extra";
    }

    @Override
    public double cost() {
        return super.cost()+1.0;
    }
}
