public interface Stock {
    void registerObserver(Observer observer);
    void deregisterObserver(Observer observer); // <-- Must match exactly
    void notifyObservers();
}
