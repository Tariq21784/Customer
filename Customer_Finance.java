/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer;

/**
 *
 * @author arnol
 */
// Create a class called Customer_Finance that contains the logic to test the two classes. 
// Prompt the user for data ((Use JOptionPane to receive the data) for the first object where no interest applies and display the results; 
// then prompt the user for data where interest is applicable and display the results. 
// Make use of Exception handling to ensure that the flow of the program doesn't break when an exception occurs. 
// Before creating your program use any tool of your choice to create a program Structure (as shown in question 1) 
// and also explain how you have applied the Object Oriented Principles (Polymorphism, Encapsulation, abstraction, and Inheritance) 
// to showcase the flow of the program you are about to create.
//import java.util.Scanner;
//
//public class Customer_Finance {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Customer customer = new Customer();
//        Finance_Period financePeriod = new Finance_Period();
//
//        customer.setPrice(Double.parseDouble(in.nextLine()));
//        customer.setMonths(Integer.parseInt(in.nextLine()));
//        System.out.println(customer.calculateRepayment());
//
//        financePeriod.setPrice(Double.parseDouble(in.nextLine()));
//        financePeriod.setMonths(Integer.parseInt(in.nextLine()));
//        System.out.println(Finance_Period.calculateMonthlyRepayment());
//    }
//}

import javax.swing.JOptionPane;
public class Customer_Finance {
    public static void main(String[] args) {
        //two objects . first with interest and second with no interest

        Finance_Period a=new Finance_Period();
        a.setCustomerName();
        a.setContactNumber();
        a.setProductPrice();
        a.setNumberOfMonths();
        a.calculate_repayment();
        display_info(a);

        Finance_Period b=new Finance_Period();
        b.setCustomerName();
        b.setContactNumber();
        b.setProductPrice();
        b.setNumberOfMonths();
        b.calculate_repayment();
        display_info(b);
    }

    //displaying message box
    public static void display_info(Customer c) {
        String info=String.format("Customer Name: %s \n Contact Number: %d \n Product Price: R%f \n Repayment Months: %f\n Monthly Repayment: R%f\n Total Due: R%f\n",c.customerName,c.contactNumber,c.productPrice,c.numberOfMonths,c.monthlyRepaymentAmount,c.monthlyRepaymentAmount*c.numberOfMonths);
        JOptionPane.showMessageDialog(null, info);
    }
}
