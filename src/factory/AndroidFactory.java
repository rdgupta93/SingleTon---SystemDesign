package factory;

import factory.component.button.AndroidButton;
import factory.component.button.Button;
import factory.component.dropdown.DropDown;
import factory.component.dropdown.MacDropDown;
import factory.component.menu.AndroidMenu;
import factory.component.menu.Menu;

public class AndroidFactory implements UIFactory {
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new MacDropDown();
    }
}
