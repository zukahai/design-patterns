package singleton;

public class VKU {
    private String name;
    private String address;
    private String phone;

    public static VKU instance = new VKU();

    private VKU() {
        this.name = "";
        this.address = "";
        this.phone = "";
    }

    public static VKU getInstance() {
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "VKU [name=" + name + ", address=" + address + ", phone=" + phone + "]";
    }
}
