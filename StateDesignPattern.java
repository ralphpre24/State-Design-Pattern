public class StateDesignPattern {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(10);

        vendingMachine.selectItem("Soda");
        vendingMachine.insertCoin(2.00);
        vendingMachine.dispenseItem();

        vendingMachine.setOutOfOrder(true);
        vendingMachine.selectItem("Chips");
        vendingMachine.insertCoin(1.00);
        vendingMachine.dispenseItem();

        vendingMachine.setOutOfOrder(false);
        vendingMachine.selectItem("Juice");
        vendingMachine.insertCoin(1.50);
        vendingMachine.dispenseItem();
    }
}
