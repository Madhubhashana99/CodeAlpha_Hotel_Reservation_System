import java.util.Date;

//Represent a booking made by a user
public class Reservation {
    private int reservationId;
    private String userName;
    private Room room;
    private Date checkInDate;
    private Date checkOutDate;

    public Reservation(int reservationId, String userName, Room room, Date checkInDate, Date checkOutDate) {
        this.reservationId = reservationId;
        this.userName = userName;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public int getReservationId() {
        return reservationId;
    }

    public String getUserName() {
        return userName;
    }

    public Room getRoom() {
        return room;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }
}
