package Hotel_Management_system;
import java.util.Scanner;

public class MainUI {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	        		System.out.println("***Hotel Management System***");
	            System.out.println("1. Add Room");
	            System.out.println("2. Add Customer");
	            System.out.println("3. Book Room");
	            System.out.println("4. Exit");
	            System.out.print("Choose: ");

	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Room Type: ");
	                    sc.nextLine();
	                    String type = sc.nextLine();
	                    System.out.print("Price: ");
	                    double price = sc.nextDouble();
	                    RoomDAO.addRoom(type, price);
	                    break;
	                case 2:
	                    System.out.print("Customer Name: ");
	                    sc.nextLine();
	                    String name = sc.nextLine();
	                    System.out.print("Phone: ");
	                    String phone = sc.nextLine();
	                    CustomerDAO.addCustomer(name, phone);
	                    break;

	                case 3:
	                    System.out.print("Customer ID: ");
	                    int cid = sc.nextInt();
	                    System.out.print("Room ID: ");
	                    int rid = sc.nextInt();
	                    System.out.print("Check-in (YYYY-MM-DD): ");
	                    String in = sc.next();
	                    System.out.print("Check-out (YYYY-MM-DD): ");
	                    String out = sc.next();
	                    BookingDAO.bookRoom(cid, rid, in, out);
	                    break;

	                case 4:
	                    System.exit(0);
	            }
	        }
	    }
	}
