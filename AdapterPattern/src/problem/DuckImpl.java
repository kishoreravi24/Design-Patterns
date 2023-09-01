package problem;

public class DuckImpl {
    public static void main(String args[]){
        Duck duck = new MallardDuck();
        testDuck(duck);
    }
    static void testDuck(Duck duck){
        duck.fly(); duck.quack(); //we can't use turkey here because turkey have gobble instead of quack
    }
}
