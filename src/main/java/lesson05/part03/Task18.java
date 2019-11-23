package lesson05.part03;

import java.io.*;
import java.util.Scanner;

/**
 * Чтение файла
 * 1. Считать с консоли имя файла.
 * 2. Вывести в консоль(на экран) содержимое файла.
 * 3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна считывать c консоли имя файла.
 * 2. Программа должна выводить на экран содержимое файла.
 * 3. Поток чтения из файла (FileInputStream) должен быть закрыт.
 * 4. BufferedReader также должен быть закрыт.
 */

public class Task18 {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        File file = new File(scanner.nextLine());
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            try {
                String s;
                while((s = reader.readLine()) != null) {
                    System.out.println(s);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                reader.close();
            }
        } catch (IOException e) {
            System.out.println("something wrong");
        }

    }
}