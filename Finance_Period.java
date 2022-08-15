/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer;

/**
 *
 * @author arnol
 */
// Add a subclass named Finance_Period that will determine if a customer pays interest or not. 
// If the number of months to pay for the product is greater than three, the customer will pay 25% interest, else no interest applies. 
// The maximum number of months to pay for the product is 12 months. 
// Override the calculate_repayment () method by determining if the customer will pay interest or not 
// and calculate the monthly repayment amount. 


//public class Finance_Period extends Customer {
////    @Override
//    public double calculateMonthlyRepayment(double price, double numberOfMonth) {
//        double repayment = price / numberOfMonth;
//        if (numberOfMonth >= 3) {
//            repayment += (price * 0.25) / numberOfMonth;
//        }
//        return repayment;
//    }
//}






public class Finance_Period extends Customer {
    //if months<=3 no interest or else interest

    @Override
    public void calculate_repayment() {
        if(numberOfMonths<=3) {
            monthlyRepaymentAmount=productPrice/numberOfMonths;
        }
        else {
            double interest= (25/100) * productPrice;
            double amount=productPrice + interest;
            monthlyRepaymentAmount=amount/numberOfMonths;
        }
    }
}
