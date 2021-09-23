package Templates;

import Generator.BasicWriteCommands;
import Templates.ImpfstatusResources.Impfstoff;
import Templates.ImpfstatusResources.ImpfungGegen;
import Templates.SharedResources.SharedID;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Impfstatus {

    public void CreateImpfstatusRescource (int number) throws IOException {

        FileWriter NewTemplate = new FileWriter("Impfstatus_Nr"+number+".json");

        BufferedWriter writer = new BufferedWriter(NewTemplate);

        BasicWriteCommands.Open(writer);

        CreateImpfstatus(writer);

        BasicWriteCommands.Close(writer);

        writer.close();
    }

    private void CreateImpfstatus (BufferedWriter writer) throws IOException {

        /**
         * Header
         */
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"resourceType\": \"Immunization\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,1);
        SharedID.WriteID(writer);
        writer.newLine();
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"meta\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"profile\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/immunization\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.CloseAndContinue(writer);
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"occurrenceDateTime\": \"2020-10-06\",");
        writer.newLine();

        /**
         * Patient
         */
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"patient\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"identifier\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"system\": \"urn:ietf:rfc:4122\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"value\": \"{{patientId}}\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.CloseAndContinue(writer);

        /**
         * ProtocolApplied
         */
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"protocolApplied\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"_doseNumberString\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"extension\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"url\": \"http://hl7.org/fhir/StructureDefinition/data-absent-reason\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"valueCode\": \"unknown\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.CloseAndContinue(writer);
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"targetDisease\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"coding\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        BasicWriteCommands.Open(writer);
        ImpfungGegen.ImpfungGegenCases(writer);
        writer.newLine();
        BasicWriteCommands.Indents(writer,7);
        writer.write("\"system\": \"http://snomed.info/sct\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.CloseAndContinueField(writer);

        /**
         * Status
         */
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"status\": \"completed\",");
        writer.newLine();

        /**
         * VaccineCode
         */
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"vaccineCode\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"coding\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.Open(writer);
        Impfstoff.ImpfstoffCases(writer);
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"system\": \"http://snomed.info/sct\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.CloseAndContinue(writer);

        /**
         * Performer
         */
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"performer\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"actor\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"identifier\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"system\": \"urn:performer:identifier:system\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"value\": \"performer_123456\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.CloseAndContinue(writer);
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"actor\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"identifier\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"system\": \"urn:organization:identifier:system\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"value\": \"organization_123456\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.CloseAndContinue(writer);
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"type\": \"Organization\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.CloseField(writer);
    }
}
