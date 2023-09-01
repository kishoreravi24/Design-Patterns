package solution;

public class DuckImpl {
    public static void main(String args[]){
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        testItems(duck);
        testItems(turkeyAdapter);
    }
    static void testItems(Duck duck){
        duck.quack(); duck.fly();
    }
}
