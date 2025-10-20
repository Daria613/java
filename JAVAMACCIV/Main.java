public class Main {
    public static void main(String[] args) {
        String a = "6 10 7 14 12 12 -2 3 -9 6 -10";
        int sum = 0;

        String[] result = a.split(" ");
        int[] array = new int[result.length];
        
        for (int i = 0; i < result.length; i++) {
            array[i] = Integer.parseInt(result[i]);
        }

        System.out.println("Выбранные");
        for (int num : array) {
            if (num % 2 == 0 && num % 3 != 0) {
                System.out.println(num);
                sum += num;
            }
        }

        System.out.println("Сумма чисел: " + sum);
    }
}