# Các Mẫu Thiết Kế (Design Patterns)
 
Chào mừng bạn đến với hướng dẫn về các mẫu thiết kế phổ biến trong lập trình.

--- 
## 1. Singleton

**Singleton** là một mẫu thiết kế tạo ra một đối tượng duy nhất trong toàn bộ ứng dụng và cung cấp một cách để truy cập nó từ bất kỳ nơi nào trong mã. Điều này đảm bảo rằng chỉ có một phiên bản của đối tượng được tạo ra.

Xem thêm chi tiết về mẫu thiết kế Singleton [Tại đây](./singleton/).


## 2. Factory Method

**Factory Method** là một mẫu thiết kế cho phép một lớp con quyết định lớp nào sẽ được khởi tạo. Nó cho phép bạn tạo ra các đối tượng mà không cần chỉ rõ lớp cụ thể của chúng.

Xem thêm chi tiết về mẫu thiết kế Factory Method [Tại đây](./FactoryMethod/).

## 3. Abstract Factory

**Abstract Factory** cung cấp một giao diện để tạo ra các loại đối tượng trong một nhóm mà không cần chỉ định lớp cụ thể của đối tượng.

Xem thêm chi tiết về mẫu thiết kế Abstract Factory [Tại đây](./AbstractFactory/).

## 4. Builder

**Builder** là một mẫu thiết kế cho phép bạn tạo ra các đối tượng phức tạp bước từng bước. Nó cho phép bạn xây dựng các đối tượng phức tạp bằng cách sử dụng các đối tượng đơn giản và sắp xếp chúng theo cách phù hợp.

Xem thêm chi tiết về mẫu thiết kế Builder [Tại đây](./Builder/).

## 5. Prototype

**Prototype** là một mẫu thiết kế cho phép bạn tạo ra các đối tượng mới bằng cách sao chép các đối tượng hiện có, giúp tránh việc tạo ra một số lượng lớn các lớp con.

Xem thêm chi tiết về mẫu thiết kế Prototype [Tại đây](./Prototype/).

## 6. Adapter

**Adapter** là một mẫu thiết kế cho phép các giao diện không tương thích làm việc cùng nhau. Nó cho phép các lớp hoạt động với nhau mà không cần sửa đổi mã nguồn.

Xem thêm chi tiết về mẫu thiết kế Adapter [Tại đây](./Adapter/).

## 7. Bridge

**Bridge** là một mẫu thiết kế cho phép bạn phân tách một thành phần trừu tượng khỏi cài đặt của nó, vì vậy cả hai có thể thay đổi độc lập.

Xem thêm chi tiết về mẫu thiết kế Bridge [Tại đây](./Bridge/).

## 8. Composite

**Composite** là một mẫu thiết kế cho phép bạn xây dựng cấu trúc cây và làm việc với các phần tử cá nhân của nó theo cách giống nhau.

Xem thêm chi tiết về mẫu thiết kế Composite [Tại đây](./Composite/).

## 9. Decorator

**Decorator** là một mẫu thiết kế cho phép bạn thêm các tính năng mới vào một đối tượng mà không ảnh hưởng đến cấu trúc của nó.

Xem thêm chi tiết về mẫu thiết kế Decorator [Tại đây](./Decorator/).

## 10. Facade

**Facade** là một mẫu thiết kế cung cấp một giao diện đơn giản để truy cập một hệ thống phức tạp.

Xem thêm chi tiết về mẫu thiết kế Facade [Tại đây](./Facade/).

## 11. Flyweight

**Flyweight** là một mẫu thiết kế cho phép bạn chia sẻ các đối tượng giữa nhiều phần tử để giảm bộ nhớ hoặc tài nguyên được sử dụng.

Xem thêm chi tiết về mẫu thiết kế Flyweight [Tại đây](./Flyweight/).

## 12. Proxy

