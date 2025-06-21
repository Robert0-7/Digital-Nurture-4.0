public class TestStockMarket {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("PhoneTracker");
        Observer webApp = new WebApp("BrowserWatcher");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice(1023.50);
        stockMarket.setStockPrice(1047.75);

        stockMarket.deregisterObserver(mobileApp);

        stockMarket.setStockPrice(1080.10);
    }
}
