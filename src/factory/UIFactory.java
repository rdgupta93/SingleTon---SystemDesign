package factory;


import factory.component.button.Button;
import factory.component.dropdown.DropDown;
import factory.component.menu.Menu;




public interface UIFactory {
    Menu createMenu();
    Button createButton();
    DropDown createDropDown();

}
