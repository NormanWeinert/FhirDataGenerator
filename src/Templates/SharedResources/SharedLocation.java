package Templates.SharedResources;

import java.io.BufferedWriter;
import java.io.IOException;

public class SharedLocation {

    public static void WriteLocation (BufferedWriter writer) throws IOException {
        writer.write("\"reference\": \"http://external/Location/123\"");
    }

}
