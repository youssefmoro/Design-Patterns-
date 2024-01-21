import java.util.function.Predicate;
class AnimalNotMain {

    private String species;
    private boolean canHop;
    private boolean canSwim;
    public AnimalNotMain(String speciesName,boolean hopper,boolean swimmer)
    {
        this.species=speciesName;
        this.canHop=hopper;
        this.canSwim=swimmer;
    }
    public boolean canHop(){return canHop;}
    public boolean canSwim(){return canSwim;}
    public String toString(){return species;}

}
//public interface checkTrait
//{
//    public boolean test(Animal a);
//}
//public interface Perdicate<T>
//{
//    public boolean test<T t>;
//}
//there's an issue here
public  class Animal{

    private static void print(AnimalNotMain animal,Predicate<AnimalNotMain> trait)
    {
        if ((trait.test(animal))) System.out.println(animal);
    }
    public static void main(String[] args)
    {
        print(new AnimalNotMain("Fish",false,true),a->a.canSwim());
        print(new AnimalNotMain("Hippo",true,true),a->a.canHop());
    }
}

