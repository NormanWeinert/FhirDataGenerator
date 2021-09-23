package Templates.StationaererVersorgungsfallResources;

import Generator.BasicWriteCommands;
import Templates.SharedResources.SharedLocation;

import java.io.BufferedWriter;
import java.io.IOException;

public class Location {

    public static void CreateLocation (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,1);
        writer.write("\"location\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"location\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        SharedLocation.WriteLocation(writer);
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.CloseAndContinue(writer);
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"status\": \"active\",");
        writer.newLine();
        PhysicalTypeCases(writer);
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"period\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"start\": \"2021-02-13T03:04:00+01:00\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"end\": \"2021-03-01T20:42:00+01:00\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.CloseAndContinueField(writer);
    }

    private static void PhysicalTypeCases (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer, 3);
        writer.write("\"physicalType\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer, 4);
        writer.write("\"coding\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer, 5);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer, 6);
        writer.write("\"system\": \"https://www.hl7.org/fhir/valueset-location-physical-type.html\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer, 6);
        writer.write("\"code\": \"bd\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer, 6);
        writer.write("\"userSelected\": false");
        writer.newLine();
        BasicWriteCommands.Indents(writer, 5);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer, 4);
        BasicWriteCommands.CloseAndContinueField(writer);
        BasicWriteCommands.Indents(writer, 4);
        writer.write("\"text\": \"Bett\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer, 3);
        BasicWriteCommands.CloseAndContinue(writer);
    }
}
