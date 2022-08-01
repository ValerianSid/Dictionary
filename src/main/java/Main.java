import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {


    public static void main(String[] args) {
        Map<Character, String> english = new HashMap<>();
        Map<Character, String> russian = new HashMap<>();
        Map<String, String> newDictionary = new TreeMap<>();
        createEnglishDictionary(english);
        createRussianDictionary(russian);
        createNewDictionary(english, russian, newDictionary);
        print(newDictionary);
    }

    public static void createEnglishDictionary(Map english){
        english.put('a', "ant");
        english.put('b', "beer");
        english.put('c', "cat");
        english.put('d', "dog");
        english.put('e', "eagle");
        english.put('f', "frog");
        english.put('g', "goose");
        english.put('h', "hunt");
        english.put('i', "intern");
        english.put('j', "jug");
        english.put('k', "key");
        english.put('l', "lamb");
        english.put('m', "man");
        english.put('n', "nose");
        english.put('o', "oil");
        english.put('p', "people");
        english.put('q', "quick");
        english.put('r', "rat");
        english.put('s', "sister");
        english.put('t', "teacher");
        english.put('u', "union");
        english.put('v', "verb");
        english.put('w', "word");
        english.put('x', "xren");
        english.put('y', "yoga");
        english.put('z', "zoom");
    }

    public static void createRussianDictionary(Map russian){
        russian.put('a', "муравей");
        russian.put('b', "пиво");
        russian.put('c', "кот");
        russian.put('d', "собака");
        russian.put('e', "орел");
        russian.put('f', "лягушка");
        russian.put('g', "гусь");
        russian.put('h', "охота");
        russian.put('i', "интерн");
        russian.put('j', "кружка");
        russian.put('k', "ключ");
        russian.put('l', "ягненок");
        russian.put('m', "человек");
        russian.put('n', "нос");
        russian.put('o', "нефть");
        russian.put('p', "люди");
        russian.put('q', "быстрый");
        russian.put('r', "крыса");
        russian.put('s', "сестра");
        russian.put('t', "учитель");
        russian.put('u', "союз");
        russian.put('v', "глагол");
        russian.put('w', "слово");
        russian.put('x', "хрень");
        russian.put('y', "йога");
        russian.put('z', "приближение");
    }

    public static void createNewDictionary(Map english, Map russian, Map newDictionary){
        english.forEach((letter, word) -> {
            newDictionary.put(word, russian.get(letter));
        });
    }

    public static void print(Map newDictionary){
        newDictionary.forEach((engWord, rusWord) -> {
            System.out.print(engWord + " ");
            System.out.println(rusWord);
        });
    }
}
