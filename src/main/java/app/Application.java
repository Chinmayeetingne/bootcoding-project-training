package app;

import com.online.restaurant.Customer;
import com.online.restaurant.Order;
import com.online.restaurant.Vendor;
import com.online.restaurant.dao.CustomerDAO;
import com.online.restaurant.dao.VendorDAO;

import java.util.Date;

public class Application {

    public static void main(String[] args) {
        Customer rashi = new Customer();
        rashi.setName("Rashi");
        rashi.setCity("Nagpur");
        rashi.setAddress("Techops Tower");
        rashi.setState("Maharashtra");
        rashi.setEmailid("rashitingne12@gamil.com");
        rashi.setPhoneNumber(9552422909L);

        System.out.println(" Customer Details:"+"\n");
        System.out.println("Name : "+ rashi.getName());
        System.out.println("City : "+ rashi.getCity());
        System.out.println("Address : "+ rashi.getAddress());
        System.out.println("State : "+ rashi.getState());
        System.out.println("Email id : "+ rashi.getEmailid());
        System.out.println("Phone : " + rashi.getPhoneNumber()+"\n");


        Vendor haldiram = new Vendor();
        haldiram.setName("Haldiram Veg Restaurant");
        haldiram.setAddress("Ajni square, Nagpur");
        haldiram.setCategory("VEG");
        haldiram.setPhoneNumber(0712223344);
        haldiram.setRating(5.0);
        haldiram.setState("Maharashtra");
        haldiram.setCity("Nagpur");

        System.out.println("Vendor Details:"+"\n");
        System.out.println("Name : "+ haldiram.getName());
        System.out.println("Address : "+ haldiram.getAddress());
        System.out.println("Category : "+ haldiram.getCategory());
        System.out.println("Phone : "+ haldiram.getPhoneNumber());
        System.out.println("Rating : "+ haldiram.getRating());
        System.out.println("State : "+ haldiram.getState());
        System.out.println("City : "+ haldiram.getCity()+"\n");

        Order order = new Order();
        order.setCustomer(rashi);
        order.setVendor(haldiram);
        order.setTotalAmount(999.00);
        order.setOrderDate(new Date());
        order.setDeliveryAddress("101,Civil Lines,Nagpur");

        System.out.println("Order Details:"+"\n");
        System.out.println("Customer : "+ order.getCustomer());
        System.out.println("Vendor : "+ order.getVendor());
        System.out.println("TotalAmount : "+ order.getTotalAmount());
        System.out.println("OrderDate : "+ order.getOrderDate());
        System.out.println("Address : "+ order.getDeliveryAddress());

        CustomerDAO customerDAO = new CustomerDAO();
        customerDAO.createTable();

        VendorDAO vendorDAO = new VendorDAO();
        vendorDAO.createTable();

    }

}
