/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package customer;

/**
 *
 * @author arnol
 */
// Create a class named Customer that will determine the monthly repayment amount due by a customer for a product bought on credit. 
// The class has five fields: customer name, contact number, product price, number of months and the monthly repayment amount. 
// Write get and set methods for each field, except for the monthly repayment amount field. The set methods must prompt) 
// the user to enter the values for the following fields: customer name, contact number, product price and number of months. 
// This class also needs a method to calculate the monthly repayment amount (product price divided by the number of months). 
//import java.util.Scanner;
//
//public class Customer {
//    private String customerName;
//    private int contactNumber;
//    private double productPrice;
//    private int numberOfMonths;
//    private double monthlyRepayment;
//
//    public String getCustomerName() {
//        return customerName;
//    }
//
//    public void setCustomerName() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the customer name:");
//        customerName = in.nextLine();
//    }
//
//    public int getContactNumber() {
//        return contactNumber;
//    }
//
//    public void setContactNumber() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the customer number:");
//        contactNumber = Integer.parseInt(in.nextLine());
//    }
//
//    public double getProductPrice() {
//        return productPrice;
//    }
//
//    public void setProductPrice() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the product price:");
//        productPrice = Double.parseDouble(in.nextLine());
//    }
//
//    public int getNumberOfMonths() {
//        return numberOfMonths;
//    }
//
//    public void setNumberOfMonths() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of months:");
//        numberOfMonths = Integer.parseInt(in.nextLine());
//    }
//
//    public void calculateMonthlyRepayment() {
//        monthlyRepayment = productPrice / numberOfMonths;
//    }
//
//    void setPrice(double parseDouble) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    void setMonths(int parseInt) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    boolean calculateRepayment() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//}
//




import javax.swing.JOptionPane;
public class Customer {
    // variables for storing customer data
    String customerName;
    int contactNumber;
    double productPrice;
    double numberOfMonths;
    double monthlyRepaymentAmount;

    // getters and setters
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName() {
        this.customerName = JOptionPane.showInputDialog("please enter customer name: ");
    }

    public int getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber() {
        this.contactNumber = Integer.parseInt(JOptionPane.showInputDialog("please enter contact number: "));
    }

    public double getProductPrice() {
        return productPrice;
    }
    public void setProductPrice() {
        this.productPrice = Double.parseDouble(JOptionPane.showInputDialog("please enter product price: "));
    }

    public double getNumberOfMonths() {
        return numberOfMonths;
    }
    public void setNumberOfMonths() {
        this.numberOfMonths = Double.parseDouble(JOptionPane.showInputDialog("please enter number of months: "));
    }

    public void calculate_repayment() {
        System.out.print("hello");
        monthlyRepaymentAmount = productPrice / numberOfMonths;
    }
}