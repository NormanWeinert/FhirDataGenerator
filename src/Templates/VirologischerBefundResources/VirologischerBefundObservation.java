package Templates.VirologischerBefundResources;

import Generator.BasicWriteCommands;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class VirologischerBefundObservation {

    public static void CreateObservation (BufferedWriter writer) throws IOException {

        /**
         * Header
         */
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"fullUrl\": \"urn:uuid:61ebe359-bfdc-4613-8bf2-c5e300945f0a\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"resource\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"resourceType\": \"Observation\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"meta\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"profile\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"http://highmed.org/StructureDefinition/ic/VirologischerBefund\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.CloseAndContinue(writer);

        /**
         * Identifier
         */
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"identifier\":[");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"type\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,7);
        writer.write("\"coding\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,8);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,9);
        writer.write("\"system\": \"http://terminology.hl7.org/CodeSystem/v2-0203\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,9);
        writer.write("\"code\": \"OBI\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,8);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,7);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,6);
        BasicWriteCommands.CloseAndContinue(writer);
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"system\": \"https://www.charite.de/fhir/CodeSystem/lab-identifiers\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"assigner\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,7);
        writer.write("\"reference\": \"Organization/Charité\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.CloseAndContinueField(writer);

        /**
         * Status
         */
        BasicWriteCommands.Indents(writer,4);
        ObservationStatus(writer);
        writer.newLine();

        /**
         * Category
         */
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"category\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"coding\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,7);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,8);
        writer.write("\"system\": \"http://loinc.org\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,8);
        writer.write("\"code\": \"26436-6\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,7);
        BasicWriteCommands.CloseAndContinue(writer);
        BasicWriteCommands.Indents(writer,7);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,8);
        writer.write("\"system\": \"http://terminology.hl7.org/CodeSystem/observation-category\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,8);
        writer.write("\"code\": \"laboratory\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,7);
        BasicWriteCommands.CloseAndContinue(writer);
        BasicWriteCommands.Indents(writer,7);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,8);
        writer.write("\"code\": \"122442008\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,8);
        writer.write("\"display\": \"Detection of virus (procedure)\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,7);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,6);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.CloseAndContinueField(writer);

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
        Virusnachweistest(writer);
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
        writer.write("\"identifier\":{");
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
         * EffectiveDateTime
         */
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"effectiveDateTime\": \"2021-05-16T08:49:21+02:00\",");
        writer.newLine();

        /**
         * Value
         */
        ValueChoice(writer);

        /**
         * Specimen
         */
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"specimen\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"identifier\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"assigner\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,7);
        writer.write("\"display\": \"DISPLAY\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        BasicWriteCommands.CloseAndContinue(writer);
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"id\": \"ID\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"type\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,7);
        writer.write("\"text\": \"URI\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        BasicWriteCommands.Close(writer);
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
        writer.write("\"url\": \"Observation\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.Close(writer);

        /**
         * Close Entry
         */
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.CloseAndContinue(writer);
    }

    private static void ObservationStatus (BufferedWriter writer) throws IOException {

        int randomNum = ThreadLocalRandom.current().nextInt(1, 8 + 1);

        switch (randomNum) {
            case 1:
                writer.write("\"status\": \"registered\",");
                break;
            case 2:
                writer.write("\"status\": \"preliminary\",");
                break;
            case 3:
                writer.write("\"status\": \"final\",");
                break;
            case 4:
                writer.write("\"status\": \"amended\",");
                break;
            case 5:
                writer.write("\"status\": \"corrected\",");
                break;
            case 6:
                writer.write("\"status\": \"cancelled\",");
                break;
            case 7:
                writer.write("\"status\": \"entered-in-error\",");
                break;
            case 8:
                writer.write("\"status\": \"unknown\",");
                break;
        }
    }

    private static void Virusnachweistest (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,7);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);

        switch (randomNum) {
            case 1:
                writer.write("\"code\": \"94500-6\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,7);
                writer.write("\"display\": \"SARS-CoV-2 (COVID-19) RNA [Presence] in Respiratory specimen by NAA with probe detection\"");
                break;
            case 2:
                writer.write("\"code\": \"94558-4\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,7);
                writer.write("\"display\": \"SARS-CoV-2 Ag\"");
                break;
            case 3:
                writer.write("\"code\": \"94745-7\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,7);
                writer.write("\"display\": \"SARS-CoV-2 (COVID-19) RNA [Cycle Threshold #] in Respiratory specimen by NAA with probe detection\"");
                break;
        }
    }

    private static void ValueChoice (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,4);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 2 + 1);

        switch (randomNum) {
            case 1:
                writer.write("\"valueCodeableConcept\": {");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                writer.write("\"coding\": [");
                writer.newLine();
                BasicWriteCommands.Indents(writer,6);
                BasicWriteCommands.Open(writer);
                Nachweis(writer);
                BasicWriteCommands.Indents(writer,6);
                BasicWriteCommands.Close(writer);
                BasicWriteCommands.Indents(writer,5);
                BasicWriteCommands.CloseField(writer);
                BasicWriteCommands.Indents(writer,4);
                BasicWriteCommands.CloseAndContinue(writer);
                break;
            case 2:
                writer.write("\"valueQuantity\": {");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                writer.write("\"value\": 72.0,");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                writer.write("\"unit\": \"µmol/l\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                writer.write("\"system\": \"http://unitsofmeasure.org\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,5);
                writer.write("\"code\": \"umol/L\"");
                writer.newLine();
                BasicWriteCommands.Indents(writer,4);
                BasicWriteCommands.CloseAndContinue(writer);
                break;
        }
    }

    private static void Nachweis (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,7);
        writer.write("\"system\": \"http://snomed.info/sct\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,7);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);

        switch (randomNum) {
            case 1:
                writer.write("\"code\": \"260373001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,7);
                writer.write("\"display\": \"Detected (qualifier value)\"");
                writer.newLine();
                break;
            case 2:
                writer.write("\"code\": \"260415000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,7);
                writer.write("\"display\": \"Not detected (qualifier value)\"");
                writer.newLine();
                break;

            case 3:
                writer.write("\"code\": \"419984006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer,7);
                writer.write("\"display\": \"Inconclusive (qualifier value)\"");
                writer.newLine();
                break;
        }
    }
}
