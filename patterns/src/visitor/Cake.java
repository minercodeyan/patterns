package visitor;

public class Cake implements CakeElement{
    CakeElement[] cakeElements;

    public Cake() {
        this.cakeElements = new CakeElement[] {
                new Biscuit(),
                new Cream(),
                new Filling()
        };
    }

    @Override
    public int beMade(Confectioner confectioner) {
        int createdElementsNumber = 0;
        for(CakeElement cakeElement: cakeElements){
            cakeElement.beMade(confectioner);
            createdElementsNumber++;
        }
        return createdElementsNumber;
    }
}