**Proxy** là một mẫu thiết kế cho phép bạn cung cấp một đại diện hoặc chỗ giữ chỗ cho một đối tượng khác để kiểm soát việc truy cập đến nó.

Xem thêm chi tiết về mẫu thiết kế Proxy [Tại đây](./Proxy/).

## 13. Chain of Responsibility

**Chain of Responsibility** là một mẫu thiết kế cho phép bạn xác định một loạt các đối tượng xử lý một yêu cầu một cách tuần tự cho đến khi nó được xử lý.
Xem thêm chi tiết về mẫu thiết kế Chain of Responsibility [Tại đây](./ChainOfResponsibility/).

## 14. Command

**Command** là một mẫu thiết kế cho phép bạn đóng gói các yêu cầu hoặc thao tác thành một đối tượng độc lập, cho phép bạn thực hiện các yêu cầu hoặc thao tác, hoãn lại chúng hoặc hủy bỏ chúng.
Xem thêm chi tiết về mẫu thiết kế Command [Tại đây](./Command/).

## 15. Interpreter

**Interpreter** là một mẫu thiết kế cho phép bạn diễn giải một ngôn ngữ hoặc cách diễn giải khác đối với một vấn đề nhất định.
Xem thêm chi tiết về mẫu thiết kế Interpreter [Tại đây](./Interpreter/).

## 16. Iterator

**Iterator** là một mẫu thiết kế cho phép bạn duyệt qua các phần tử của một tập hợp mà không cần biết cấu trúc bên trong của nó.
Xem thêm chi tiết về mẫu thiết kế Iterator [Tại đây](./Iterator/).

## 17. Mediator

**Mediator** là một mẫu thiết kế cho phép các đối tượng tương tác thông qua một đối tượng trung gian, giúp giảm sự phụ thuộc giữa chúng.
Xem thêm chi tiết về mẫu thiết kế Mediator [Tại đây](./Mediator/).

## 18. Memento

**Memento** là một mẫu thiết kế cho phép bạn lưu trữ và khôi phục trạng thái của một đối tượng mà không tiết lộ chi tiết triển khai của nó.
Xem thêm chi tiết về mẫu thiết kế Memento [Tại đây](./Memento/).

## 19. Observer

**Observer** là một mẫu thiết kế cho phép các đối tượng theo dõi và phản ứng với sự thay đổi trong trạng thái của một đối tượng khác.
Xem thêm chi tiết về mẫu thiết kế Observer [Tại đây](./Observer/).

## 20. State

**State** là một mẫu thiết kế cho phép một đối tượng thay đổi hành vi của mình khi trạng thái nội bộ của nó thay đổi
Xem thêm chi tiết về mẫu thiết kế State [Tại đây](./State/).

## 21. Template Method

**Template Method** là một mẫu thiết kế cho phép bạn định nghĩa một bản khuôn mẫu cho một thuật toán và để các lớp con triển khai các bước cụ thể.
Xem thêm chi tiết về mẫu thiết kế Template Method [Tại đây](./TemplateMethod/).

## 22. Visitor

**Visitor** là một mẫu thiết kế cho phép bạn tách biệt các thuật toán từ cấu trúc của đối tượng mà chúng hoạt động, cho phép bạn thêm các thuật toán mới mà không cần sửa đổi các lớp hiện có.
Xem thêm chi tiết về mẫu thiết kế Visitor [Tại đây](./Visitor/).

# Kết
Trên đây là một số mẫu thiết kế phổ biến trong lập trình. Hy vọng rằng bạn đã tìm thấy thông tin hữu ích và có thể áp dụng chúng vào công việc của mình.

Nếu bạn muốn tìm hiểu thêm về các mẫu thiết kế khác, hãy xem thêm tài liệu và ví dụ chi tiết trong các liên kết ở trên.

Chúc bạn thành công trong việc áp dụng các mẫu thiết kế vào phát triển phần mềm của mình!


