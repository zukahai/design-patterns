# Factory Method Pattern

## Giới thiệu
Factory Method là một mẫu thiết kế thuộc nhóm Creational Patterns. Mẫu thiết kế này cho phép chúng ta tạo đối tượng mà không cần chỉ định rõ lớp cụ thể của đối tượng đó. Thay vào đó, chúng ta sẽ sử dụng một phương thức gọi là "Factory Method" để tạo ra đối tượng.

## Ví dụ
Giả sử chúng ta đang xây dựng một ứng dụng quản lý nhà hàng và cần tạo ra các đối tượng món ăn. Chúng ta có thể sử dụng Factory Method để tạo ra các đối tượng món ăn mà không cần biết trước lớp cụ thể của từng món ăn.

```java
public interface Food {
    void prepare();
    void cook();
    void serve();
}

public class Pizza implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing pizza...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking pizza...");
    }

    @Override
    public void serve() {
        System.out.println("Serving pizza...");
    }
}

public class Burger implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing burger...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking burger...");
    }

    @Override
    public void serve() {
        System.out.println("Serving burger...");
    }
}

public class FoodFactory {
    public static Food createFood(String type) {
        if (type.equalsIgnoreCase("pizza")) {
            return new Pizza();
        } else if (type.equalsIgnoreCase("burger")) {
            return new Burger();
        } else {
            throw new IllegalArgumentException("Invalid food type: " + type);
        }
    }
}

public class Restaurant {
    public static void main(String[] args) {
        Food pizza = FoodFactory.createFood("pizza");
        pizza.prepare();
        pizza.cook();
        pizza.serve();

        Food burger = FoodFactory.createFood("burger");
        burger.prepare();
        burger.cook();
        burger.serve();
    }
}
```