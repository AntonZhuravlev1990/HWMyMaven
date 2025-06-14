public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // подготавливаем данные:
        amount = 1_000_000;
        registered = true;
        expected = 500;
    }
}
