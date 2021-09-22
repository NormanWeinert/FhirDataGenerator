package Templates.PatientenAufenthaltResources;

import Generator.BasicWriteCommands;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class ReasonCode {

    public static void CreateReasonCode (BufferedWriter writer) throws IOException {

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
        ReasonCodeCases(writer);
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

    private static void ReasonCodeCases (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,5);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 9 + 1);

        switch (randomNum) {
            case 1:
                writer.write("\"code\": \"01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                writer.write("\"display\": \"Krankenhausbehandlung, vollstationär\"");
                break;
            case 2:
                writer.write("\"code\": \"02\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                writer.write("\"display\": \"Krankenhausbehandlung, vollstationär mit vorausgegangener vorstationärer Behandlung\"");
                break;
            case 3:
                writer.write("\"code\": \"03\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                writer.write("\"display\": \"Krankenhausbehandlung, teilstationär\"");
                break;
            case 4:
                writer.write("\"code\": \"04\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                writer.write("\"display\": \"vorstationäre Behandlung ohne anschließende vollstationäre Behandlung\"");
                break;
            case 5:
                writer.write("\"code\": \"05\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                writer.write("\"display\": \"Stationäre Entbindung\"");
                break;
            case 6:
                writer.write("\"code\": \"06\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                writer.write("\"display\": \"Geburt\"");
                break;
            case 7:
                writer.write("\"code\": \"07\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                writer.write("\"display\": \"Wiederaufnahme wegen Komplikationen (Fallpauschale) nach KFPV 2003\"");
                break;
            case 8:
                writer.write("\"code\": \"08\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                writer.write("\"display\": \"Stationäre Aufnahme zur Organentnahme\"");
                break;
            case 9:
                writer.write("\"code\": \"10\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                writer.write("\"display\": \"Stationsäquivalente Behandlung\"");
                break;
        }

    }

}
