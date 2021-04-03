public class HomeWorkApp {
    public static void main(String[] args) throws Exception {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    private static void printThreeWords() {
        String[] trees = { "Orange", "Banana", "Apple" };
        for (String tree : trees) {
            System.out.println(String.format("_%s", tree));
        }

    }

    private static void checkSumSign() {

        int a = 0;
        int b = -45;
        String result = (a + b >= 0) ? "Сумма положительная" : "Сумма отрицательная";
        System.out.println(result);

    }

    private static void printColor() {

        int value = 34;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    private static void compareNumbers() {

        int a = 90;
        int b = 45;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }
}
