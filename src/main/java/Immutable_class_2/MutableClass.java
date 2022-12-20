package Immutable_class_2;

import java.util.HashMap;
import java.util.Map;

public final class MutableClass {
    private String field;
    private Map<String, String> fieldMap;

    public MutableClass(String field, Map<String, String> fieldMap){
        this.field = field;
        Map<String, String> copyMap = new HashMap<String, String>();
        for(String key : fieldMap.keySet()) {
            copyMap.put(key, fieldMap.get(key));
        }
        this.fieldMap = copyMap;
    }
    public String getField(){
        return field;
    }
    public Map<String, String> getFieldMap(){
        Map<String, String> copyMap = new HashMap<String,String>();
        for(String key: fieldMap.keySet()){
            copyMap.put(key, fieldMap.get(key));
        }

        return copyMap;
    }

}
