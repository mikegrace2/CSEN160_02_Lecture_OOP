package SCU.CSEN160.ThisSuper;

public class AMain_ThisAndSuper {
    public static void main(String[] args) {
        SubClass sub=new SubClass();
        sub.setId(456237845);
        sub.setName("Mike");
        sub.doSomething();
        System.out.println("SubClass id: "+sub.id);
        System.out.println("SuperClass id: "+sub.getId());
    }
}
