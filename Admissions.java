import java.util.Scanner;
public class Admissions{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Last Name: ");
        String last = sc.next();
        
        System.out.println("SAT Score: ");
        int SAT = sc.nextInt();

        System.out.println("Class Rank (Percentile): ");
        int ClassRank = sc.nextInt();

        System.out.println("Awards: ");
        int Awards = sc.nextInt();

        System.out.println("Residence: ");
        String Residence = sc.next();
    
        int elite = 0;
        int solid = 0;
        int nope = 0;
        int SATfail = 0;
        int Classfail = 0;
        int Awardfail = 0;
        Boolean Residencefail = false;

        // SAT CHECKS
        if (SAT >= 1500){
            elite += 1;
        }
        else if (SAT <= 1499 && SAT >= 1400){
            solid += 1;
        }
        else{
            nope += 1;
            SATfail = 1;
        }

        // CLASS RANK CHECKS
        if (ClassRank >= 95){
            elite += 1;
        }
        else if (ClassRank >= 90){
            solid += 1;
        }
        else{
            nope +=1;
            Classfail = 1;
        }

        // AWARD CHECKS
        if (Awards >= 10){
            elite += 1;
        }
        else if (Awards == 9 || Awards == 8){
            solid += 1;
        }
        else{
            nope += 1;
            Awardfail = 1;
        }

        // RESIDENCE CHECKS
        if (Residence.equals("Florida")){
            nope += 1;
            Residencefail = true;
        }
        else if (Residence.equals("Colorado")){
            elite += 1;
        }
        

        // ACCEPTANCE CHECK
        if ((elite > 1 || solid > 2 || last == "Padjen") && nope == 0){
            System.out.println("You've been accepted!");
        }
        else{
            System.out.println("Sorry you haven't been accepted.");
            System.out.println("Reasons:\n");
            if (SATfail == 1){
                System.out.println("SAT Score");
            }

            if (Classfail == 1){
                System.out.println("Class Rank");
            }

            if (Awardfail == 1){
                System.out.println("Not Enough Awards");
            }

            if (Residencefail){
                System.out.println("You live in Florida");
            }
            
        }
        // System.out.println("\n" + elite);
        // System.out.println(solid);
        // System.out.println(accept);
        // System.out.println(nope);







        sc.close();
    }
}