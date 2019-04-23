import org.json.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Cloudator {

    public static void main(String[] args) {
        if (args.length == 0) {
            throw new Error("Please provide a path to Cloudformation file");
        }

        try (Stream<String> stream = Files.lines(Paths.get(args[0]))) {
            String str = stream.map( n -> n.toString() )
                    .collect( Collectors.joining( "\n" ) );
            String json = Convertor.convertYamlToJson(str);
            System.out.println(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}