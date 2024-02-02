package factory;

import factory.component.button.Button;
import factory.component.button.MacButton;
import factory.component.dropdown.DropDown;
import factory.component.dropdown.MacDropDown;
import factory.component.menu.MacMenu;
import factory.component.menu.Menu;

public class MacFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new MacMenu();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public DropDown createDropDown() {
        return new MacDropDown();
    }
}
