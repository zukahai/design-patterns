package singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton Pattern");
        VKU vku = VKU.getInstance();
        vku.setName("Vietnam - Korea University of Information and Communication Technology - The University of Da Nang");
        vku.setAddress("470 Đ. Trần Đại Nghĩa, Khu đô thị, Ngũ Hành Sơn, Đà Nẵng 550000");
        vku.setPhone("0236 3667 117");
        System.out.println(vku);
        // VKU [name=Vietnam - Korea University of Information and Communication Technology - The University of Da Nang, address=470 Đ. Trần Đại Nghĩa, Khu đô thị, Ngũ Hành Sơn, Đà Nẵng 550000, phone=0236 3667 117]

        VKU vku2 = VKU.getInstance();
        System.out.println(vku2);
        // VKU [name=Vietnam - Korea University of Information and Communication Technology - The University of Da Nang, address=470 Đ. Trần Đại Nghĩa, Khu đô thị, Ngũ Hành Sơn, Đà Nẵng 550000, phone=0236 3667 117]
    }

}
