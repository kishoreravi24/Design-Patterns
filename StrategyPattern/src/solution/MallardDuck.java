package solution;

public class MallardDuck extends Duck{
    @Override
    public void display(){
        System.out.println("MallardDuck");
    }

    public void flyType(){
        performFly().noFly();
    }

    public void quackType(){
        quackBehavior.quack();
    }

    public void swimType(){
        swim();
    }
}
