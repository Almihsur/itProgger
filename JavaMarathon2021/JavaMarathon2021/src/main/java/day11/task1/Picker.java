package day11.task1;

public class Picker implements Worker {
    private int salary;
    private static final int STAT_SALARY = 80;
    private static final int STAT_BONUS = 70000;
    private boolean isPayed;
    Warehouse w;

    public Picker(Warehouse w) {
        this.w = w;
    }

    @Override
    public void doWork() {
        w.incrementPickerOrders();
        salary += STAT_SALARY;
    }

    @Override
    public void bonus() {
        if (w.getCountPickedOrders() < 10000) {
            System.out.println("Бонус аока не доступен");
            return;
        }
        if (isPayed) {
        System.out.println("Бонус уже выплачен");
        return;
        }
        salary += STAT_BONUS;
        isPayed = true;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}
