package Templates.PatientenaufenthaltResources;

import Generator.BasicWriteCommands;
import Templates.SharedResources.SharedHospitalization;

import java.io.BufferedWriter;
import java.io.IOException;

public class Hospitalization {

    public static void CreateHospitalization (BufferedWriter writer, int HospitalizationAdmitSourceCode, int HospitalizationDischargeDipositionCode) throws IOException {

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
        BasicWriteCommands.Indents(writer,5);
        SharedHospitalization.AdmitSourceCases(writer, HospitalizationAdmitSourceCode);
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
        BasicWriteCommands.Indents(writer,5);
        SharedHospitalization.DischargeDispositionCases(writer, HospitalizationDischargeDipositionCode);
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

}
