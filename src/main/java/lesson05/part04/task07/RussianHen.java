package lesson05.part04.task07;

public class RussianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 22;
    }
    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
