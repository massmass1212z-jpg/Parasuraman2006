package Hotel_Management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RoomDAO {

    public static void addRoom(String type, double price) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO rooms(room_type, price, status) VALUES(?, ?, 'Available')";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, type);
            ps.setDouble(2, price);
            ps.executeUpdate();
            System.out.println("Room added successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
