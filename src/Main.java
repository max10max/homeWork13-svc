public class Main {
    public static void main(String[] args) {

        long[] sales = {1, 2, 5, 3, 3,4,10,6,3};

        SalesManager manager1 = new SalesManager(sales);
        System.out.println("Максимальная сумма продажи " + manager1.max());
        System.out.println("Урезанное среднее значение продаж " + manager1.croppedAverageSales());


    }
}
