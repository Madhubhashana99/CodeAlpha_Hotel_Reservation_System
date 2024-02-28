import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Represent the hotel containing rooms and handling reservations
public class Hotel {
    private List<Room> rooms;
    private List<Reservation> reservations;
    private int reservationIdCounter;

    public Hotel(){
        rooms = new ArrayList<>();
        reservations = new ArrayList<>();
        reservationIdCounter = 1;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> searchAvailableRooms(Date checkInDate, Date checkOutDate) {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.isAvailable()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public Reservation makeReservation(String userName, Room room, Date checkInDate, Date checkOutDate) {
        Reservation reservation = new Reservation(reservationIdCounter++, userName, room, checkInDate, checkOutDate);
        room.book();
        reservations.add(reservation);
        return reservation;
    }

    public void cancelReservation(Reservation reservation) {
        reservation.getRoom().unBook();
        reservations.remove(reservation);
    }

    public List<Reservation> getAllReservations() {
        return reservations;
    }
}
