package Templates.VirologischerBefundRescources;

import Generator.BasicWriteCommands;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class VirologischerBefundDiagnosticReport {

    public static void CreateDiagnosticReport (BufferedWriter writer) throws IOException {

        /**
         * Header
         */
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"fullUrl\": \"urn:uuid:61ebe359-bfdc-4613-8bf2-c5e300945f01\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"resource\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"resourceType\": \"DiagnosticReport\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"meta\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"profile\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"http://highmed.org/fhir/StructureDefinition/ic/DiagnosticReportLab\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.CloseAndContinue(writer);

        /**
         * Identifier
         */
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"identifier\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"system\": \"urn:ietf:rfc:4122\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"value\": \"{{patientId}}\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.CloseAndContinueField(writer);

        /**
         * Status
         */
        BasicWriteCommands.Indents(writer,4);
        DiagnosticReportStatus(writer);
        writer.newLine();

        /**
         * Code
         */
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"code\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"coding\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,7);
        writer.write("\"system\": \"http://loinc.org\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,7);
        writer.write("\"code\": \"11502-2\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,7);
        writer.write("\"display\": \"Laboratory report\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.CloseAndContinue(writer);

        /**
         * Subject
         */
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"subject\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"identifier\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"system\": \"urn:ietf:rfc:4122\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"value\": \"{{patientId}}\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.CloseAndContinue(writer);

        /**
         * Encounter
         */
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"encounter\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"reference\": \"http://external.fhir.server/Encounter/555\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.CloseAndContinue(writer);

        /**
         * Result
         */
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"result\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"reference\": \"Observation/1\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.CloseField(writer);

        /**
         * Close Rescource
         */
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.CloseAndContinue(writer);

        /**
         * Request
         */
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"request\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"method\": \"POST\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"url\": \"DiagnosticReport\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.Close(writer);

        /**
         * Close Entry
         */
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.CloseAndContinue(writer);

    }

    private static void DiagnosticReportStatus (BufferedWriter writer) throws IOException {

        int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);

        switch (randomNum) {
            case 1:
                writer.write("\"status\": \"registered\",");
                break;
            case 2:
                writer.write("\"status\": \"partial\",");
                break;
            case 3:
                writer.write("\"status\": \"preliminary\",");
                break;
            case 4:
                writer.write("\"status\": \"final\",");
                break;
            case 5:
                writer.write("\"status\": \"amended\",");
                break;
            case 6:
                writer.write("\"status\": \"corrected\",");
                break;
            case 7:
                writer.write("\"status\": \"appended\",");
                break;
            case 8:
                writer.write("\"status\": \"cancelled\",");
                break;
            case 9:
                writer.write("\"status\": \"entered-in-error\",");
                break;
            case 10:
                writer.write("\"status\": \"unknown\",");
                break;
        }
    }

}
