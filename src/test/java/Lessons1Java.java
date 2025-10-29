public class Lessons1Java {
    public static void main(String[] args) {
            //0)применить несколько арифметических операций ( + , -, * , /)
            // над двумя примитивами типа int
            int a = 25;
            int b = 3;

            // Сложение
            int sum = a + b;
            System.out.println(a + " + " + b + " = " + sum); // 25 + 3 = 28

            // Вычитание
            int difference = a - b;
            System.out.println(a + " - " + b + " = " + difference); // 25 - 3 = 22

            // Умножение
            int product = a * b;
            System.out.println(a + " * " + b + " = " + product); // 25 * 3 = 75

            // Деление
            int quotient = a / b;
            System.out.println(a + " / " + b + " = " + quotient); // 25 / 3 = 8

            // Остаток от деления
            int remainder = a % b;
            System.out.println(a + " % " + b + " = " + remainder); // 25 % 3 = 1

            //1) применить несколько арифметических операций над int и double в одном выражении

            int c = 25;
            double d = 3.2;

            // Сложение
            double sum1 = c + d;
            System.out.println(c + " + " + d + " = " + sum1); // 25 + 3.2 = 28.2

            // Вычитание
            double difference1 = c - d;
            System.out.println(c + " - " + d + " = " + difference1); // 25 - 3.2 = 21.8

            // Умножение
            double product1 = c * d;
            System.out.println(c + " * " + d + " = " + product1); // 25 * 3.2 = 80.0

            // Деление
            double quotient1 = c / d;
            System.out.println(c + " / " + d + " = " + quotient1); // 25 / 3.2 = 7.8125

            // Остаток от деления
            double remainder1 = c % d;
            System.out.println(c + " % " + d + " = " + remainder1); // 25 % 3.2 = 2.5999999999999988

            //2) применить несколько логических операций ( < , >, >=, <= )

            int i = 10;
            int f = 5;
            int j = 10;

            System.out.println("i = " + i + ", f = " + f + ", j = " + j);
            System.out.println("i < f: " + (i < f));   // false
            System.out.println("i > f: " + (i > f));   // true
            System.out.println("i <= j: " + (i <= j)); // true
            System.out.println("i >= f: " + (i >= f)); // true
            System.out.println("i == j: " + (i == j)); // true
            System.out.println("i != f: " + (i != f)); // true

            //3) получить переполнение при арифметической операции

            // Берем самое большое возможное число
            double maxValue = Double.MAX_VALUE;
            System.out.println("Самое большое double: " + maxValue);

            // Пытаемся сделать его еще больше - получаем Переполнение!
            double overFlowMax = maxValue * 2;
            System.out.println("MAX_VALUE * 2 = " + overFlowMax); // Infinity




    }
}
