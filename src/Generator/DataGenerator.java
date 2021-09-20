package Generator;

import Templates.VirologischerBefund;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataGenerator {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the amount of Fhir files you want to generate per template:");

        int amount = Integer.parseInt(input.readLine());

        int number;

        VirologischerBefund VirologischerBefund = new VirologischerBefund();

        for (number = 1; number <= amount; number++){
            VirologischerBefund.CreateVirologischerBefundRescource(number);
        }

    }
}
