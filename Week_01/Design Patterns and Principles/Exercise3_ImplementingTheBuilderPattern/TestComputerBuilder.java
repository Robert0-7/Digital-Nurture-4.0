public class TestComputerBuilder {
    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard(true)
                .setWifiCard(true)
                .build();


        Computer officePC = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("8GB")
                .setStorage("512GB SSD")
                .setGraphicsCard(false)
                .setWifiCard(true)
                .build();

        System.out.println("Gaming " + gamingPC);
        System.out.println("Office " + officePC);
    }
}
