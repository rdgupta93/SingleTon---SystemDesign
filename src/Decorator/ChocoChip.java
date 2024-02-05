package Decorator;

// normal add always wiil be added after a base ie some form of icecream.
public class ChocoChip implements Icecream{
    private Icecream icecream;

    public ChocoChip(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        return icecream.getCost()+60;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription()+", Choco Scoop";
    }
}
