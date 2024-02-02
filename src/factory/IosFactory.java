package factory;

import factory.component.button.Button;
import factory.component.button.IosButton;
import factory.component.dropdown.DropDown;
import factory.component.dropdown.IosDropDown;
import factory.component.menu.IosMenu;
import factory.component.menu.Menu;

public class IosFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }
}
