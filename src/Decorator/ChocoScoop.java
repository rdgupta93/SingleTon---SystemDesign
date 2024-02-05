package Decorator;

// normal add always wiil be added after a base ie some form of icecream.
public class ChocoScoop implements Icecream{
    private Icecream icecream;

    public ChocoScoop(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        return icecream.getCost()+50;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription()+", Choco Scoop";
    }


}
