package lesson05.part03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

import static java.lang.Math.abs;

/**
 * Сортировка четных чисел из файла
 * 1. Ввести имя файла с консоли.
 * 2. Прочитать из него набор чисел.
 * 3. Вывести на консоль только четные, отсортированные по возрастанию.
 * <p>
 * Пример ввода:
 * 5
 * 8
 * -2
 * 11
 * 3
 * -5
 * 2
 * 10
 * <p>
 * Пример вывода:
 * -2
 * 2
 * 8
 * 10
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна считывать данные с консоли.
 * 2. Программа должна создавать FileInputStream для введенной с консоли строки.
 * 3. Программа должна выводить данные на экран.
 * 4. Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
 * 5. Программа должна закрывать поток чтения из файла(FileInputStream).
 */

public class Task26 {
    public static void main(String[] args) {
        // напишите тут ваш код
        try {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            File file;
            try {
                file = new File(bufferedReader.readLine());
            } finally {
                bufferedReader.close();
            }

            ArrayList<Float> floats = new ArrayList<>();
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String s;
                while((s = bufferedReader.readLine()) != null) {
                    floats.add(Float.parseFloat(s));
                }
            } finally {
                bufferedReader.close();
            }

            floats.removeIf(x -> (abs(x) % 2 > 0));
            floats.sort(Comparator.naturalOrder());

            for (Float f: floats) {
                System.out.println(f);
            }
        } catch (Exception e) {
            System.out.println("SKIDADLE_SKIDOODLE");
            System.out.println(e);
        }

    }
}
