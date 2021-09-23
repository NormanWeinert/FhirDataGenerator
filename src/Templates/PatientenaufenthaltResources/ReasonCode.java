package Templates.PatientenaufenthaltResources;

import Generator.BasicWriteCommands;
import Templates.SharedResources.SharedReasonCode;

import java.io.BufferedWriter;
import java.io.IOException;

public class ReasonCode {

    public static void CreateReasonCode (BufferedWriter writer, int ReasonCodeCode) throws IOException {

        BasicWriteCommands.Indents(writer,1);
        writer.write("\"reasonCode\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"coding\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"system\": \"https://www.medizininformatik-initiative.de/fhir/modul-fall/core/CodeSystem/Aufnahmegrund\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        SharedReasonCode.ReasonCodeCases(writer, ReasonCodeCode);
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.CloseAndContinueField(writer);
    }

}
