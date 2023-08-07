package secondExam;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String deliveryAddress;
    private CustomerType customerType;
    private Double customerDiscount;
    private Voucher foodVoucher;

    public Customer(int id, String firstName, String lastName, String email, String deliveryAddress, CustomerType customerType, Double customerDiscount, Voucher foodVoucher) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.customerType = customerType;
        this.customerDiscount = customerDiscount;
        this.foodVoucher = foodVoucher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Double getCustomerDiscount() {
        return customerDiscount;
    }

    public void setCustomerDiscount(Double customerDiscount) {
        this.customerDiscount = customerDiscount;
    }

    public Voucher getFoodVoucher() {
        return foodVoucher;
    }

    public void setFoodVoucher(Voucher foodVoucher) {
        this.foodVoucher = foodVoucher;
    }

    public void takeFoodVoucher(){
        this.getFoodVoucher().eat();
    }
}
