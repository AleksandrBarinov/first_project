package sixth.words;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordSorter {

    public static void main(String[] args) throws IOException {

        try {

            //чтение текста из файла
            BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/text.txt"));
            String text = null;
            String tempTxt;
            while ((tempTxt = reader.readLine()) != null) {
                text = tempTxt;
            }
            System.out.println("original text:");
            System.out.println(text);
            System.out.println("************************************");

            //разбиение строковой переменной на слова и запись каждого слова в коллекцию ls
            List <String> ls = new ArrayList();
            for (String temp : text.split("\\s")) {
                ls.add(temp);

            }

            //сортировка коллекции в алфавитном порядке
            Collections.sort(ls);
            System.out.println("sorted text is");
            System.out.println(ls);

            //создание map
            Map repeats = new HashMap <String,String>();

            //цикл for для сравнения каждого элемента с каждым
            for (int j = 0; j < ls.size(); j++) {
                int countRepeats = 0;

                for (int k = 0; k < ls.size(); k++) {
                    //условие для добавления элемента и его количества повторений в map
                    if (ls.get(j).equals(ls.get(k)))  {
                        countRepeats++;
                        repeats.put(ls.get(j),countRepeats);

                    }
                }
            }
            // переменные для хранения данных элемента, повторяющегося максимальное кол-во раз
            final String[] maxName = {null};
            final int[] maxRepeats = {0};

            System.out.println("************************************");

            //цикл, который выводит на экран каждый элемент Map
            repeats.forEach((key, value) -> {
                System.out.println("[" + key + "] repeats " + value + " times");

                //+ выполняет условие по поиску элемента, повторяющегося максимальное кол-во раз
                int temForMax = Integer.parseInt(value.toString());
                String temForMaxName = key.toString();
                if (temForMax> maxRepeats[0]){
                    maxName[0] = temForMaxName;
                    maxRepeats[0] = temForMax;
                }
                });

            //вывод результата на экран
            System.out.println("************************************");
            System.out.println("maximum repeats is [" + maxName[0] + "] by " + maxRepeats[0] + " times");

        } catch (FileNotFoundException e) {
            System.out.println("file don't found");
        }
    }
}
