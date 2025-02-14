public class IdleState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine, String item) {
        System.out.println("Item selected: " + item);
        vendingMachine.setCurrentState(new ItemSelectedState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, double amount) {
        System.out.println("Cannot insert coin in Idle state.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Cannot dispense item in Idle state.");
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine, boolean outOfOrder) {
        if (outOfOrder) {
            vendingMachine.setCurrentState(new OutOfOrderState());
        }
    }
}
