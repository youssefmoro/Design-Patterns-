//singelton creation pattern
public class HayStorage {
   private int quantity=0;
   private HayStorage(){}
   private static final HayStorage instance=new HayStorage();
    public static HayStorage getInstance() {
        return instance;
    }
    public synchronized void addHay(int amount) {
        quantity += amount;
    }
    public synchronized boolean removeHay (int amount) {
        if(quantity < amount) return false;
        quantity -= amount;
        return true;
    }
    public synchronized int getHayQuantity() {
        return quantity;
    }

    public static void main(String [] args)
    {
        instance.addHay(100);
        System.out.println(getInstance());
        System.out.println(instance.getHayQuantity());
        instance.removeHay(50);
        System.out.println(instance.getHayQuantity());
        System.out.println(instance.removeHay(120));
    }
}
