package SCU.CSEN160.ThisSuper;

public class SubClass extends SuperClass {
    long id;

    public void doSomething(){
        this.id=120;
        super.id=89;
    }
}
