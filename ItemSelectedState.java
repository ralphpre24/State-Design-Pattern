class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine, String item) {
        System.out.println("Item already selected. Please insert coins.");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Coin inserted: " + amount);
        vendingMachine.setBalance(vendingMachine.getBalance() + amount);
        if (vendingMachine.getBalance() >= vendingMachine.getItemPrice(vendingMachine.getSelectedItem())) {
            vendingMachine.setState(new DispensingState());
        }
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Please insert sufficient coins.");
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Vending machine is now out of order.");
        vendingMachine.setState(new OutOfOrderState());
    }
}
