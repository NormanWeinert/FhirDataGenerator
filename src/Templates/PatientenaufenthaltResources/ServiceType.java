package Templates.PatientenaufenthaltResources;

import Generator.BasicWriteCommands;
import Templates.SharedResources.SharedServiceType;

import java.io.BufferedWriter;
import java.io.IOException;

public class ServiceType {

    public static void CreateServiceType (BufferedWriter writer, int SerivceTypeCode) throws IOException {

        BasicWriteCommands.Indents(writer,1);
        writer.write("\"serviceType\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"coding\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"system\": \"https://www.medizininformatik-initiative.de/fhir/core/modul-fall/CodeSystem/Fachabteilungsschluessel\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        SharedServiceType.ServiceTypeCases(writer, SerivceTypeCode);
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"userSelected\": false");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.CloseAndContinue(writer);
    }
}
