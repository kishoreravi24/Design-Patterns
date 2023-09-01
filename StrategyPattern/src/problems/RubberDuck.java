package problems;

public class RubberDuck extends Duck{
    @Override
    public void display(){

    }

    @Override
    public void quack(){
        System.out.println("no quack");
    }

    @Override
    public  void fly(){
        System.out.println("I can't fly");
    }
}
