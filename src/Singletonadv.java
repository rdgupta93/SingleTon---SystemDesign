public class Singletonadv {
    private static Singletonadv instance;

    private Singletonadv(){}

    public static Singletonadv getInstance(){
        if(instance==null){
            synchronized (Singletonadv.class){
              if(instance==null){
                  instance = new Singletonadv();
              }
            }
        }
        return instance;
    }

}
