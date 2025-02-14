import java.util.*;

class VendingMachine {
    private VendingMachineState currentState;
    private String selectedItem;
    private int balance;
    private Map<String, Integer> itemInventory;

    public VendingMachine() {
        this.currentState = new IdleState();
        this.balance = 0;
        this.itemInventory = new HashMap<>();
        itemInventory.put("Soda", 2);
        itemInventory.put("Chips", 3);
        itemInventory.put("Candy", 1);
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public String getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getItemPrice(String item) {
        return itemInventory.getOrDefault(item, 0);
    }

    public void selectItem(String item) {
        currentState.selectItem(this, item);
    }

    public void insertCoin(int amount) {
        currentState.insertCoin(this, amount);
    }

    public void dispenseItem() {
        currentState.dispenseItem(this);
    }

    public void setOutOfOrder() {
        currentState.setOutOfOrder(this);
    }
}
