public class OutOfOrderState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine, String item) {
        System.out.println("Vending machine is out of order. Cannot select item.");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, double amount) {
        System.out.println("Vending machine is out of order. Cannot insert coin.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Vending machine is out of order. Cannot dispense item.");
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine, boolean outOfOrder) {
        if (!outOfOrder) {
            vendingMachine.setCurrentState(new IdleState());
        }
    }
}
