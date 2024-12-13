import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BankTransactionAnalyzerSimple {
        private static final String RESOURCES = "main/resource/";

    public static void main(String[] args) throws IOException {
        final Path path = Paths.get(RESOURCES + "transactions.csv");
        final List<String> lines = Files.readAllLines(path);
        double total = 0;
        for(final String line: lines) {
            String[] columns = line.split(",");
            double amount = Double.parseDouble(columns[1]);
            total += amount;
        }

        System.out.println("The total for all transaction is " + total);

    }
}
