public class Main {
    public static void main(String[] args) {
        int[] sales = {1, 2, 5, 3};
        SalesManager manager1 = new SalesManager(sales);
        System.out.println("Максимальная сумма продажи " + manager1.max());

    }
}
