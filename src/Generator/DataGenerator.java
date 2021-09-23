package Generator;

import Templates.Impfstatus;
import Templates.Patientenaufenthalt;
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

        int SerivceTypeCode = CreateSerivceTypeCode();
        int HospitalizationAdmitSourceCode = CreateHospitalizationAdmitSourceCode();
        int HospitalizationDischargeDipositionCode = CreateHospitalizationDischargeDipositionCode();
        int ReasonCodeCode = CreateReasonCodeCode();
        
        for (number = 1; number <= amount; number++){
            VirologischerBefund.CreateVirologischerBefundRescource(number);
            Impfstatus.CreateImpfstatusRescource(number);
            PatientenAufenthalt.CreatePatientenaufenthaltRescource(number,SerivceTypeCode,HospitalizationAdmitSourceCode,HospitalizationDischargeDipositionCode,ReasonCodeCode);
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

}
