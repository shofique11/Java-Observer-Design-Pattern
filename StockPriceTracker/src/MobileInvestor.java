public class MobileInvestor implements Observer{
    private final String investorName;
    public  MobileInvestor(String investorName)
    {
        this.investorName = investorName;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("Investor: "+ investorName + "notified. " + "New product of "+ stockName + ": $"+stockPrice);
    }
}
