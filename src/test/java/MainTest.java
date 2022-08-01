import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainTest {

    @Test
    void create_new_dictionary_work(){
        Map<Character, String> english = new HashMap<>();
        Map<Character, String> russian = new HashMap<>();
        Map<String, String> newDictionary = new TreeMap<>();
        Main.createEnglishDictionary(english);
        Main.createRussianDictionary(russian);
        Main.createNewDictionary(english, russian, newDictionary);
    }
}
