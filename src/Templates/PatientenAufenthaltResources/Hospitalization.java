package Templates.PatientenAufenthaltResources;

import Generator.BasicWriteCommands;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Hospitalization {

    public static void CreateHospitalization (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,1);
        writer.write("\"hospitalization\": {");
        writer.newLine();

        /**
         * AdmitSource
         */
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"admitSource\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"coding\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"system\": \"https://www.medizininformatik-initiative.de/fhir/core/modul-fall/CodeSystem/Aufnahmeanlass\",");
        writer.newLine();
        AdmitSourceCases(writer);
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.CloseAndContinue(writer);

        /**
         * DischargeDisposition
         */
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"dischargeDisposition\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"coding\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"system\": \"https://www.medizininformatik-initiative.de/fhir/core/modul-fall/CodeSystem/Entlassungsgrund\",");
        writer.newLine();
        DischargeDispositionCases(writer);
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Close(writer);

        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.CloseAndContinue(writer);
    }

    private static void AdmitSourceCases (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,5);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 8 + 1);

        switch (randomNum) {
            case 1:
                writer.write("\"code\": \"E\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Einweisung durch einen Arzt\"");
                break;
            case 2:
                writer.write("\"code\": \"Z\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Einweisung durch einen Zahnarzt\"");
                break;
            case 3:
                writer.write("\"code\": \"N\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Notfall\"");
                break;
            case 4:
                writer.write("\"code\": \"R\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Aufnahme nach vorausgehender Behandlung in einer Rehabilitationseinrichtung\"");
                break;
            case 5:
                writer.write("\"code\": \"V\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Verlegung mit Behandlungsdauer im verlegenden Krankenhaus länger als 24 Stunden\"");
                break;
            case 6:
                writer.write("\"code\": \"A\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Verlegung mit Behandlungsdauer im verlegenden Krankenhaus bis zu 24 Stunden\"");
                break;
            case 7:
                writer.write("\"code\": \"G\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Geburt\"");
                break;
            case 8:
                writer.write("\"code\": \"B\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Begleitperson oder mitaufgenommene Pflegekraft\"");
                break;
        }
    }

    private static void DischargeDispositionCases (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,5);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 8 + 1);

        switch (randomNum) {
            case 1:
                writer.write("\"code\": \"01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Behandlung regulär beendet\"");
                break;
            case 2:
                writer.write("\"code\": \"02\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Behandlung regulär beendet, nachstationäre Behandlung vorgesehen\"");
                break;
            case 3:
                writer.write("\"code\": \"03\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Behandlung aus sonstigen Gründen beendet\"");
                break;
            case 4:
                writer.write("\"code\": \"04\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Behandlung gegen ärztlichen Rat beendet\"");
                break;
            case 5:
                writer.write("\"code\": \"05\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Zuständigkeitswechsel des Kostenträgers\"");
                break;
            case 6:
                writer.write("\"code\": \"06\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Verlegung in ein anderes Krankenhaus\"");
                break;
            case 7:
                writer.write("\"code\": \"07\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Tod\"");
                break;
            case 8:
                writer.write("\"code\": \"08\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 5);
                writer.write("\"display\": \"Verlegung in ein anderes Krankenhaus im Rahmen einer Zusammenarbeit (§ 14 Abs. 5 Satz 2 BPflV in der am 31.12.2003 geltenden Fassung)\"");
                break;
        }
    }

}
