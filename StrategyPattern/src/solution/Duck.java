package solution;

import solution.FlyBehavior.FlyBehaviorImpl;
import solution.QuackBehavior.QuackBehaviorImpl;

public abstract class Duck{
    FlyBehaviorImpl flyBehavior;
    QuackBehaviorImpl quackBehavior;

    abstract void display();

    public FlyBehaviorImpl performFly(){
        return flyBehavior;
    }

    public  QuackBehaviorImpl performQuack(){
        return  quackBehavior;
    }

    public void swim() {
        System.out.println("All ducks float,even decoys");
    }

    public static class RubberDuck extends Duck {
        @Override
        public void display(){
            System.out.println("RubberDuck");
        }

        public void flyType(){
            performFly().flyWithWings();
        }

        public void quackType(){
            quackBehavior.quack();
        }
    }
}
