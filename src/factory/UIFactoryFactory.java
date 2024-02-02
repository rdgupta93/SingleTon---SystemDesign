package factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatform supportedPlatform){
        switch (supportedPlatform){
            case IOS : return new IosFactory();
            case ANDROID:return new AndroidFactory();
          //  case MAC:return MacFactory();
        }
        return null;
    }
}

//UIFactory --> Manufactures --> UI components --> Button menu,dropdown etc
// UIFactoryFactory --> manufacture --UI factory --> Ios factory, Android factory , MacFactory
