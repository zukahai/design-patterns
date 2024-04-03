# Singleton Pattern

Trong lập trình hướng đối tượng, Singleton là một mẫu thiết kế (design pattern) được sử dụng để đảm bảo rằng một lớp chỉ có duy nhất một thể hiện (instance) và cung cấp một điểm truy cập toàn cục đến thể hiện đó.

## Tại sao sử dụng Singleton?

Singleton được sử dụng khi chúng ta muốn đảm bảo rằng chỉ có một thể hiện duy nhất của một lớp được tạo ra và sử dụng trong toàn bộ ứng dụng. Điều này có thể hữu ích trong nhiều trường hợp, ví dụ như:

- Khi chúng ta muốn chia sẻ một tài nguyên duy nhất (ví dụ: kết nối cơ sở dữ liệu) giữa các thành phần khác nhau của ứng dụng.
- Khi chúng ta muốn giới hạn việc tạo ra các thể hiện mới của một lớp, để tránh việc lãng phí tài nguyên.

## Cách triển khai Singleton trong Java

Dưới đây là một ví dụ về cách triển khai Singleton trong Java:

```java
public class Singleton {
    private static Singleton instance;
    private String data;

    private Singleton() {
        // private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "data='" + data + '\'' +
                '}';
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setData("Hello, Singleton!");
        System.out.println(singleton);
        // Output: Singleton{data='Hello, Singleton!'}

        Singleton anotherSingleton = Singleton.getInstance();
        System.out.println(anotherSingleton);
        // Output: Singleton{data='Hello, Singleton!'}
    }
}
```