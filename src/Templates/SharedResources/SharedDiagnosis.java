package Templates.SharedResources;

import java.io.BufferedWriter;
import java.io.IOException;

public class SharedDiagnosis {

    public static void WriteDiagnosis (BufferedWriter writer) throws IOException {
        writer.write("\"reference\": \"http://external/Condition/123\"");
    }

}
