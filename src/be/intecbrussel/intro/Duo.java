package be.intecbrussel.intro;

public class Duo<E, T> {
    private E s1;
    private T s2;

    public Duo(E s1, T s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public E getS1() {
        return s1;
    }

    public void setS1(E s1) {
        this.s1 = s1;
    }

    public T getS2() {
        return s2;
    }

    public void setS2(T s2) {
        this.s2 = s2;
    }
}
