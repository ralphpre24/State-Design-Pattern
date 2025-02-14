interface VendingMachineState {
    void selectItem(VendingMachine vendingMachine, String item);
    void insertCoin(VendingMachine vendingMachine, int amount);
    void dispenseItem(VendingMachine vendingMachine);
    void setOutOfOrder(VendingMachine vendingMachine);
}
