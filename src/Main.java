import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    static int i = 0;
    public static void main(String[] args) {

        int[] numbers = {2,4,4,53,45,45,645,6,456};
        Arrays.stream(numbers)
                .filter(num->num%2==0)
                .forEach(System.out :: println);


    }
}