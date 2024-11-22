public class LaptopInvestor implements Observer{
    private final String investorName;
    public  LaptopInvestor(String investorName)
    {
        this.investorName = investorName;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("Investor: "+ investorName + "notified. " + "New proce of "+ stockName + ": $"+stockPrice);
    }
}
