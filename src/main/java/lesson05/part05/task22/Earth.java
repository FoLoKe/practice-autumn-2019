package lesson05.part05.task22;

public class Earth implements Planet {
    private static Earth instance;
    private Earth() {}
    public static Earth getInstance() {
        if (instance == null) {
            instance = new Earth();
        }

        return instance;
    }
}
