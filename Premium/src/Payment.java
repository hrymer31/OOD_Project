public class Payment {
    //CREATE payment variables
    private static Payment payments;

    private boolean paidInFull;
    //Implement loan info from professor - Loan and Loan Calculator
    private int amount;
    private String card;
    private String checkNo;
    private String cash;

    //private constructor.
    private Payment(){
        if(payments != null){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");

        }
    }

    public static Payment getInstance(){
        //if there is no instance available... create new one
        if (payments == null){
            payments = new Payment();
        }
        return payments;

    }

    public boolean getPaidInFull(){
        return paidInFull;
    }
    public void setPaidInFull(boolean paidInFull){
        this.paidInFull = paidInFull;
    }
    public int getAmount(){
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String getCard(){
        return card;
    }
    public void setCard(String card) {
        this.card = card;
    }
    public String getCheckNo(){
        return checkNo;
    }

    public void setCheckNo(String checkNo) {
        this.checkNo = checkNo;
    }

    public String getCash(){
        return cash;
    }
    public void setCash(String cash){
        this.cash = cash;
    }
    public static void setPayment(Payment payments){
        Payment.payments = payments;
    }
}
