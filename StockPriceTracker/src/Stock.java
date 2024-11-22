import java.util.ArrayList;
import java.util.List;
//Create the Concrete Subject
public class Stock implements Subject{
    private String stockName;
    private  double stockPrice;

    private final List<Observer> observers = new ArrayList<>();
   public Stock(String stockName){
       this.stockName = stockName;
   }
    @Override
    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, stockPrice);
        }
    }
    // Method to change the stock price and notify observers
    public void setPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        notifyObservers();
    }

}
