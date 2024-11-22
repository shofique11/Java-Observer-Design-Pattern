//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // create a stock

        Stock appleStock = new Stock("Apple");
        LaptopInvestor investor1 = new LaptopInvestor("Shofique");
        LaptopInvestor investor2 = new LaptopInvestor("Mahmudur rahaman");
        appleStock.registerObserver(investor1);
        appleStock.registerObserver(investor2);
        appleStock.setPrice(150);
        Stock realmeStock = new Stock("Readme Note 12");
        MobileInvestor mobileInvestor = new MobileInvestor("Kholilllur");
        realmeStock.registerObserver(mobileInvestor);
        realmeStock.setPrice(20);
    }
}