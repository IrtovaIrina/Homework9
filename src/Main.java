import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
             arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {

        //задача1
         int[] array1 = generateRandomArray();
        int monthlyPaymentAmount = 0;
        for (int arr1 : array1){
            monthlyPaymentAmount += arr1;
        }
        System.out.println("Сумма трат за месяц составила " + monthlyPaymentAmount +  " рублей");
        System.out.println();
        //задача2
        int[] array2 = generateRandomArray();
        int max = array2[0];
        int min = array2[0];
        for (int i = 1; i < array2.length - 1;i++){
            if (array2[i] > max){
                max = array2[i];
            }
            if (array2[i] < min){
                min = array2[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min +
                " рублей. Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println();
        //задача3
        int[] array3 = generateRandomArray();
        monthlyPaymentAmount = 0;
        for (int arr3 : array3){
            monthlyPaymentAmount += arr3;
        }
        int averageMonthlyPayoutAmount = (int) monthlyPaymentAmount / array3.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageMonthlyPayoutAmount + " рублей");
        System.out.println();
        //задача4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0;i < reverseFullName.length;i++){
            System.out.print(reverseFullName[reverseFullName.length - 1 - i]);
        }

    }
}