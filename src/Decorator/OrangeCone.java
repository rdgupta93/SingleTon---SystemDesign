package Decorator;

public class OrangeCone implements Icecream{
    private Icecream icecream;

    public OrangeCone() {// when cone is the base

    }

    public OrangeCone(Icecream icecream) { // when cone is being added on top of addon (some ice cream is already there
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        if(icecream!=null){
            return icecream.getCost()+10;
        }else{
            return 10;
        }
    }

    @Override
    public String getDescription() {
        if(icecream!=null){
            return icecream.getDescription()+"Orange Cone";
        }else{
            return "Orange Cone";
        }
    }
}
