public class Computer {

    private final String CPU;
    private final String RAM;
    private final String storage;
    private final boolean graphicsCard;
    private final boolean wifiCard;


    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.wifiCard = builder.wifiCard;
    }

    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private boolean graphicsCard;
        private boolean wifiCard;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(boolean graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setWifiCard(boolean wifiCard) {
            this.wifiCard = wifiCard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage +
                ", GraphicsCard=" + graphicsCard + ", WifiCard=" + wifiCard + "]";
    }
}
