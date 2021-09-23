package Templates;

import Generator.BasicWriteCommands;
import Templates.PatientenaufenthaltResources.Hospitalization;
import Templates.PatientenaufenthaltResources.Location;
import Templates.PatientenaufenthaltResources.ReasonCode;
import Templates.PatientenaufenthaltResources.ServiceType;
import Templates.SharedResources.SharedDiagnosis;
import Templates.SharedResources.SharedServiceProvider;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Patientenaufenthalt {

    public void CreatePatientenaufenthaltRescource(int number, int SerivceTypeCode, int HospitalizationAdmitSourceCode, int HospitalizationDischargeDipositionCode, int ReasonCodeCode) throws IOException {

        FileWriter NewTemplate = new FileWriter("Patientenaufenthalt_Nr"+number+".json");

        BufferedWriter writer = new BufferedWriter(NewTemplate);

        BasicWriteCommands.Open(writer);

        CreatePatientenaufenthalt(writer,SerivceTypeCode,HospitalizationAdmitSourceCode,HospitalizationDischargeDipositionCode,ReasonCodeCode);

        BasicWriteCommands.Close(writer);

        writer.close();

    }

    private void CreatePatientenaufenthalt(BufferedWriter writer, int SerivceTypeCode, int HospitalizationAdmitSourceCode, int HospitalizationDischargeDipositionCode, int ReasonCodeCode) throws IOException {

        /**
         * Header
         */
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"resourceType\": \"Encounter\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"id\": \"28436186-b5b3-4881-b000-8a89abf659b7\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"meta\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"profile\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"https://www.medizininformatik-initiative.de/fhir/core/modul-fall/StructureDefinition/KontaktGesundheitseinrichtung\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.CloseAndContinue(writer);

        /**
         * Identifier
         */
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"identifier\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"type\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        writer.write("\"coding\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"system\": \"http://terminology.hl7.org/CodeSystem/v2-0203\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,6);
        writer.write("\"code\": \"VN\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.CloseAndContinue(writer);
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"system\": \"http://medizininformatik-initiative.de/fhir/NamingSystem/Aufnahmenummer/MusterKrankenhaus\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"value\": \"F_0000001\",");
        writer.newLine();
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

        /**
         * Status
         */
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"status\": \"finished\",");
        writer.newLine();

        /**
         * Class
         */
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"class\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"system\": \"https://www.medizininformatik-initiative.de/fhir/core/CodeSystem/EncounterClassAdditionsDE\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"code\": \"operation\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"display\": \"Operation\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.CloseAndContinue(writer);

        /**
         * Type
         */
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"type\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"coding\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"system\": \"https://www.medizininformatik-initiative.de/fhir/core/modul-fall/CodeSystem/Kontaktebene\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"code\": \"abteilungskontakt\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"display\": \"Abteilungskontakt\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,5);
        writer.write("\"userSelected\": false");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.CloseField(writer);
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.CloseAndContinueField(writer);

        /**
         * Subject
         */
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

        /**
         * Diagnosis
         */
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"diagnosis\": [");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Open(writer);
        BasicWriteCommands.Indents(writer,3);
        writer.write("\"condition\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,4);
        SharedDiagnosis.WriteDiagnosis(writer);
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.CloseAndContinueField(writer);

        /**
         * Period
         */
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"period\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"start\": \"2021-02-13T03:04:00+01:00\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"end\": \"2021-03-01T20:42:00+01:00\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.CloseAndContinue(writer);

        /**
         * ReasonCode
         */
        ReasonCode.CreateReasonCode(writer, ReasonCodeCode);

        /**
         * Hospitalization
         */
        Hospitalization.CreateHospitalization(writer, HospitalizationAdmitSourceCode, HospitalizationDischargeDipositionCode);

        /**
         * Location
         */
        Location.CreateLocation(writer);

        /**
         * ServiceType
         */
        ServiceType.CreateServiceType(writer, SerivceTypeCode);

        /**
         * ServiceProvider
         */
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"serviceProvider\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"identifier\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        SharedServiceProvider.WriteServiceProviderSystem(writer);
        writer.newLine();
        BasicWriteCommands.Indents(writer,3);
        SharedServiceProvider.WriteServiceProviderValue(writer);
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        BasicWriteCommands.Close(writer);
        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.Close(writer);
    }

}
