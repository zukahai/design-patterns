# Builder design pattern

## Giới thiệu về Builder design pattern

Builder design pattern là một mẫu thiết kế thuộc nhóm Creational Patterns. Mục đích chính của nó là tách rời quá trình xây dựng một đối tượng phức tạp từ việc tạo ra và sắp xếp các phần tử cơ bản của nó. Điều này cho phép chúng ta xây dựng các đối tượng phức tạp theo cách linh hoạt và tiện lợi.

Ví dụ, giả sử chúng ta đang xây dựng một ứng dụng để tạo ra các bức tranh. Mỗi bức tranh có thể có nhiều yếu tố như hình ảnh, văn bản, màu sắc, v.v. Sử dụng Builder design pattern, chúng ta có thể tạo ra một Builder để xây dựng các bức tranh theo các bước khác nhau. Ví dụ:

```java
public class PictureBuilder {
    private String image;
    private String text;
    private String color;

    public PictureBuilder buildImage(String image) {
        this.image = image;
        return this;
    }

    public PictureBuilder buildText(String text) {
        this.text = text;
        return this;
    }

    public PictureBuilder buildColor(String color) {
        this.color = color;
        return this;
    }

    public Picture build() {
        return new Picture(image, text, color);
    }
}

public class Picture {
    private String image;
    private String text;
    private String color;

    public Picture(String image, String text, String color) {
        this.image = image;
        this.text = text;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "image='" + image + '\'' +
                ", text='" + text + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImage() {
        return image;
    }

    public String getText() {
        return text;
    }

    public String getColor() {
        return color;
    }

}

public class Main {
    public static void main(String[] args) {
        Picture picture = new PictureBuilder()
            .buildImage("image.jpg")
            .buildText("Hello, World!")
            .buildColor("red")
            .build();
        
        System.out.println(picture); // Picture{image='image.jpg', text='Hello, World!', color='red'}

        Picture picture2 = new PictureBuilder()
            .buildImage("image2.jpg")
            .buildText("Hello, Java!")
            .build();

        System.out.println(picture2); // Picture{image='image2.jpg', text='Hello, Java!', color='null'}

        Picture picture3 = new PictureBuilder()
            .build();

        System.out.println(picture3); // Picture{image='null', text='null', color='null'}

    }
}
```


