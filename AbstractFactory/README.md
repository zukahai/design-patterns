# Abstract Factory Pattern

## Giới thiệu

Abstract Factory là một mẫu thiết kế (design pattern) thuộc nhóm Creational Patterns. Mẫu thiết kế này cho phép tạo ra các đối tượng liên quan đến nhau mà không cần chỉ định cụ thể lớp cụ thể của chúng.

## Đặt vấn đề

Trong một số trường hợp, chúng ta cần tạo ra một nhóm các đối tượng có liên quan đến nhau. Tuy nhiên, việc tạo ra các đối tượng này có thể phức tạp và phụ thuộc vào nhiều yếu tố khác nhau. Abstract Factory giúp chúng ta giải quyết vấn đề này bằng cách cung cấp một giao diện chung để tạo ra các đối tượng liên quan đến nhau mà không cần biết chi tiết về cách tạo ra chúng.

## Cách sử dụng

Để sử dụng Abstract Factory, chúng ta cần thực hiện các bước sau:

1. Định nghĩa một giao diện Abstract Factory chứa các phương thức tạo ra các đối tượng liên quan đến nhau.
2. Định nghĩa các lớp Factory cụ thể kế thừa từ giao diện Abstract Factory và triển khai các phương thức tạo ra các đối tượng cụ thể.
3. Định nghĩa các lớp đối tượng liên quan đến nhau và triển khai chúng.
4. Sử dụng Abstract Factory để tạo ra các đối tượng liên quan đến nhau mà không cần biết chi tiết về cách tạo ra chúng.

## Ưu điểm

- Tách biệt việc tạo ra các đối tượng khỏi việc sử dụng chúng, giúp giảm sự phụ thuộc giữa các lớp.
- Dễ dàng thay đổi các lớp Factory cụ thể mà không ảnh hưởng đến mã nguồn sử dụng Abstract Factory.

## Ví dụ
```java
// Bước 1: Định nghĩa giao diện Abstract Factory
interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}

// Bước 2: Định nghĩa các factory cụ thể triển khai giao diện Abstract Factory
class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}

class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}

// Bước 3: Định nghĩa các lớp sản phẩm liên quan và triển khai chúng
interface ProductA {
    void operationA();
}

class ConcreteProductA1 implements ProductA {
    @Override
    public void operationA() {
        System.out.println("ConcreteProductA1 operationA");
    }
}

class ConcreteProductA2 implements ProductA {
    @Override
    public void operationA() {
        System.out.println("ConcreteProductA2 operationA");
    }
}

interface ProductB {
    void operationB();
}

class ConcreteProductB1 implements ProductB {
    @Override
    public void operationB() {
        System.out.println("ConcreteProductB1 operationB");
    }
}

class ConcreteProductB2 implements ProductB {
    @Override
    public void operationB() {
        System.out.println("ConcreteProductB2 operationB");
    }
}

// Bước 4: Sử dụng Abstract Factory để tạo ra các đối tượng liên quan mà không cần biết lớp cụ thể của chúng
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();
        productA1.operationA();
        productB1.operationB();

        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();
        productA2.operationA();
        productB2.operationB();
    }
}
```