public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        // Тест 1
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // Тесе 2
        amount = 1_000_000;
        registered = true;
        expected = 500;
    }
}
