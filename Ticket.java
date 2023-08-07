package secondExam;

import java.time.LocalDateTime;

public abstract class Ticket implements Priceable{
    private int id;
    private String showName;
    private LocalDateTime showDate;
    private int rowNumber;
    private int sitNumber;
    private Customer customer;
    private Priceable price;

    public Ticket(int id, String showName, LocalDateTime showDate, int rowNumber, int sitNumber, Customer customer, Priceable price) {
        this.id = id;
        this.showName = showName;
        this.showDate = showDate;
        this.rowNumber = rowNumber;
        this.sitNumber = sitNumber;
        this.customer = customer;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public LocalDateTime getShowDAte() {
        return showDate;
    }

    public void setShowDAte(LocalDateTime showDAte) {
        this.showDate = showDAte;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public int getSitNumber() {
        return sitNumber;
    }

    public void setSitNumber(int sitNumber) {
        this.sitNumber = sitNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Priceable getPrice() {
        return price;
    }

    public void setPrice(Priceable price) {
        this.price = price;
    }
}
