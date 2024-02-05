package Decorator;
// base add on - it can come as base as well as normal on top of topping
public class ChcoCone implements Icecream{

    private Icecream icecream;

    public ChcoCone() {// when cone is the base

    }

    public ChcoCone(Icecream icecream) { // when cone is being added on top of addon (some ice cream is already there
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        if(icecream!=null){
            return icecream.getCost()+20;
        }else{
            return 20;
        }
    }

    @Override
    public String getDescription() {
        if(icecream!=null){
            return icecream.getDescription()+"Chocolate Cone";
        }else{
            return "Chocolate Cone";
        }
    }
}
