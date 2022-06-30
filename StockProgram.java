//description here ->

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.file.Files.lines;

public class StockProgram {

    public static void main(String[] args) throws IOException { //does this also need to be stockProgram???
	// write your code here

        Pattern pat = Pattern.compile(", ");

        try (Stream<String> lines = Files.lines(Path.of("inventory.txt"))) {
            //lines.forEach(System.out::println);

            List<StockItem> items = lines.map(line -> {
                String[] arr = pat.split(line);
                return new StockItem(arr[1],
                        Integer.parseInt(arr[2]),
                        Float.parseFloat(arr[3]));
            }).collect(Collectors.toList());

            items.forEach(System.out::println);
        }
    }
}
