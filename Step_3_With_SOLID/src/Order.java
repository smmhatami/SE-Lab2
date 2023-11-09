import java.time.LocalDateTime;
import java.util.ArrayList;

public class  Order {
    String customerName;
    ArrayList<OrderItem> items = new ArrayList<>();
    LocalDateTime orderDate= LocalDateTime.now();

    public Order(String customerName){
        this.customerName= customerName;
    }

    public void addItem(Food food){
        this.items.add(food);
    }

    public int getTotalPrice(){
        int price= this.items.stream().mapToInt(food -> food.getPrice()).sum();
        return price;
    }

    @Override
    public String toString() {
        String orders ="";
        for (OrderItem food:this.items) {
            orders+= food.getItemName() + " -> " + food.getPrice()+"\n";
        }
        return "Customer : " + customerName + "\nOrders are : \n" + orders + "\nTotal Price : " + this.getTotalPrice();
    }
}
