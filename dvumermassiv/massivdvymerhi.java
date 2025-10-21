public class massiv {
     
    int[][] array = {{1, 2, 3}, {4, 4, 2}, {6, 1, 4}};
    //объявление двумерного массива.
    //массив содержит 3 строки и 3 столбца,
    //содержит 3 элемента это строки

    public void Max() {
        int max = array[0][0];
        // переменная для вычисления максимального элемента
        
        for(int[] g: array) {
            // пробегаемся по массивам 
            for(int a: g) {
                if (a > max) {
                    max = a;
                }
            }
        }
        
        System.out.println("ответ: " + max);
        // Вывод результата
    }
    
  
    public static void main(String[] args) {
        massiv m = new massiv();
        m.Max();
        // Добавляем главный метод для запуска программы
    }
}