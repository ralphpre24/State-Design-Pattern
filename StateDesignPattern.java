public class StateDesignPattern {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.selectItem("Soda"); // Select item
        vendingMachine.insertCoin(1);     // Insert coin
        vendingMachine.insertCoin(1);     // Insert another coin
        vendingMachine.dispenseItem();    // Dispense item

        vendingMachine.setOutOfOrder();   // Set out of order
        vendingMachine.selectItem("Chips"); // Try to select item (should fail)
    }
}
