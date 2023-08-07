package secondExam;

import java.time.LocalDateTime;

public class RegularTicket extends Ticket {

    private Double totalPrice;

    public RegularTicket(int id, String showName, LocalDateTime showDate, int rowNumber, int sitNumber, Customer customer, Priceable price, Double totalPrice)throws Exception {
        super(id, showName, showDate, rowNumber, sitNumber, customer, price);
        this.totalPrice = this.calculateTotalPrice();
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public Double calculatePrice() {
        Double totalPrice = 0D;
          totalPrice += ticket.getPrice();
          return totalPrice;
    }
}