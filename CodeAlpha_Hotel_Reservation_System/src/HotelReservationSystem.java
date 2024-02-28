import java.util.Date;
import java.util.List;

public class HotelReservationSystem {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        hotel.addRoom(new Room(101, "Single"));
        hotel.addRoom(new Room(102, "Double"));
        hotel.addRoom(new Room(103, "Suite"));

        //Searching available rooms for booking
        List<Room> availableRooms = hotel.searchAvailableRooms(new Date(), new Date());
        for (Room room : availableRooms) {
            System.out.println("Available Room: " + room.getRoomNumber() + " - " + room.getCategory());
        }

        //Making reservation
        Room selectedRoom = availableRooms.get(0);
        Reservation reservation = hotel.makeReservation("John Doe", selectedRoom, new Date(), new Date());
        System.out.println("Reservation made with ID: " + reservation.getReservationId());

        //Viewing booking details
        List<Reservation> allReservations = hotel.getAllReservations();
        for (Reservation res : allReservations) {
            System.out.println("Reservation ID: " + res.getReservationId() +
                    ", User: " + res.getUserName() +
                    ", Room: " + res.getRoom().getRoomNumber() +
                    ", Check-in: " + res.getCheckInDate() +
                    ", Check-out: " + res.getCheckOutDate());
        }

        //Cancelling a reservation
        hotel.cancelReservation(reservation);
        System.out.println("Reservation canceled.");

        //Viewing updated booking details
        allReservations = hotel.getAllReservations();
        for (Reservation res : allReservations) {
            System.out.println("Reservation ID: " + res.getReservationId() +
                    ", User: " + res.getUserName() +
                    ", Room: " + res.getRoom().getRoomNumber() +
                    ", Check-in: " + res.getCheckInDate() +
                    ", Check-out: " + res.getCheckOutDate());
        }

    }
}
