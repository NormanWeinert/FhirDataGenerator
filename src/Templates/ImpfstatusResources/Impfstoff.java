package Templates.ImpfstatusResources;

import Generator.BasicWriteCommands;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Impfstoff {

    public static void ImpfstoffCases (BufferedWriter writer) throws IOException {

        BasicWriteCommands.Indents(writer,4);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 295 + 1);

        switch (randomNum) {
            case 1:
                writer.write("\"code\": \"421245007\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtheria + pertussis + tetanus vaccine (product)\",");
                break;
            case 2:
                writer.write("\"code\": \"37146000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Typhus vaccine (product)\",");
                break;
            case 3:
                writer.write("\"code\": \"407746005\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Varicella-zoster live attenuated vaccine (product)\",");
                break;
            case 4:
                writer.write("\"code\": \"787859002:127489000=412300006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product (product): Has active ingredient (attribute) = Rubella and mumps vaccine (substance)\",");
                break;
            case 5:
                writer.write("\"code\": \"787859002:{127489000=428126001}{127489000=412374001}{127489000=396433007}{127489000=412375000}{127489000=396424005}{127489000=768365004}{127489000=768366003}\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product (product): { Has active ingredient (attribute) = Diphtheria vaccine (substance) } { Has active ingredient (attribute) = Haemophilus influenzae type b vaccine (substance) } { Has active ingredient (attribute) = Pertussis vaccine (substance) } { Has active ingredient (attribute) = Tetanus vaccine (substance) } { Has active ingredient (attribute) = Hepatitis B virus vaccine (substance) } { Has active ingredient (attribute) = Meningococcus group A vaccine (substance) } { Has active ingredient (attribute) = Meningococcus group C vaccine (substance) }\",");
                break;
            case 6:
                writer.write("\"code\": \"427542001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtheria + tetanus + pertussis + poliomyelitis + recombinant hepatitis B virus vaccine (product)\",");
                break;
            case 7:
                writer.write("\"code\": \"787859002:{127489000=428126001}{127489000=412374001}{127489000=396433007}{127489000=412375000}{127489000=396424005}\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product (product): { Has active ingredient (attribute) = Diphtheria vaccine (substance) } { Has active ingredient (attribute) = Haemophilus influenzae type b vaccine (substance) } { Has active ingredient (attribute) = Pertussis vaccine (substance) } { Has active ingredient (attribute) = Tetanus vaccine (substance) } { Has active ingredient (attribute) = Hepatitis B virus vaccine (substance) }\",");
                break;
            case 8:
                writer.write("\"code\": \"333707007\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Hepatitis A+typhoid vaccine (product)\",");
                break;
            case 9:
                writer.write("\"code\": \"426842004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtheria + tetanus + pertussis + poliomyelitis + recombinant hepatitis B virus + recombinant haemophilus influenzae type B vaccine (product)\",");
                break;
            case 10:
                writer.write("\"code\": \"426971004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Haemophilus influenzae Type b + recombinant hepatitis B virus vaccine (product)\",");
                break;
            case 11:
                writer.write("\"code\": \"787859002:{127489000=428126001}{127489000=396424005}{127489000=412375000}\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product (product): { Has active ingredient (attribute) = Diphtheria vaccine (substance) } { Has active ingredient (attribute) = Hepatitis B virus vaccine (substance) } { Has active ingredient (attribute) = Tetanus vaccine (substance) }\",");
                break;
            case 12:
                writer.write("\"code\": \"414004005\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtheria + tetanus + pertussis + poliomyelitis + haemophilus influenzae b vaccine (product)\",");
                break;
            case 13:
                writer.write("\"code\": \"4426081003\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtheria + tetanus + pertussis + recombinant hepatitis B virus vaccine (product)\",");
                break;
            case 14:
                writer.write("\"code\": \"787859002:{127489000=412374001}{127489000=396436004}\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product (product): { Has active ingredient (attribute) = Haemophilus influenzae type b vaccine (substance) } { Has active ingredient (attribute) = Live Poliovirus vaccine (substance) }\",");
                break;
            case 15:
                writer.write("\"code\": \"787859002:{127489000=428126001}{127489000=396438003}{127489000=412375000}\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product (product): { Has active ingredient (attribute) = Diphtheria vaccine (substance) } { Has active ingredient (attribute) = Rubella vaccine (substance) } { Has active ingredient (attribute) = Tetanus vaccine (substance) }\",");
                break;
            case 16:
                writer.write("\"code\": \"414005006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtheria + tetanus + pertussis + poliomyelitis vaccine (product)\",");
                break;
            case 17:
                writer.write("\"code\": \"414006007\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtheria + tetanus + poliomyelitis vaccine (product)\",");
                break;
            case 18:
                writer.write("\"code\": \"419550004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Measles + mumps + rubella + varicella vaccine (product)\",");
                break;
            case 19:
                writer.write("\"code\": \"787859002:{127489000=396427003}{127489000=396438003}\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product (product): { Has active ingredient (attribute) = Measles vaccine (substance) } { Has active ingredient (attribute) = Rubella vaccine (substance) }\",");
                break;
            case 20:
                writer.write("\"code\": \"61153008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Measles, mumps and rubella vaccine (product)\",");
                break;
            case 21:
                writer.write("\"code\": \"785865001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Measles and mumps vaccine (product)\",");
                break;
            case 22:
                writer.write("\"code\": \"333702001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Hepatitis A+B vaccine (product)\",");
                break;
            case 23:
                writer.write("\"code\": \"350327004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtheria + tetanus vaccine (product)\",");
                break;
            case 24:
                writer.write("\"code\": \"78785900:{127489000=398730001}{127489000=412374001}\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product (product): { Has active ingredient (attribute) = Pneumococcal vaccine (substance) } { Has active ingredient (attribute) = Haemophilus influenzae type b vaccine (substance) }\",");
                break;
            case 25:
                writer.write("\"code\": \"423912009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Haemophilus influenzae type b + Meningococcal group C vaccine (product)\",");
                break;
            case 26:
                writer.write("\"code\": \"787859002:{127489000=412374001}{127489000=396433007}{127489000=396411005}\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product (product): { Has active ingredient (attribute) = Haemophilus influenzae type b vaccine (substance) } { Has active ingredient (attribute) = Pertussis vaccine (substance) } { Has active ingredient (attribute) = Toxoid (substance) }\",");
                break;
            case 27:
                writer.write("\"code\": \"787859002:{127489000=396422009}{127489000=396441007}\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product (product): { Has active ingredient (attribute) = Cholera vaccine (substance) } { Has active ingredient (attribute) = Typhoid vaccine (substance) }\",");
                break;
            case 28:
                writer.write("\"code\": \"333697005\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Japanese B encephalitis vaccine\",");
                break;
            case 29:
                writer.write("\"code\": \"333699008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Tick-borne encephalitis vaccine\",");
                break;
            case 30:
                writer.write("\"code\": \"90043005\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Mumps live virus vaccine\",");
                break;
            case 31:
                writer.write("\"code\": \"111164008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Poliovirus vaccine\",");
                break;
            case 32:
                writer.write("\"code\": \"116077000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Rotavirus vaccine\",");
                break;
            case 33:
                writer.write("\"code\": \"333606008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Rabies vaccine\",");
                break;
            case 34:
                writer.write("\"code\": \"407737004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Varicella-zoster vaccine\",");
                break;
            case 35:
                writer.write("\"code\": \"33234009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Smallpox vaccine\",");
                break;
            case 36:
                writer.write("\"code\": \"424519000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Human papillomavirus vaccine\",");
                break;
            case 37:
                writer.write("\"code\": \"56844000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Yellow fever vaccine\",");
                break;
            case 38:
                writer.write("\"code\": \"386013003\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Rubella vaccine\",");
                break;
            case 39:
                writer.write("\"code\": \"386012008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Measles vaccine\",");
                break;
            case 40:
                writer.write("\"code\": \"14745005\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Hepatitis A virus vaccine\",");
                break;
            case 41:
                writer.write("\"code\": \"34689006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Hepatitis B virus vaccine\",");
                break;
            case 42:
                writer.write("\"code\": \"46233009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Influenza virus vaccine\",");
                break;
            case 43:
                writer.write("\"code\": \"89428009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Typhoid vaccine\",");
                break;
            case 44:
                writer.write("\"code\": \"420538001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Tuberculosos vaccine\",");
                break;
            case 45:
                writer.write("\"code\": \"333621002\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Tetanus vaccine\",");
                break;
            case 46:
                writer.write("\"code\": \"333598008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Pneumococcal vaccine\",");
                break;
            case 47:
                writer.write("\"code\": \"11866009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Plague vaccine\",");
                break;
            case 48:
                writer.write("\"code\": \"61602008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Pertussis vaccine\",");
                break;
            case 49:
                writer.write("\"code\": \"423531006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Meningococcus vaccine\",");
                break;
            case 50:
                writer.write("\"code\": \"333680004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Haemophilus influenzae Type b vaccine\",");
                break;
            case 51:
                writer.write("\"code\": \"428214002\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtheria vaccine\",");
                break;
            case 52:
                writer.write("\"code\": \"35736007\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Cholera vaccine\",");
                break;
            case 53:
                writer.write("\"code\": \"7230005\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Brucella vaccine\",");
                break;
            case 54:
                writer.write("\"code\": \"333521006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Anthrax vaccine\",");
                break;
            case 55:
                writer.write("\"code\": \"714569001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Product containing normal immunoglobulin human (medicinal product)\",");
                break;
            case 56:
                writer.write("\"code\": \"786224004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Product containing human anti-D immunoglobulin (medicinal product)|\",");
                break;
            case 57:
                writer.write("\"code\": \"384706007\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Product containing tetanus antitoxin (medicinal product)\",");
                break;
            case 58:
                writer.write("\"code\": \"62294009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Product containing Varicella-zoster virus antibody (medicinal product)\",");
                break;
            case 59:
                writer.write("\"code\": \"9542007\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Product containing Hepatitis B surface antigen immunoglobulin (medicinal product)\",");
                break;
            case 60:
                writer.write("\"code\": \"80834004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Product containing rabies human immune globulin (medicinal product)\",");
                break;
            case 61:
                writer.write("\"code\": \"9778000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Product containing Cytomegalovirus antibody (medicinal product)\",");
                break;
            case 62:
                writer.write("\"code\": \"108725001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Product containing palivizumab (medicinal product)\",");
                break;
            case 63:
                writer.write("\"code\": \"763703008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Product containing bezlotoxumab (medicinal product)\",");
                break;
            case 64:
                writer.write("\"code\": \"J07AR\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Typhus (exanthematicus)-Impfstoff\",");
                break;
            case 65:
                writer.write("\"code\": \"J07AR01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Typhus exanthematicus, inaktiviert, ganze Zelle\",");
                break;
            case 66:
                writer.write("\"code\": \"J07AC\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Milzbrand-Impfstoffe\",");
                break;
            case 67:
                writer.write("\"code\": \"J07AC01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Anthrax-Antigen\",");
                break;
            case 68:
                writer.write("\"code\": \"J07AD\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Brucellose-Impfstoffe\",");
                break;
            case 69:
                writer.write("\"code\": \"J07AD01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Brucella-Antigen\",");
                break;
            case 70:
                writer.write("\"code\": \"J07AE\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Cholera-Impfstoffe\",");
                break;
            case 71:
                writer.write("\"code\": \"J07AE01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Cholera, inaktiviert, ganze Zelle\",");
                break;
            case 72:
                writer.write("\"code\": \"J07AE02\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Cholera, lebend abgeschwächt\",");
                break;
            case 73:
                writer.write("\"code\": \"J07AE51\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Cholera, Kombinationen mit Typhus-Impfstoff, inaktiviert, ganze Zelle\",");
                break;
            case 74:
                writer.write("\"code\": \"J07AF\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtherie-Impfstoffe\",");
                break;
            case 75:
                writer.write("\"code\": \"J07AF01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtherie-Toxoid\",");
                break;
            case 76:
                writer.write("\"code\": \"J07AG\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Haemophilus influenzae B-Impfstoffe\",");
                break;
            case 77:
                writer.write("\"code\": \"J07AG01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Haemophilus influenzae B, gereinigtes Antigen konjugiert\",");
                break;
            case 78:
                writer.write("\"code\": \"J07AG51\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Haemophilus influenzae B, Kombinationen mit Toxoiden\",");
                break;
            case 79:
                writer.write("\"code\": \"J07AG52\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Haemophilus influenzae B, Kombinationen mit Pertussis und Toxoiden\",");
                break;
            case 80:
                writer.write("\"code\": \"J07AG53\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Haemophilus influenzae B, Kombinationen mit Meningokokken C, konjugiert\",");
                break;
            case 81:
                writer.write("\"code\": \"J07AH\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Meningokokken-Impfstoffe\",");
                break;
            case 82:
                writer.write("\"code\": \"J07AH01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Meningokokken A, gereinigtes Polysaccharid-Antigen\",");
                break;
            case 83:
                writer.write("\"code\": \"J07AH02\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Andere Meningokokken monovalent, gereinigtes Polysaccharid-Antigen\",");
                break;
            case 84:
                writer.write("\"code\": \"J07AH03\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Meningokokken bivalent (A, C), gereinigtes Polysaccharid-Antigen\",");
                break;
            case 85:
                writer.write("\"code\": \"J07AH04\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Meningokokken tetravalent (A, C, Y, W-135), gereinigtes Polysaccharid-Antigen\",");
                break;
            case 86:
                writer.write("\"code\": \"J07AH05\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Andere Meningokokken polyvalent, gereinigtes Polysaccharid-Antigen\",");
                break;
            case 87:
                writer.write("\"code\": \"J07AH06\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Meningokokken B, äußere Vesikelmembran-Impfstoff\",");
                break;
            case 88:
                writer.write("\"code\": \"J07AH07\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Meningokokken C, gereinigtes Polysaccharid-Antigen, konjugiert\",");
                break;
            case 89:
                writer.write("\"code\": \"J07AH08\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Meningokokken tetravalent (A, C, Y, W-135), gereinigtes Polysaccharid-Antigen, konjugiert\",");
                break;
            case 90:
                writer.write("\"code\": \"J07AH09\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Meningokokken B, Multikomponenten-Impfstoff\",");
                break;
            case 91:
                writer.write("\"code\": \"J07AH10\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Meningokokken A, gereinigtes Polysaccharid-Antigen, konjugiert\",");
                break;
            case 92:
                writer.write("\"code\": \"J07AJ\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Pertussis-Impfstoffe\",");
                break;
            case 93:
                writer.write("\"code\": \"J07AJ01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Pertussis, inaktiviert, ganze Zelle\",");
                break;
            case 94:
                writer.write("\"code\": \"J07AJ02\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Pertussis, gereinigtes Antigen\",");
                break;
            case 95:
                writer.write("\"code\": \"J07AJ51\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Pertussis, inaktiviert, ganze Zelle, Kombinationen mit Toxoiden\",");
                break;
            case 96:
                writer.write("\"code\": \"J07AJ52\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Pertussis, gereinigtes Antigen, Kombinationen mit Toxoiden\",");
                break;
            case 97:
                writer.write("\"code\": \"J07AK\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Pest-Impfstoffe\",");
                break;
            case 98:
                writer.write("\"code\": \"J07AK01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Pest, inaktiviert, ganze Zelle\",");
                break;
            case 99:
                writer.write("\"code\": \"J07AL\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Pneumokokken-Impfstoffe\",");
                break;
            case 100:
                writer.write("\"code\": \"J07AL01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Pneumokokken, gereinigtes Polysaccharid-Antigen\",");
                break;
            case 101:
                writer.write("\"code\": \"J07AL02\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Pneumokokken, gereinigtes Polysaccharid-Antigen, konjugiert\",");
                break;
            case 102:
                writer.write("\"code\": \"J07AL52\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Pneumokokken, gereinigtes Polysaccharid-Antigen und Haemophilus influenzae B, konjugiert\",");
                break;
            case 103:
                writer.write("\"code\": \"J07AM\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Tetanus-Impfstoffe\",");
                break;
            case 104:
                writer.write("\"code\": \"J07AM01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Tetanus-Toxoid\",");
                break;
            case 105:
                writer.write("\"code\": \"J07AM51\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Tetanus-Toxoid, Kombinationen mit Diphtherie-Toxoid\",");
                break;
            case 106:
                writer.write("\"code\": \"J07AM52\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Tetanus-Toxoid, Kombinationen mit Tetanus-Immunglobulin\",");
                break;
            case 107:
                writer.write("\"code\": \"J07AN\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Tuberkulose-Impfstoffe\",");
                break;
            case 108:
                writer.write("\"code\": \"J07AN01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Tuberkulose, lebend abgeschwächt\",");
                break;
            case 109:
                writer.write("\"code\": \"J07AP\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Typhus-Impfstoffe\",");
                break;
            case 110:
                writer.write("\"code\": \"J07AP01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Typhus, oral, lebend abgeschwächt\",");
                break;
            case 111:
                writer.write("\"code\": \"J07AP02\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Typhus, inaktiviert, ganze Zelle\",");
                break;
            case 112:
                writer.write("\"code\": \"J07AP03\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Typhus, gereinigtes Polysaccharid-Antigen\",");
                break;
            case 113:
                writer.write("\"code\": \"J07AP10\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Typhus, Kombinationen mit Paratyphustypen\",");
                break;
            case 114:
                writer.write("\"code\": \"J07BA\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Encephalitis-Impfstoffe\",");
                break;
            case 115:
                writer.write("\"code\": \"J07BA01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"FSME, inaktiviert, ganzes Virus\",");
                break;
            case 116:
                writer.write("\"code\": \"J07BA02\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Encephalitis, japanische, inaktiviert, ganzes Virus\",");
                break;
            case 117:
                writer.write("\"code\": \"J07BA03\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Encephalitis, japanische, lebend abgeschwächt\",");
                break;
            case 118:
                writer.write("\"code\": \"J07BB\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Influenza-Impfstoffe\",");
                break;
            case 119:
                writer.write("\"code\": \"J07BB01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Influenza, inaktiviert, ganzes Virus\",");
                break;
            case 120:
                writer.write("\"code\": \"J07BB02\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Influenza, inaktiviert, Spaltvirus oder Oberflächenantigen\",");
                break;
            case 121:
                writer.write("\"code\": \"J07BB03\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Influenza, lebend abgeschwächt\",");
                break;
            case 122:
                writer.write("\"code\": \"J07BC\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Hepatitis-Impfstoffe\",");
                break;
            case 123:
                writer.write("\"code\": \"J07BC01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Hepatitis B, gereinigtes Antigen\",");
                break;
            case 124:
                writer.write("\"code\": \"J07BC02\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Hepatitis A, inaktiviert, ganzes Virus\",");
                break;
            case 125:
                writer.write("\"code\": \"J07BC03\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Hepatitis A, gereinigtes Antigen\",");
                break;
            case 126:
                writer.write("\"code\": \"J07BC20\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Kombinationen\",");
                break;
            case 127:
                writer.write("\"code\": \"J07BD\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Masern-Impfstoffe\",");
                break;
            case 128:
                writer.write("\"code\": \"J07BD01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Masern, lebend abgeschwächt\",");
                break;
            case 129:
                writer.write("\"code\": \"J07BD51\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Masern, Kombinationen mit Mumps, lebend abgeschwächt\",");
                break;
            case 130:
                writer.write("\"code\": \"J07BD52\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Masern, Kombinationen mit Mumps und Röteln, lebend abgeschwächt\",");
                break;
            case 131:
                writer.write("\"code\": \"J07BD53\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Masern, Kombinationen mit Röteln, lebend abgeschwächt\",");
                break;
            case 132:
                writer.write("\"code\": \"J07BD54\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Masern, Kombinationen mit Mumps, Röteln und Varicella, lebend abgeschwächt\",");
                break;
            case 133:
                writer.write("\"code\": \"J07BE\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Mumps-Impfstoffe\",");
                break;
            case 134:
                writer.write("\"code\": \"J07BE01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Mumps, lebend abgeschwächt\",");
                break;
            case 135:
                writer.write("\"code\": \"J07BF\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Poliomyelitis-Impfstoffe\",");
                break;
            case 136:
                writer.write("\"code\": \"J07BF01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Poliomyelitis, oral, monovalent, lebend abgeschwächt\",");
                break;
            case 137:
                writer.write("\"code\": \"J07BF02\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Poliomyelitis, oral, trivalent, lebend abgeschwächt\",");
                break;
            case 138:
                writer.write("\"code\": \"J07BF03\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Poliomyelitis, trivalent, inaktiviert, ganzes Virus\",");
                break;
            case 139:
                writer.write("\"code\": \"J07BF04\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Poliomyelitis, oral, bivalent, lebend abgeschwächt\",");
                break;
            case 140:
                writer.write("\"code\": \"J07BG\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Tollwut-Impfstoffe\",");
                break;
            case 141:
                writer.write("\"code\": \"J07BG01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Tollwut, inaktiviert, ganzes Virus\",");
                break;
            case 142:
                writer.write("\"code\": \"J07BH\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Rotavirus-Diarrhoe-Impfstoffe\",");
                break;
            case 143:
                writer.write("\"code\": \"J07BH01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Rotavirus, lebend abgeschwächt\",");
                break;
            case 144:
                writer.write("\"code\": \"J07BH02\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Rotavirus, pentavalent, lebend, Reassortanten\",");
                break;
            case 145:
                writer.write("\"code\": \"J07BJ\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Röteln-Impfstoffe\",");
                break;
            case 146:
                writer.write("\"code\": \"J07BJ01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Röteln, lebend abgeschwächt\",");
                break;
            case 147:
                writer.write("\"code\": \"J07BJ51\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Röteln, Kombinationen mit Mumps, lebend abgeschwächt\",");
                break;
            case 148:
                writer.write("\"code\": \"J07BK\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Varicella Zoster Impfstoffe\",");
                break;
            case 149:
                writer.write("\"code\": \"J07BK01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Varicella, lebend abgeschwächt\",");
                break;
            case 150:
                writer.write("\"code\": \"J07BK02\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Zoster Virus, lebend abgeschwächt\",");
                break;
            case 151:
                writer.write("\"code\": \"J07BK03\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Zoster Virus, gereinigtes Antigen\",");
                break;
            case 152:
                writer.write("\"code\": \"J07BL\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Gelbfieber-Impfstoffe\",");
                break;
            case 153:
                writer.write("\"code\": \"J07BL01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Gelbfieber, lebend abgeschwächt\",");
                break;
            case 154:
                writer.write("\"code\": \"J07BM\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Papillomvirus-Impfstoffe\",");
                break;
            case 155:
                writer.write("\"code\": \"J07BM01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Humaner-Papillomvirus-Impfstoff (Typen 6,11,16,18)\",");
                break;
            case 156:
                writer.write("\"code\": \"J07BM02\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Humaner-Papillomvirus-Impfstoff (Typen 16,18)\",");
                break;
            case 157:
                writer.write("\"code\": \"J07BM03\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Humaner-Papillomvirus-Impfstoff (Typen 6,11,16,18,31,33,45,52,58)\",");
                break;
            case 158:
                writer.write("\"code\": \"J07BX\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Andere virale Impfstoffe\",");
                break;
            case 159:
                writer.write("\"code\": \"J07BX01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Pocken-Impfstoff, lebend, modifiziert\",");
                break;
            case 160:
                writer.write("\"code\": \"J07CA\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Bakterielle und virale Impfstoffe, kombiniert\",");
                break;
            case 161:
                writer.write("\"code\": \"J07CA01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtherie-Poliomyelitis-Tetanus\",");
                break;
            case 162:
                writer.write("\"code\": \"J07CA02\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtherie-Pertussis-Poliomyelitis-Tetanus\",");
                break;
            case 163:
                writer.write("\"code\": \"J07CA03\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtherie-Röteln-Tetanus\",");
                break;
            case 164:
                writer.write("\"code\": \"J07CA04\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Haemophilus influenzae B und Poliomyelitis\",");
                break;
            case 165:
                writer.write("\"code\": \"J07CA05\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtherie-Hepatitis B-Pertussis-Tetanus\",");
                break;
            case 166:
                writer.write("\"code\": \"J07CA06\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtherie-Haemophilus influenzae B-Pertussis-Poliomyelitis-Tetanus\",");
                break;
            case 167:
                writer.write("\"code\": \"J07CA07\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtherie-Hepatitis B-Tetanus\",");
                break;
            case 168:
                writer.write("\"code\": \"J07CA08\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Haemophilus influenzae B und Hepatitis B\",");
                break;
            case 169:
                writer.write("\"code\": \"J07CA09\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtherie-Haemophilus influenzae B-Pertussis-Poliomyelitis-Tetanus-Hepatitis B\",");
                break;
            case 170:
                writer.write("\"code\": \"J07CA10\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Typhus-Hepatitis A\",");
                break;
            case 171:
                writer.write("\"code\": \"J07CA11\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtherie-Haemophilus influenzae B-Pertussis-Tetanus-Hepatitis B\",");
                break;
            case 172:
                writer.write("\"code\": \"J07CA12\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtherie-Pertussis-Poliomyelitis-Tetanus-Hepatitis B\",");
                break;
            case 173:
                writer.write("\"code\": \"J07CA13\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Diphtherie-Haemophilus influenzae B-Pertussis-Tetanus-Hepatitis B-Meningokokken A + C\",");
                break;
            case 174:
                writer.write("\"code\": \"J06BA\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Immunglobuline, normal human\",");
                break;
            case 175:
                writer.write("\"code\": \"J06BA01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Immunglobuline, normal human, zur extravasalen Anwendung\",");
                break;
            case 176:
                writer.write("\"code\": \"J06BA02\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Immunglobuline, normal human, zur intravasalen Anwendung\",");
                break;
            case 177:
                writer.write("\"code\": \"J06BB\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Spezifische Immunglobuline\",");
                break;
            case 178:
                writer.write("\"code\": \"J06BB01\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Anti-D(rh)-Immunglobulin\",");
                break;
            case 179:
                writer.write("\"code\": \"J06BB02\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Tetanus-Immunglobulin\",");
                break;
            case 180:
                writer.write("\"code\": \"J06BB03\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Varicella/Zoster-Immunglobulin\",");
                break;
            case 181:
                writer.write("\"code\": \"J06BB04\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Hepatitis-B-Immunglobulin\",");
                break;
            case 182:
                writer.write("\"code\": \"J06BB05\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Tollwut-Immunglobulin\",");
                break;
            case 183:
                writer.write("\"code\": \"J06BB09\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Cytomegalievirus-Immunglobulin\",");
                break;
            case 184:
                writer.write("\"code\": \"J06BB16\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Palivizumab\",");
                break;
            case 185:
                writer.write("\"code\": \"J06BB21\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Bezlotoxumab\",");
                break;
            case 186:
                writer.write("\"code\": \"1119305005\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Severe acute respiratory syndrome coronavirus 2 antigen (medicinal product)\",");
                break;
            case 187:
                writer.write("\"code\": \"1119349007\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Severe acute respiratory syndrome coronavirus 2 messenger ribonucleic acid (medicinal product)\",");
                break;
            case 188:
                writer.write("\"code\": \"836503005\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Bordetella pertussis and Clostridium tetani and Corynebacterium diphtheriae antigens (medicinal product)\",");
                break;
            case 189:
                writer.write("\"code\": \"2221000221107\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only live attenuated Human alphaherpesvirus 3 antigen (medicinal product)\",");
                break;
            case 190:
                writer.write("\"code\": \"836376002\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Mumps orthorubulavirus and Rubella virus antigens (medicinal product)\",");
                break;
            case 191:
                writer.write("\"code\": \"871729003+836380007+601000221108+863911006+836374004+871871008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Corynebacterium diphtheriae antigen (medicinal product) + Vaccine product containing Haemophilus influenzae type B antigen (medicinal product) + Vaccine product containing Bordetella pertussis antigen (medicinal product) + Vaccine product containing Clostridium tetani antigen (medicinal product) + Vaccine product containing Hepatitis B virus antigen (medicinal product) + Vaccine product containing only Neisseria meningitidis serogroup A and C antigens (medicinal product)\",");
                break;
            case 192:
                writer.write("\"code\": \"871892008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Bordetella pertussis and Clostridium tetani and Corynebacterium diphtheriae and Hepatitis B virus and Human poliovirus antigens (medicinal product)\",");
                break;
            case 193:
                writer.write("\"code\": \"871729003+836380007+601000221108+863911006+836374004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Corynebacterium diphtheriae antigen (medicinal product) + Vaccine product containing Haemophilus influenzae type B antigen (medicinal product) + Vaccine product containing Bordetella pertussis antigen (medicinal product) + Vaccine product containing Clostridium tetani antigen (medicinal product) + Vaccine product containing Hepatitis B virus antigen (medicinal product)\",");
                break;
            case 194:
                writer.write("\"code\": \"836501007\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Hepatitis A virus and Salmonella enterica subspecies enterica serovar Typhi antigens (medicinal product)\",");
                break;
            case 195:
                writer.write("\"code\": \"871896006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Bordetella pertussis and Clostridium tetani and Corynebacterium diphtheriae and Haemophilus influenzae type B and Hepatitis B virus and Human poliovirus antigens (medicinal product)\",");
                break;
            case 196:
                writer.write("\"code\": \"865946000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Haemophilus influenzae type B and Hepatitis B virus antigens (medicinal product)\",");
                break;
            case 197:
                writer.write("\"code\": \"871729003+836374004+863911006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Corynebacterium diphtheriae antigen (medicinal product) + Vaccine product containing Hepatitis B virus antigen (medicinal product) + Vaccine product containing Clostridium tetani antigen (medicinal product)\",");
                break;
            case 198:
                writer.write("\"code\": \"838279002\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Bordetella pertussis and Clostridium tetani and Corynebacterium diphtheriae and Haemophilus influenzae type B and Human poliovirus antigens (medicinal product)\",");
                break;
            case 199:
                writer.write("\"code\": \"871917002\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Bordetella pertussis and Clostridium tetani and Corynebacterium diphtheriae and Hepatitis B virus (medicinal product)\",");
                break;
            case 200:
                writer.write("\"code\": \"836380007+1031000221108\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Haemophilus influenzae type B antigen (medicinal product) + Vaccine product containing Human poliovirus antigen (medicinal product)\",");
                break;
            case 201:
                writer.write("\"code\": \"871729003+836388000+863911006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Corynebacterium diphtheriae antigen (medicinal product) + Vaccine product containing Rubella virus antigen (medicinal product) + Vaccine product containing Clostridium tetani antigen (medicinal product)\",");
                break;
            case 202:
                writer.write("\"code\": \"836508001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Bordetella pertussis and Clostridium tetani and Corynebacterium diphtheriae and Human poliovirus antigens (medicinal product)\",");
                break;
            case 203:
                writer.write("\"code\": \"836505003\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Clostridium tetani and Corynebacterium diphtheriae and Human poliovirus antigens (medicinal product)\",");
                break;
            case 204:
                writer.write("\"code\": \"838280004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Human alphaherpesvirus 3 and Measles morbillivirus and Mumps orthorubulavirus and Rubella virus antigens (medicinal product)\",");
                break;
            case 205:
                writer.write("\"code\": \"836382004+836388000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Measles morbillivirus antigen (medicinal product) + Vaccine product containing Rubella virus antigen (medicinal product)\",");
                break;
            case 206:
                writer.write("\"code\": \"836494009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Measles morbillivirus and Mumps orthorubulavirus and Rubella virus antigens (medicinal product)\",");
                break;
            case 207:
                writer.write("\"code\": \"836499004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Measles morbillivirus and Mumps orthorubulavirus antigens (medicinal product)\",");
                break;
            case 208:
                writer.write("\"code\": \"836493003\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Hepatitis A and Hepatitis B virus antigens (medicinal product)\",");
                break;
            case 209:
                writer.write("\"code\": \"836502000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Clostridium tetani and Corynebacterium diphtheriae antigens (medicinal product)\",");
                break;
            case 210:
                writer.write("\"code\": \"836398006+836380007\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Streptococcus pneumoniae antigen (medicinal product) + Vaccine product containing Haemophilus influenzae type B antigen (medicinal product)\",");
                break;
            case 211:
                writer.write("\"code\": \"836500008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Haemophilus influenzae type B and Neisseria meningitidis serogroup C antigens (medicinal product)\",");
                break;
            case 212:
                writer.write("\"code\": \"836380007+601000221108\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Haemophilus influenzae type B antigen (medicinal product) + Vaccine product containing Bordetella pertussis antigen (medicinal product)\",");
                break;
            case 213:
                writer.write("\"code\": \"836383009+836390004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Vibrio cholerae antigen (medicinal product) + Vaccine product containing Salmonella enterica subspecies enterica serovar Typhi antigen (medicinal product)\",");
                break;
            case 214:
                writer.write("\"code\": \"836378001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Japanese encephalitis virus antigen (medicinal product)\",");
                break;
            case 215:
                writer.write("\"code\": \"836403007\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Tick-borne encephalitis virus antigen (medicinal product)\",");
                break;
            case 216:
                writer.write("\"code\": \"871738001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only live attenuated Mumps orthorubulavirus antigen (medicinal product)\",");
                break;
            case 217:
                writer.write("\"code\": \"1031000221108\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Human poliovirus antigen (medicinal product)\",");
                break;
            case 218:
                writer.write("\"code\": \"836387005\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Rotavirus antigen (medicinal product)\",");
                break;
            case 219:
                writer.write("\"code\": \"836393002\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Rabies lyssavirus antigen (medicinal product)\",");
                break;
            case 220:
                writer.write("\"code\": \"836495005\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Human alphaherpesvirus 3 antigen (medicinal product)\",");
                break;
            case 221:
                writer.write("\"code\": \"836389008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Vaccinia virus antigen (medicinal product)\",");
                break;
            case 222:
                writer.write("\"code\": \"836379009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Human papillomavirus antigen (medicinal product)\",");
                break;
            case 223:
                writer.write("\"code\": \"836385002\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Yellow fever virus antigen (medicinal product)\",");
                break;
            case 224:
                writer.write("\"code\": \"836388000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Rubella virus antigen (medicinal product)\",");
                break;
            case 225:
                writer.write("\"code\": \"836382004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Measles morbillivirus antigen (medicinal product)\",");
                break;
            case 226:
                writer.write("\"code\": \"836375003\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Hepatitis A virus antigen (medicinal product)\",");
                break;
            case 227:
                writer.write("\"code\": \"836374004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Hepatitis B virus antigen (medicinal product)\",");
                break;
            case 228:
                writer.write("\"code\": \"836377006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Influenza virus antigen (medicinal product)\",");
                break;
            case 229:
                writer.write("\"code\": \"836390004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Salmonella enterica subspecies enterica serovar Typhi antigen (medicinal product)\",");
                break;
            case 230:
                writer.write("\"code\": \"836402002\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing live attenuated Mycobacterium bovis antigen (medicinal product)\",");
                break;
            case 231:
                writer.write("\"code\": \"863911006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Clostridium tetani antigen (medicinal product)\",");
                break;
            case 232:
                writer.write("\"code\": \"836398006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Streptococcus pneumoniae antigen (medicinal product)\",");
                break;
            case 233:
                writer.write("\"code\": \"840549009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Yersinia pestis antigen (medicinal product)\",");
                break;
            case 234:
                writer.write("\"code\": \"601000221108\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Bordetella pertussis antigen (medicinal product)\",");
                break;
            case 235:
                writer.write("\"code\": \"836401009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Neisseria meningitidis antigen (medicinal product)\",");
                break;
            case 236:
                writer.write("\"code\": \"836380007\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Haemophilus influenzae type B antigen (medicinal product)\",");
                break;
            case 237:
                writer.write("\"code\": \"836381006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Corynebacterium diphtheriae antigen (medicinal product)\",");
                break;
            case 238:
                writer.write("\"code\": \"836383009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Vibrio cholerae antigen (medicinal product)\",");
                break;
            case 239:
                writer.write("\"code\": \"836384003\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Bacillus anthracis antigen (medicinal product)\",");
                break;
            case 240:
                writer.write("\"code\": \"1119305005\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Severe acute respiratory syndrome coronavirus 2 antigen (medicinal product)\",");
                break;
            case 241:
                writer.write("\"code\": \"1119349007\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Severe acute respiratory syndrome coronavirus 2 messenger ribonucleic acid (medicinal product)\",");
                break;
            case 242:
                writer.write("\"code\": \"871875004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Bordetella pertussis and Clostridium tetani and Corynebacterium diphtheriae antigens (medicinal product)\",");
                break;
            case 243:
                writer.write("\"code\": \"787859002\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product (medicinal product)\",");
                break;
            case 244:
                writer.write("\"code\": \"37146000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Typhus vaccine (product)\",");
                break;
            case 245:
                writer.write("\"code\": \"2221000221107\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only live attenuated Human alphaherpesvirus 3 antigen (medicinal product)\",");
                break;
            case 246:
                writer.write("\"code\": \"836498007+836388000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Mumps orthorubulavirus antigen (medicinal product) + Vaccine product containing Rubella virus antigen (medicinal product)\",");
                break;
            case 247:
                writer.write("\"code\": \"871729003+836380007+601000221108+863911006+836374004+871871008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Corynebacterium diphtheriae antigen (medicinal product) + Vaccine product containing Haemophilus influenzae type B antigen (medicinal product) + Vaccine product containing Bordetella pertussis antigen (medicinal product) + Vaccine product containing Clostridium tetani antigen (medicinal product) + Vaccine product containing Hepatitis B virus antigen (medicinal product) + Vaccine product containing only Neisseria meningitidis serogroup A and C antigens (medicinal product)\",");
                break;
            case 248:
                writer.write("\"code\": \"871891001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only acellular Bordetella pertussis and Clostridium tetani and Corynebacterium diphtheriae and Hepatitis B virus and inactivated whole Human poliovirus antigens (medicinal product)\",");
                break;
            case 249:
                writer.write("\"code\": \"871729003+836380007+601000221108+863911006+836374004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Corynebacterium diphtheriae antigen (medicinal product) + Vaccine product containing Haemophilus influenzae type B antigen (medicinal product) + Vaccine product containing Bordetella pertussis antigen (medicinal product) + Vaccine product containing Clostridium tetani antigen (medicinal product) + Vaccine product containing Hepatitis B virus antigen (medicinal product)\",");
                break;
            case 250:
                writer.write("\"code\": \"871804001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Hepatitis A virus and Salmonella enterica subspecies enterica serovar Typhi antigens (medicinal product)\",");
                break;
            case 251:
                writer.write("\"code\": \"871895005\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Bordetella pertussis and Clostridium tetani and Corynebacterium diphtheriae and Haemophilus influenzae type B and Hepatitis B virus and Human poliovirus antigens (medicinal product)\",");
                break;
            case 252:
                writer.write("\"code\": \"871806004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Haemophilus influenzae type B and Hepatitis B virus antigens (medicinal product)\",");
                break;
            case 253:
                writer.write("\"code\": \"871729003+836374004+863911006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Corynebacterium diphtheriae antigen (medicinal product) + Vaccine product containing Hepatitis B virus antigen (medicinal product) + Vaccine product containing Clostridium tetani antigen (medicinal product)\",");
                break;
            case 254:
                writer.write("\"code\": \"871887006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Bordetella pertussis and Clostridium tetani and Corynebacterium diphtheriae and Haemophilus influenzae type B and Human poliovirus antigens (medicinal product)\",");
                break;
            case 255:
                writer.write("\"code\": \"863911006+836374004+601000221108+836381006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Clostridium tetani antigen (medicinal product) + Vaccine product containing Hepatitis B virus antigen (medicinal product) + Vaccine product containing Bordetella pertussis antigen (medicinal product) + Vaccine product containing Corynebacterium diphtheriae antigen (medicinal product)\",");
                break;
            case 256:
                writer.write("\"code\": \"836380007+1031000221108\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Haemophilus influenzae type B antigen (medicinal product) + Vaccine product containing Human poliovirus antigen (medicinal product)\",");
                break;
            case 257:
                writer.write("\"code\": \"871729003+836388000+863911006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Corynebacterium diphtheriae antigen (medicinal product) + Vaccine product containing Rubella virus antigen (medicinal product) + Vaccine product containing Clostridium tetani antigen (medicinal product)\",");
                break;
            case 258:
                writer.write("\"code\": \"871878002\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Bordetella pertussis and Clostridium tetani and Corynebacterium diphtheriae and Human poliovirus antigens (medicinal product)\",");
                break;
            case 259:
                writer.write("\"code\": \"871837004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Clostridium tetani and Corynebacterium diphtheriae and Human poliovirus antigens (medicinal product)\",");
                break;
            case 260:
                writer.write("\"code\": \"871908002\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Human alphaherpesvirus 3 and Measles morbillivirus and Mumps orthorubulavirus and Rubella virus antigens (medicinal product)\",");
                break;
            case 261:
                writer.write("\"code\": \"836382004+836388000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Measles morbillivirus antigen (medicinal product) + Vaccine product containing Rubella virus antigen (medicinal product)\",");
                break;
            case 262:
                writer.write("\"code\": \"871831003\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Measles morbillivirus and Mumps orthorubulavirus and Rubella virus antigens (medicinal product)\",");
                break;
            case 263:
                writer.write("\"code\": \"836498007+836382004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Mumps orthorubulavirus antigen (medicinal product) + Vaccine product containing Measles morbillivirus antigen (medicinal product)\",");
                break;
            case 264:
                writer.write("\"code\": \"871803007\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Hepatitis A and Hepatitis B virus antigens (medicinal product)\",");
                break;
            case 265:
                writer.write("\"code\": \"871826000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Clostridium tetani and Corynebacterium diphtheriae antigens (medicinal product)\",");
                break;
            case 266:
                writer.write("\"code\": \"836398006+836380007\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Streptococcus pneumoniae antigen (medicinal product) + Vaccine product containing Haemophilus influenzae type B antigen (medicinal product)\",");
                break;
            case 267:
                writer.write("\"code\": \"836500008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only Haemophilus influenzae type B and Neisseria meningitidis serogroup C antigens (medicinal product)\",");
                break;
            case 268:
                writer.write("\"code\": \"836380007+601000221108\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Haemophilus influenzae type B antigen (medicinal product) + Vaccine product containing Bordetella pertussis antigen (medicinal product)\",");
                break;
            case 269:
                writer.write("\"code\": \":836383009+836390004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Vibrio cholerae antigen (medicinal product) + Vaccine product containing Salmonella enterica subspecies enterica serovar Typhi antigen (medicinal product)\",");
                break;
            case 270:
                writer.write("\"code\": \"836378001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Japanese encephalitis virus antigen (medicinal product)\",");
                break;
            case 271:
                writer.write("\"code\": \"836403007\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Tick-borne encephalitis virus antigen (medicinal product)\",");
                break;
            case 272:
                writer.write("\"code\": \"871738001\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing only live attenuated Mumps orthorubulavirus antigen (medicinal product)\",");
                break;
            case 273:
                writer.write("\"code\": \"1031000221108\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Human poliovirus antigen (medicinal product)\",");
                break;
            case 274:
                writer.write("\"code\": \"836387005\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Rotavirus antigen (medicinal product)\",");
                break;
            case 275:
                writer.write("\"code\": \"836393002\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Rabies lyssavirus antigen (medicinal product)\",");
                break;
            case 276:
                writer.write("\"code\": \"836495005\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Human alphaherpesvirus 3 antigen (medicinal product)\",");
                break;
            case 277:
                writer.write("\"code\": \"836389008\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Vaccinia virus antigen (medicinal product)\",");
                break;
            case 278:
                writer.write("\"code\": \"836379009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Human papillomavirus antigen (medicinal product)\",");
                break;
            case 279:
                writer.write("\"code\": \"836385002\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Yellow fever virus antigen (medicinal product)\",");
                break;
            case 280:
                writer.write("\"code\": \"836388000\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Rubella virus antigen (medicinal product)\",");
                break;
            case 281:
                writer.write("\"code\": \"836382004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Measles morbillivirus antigen (medicinal product)\",");
                break;
            case 282:
                writer.write("\"code\": \"836375003\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Hepatitis A virus antigen (medicinal product)\",");
                break;
            case 283:
                writer.write("\"code\": \"836374004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Hepatitis B virus antigen (medicinal product)\",");
                break;
            case 284:
                writer.write("\"code\": \"836377006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Influenza virus antigen (medicinal product)\",");
                break;
            case 285:
                writer.write("\"code\": \"836390004\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Salmonella enterica subspecies enterica serovar Typhi antigen (medicinal product)\",");
                break;
            case 286:
                writer.write("\"code\": \"836402002\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing live attenuated Mycobacterium bovis antigen (medicinal product)\",");
                break;
            case 287:
                writer.write("\"code\": \"863911006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Clostridium tetani antigen (medicinal product)\",");
                break;
            case 288:
                writer.write("\"code\": \"836398006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Streptococcus pneumoniae antigen (medicinal product)\",");
                break;
            case 289:
                writer.write("\"code\": \"840549009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Yersinia pestis antigen (medicinal product)\",");
                break;
            case 290:
                writer.write("\"code\": \"601000221108\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Bordetella pertussis antigen (medicinal product)\",");
                break;
            case 291:
                writer.write("\"code\": \"836401009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Neisseria meningitidis antigen (medicinal product)\",");
                break;
            case 292:
                writer.write("\"code\": \"836380007\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Haemophilus influenzae type B antigen (medicinal product)\",");
                break;
            case 293:
                writer.write("\"code\": \"836381006\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Corynebacterium diphtheriae antigen (medicinal product)\",");
                break;
            case 294:
                writer.write("\"code\": \"836383009\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Vibrio cholerae antigen (medicinal product)\",");
                break;
            case 295:
                writer.write("\"code\": \"836384003\",");
                writer.newLine();
                BasicWriteCommands.Indents(writer, 4);
                writer.write("\"display\": \"Vaccine product containing Bacillus anthracis antigen (medicinal product)\",");
                break;
        }

    }
}
