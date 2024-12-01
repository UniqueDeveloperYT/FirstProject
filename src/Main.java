import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    static int i = 0;

    public static void main(String[] args) {

        Vector<Integer> list = new Vector<>();



        Thread t1 = new Thread(()->{
            for (int j = 0; j < 100; j++) {
               list.add(j);
            }
        });

        Thread t2 = new Thread(()->{
            for (int j = 0; j < 100; j++) {
                list.add(j);
            }
            System.out.println(list.size());
        });
        t1.start();
        t2.start();





    }

    public static boolean isPrime(int num){
        if (num<=1) return false;
        return IntStream.rangeClosed(2,(int)Math.sqrt(num))
                .peek(System.out::println)
                .allMatch(divisor->num % divisor != 0);
    }

    public static Optional<String> getName() {

        String name = null;
        return Optional.ofNullable(name);
    }


}


class Employee {

    private int eid;
    private String name;

    Employee() {

    }

    Employee(String name) {
        this.name = name;


    }


    Employee(String name, int eid) {
        this.name = name;

        this.eid = eid;

    }

    public String getName() {
        return name;
    }


    public int getEid() {
        return eid;
    }


    @Override
    public String toString() {
        return "emp id : " + this.eid + " Name : " + this.name;
    }
}



