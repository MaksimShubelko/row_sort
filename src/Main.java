import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static final FileReader fileReader = new FileReader();

    public static void main(String[] args) {
        String[] rows = fileReader.createDataFromFile("rows");

        List<String> sortedRows = Arrays.stream(rows)
                .sorted(Comparator.comparingInt(str -> Integer.parseInt(str.split(" ")[2]
                        .split("/p/")[1]
                        .split("\\?")[0]
                        .replaceAll("[\"/]", "")
                        .replaceAll("BP_", ""))))
                .toList();

        for (String str : sortedRows) {
            System.out.println(str);
        }
    }
}