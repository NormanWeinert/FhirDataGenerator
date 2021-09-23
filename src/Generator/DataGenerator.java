package Generator;

import Templates.Impfstatus;
import Templates.Patientenaufenthalt;
import Templates.StationaererVersorgungsfall;
import Templates.VirologischerBefund;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

public class DataGenerator {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the amount of Fhir files you want to generate per template:");

        int amount = Integer.parseInt(input.readLine());

        int number;

        VirologischerBefund VirologischerBefund = new VirologischerBefund();
        Impfstatus Impfstatus = new Impfstatus();
        Patientenaufenthalt PatientenAufenthalt = new Patientenaufenthalt();
        StationaererVersorgungsfall StationaererVersorgungsfall = new StationaererVersorgungsfall();

        int SerivceTypeCode;
        int HospitalizationAdmitSourceCode;
        int HospitalizationDischargeDipositionCode;
        int ReasonCodeCode;
        int StatusCode;

        for (number = 1; number <= amount; number++){

            SerivceTypeCode = CreateSerivceTypeCode();
            HospitalizationAdmitSourceCode = CreateHospitalizationAdmitSourceCode();
            HospitalizationDischargeDipositionCode = CreateHospitalizationDischargeDipositionCode();
            ReasonCodeCode = CreateReasonCodeCode();
            StatusCode = CreateStatusCode();

            VirologischerBefund.CreateVirologischerBefundRescource(number);
            Impfstatus.CreateImpfstatusRescource(number);
            PatientenAufenthalt.CreatePatientenaufenthaltRescource(number,SerivceTypeCode,HospitalizationAdmitSourceCode,HospitalizationDischargeDipositionCode,ReasonCodeCode,StatusCode);
            StationaererVersorgungsfall.CreateStationaererVersorgungsfallRescource(number,SerivceTypeCode,HospitalizationAdmitSourceCode,HospitalizationDischargeDipositionCode,ReasonCodeCode,StatusCode);
        }
    }

    private static int CreateSerivceTypeCode() {

        int randomNum = ThreadLocalRandom.current().nextInt(1, 39 + 1);

        return randomNum;
    }

    private static int CreateHospitalizationAdmitSourceCode() {

        int randomNum = ThreadLocalRandom.current().nextInt(1, 8 + 1);

        return randomNum;

    }

    private static int CreateHospitalizationDischargeDipositionCode() {

        int randomNum = ThreadLocalRandom.current().nextInt(1, 29 + 1);

        return randomNum;

    }

    private static int CreateReasonCodeCode() {

        int randomNum = ThreadLocalRandom.current().nextInt(1, 9 + 1);

        return randomNum;
    }

    private static int CreateStatusCode() {

        int randomNum = ThreadLocalRandom.current().nextInt(1, 7 + 1);

        return randomNum;
    }

}
