package secondExam;

import java.time.LocalDateTime;

p ublic class VipTicket extends Ticket {

    Double totalPrice;
    public VipTicket(int id, String showName, LocalDateTime showDate, int rowNumber, int sitNumber, Customer customer, Priceable price) throws Exception {
        super(id, showName, showDate, rowNumber, sitNumber, customer, price);
        this.totalPrice = this.calculatetotalPrice();
    }

    public void calculate(){

    }
}
