package Prototype;
import java.util.HashMap;
public class studentRegistry {
    private HashMap<String, student> studentRegistry;

    public studentRegistry(){
        this.studentRegistry = new HashMap<>();
    }

    public student add(student studentPrototype){
        studentRegistry.put(studentPrototype.getBatchName(), studentPrototype);
                return studentPrototype;
    }
    public student get(String batchName){
        return studentRegistry.get(batchName);
    }
}
