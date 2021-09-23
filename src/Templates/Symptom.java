package Templates;

import Generator.BasicWriteCommands;
import Templates.SharedResources.SharedID;
import Templates.SymptomResources.Code;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Symptom {

    public void CreateSymptomRescource (int number) throws IOException {

        FileWriter NewTemplate = new FileWriter("Symptom_Nr"+number+".json");

        BufferedWriter writer = new BufferedWriter(NewTemplate);

        BasicWriteCommands.Open(writer);

        CreateSymptomHeader(writer);

        BasicWriteCommands.Close(writer);

        writer.close();
    }

    private void CreateSymptomHeader(BufferedWriter writer) throws IOException {

        /**
         * 1-2 Covid present  3-4 Covid absent 5 Unkown
         */
        int Case = ThreadLocalRandom.current().nextInt(1, 5 + 1);

        /**
         * Header
         */
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"resourceType\": \"Condition\",");
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
        writer.write("\"https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/symptoms-covid-19\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.CloseAndContinue(writer);

        /**
         * CheckForUnkown
         */
        if (Case == 5){
            CreateSymptomUnknown(writer);
        } else {
            CreateSymptom(writer, Case);
        }
    }

    private void CreateSymptom(BufferedWriter writer, int Case) throws IOException {

        /**
         * Category
         */
        WriteCategory(writer);

        /**
         * Code
         */
        WriteCode(writer);

        /**
         * Dates
         */
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"recordedDate\": \"2020-10-05\",");
        writer.newLine();
        if (Case == 3 || Case == 4) {
            BasicWriteCommands.Indents(writer, 1);
            writer.write("\"onsetDateTime\": \"2020-10-05\",");
            writer.newLine();
        }

        /**
         * Subject
         */
        WriteSubject(writer);

        /**
         * VerificationStatus
         */
        if (Case == 1 || Case == 2){
            WriteVerificationStatusPresent(writer);
        } else if (Case == 3 || Case == 4) {
            WriteVerificationStatusAbsent(writer);
        }

        /**
         * Recorder
         */
        if (Case == 3 || Case == 4) {
            WriteRecorder(writer);
        }
    }

    private void CreateSymptomUnknown(BufferedWriter writer) throws IOException {

        /**
         * ModifierExtension
         */
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"modifierExtension\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"url\": \"https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"valueCodeableConcept\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"coding\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"code\": \"261665006\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"display\": \"Unknown (qualifier value)\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"system\": \"http://snomed.info/sct\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.CloseAndContinueField(writer);
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"text\": \"Presence of symptom is unknown.\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.CloseAndContinueField(writer);

        /**
         * Category
         */
        WriteCategory(writer);

        /**
         * Code
         */
        WriteCode(writer);

        /**
         * Dates
         */
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"recordedDate\": \"2020-10-05\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"onsetDateTime\": \"2020-10-05\",");
        writer.newLine();

        /**
         * Subject
         */
        WriteSubject(writer);

    }

    private void WriteCategory(BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,1);
        writer.write("\"category\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"coding\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"code\": \"75325-1\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"display\": \"Symptom\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"system\": \"http://loinc.org\"");
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

    private void WriteCode(BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,1);
        writer.write("\"code\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"coding\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.Open(writer);
        Code.CreateCode(writer);
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
    }

    private void WriteSubject(BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,1);
        writer.write("\"subject\": {");
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
    }

    private void WriteVerificationStatusPresent (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,1);
        writer.write("\"verificationStatus\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"coding\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"code\": \"confirmed\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"display\": \"Confirmed\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"system\": \"http://terminology.hl7.org/CodeSystem/condition-ver-status\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.CloseAndContinue(writer);
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"code\": \"410605003\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"display\": \"Confirmed present (qualifier value)\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"system\": \"http://snomed.info/sct\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.Close(writer);

    }

    private void WriteVerificationStatusAbsent (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,1);
        writer.write("\"verificationStatus\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"coding\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"code\": \"refuted\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"display\": \"Refuted\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"system\": \"http://terminology.hl7.org/CodeSystem/condition-ver-status\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.CloseAndContinue(writer);
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"code\": \"410594000\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"display\": \"Definitely NOT present (qualifier value)\",");
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
    }

    private void WriteRecorder (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,1);
        writer.write("\"recorder\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"identifier\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"system\": \"urn:recorder:identifier:system\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"value\": \"recorder_123456\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.Close(writer);
    }
}
