class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine, String item) {
        System.out.println("Currently dispensing an item. Please wait.");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Currently dispensing an item. Please wait.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Dispensing item: " + vendingMachine.getSelectedItem());
        vendingMachine.setBalance(vendingMachine.getBalance() - vendingMachine.getItemPrice(vendingMachine.getSelectedItem()));
        vendingMachine.setSelectedItem(null);
        vendingMachine.setState(new IdleState());
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Vending machine is now out of order.");
        vendingMachine.setState(new OutOfOrderState());
    }
}
