public interface VendingMachineState {
    void selectItem(VendingMachine vendingMachine, String item);
    void insertCoin(VendingMachine vendingMachine, double amount);
    void dispenseItem(VendingMachine vendingMachine);
    void setOutOfOrder(VendingMachine vendingMachine, boolean outOfOrder);
}
