package lesson05.part03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Писатель в файл с консоли
 * 1. Прочесть с консоли имя файла.
 * 2. Считывать строки с консоли, пока пользователь не введет строку "exit".
 * 3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна считывать c консоли имя файла.
 * 2. Создай и используй объект типа BufferedWriter.
 * 3. Программа не должна ничего читать из файловой системы.
 * 4. Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
 * 5. Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
 * 6. Метод main должен закрывать объект типа BufferedWriter после использования.
 * 7. Метод main не должен выводить данные на экран.
 */

public class Task19 {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        File file = new File(scanner.nextLine());
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            String inputString;
            try {
                while (!(inputString = scanner.nextLine()).equals("exit")) {
                    bufferedWriter.write(inputString);
                    bufferedWriter.newLine();
                }
            } finally {
                bufferedWriter.close();
            }

        } catch (IOException e) {
            System.out.println("not found");
        }
    }
}
