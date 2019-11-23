package lesson05.part05.task22;

public class Sun implements Planet {
    private static Sun instance;
    private Sun() {}
    public static Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
        }

        return instance;
    }
}
