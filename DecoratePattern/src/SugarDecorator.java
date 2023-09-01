public class SugarDecorator extends Decorator {

    public SugarDecorator(Coffee coffee){
        super(coffee);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "Added sugar extra";
    }

    @Override
    public double cost() {
        return super.cost()+2.5;
    }
}