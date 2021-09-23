package Templates;

import Generator.BasicWriteCommands;
import Templates.SharedResources.SharedServiceProvider;
import Templates.StationaererVersorgungsfallResources.ReasonCode;
import Templates.StationaererVersorgungsfallResources.Hospitalization;
import Templates.StationaererVersorgungsfallResources.Location;
import Templates.StationaererVersorgungsfallResources.ServiceType;
import Templates.SharedResources.SharedDiagnosis;
import Templates.SharedResources.SharedID;
import Templates.SharedResources.SharedStatus;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StationaererVersorgungsfall {

    public void CreateStationaererVersorgungsfallRescource(int number, int SerivceTypeCode, int HospitalizationAdmitSourceCode, int HospitalizationDischargeDipositionCode, int ReasonCodeCode, int StatusCode) throws IOException {

        FileWriter NewTemplate = new FileWriter("StationaererVersorgungsfall_Nr"+number+".json");

        BufferedWriter writer = new BufferedWriter(NewTemplate);

        BasicWriteCommands.Open(writer);

        CreateStationaererVersorgungsfall(writer,SerivceTypeCode,HospitalizationAdmitSourceCode,HospitalizationDischargeDipositionCode,ReasonCodeCode,StatusCode);

        BasicWriteCommands.Close(writer);

        writer.close();
    }

    private void CreateStationaererVersorgungsfall(BufferedWriter writer, int SerivceTypeCode, int HospitalizationAdmitSourceCode, int HospitalizationDischargeDipositionCode, int ReasonCodeCode, int StatusCode) throws IOException {

        /**
         * Header
         */
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"resourceType\": \"Encounter\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,1);
        SharedID.WriteID(writer);
        writer.newLine();

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
        SharedStatus.StatusCases(writer,StatusCode);
        writer.newLine();

        /**
         * Class
         */
        BasicWriteCommands.Indents(writer,1);
        writer.write("\"class\": {");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"system\": \"http://hl7.org/fhir/v3/ActCode/cs.html\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"code\": \"IMP\",");
        writer.newLine();
        BasicWriteCommands.Indents(writer,2);
        writer.write("\"display\": \"stationär\"");
        writer.newLine();
        BasicWriteCommands.Indents(writer,1);
        BasicWriteCommands.CloseAndContinue(writer);

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
