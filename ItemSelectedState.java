public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine, String item) {
        System.out.println("Item already selected. Please insert coin.");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, double amount) {
        System.out.println("Coin inserted: " + amount);
        // Assuming the item price is 1.50 for simplicity
        double price = 1.50;
        if (amount >= price) {
            vendingMachine.setBalance(amount);
            vendingMachine.setCurrentState(new DispensingState());
        } else {
            System.out.println("Insufficient amount. Please insert more coins.");
        }
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Please insert coin first.");
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine, boolean outOfOrder) {
        if (outOfOrder) {
            vendingMachine.setCurrentState(new OutOfOrderState());
        }
    }
}

