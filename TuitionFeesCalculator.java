package ReviewExercise;

import java.util.Scanner;

public class TuitionFeesCalculator {
        public static void main(String[] args) {
            Scanner in = new Scanner (System.in);
            //variables
            int sem;
            double cHour;
            double total;

            System.out.println(" __________________________________________________________________");
            System.out.println("|  CODE   |                       PROGRAMME                       |");
            System.out.println(" __________________________________________________________________");
            System.out.println("|   BENG  |           Bachelor of Electronic Engineering          |");
            System.out.println("|   BENE  |           Bachelor of Electrical Engineering          |");
            System.out.println("|   BENC  |            Bachelor of Computer Engineering           |");
            System.out.println("|   BENT  |        Bachelor of Telecommunication Engineering      |");
            System.out.println(" __________________________________________________________________");

            System.out.print("Code Program: ");
            String code = in.next().toUpperCase(); // Convert input to uppercase

            System.out.print("Semester No: ");
            sem = in.nextInt();

            System.out.print("Credit Hours Registered: ");
            cHour = in.nextDouble();
            //read

            System.out.println("---------------------------------------------------------------------");

            switch(code){
                case "BENG" :
                    System.out.println("Bachelor Degree: Bachelor of Electronic Engineering");
                    break;
                case "BENE" :
                    System.out.println("Bachelor Degree: Bachelor of Electrical Engineering");
                    break;
                case "BENC" :
                    System.out.println("Bachelor Degree: Bachelor of Computer Engineering");
                    break;
                case "BENT" :
                    System.out.println("Bachelor Degree: Bachelor of Telecommunication Engineering");
                    break;
                default:
                    System.out.println("Invalid Program! Please enter the valid program.");
                    return;
            }

            System.out.println("Semester No: "+ sem);

            System.out.println("Credit Hours: "+ cHour);


            if (code.equals("BENG")){
                if (sem == 1)
                    total= 1250 + 250*cHour;
                else if (sem == 2);
                total= 1000 + 250*cHour;

                System.out.println("Total Tuition Fees: " + total);
            }
            else if (code.equals("BENE")){
                if (sem == 1)
                    total= 1400 + 250*cHour;
                else if (sem == 2);
                total= 1100 + 250*cHour;

                System.out.println("Total Tuition Fees: " + total);
            }
            else if (code.equals("BENC")){
                if (sem == 1)
                    total= 1250 + 275*cHour;
                else if (sem == 2);
                total= 1250 + 275*cHour;

                System.out.println("Total Tuition Fees: " + total);
            }
            else if (code.equals("BENT")){
                if (sem == 1)
                    total= 1250 + 350*cHour;
                else if (sem == 2);
                total= 1250 + 350*cHour;

                System.out.println("Total Tuition Fees: " + total);
            }
    }
}
