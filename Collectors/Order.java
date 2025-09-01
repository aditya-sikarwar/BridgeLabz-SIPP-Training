import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Order {
    String customer;
    double total;

    public Order(String customer, double total) {
        this.customer = customer;
        this.total = total;
    }

    public String getCustomer() {
        return customer;
    }

    public double getTotal() {
        return total;
    }
}

public class OrderRevenueSummary {
    public static void main(String[] args) {
        List<Order> orders = List.of(
            new Order("Alice", 100.50),
            new Order("Bob", 75.25),
            new Order("Alice", 25.00),
            new Order("Charlie", 50.00),
            new Order("Bob", 10.75)
        );

        Map<String, Double> revenueByCustomer = orders.stream()
            .collect(Collectors.groupingBy(
                Order::getCustomer,
                Collectors.summingDouble(Order::getTotal)
            ));

        System.out.println(revenueByCustomer);
        
    }
}