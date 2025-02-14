public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine, String item) {
        System.out.println("Cannot select item while dispensing.");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, double amount) {
        System.out.println("Cannot insert coin while dispensing.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Dispensing item...");
        // Simulate item dispensing and reset to Idle
        vendingMachine.setCurrentState(new IdleState());
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine, boolean outOfOrder) {
        if (outOfOrder) {
            vendingMachine.setCurrentState(new OutOfOrderState());
        }
    }
}
