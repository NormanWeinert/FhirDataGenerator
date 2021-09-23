package Templates.SharedResources;

import java.io.BufferedWriter;
import java.io.IOException;

public class SharedServiceProvider {

    public static void WriteServiceProviderSystem (BufferedWriter writer) throws IOException {
        writer.write("\"system\": \"http://medizininformatik-initiative.de/fhir/NamingSystem/Abteilungsidentifikator/MusterKrankenhaus\",");
    }
    public static void WriteServiceProviderValue (BufferedWriter writer) throws IOException {
        writer.write("\"value\": \"1500_ACHI\"");
    }
}
