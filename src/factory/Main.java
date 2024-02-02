package factory;


import factory.component.button.Button;
import factory.component.dropdown.DropDown;
import factory.component.menu.Menu;

public class Main {
    public static void main(String[] args) {
       Flutter flutter= new Flutter(SupportedPlatform.IOS);
       UIFactory factory = flutter.createUIFactory();
       Menu menu = factory.createMenu();
       Button button = factory.createButton();
       DropDown dropDown = factory.createDropDown();



    }
}
