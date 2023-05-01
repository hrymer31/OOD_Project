//Professor Notes

public class Loan {
    private double loanAmount;
    private int loanPeriod;     // in year
    private double loanRate;    // annual interest rate in %
    Loan loan;

    public void Loan(){
        loanAmount = 0.0;
        loanPeriod = 0;
        loanRate = 0.0;
    }

    public void Loan(double loanAmt, int loanPr, double loanRt){
        loanAmount = loanAmt;
        loanPeriod = loanPr;
        loanRate = loanRt;
    }


    public void setLoanAmount(double amt){
        loanAmount = amt;
    }

    public double getLoanAmount(){
        return loanAmount;
    }

    public void setLoanPeriod(int loanPr){
        loanPeriod = loanPr;
    }

    public int getLoanPeriod(){
        return loanPeriod;
    }

    public void setLoanRate(double loanRt){
        loanRate = loanRt;
    }

    public double getLoanRate(){
        return loanRate;
    }
    public double getMonthlyPayment(){

        double monthlyPayment;
        int loanPr;
        double loanRt;

        loanPr = loanPeriod * 12;
        loanRt = loanRate / 12;
        loanRt = loanRt / 100;

        monthlyPayment = loanAmount * loanRt / (1 - 1/Math.pow(1+loanRt, loanPr));

        return monthlyPayment;
    }

    public double getTotalPayment(){
        double totalPayment;

        totalPayment = getMonthlyPayment() * loanPeriod * 12;
        return totalPayment;
    }
}

