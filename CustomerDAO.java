package Hotel_Management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerDAO {

    public static void addCustomer(String name, String phone) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO customers(name, phone) VALUES(?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.executeUpdate();
            System.out.println("Customer added successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
