package secondExam;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Show {
    public int id;
    public String showName;
    public LocalDateTime showDate;
    public ArrayList<Ticket> ticketsList;

    public Show(int id, String showName, LocalDateTime showDate, ArrayList<Ticket> ticketsList) {
        this.id = id;
        this.showName = showName;
        this.showDate = showDate;
        this.ticketsList = ticketsList;
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

    public LocalDateTime getShowDate() {
        return showDate;
    }

    public void setShowDate(LocalDateTime showDate) {
        this.showDate = showDate;
    }

    public ArrayList<Ticket> getTicketsList() {
        return ticketsList;
    }

    public void setTicketsList(ArrayList<Ticket> ticketsList) {
        this.ticketsList = ticketsList;
    }

    public void aadTicketsToShowList(){
        getTicketsList().add();
    }
}
