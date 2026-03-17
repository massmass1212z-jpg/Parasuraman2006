package Hotel_Management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookingDAO {

    public static void bookRoom(int customerId, int roomId, String in, String out) {
        try {
            Connection con = DBConnection.getConnection();

            String bookSql = "INSERT INTO bookings(customer_id, room_id, check_in, check_out) VALUES(?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(bookSql);
            ps.setInt(1, customerId);
            ps.setInt(2, roomId);
            ps.setString(3, in);
            ps.setString(4, out);
            ps.executeUpdate();

            String updateRoom = "UPDATE rooms SET status='Booked' WHERE room_id=?";
            PreparedStatement ps2 = con.prepareStatement(updateRoom);
            ps2.setInt(1, roomId);
            ps2.executeUpdate();

            System.out.println("Room booked successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
