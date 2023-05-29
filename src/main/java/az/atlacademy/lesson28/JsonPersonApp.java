package az.atlacademy.lesson28;

import com.fasterxml.jackson.xml.XmlMapper;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JsonPersonApp {

    public static void main(String[] args) {
        Person rte = new Person(1, "RTE", "T");

        try {
            XmlMapper xmlMapper = new XmlMapper();
            String rteJson = xmlMapper.writeValueAsString(rte);
            System.out.println(rteJson);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String rteJson = objectMapper.writeValueAsString(rte);
            System.out.println(rteJson);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
