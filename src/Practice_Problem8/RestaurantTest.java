package Practice_Problem8;

class Restaurant{
    protected double foodPrice;
    public Restaurant(double foodPrice){
        this.foodPrice=foodPrice;
    }
    public double calculateBill(){
        double tax = 0.1*foodPrice;
        return (foodPrice + tax);
    }
    public int estimateTime(){
        return 40;
    }
    public void displayInfo(){
        System.out.println("Food price: $" +foodPrice);
        System.out.println("Total Bill: $" +calculateBill());
        System.out.println("Estimate Time: " +estimateTime()+ "min");
    }
}

class fastFoodRestaurant extends Restaurant{
    public fastFoodRestaurant(double foodPrice){
        super(foodPrice);
    }
    @Override
    public double calculateBill(){
        double tax = 0.15*foodPrice;
        return (foodPrice+tax);
    }
    @Override
    public int estimateTime(){
        return 20;
    }
}

class fineDiningRestaurant extends Restaurant{
    public fineDiningRestaurant(double foodPrice){
        super(foodPrice);
    }
    @Override
    public int estimateTime(){
        return 60;
    }
}

public class RestaurantTest {
    public static void main(String[] args){
        Restaurant fastFood = new fastFoodRestaurant(200.00);
        Restaurant fineDine = new fineDiningRestaurant(300.00);

        fastFood.displayInfo();
        fineDine.displayInfo();
    }
}
