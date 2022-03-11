package day11.task1;

public class Courier implements Worker{
    private int salary;
    private static final int STAT_SALARY = 100;
    private static final int STAT_BONUS = 50000;
    private boolean isPayed;
    Warehouse w;

    public Courier(Warehouse w) {
        this.w = w;
    }

    @Override
    public void doWork() {
        w.incrementDeliveredOrders();
        salary += STAT_SALARY;
    }

    @Override
    public void bonus() {
        if (w.getCountDeliveredOrders() < 10000) {
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
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}
