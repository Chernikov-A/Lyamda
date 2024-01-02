import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> numbers2 = Arrays.asList(1, 5, -1, 3, 5, 23); // проверка списка без четных чисел

        OptionalDouble avg = numbers1.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .average();

        if(avg.isPresent()){
            System.out.println("Среднее значение всех четных чисел в списке: " + avg.getAsDouble());
        }else {
            System.out.println("В списке нет четных чисел. ");
        }
    }
}