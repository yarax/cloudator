import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import java.io.IOException;

public class Convertor {
    public static String convertYamlToJson(String yaml) throws IOException {
//        try {
        
//        Exception in thread "main" java.lang.NoClassDefFoundError: com/fasterxml/jackson/dataformat/yaml/YAMLFactory
//        at Convertor.convertYamlToJson(Convertor.java:8)
//        at Cloudator.main(Cloudator.java:18)
//        Caused by: java.lang.ClassNotFoundException: com.fasterxml.jackson.dataformat.yaml.YAMLFactory
//
            YAMLFactory yf =  new YAMLFactory();
            //ObjectMapper yamlReader = new ObjectMapper(yf);
            //Object obj = yamlReader.readValue(yaml, Object.class);
            return "";
            //ObjectMapper jsonWriter = new ObjectMapper();
//            //return jsonWriter.writeValueAsString(obj);
//        } catch (IOException e) {
//            e.printStackTrace();
//            throw e;
//        }
    }
}
