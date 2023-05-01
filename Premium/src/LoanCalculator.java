import java.util.Scanner;
import java.text.*;

public class LoanCalculator {
    private Loan loan;
    public static void main(String[] args){
        //Loan loan;
        LoanCalculator calc = new LoanCalculator();
        calc.start();
    }
    public void LoanCalculator(){
        loan = new Loan();
    }
    public void start(){
        getInput();
        showResult();
    }
    public void getInput(){
        Scanner scanner = new Scanner(System.in);
        double loanAmt;
        int loanPr;
        double loanRt;

        System.out.println("Enter Loan Amount");
        loanAmt = scanner.nextDouble();


        System.out.println("Enter Loan Period in year");
        loanPr = scanner.nextInt();


        System.out.println("Enter Annual Interest Rate in percent");
        loanRt = scanner.nextDouble();

        loan = new Loan();
        loan.setLoanAmount(loanAmt);
        loan.setLoanPeriod(loanPr);
        loan.setLoanRate(loanRt);

        scanner.close();
    }

    public void showResult(){
        DecimalFormat df = new DecimalFormat();

        double monthlyPayment;
        double totalPayment;

        System.out.println("Loan Amount " + loan.getLoanAmount());
        System.out.println("Loan Period " + loan.getLoanPeriod());
        System.out.println("Loan Rate " + loan.getLoanRate());

        monthlyPayment = loan.getMonthlyPayment();
        totalPayment = loan.getTotalPayment();

        System.out.println("Monthly Payment " + df.format(monthlyPayment));
        System.out.println("Total Payment " + df.format(totalPayment));

    }
}
