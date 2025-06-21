public class WebApp implements Observer {
    private String webAppName;

    public WebApp(String webAppName) {
        this.webAppName = webAppName;
    }

    @Override
    public void update(double price) {
        System.out.println(webAppName + " - Stock Price Updated: ₹" + price);
    }
}
