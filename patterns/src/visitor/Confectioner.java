package visitor;

public interface Confectioner {
    void make(Biscuit biscuit);
    void make(Cream cream);
    void make(Filling filling);
}
