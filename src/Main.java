public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int sum=0;
        var arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++){
            sum +=arr[i];
        }
        System.out.println("Сумма трат за месяц составила " +  sum + " рублей");

        System.out.println("задача 2");
        int minSum=arr[0];
        int maxSum=0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]> maxSum){
                maxSum = arr [i];
            }
            if (minSum > arr [i]) {
                minSum = arr [i];
            }
        }
        System.out.println("Мксимальная сумма трат за день состовляет: " + maxSum + " рублей");
        System.out.println("минимальная сумма трат за день состовляет: " + minSum + " рублей");

        System.out.println("Задача 3");
        int averageExpenses = sum / 30;
        System.out.println("Средняя трата за день составила " + averageExpenses + " рублей");

        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1 ;i >=0; i--){
            System.out.print(reverseFullName[i]);
        }

    }
}
