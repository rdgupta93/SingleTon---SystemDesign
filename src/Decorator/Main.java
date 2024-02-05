package Decorator;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

       Icecream ice = new ChocoChip(
                          new ChocoScoop(
                             new OrangeCone(
                                 new ChocoSyrup(
                                    new ChcoCone()))));
        System.out.println(ice.getCost());
        System.out.println(ice.getDescription());


        System.out.println("I am learning Java");
        int a =9;
        int b =12;
        System.out.println(a+b);
    }
}
