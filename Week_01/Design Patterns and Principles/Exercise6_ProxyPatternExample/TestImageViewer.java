public class TestImageViewer {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("mountains.jpg");
        Image image2 = new ProxyImage("river.png");

        // image will be loaded from server
        image1.display();

        // image will be loaded from server
        image2.display();

        // image is already loaded, no need to load again
        image1.display();
    }
}
