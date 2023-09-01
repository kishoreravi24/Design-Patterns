package solution;

public class DecoyDuck extends Duck{
    @Override
    public void display(){
        System.out.println("DecoyDuck");
    }

    public void flyType(){
        performFly().noFly();
    }

    public void quackType(){
        quackBehavior.noQuack();
    }

    public void swimType(){
        swim();
    }
}
