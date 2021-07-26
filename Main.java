package HomeTask2;

import java.io.*;
import java.util.*;

public class Main {

    static void findHighRankWord(TreeMap<String, Integer> map){
        int highRank = 0;
        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue() > highRank){
                list.clear();
                list.add(entry.getKey());
                highRank = entry.getValue();
            }
            else if (entry.getValue() == highRank){
                list.add(entry.getKey());
            }
        }
        System.out.println("Максимальная частота = " + highRank);
        System.out.println("Слова с этой частотой:");
        for(String word : list){
            System.out.println(word);
        }
    }

    private static void showMap(TreeMap<String, Integer> map){
        System.out.println("Статистика слов");
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        System.out.println();
    }

    private static void showWords(TreeMap<String, Integer> map){
        System.out.println("Отсортированный список слов");
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            for (int i = 0; i < entry.getValue(); i++) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название файла: ");
        String filename = scanner.nextLine();

        if (new File(filename).exists()){
            TreeMap<String, Integer> map = new TreeMap<>();

            try(BufferedReader br = new BufferedReader(new FileReader(filename)))
            {
                String s;
                while((s=br.readLine()) != null){
                    String[] words = s.split("[^a-zA-Z]");
                    for(String word : words){
                        if (word.length() == 0)
                            continue;
                        word = word.toLowerCase();
                        if (map.containsKey(word)){
                            map.replace(word, map.get(word) + 1);
                        }
                        else {
                            map.put(word, 1);
                        }
                    }
                }
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }

            showWords(map);
            showMap(map);
            findHighRankWord(map);
        }
        else{
            System.out.println("Файл не найден");
        }
    }
}
