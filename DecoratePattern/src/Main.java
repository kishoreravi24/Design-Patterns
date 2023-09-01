public class Main {
    public static void main(String[] args) {
       Coffee coffee = new SimpleCoffee();
       System.out.println(coffee.getDescription());
       System.out.println(coffee.cost());

       //Add coffee decorator
        Decorator coffeeDecorator = new CoffeeDecorator(coffee);
        System.out.println(coffeeDecorator.getDescription());
        System.out.println(coffeeDecorator.cost());

        //Add sugar decorator
        Coffee sugarDecorator = new SugarDecorator(coffeeDecorator);
        System.out.println(sugarDecorator.getDescription());
        System.out.println(sugarDecorator.cost());
    }
}