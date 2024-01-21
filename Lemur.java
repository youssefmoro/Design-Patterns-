//polymorphism properties //you can pass a reference of an object strored in an instance of a child class
//to a new instance of the parent class and by this you will be able to access the properties of the child
//through this new instance and all pollymorphic previleges
 class Primate {
    public boolean hasHair() {
        return true;
    }
}
 interface HasTail {
    public boolean isTailStriped();
}
public class Lemur extends Primate implements HasTail {
    public int age = 10;
    public boolean isTailStriped() {
        return false;
    }
    public static void main(String[] args) {
       Lemur lemur=new Lemur();
        System.out.println(lemur.age);
        System.out.println(lemur.isTailStriped());
        Primate x=lemur;
        System.out.println(x.hasHair());
        HasTail y=lemur;
        System.out.println(y.isTailStriped());
    }
}
