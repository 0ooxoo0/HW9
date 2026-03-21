public class Main {
    public static void main(String[] args) {
        // Задача 1: выплаты авторам — сумма, максимум, минимум, среднее
        int[] inputArray1 = {1000, 2000, 1500, 3000, 2500};
        float[] outputArray1 = new float[4];

        float sum1 = 0;
        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;

        for (int value : inputArray1) {
            sum1 += value;
            if (value > max1) {max1 = value;}
            if (value < min1) {min1 = value;}
        }
        float average1 = sum1 / inputArray1.length;

        outputArray1[0] = sum1;
        outputArray1[1] = max1;
        outputArray1[2] = min1;
        outputArray1[3] = average1;

        System.out.println("Задача 1:");
        System.out.print("inputArray1: ");
        for (int v : inputArray1) {
            System.out.print(v + " ");
        }
        System.out.println();
        System.out.print("outputArray1: ");
        for (float v : outputArray1) {
            System.out.print(v + " ");
        }
        System.out.println("\n");

        // Задача 2: налог 13% с каждой выплаты
        int[] inputArray2 = {50000, 60000, 45000, 70000, 55000};
        float[] outputArray2 = new float[inputArray2.length];

        int idx2 = 0;
        for (int value : inputArray2) {
            outputArray2[idx2++] = value * 0.13f;
        }

        System.out.println("Задача 2:");
        System.out.print("inputArray2: ");
        for (int v : inputArray2) {
            System.out.print(v + " ");
        }
        System.out.println();
        System.out.print("outputArray2 (налоги): ");
        for (float v : outputArray2) {
            System.out.print(v + " ");
        }
        System.out.println("\n");

        // Задача 3: бонусы выше 5000 → true/false
        int[] inputArray3 = {3000, 6000, 4500, 7000, 2000};
        boolean[] outputArray3 = new boolean[inputArray3.length];

        int idx3 = 0;
        for (int value : inputArray3) {
            outputArray3[idx3++] = value > 5000;
        }

        System.out.println("Задача 3:");
        System.out.print("inputArray3: ");
        for (int v : inputArray3) {
            System.out.print(v + " ");
        }
        System.out.println();
        System.out.print("outputArray3 (флаги >5000): ");
        for (boolean v : outputArray3) {
            System.out.print(v + " ");
        }
        System.out.println("\n");

        // Задача 4: проверка просрочек (отрицательный остаток)
        int[] inputArray4 = {1000, 500, -200, 300, 400}; // есть отрицательный
        boolean[] outputArray4 = new boolean[1];

        boolean allPositive = true;
        for (int value : inputArray4) {
            if (value < 0) {
                allPositive = false;
                break; // прерываем при первом отрицательном
            }
        }
        outputArray4[0] = allPositive;

        System.out.println("Задача 4:");
        System.out.print("inputArray4: ");
        for (int v : inputArray4) {
            System.out.print(v + " ");
        }
        System.out.println();
        System.out.println("outputArray4 (нет просрочек?): " + outputArray4[0]);
        System.out.println();

        // Задача 5: количество рентабельных месяцев (прибыль > 0)
        int[] inputArray5 = {10000, -5000, 2000, 0, 3000};
        int[] outputArray5 = new int[1];

        int count = 0;
        for (int value : inputArray5) {
            if (value > 0) {count++;}
        }
        outputArray5[0] = count;

        System.out.println("Задача 5:");
        System.out.print("inputArray5: ");
        for (int v : inputArray5) {
            System.out.print(v + " ");
        }
        System.out.println();
        System.out.println("outputArray5 (рентабельные месяцы): " + outputArray5[0]);
    }
}
