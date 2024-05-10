import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class fruitMoving {

    public static void counterWord(){
//        Подсчитываем количество слов в файле
        try{
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            int countWord = 0;

            while (scanner.hasNext()){
                scanner.next();
                countWord++;
            }
            System.out.println("Всего слов в файле ==> " + countWord );
        } catch (FileNotFoundException e){
            System.err.println("Файл не найден");
        }

    }
    public static void wordLengthMax(){
//        Находим самое длинное слово
        try{
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            String LongestWord = "";

            while (scanner.hasNext()){
                String word = scanner.next();
                if (word.length() > LongestWord.length()) {
                    LongestWord = word;

                }
            }
            System.out.println("Самое длинное слово из перечисленных ниже ==> " + LongestWord);

        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
        }
    }
    public static void frequencyWord(){
//        Подсчитываем сколько раз каждое слово встречается в файле
        try{
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            Map<String, Integer> freqWord = new TreeMap<>();


            while (scanner.hasNext()){
                String word = scanner.next();
                freqWord.put(word, freqWord.getOrDefault(word, 0) + 1);

            }
            System.out.println("В файле встречаются следующие слова:");
            freqWord.forEach((word, frequency) -> System.out.println( word + " ==> " + frequency + " раз"));

    
        }
        catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
        }
    }
}
