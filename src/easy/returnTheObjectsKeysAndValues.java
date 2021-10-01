package easy;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class returnTheObjectsKeysAndValues {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "Apple");
        map.put("b", "Microsoft");
        map.put("c", "Google");
        System.out.println(Arrays.toString(getValues(map)));
    }
    public static String[] getValues(Map<String,String> dict) {
        Collection<String> values = dict.values();
        String[] targetArray = values.toArray(new String[0]);
        return targetArray;
    }
}

//    getValues({ "a": "1", "b": "2", "c": "3" } )
//        ➞ ["1", "2", "3"]
//
//        getValues({ "a": "Apple", "b": "Microsoft", "c": "Google" })
//        ➞ ["Apple", "Microsoft", "Google"]
//
//        getValues({ "key1": "true", "key2": "false", "key3": "undefined" })
//        ➞ ["true", "false", "undefined"]
