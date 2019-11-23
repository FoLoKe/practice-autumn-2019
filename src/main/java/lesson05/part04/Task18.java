package lesson05.part04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Нашествие исключений
 * Заполни список exceptions десятью(10) различными исключениями.
 * Первое исключение уже реализовано в методе initExceptions.
 * <p>
 * <p>
 * Требования:
 * 1. Список exceptions должен содержать 10 элементов.
 * 2. Все элементы списка exceptions должны быть исключениями(потомками класса Throwable).
 * 3. Все элементы списка exceptions должны быть уникальны.
 * 4. Метод initExceptions должен быть статическим.
 */

public class Task18 {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            float[] a = new float[0];
            a[0] = 1;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object szStr[] = new String[10];
            szStr[0] = new Character('*');
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object ch = new Character('*');
            System.out.println((Byte)ch);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] nNegArray = new int[-5];
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            File file = new File("asdad");
            FileReader fr = new FileReader(file);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] nNulArray = new int[5];
            nNulArray = null;
            int i = nNulArray.length;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String szShortString = "123";
            char chr = szShortString.charAt(10);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.indexOf(new Object());
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int num = Integer.parseInt ("akki") ;
        } catch (Exception e) {
            exceptions.add(e);
        }

    }
}
