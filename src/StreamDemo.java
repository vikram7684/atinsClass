import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.generate(()->"Hello");
      List<String> names =   Arrays.asList("Aman,","Ajay", "Amar","vikram", "amana");
names.stream().map(s -> s.length()).distinct().forEach(System.out::println);


    }
}
