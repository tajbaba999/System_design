public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
            return super.getCost() + 1.5;
    }
}
