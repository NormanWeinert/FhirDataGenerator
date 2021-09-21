package Templates.VirologischerBefundRescources;

import Generator.BasicWriteCommands;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class VirologischerBefundSpecimen {

    public static void CreateSpecimen (BufferedWriter writer) throws IOException {

        /**
         * Header
         */
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"fullUrl\": \"urn:uuid:61ebe359-bfdc-4613-8bf2-c5e300945f04\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"resource\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"resourceType\": \"Specimen\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"meta\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"profile\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"http://hl7.org/fhir/StructureDefinition/Specimen\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.CloseAndContinue(writer);

        /**
         * AccessionIdentifier
         */
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"accessionIdentifier\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"assigner\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"display\": \"DISPLAY\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.CloseAndContinue(writer);
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"id\": \"ID\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"type\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"text\": \"URI\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.Close(writer);
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
         * Collection
         */
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"collection\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"collectedDateTime\" : \"2011-08-16T06:15:00Z\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"bodySite\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"coding\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,7);
        BasicWriteCommands.Open(writer);
        NameDerKoerperstelle(writer);
        writer.newLine();
        BasicWriteCommands.Indents(writer,7);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,6);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.Close(writer);

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
        writer.write("\"url\": \"Specimen\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.Close(writer);

        /**
         * Close Entry
         */
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Close(writer);

    }

    private static void NameDerKoerperstelle (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,8);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 8 + 1);

        switch (randomNum) {
            case 1:
                writer.write("\"code\": \"367592002\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,8);
                writer.write("\"display\": \"Structure of posterior nasopharynx (body structure)\"");
                break;
            case 2:
                writer.write("\"code\": \"12999009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,8);
                writer.write("\"display\": \"Structure of posterior wall of oropharynx (body structure)\"");
                break;
            case 3:
                writer.write("\"code\": \"700016008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,8);
                writer.write("\"display\": \"Structure of internal part of mouth (body structure)\"");
                break;
            case 4:
                writer.write("\"code\": \"44567001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,8);
                writer.write("\"display\": \"Tracheal structure (body structure)\"");
                break;
            case 5:
                writer.write("\"code\": \"82094008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,8);
                writer.write("\"display\": \"Lower respiratory tract structure (body structure)\"");
                break;
            case 6:
                writer.write("\"code\": \"91724006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,8);
                writer.write("\"display\": \"Tracheobronchial structure (body structure)\"");
                break;
            case 7:
                writer.write("\"code\": \"955009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,8);
                writer.write("\"display\": \"Bronchial structure (body structure)\"");
                break;
            case 8:
                writer.write("\"code\": \"113253006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,8);
                writer.write("\"display\": \"Pulmonary alveolar structure (body structure)\"");
                break;
        }
    }
}
