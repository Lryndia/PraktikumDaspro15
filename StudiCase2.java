import java.util.Scanner;
public class StudiCase2  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String typeOfActivity;
        String studentName;
        int NumberOfDocumentsUploaded;
        int winnerRank;
        int fundingStatus;

        System.out.print("Student Name: ");
        studentName = input.nextLine();
        System.out.print("Enter your Type of Activity (BELMAWA/BAKORMA/MANDIRI/PKM/OTHERS): ");
        typeOfActivity = input.nextLine().trim().toLowerCase();
        System.out.print("Number of Documents: ");
        NumberOfDocumentsUploaded = input.nextInt();
        
        
        if (typeOfActivity.equals("belmawa") || typeOfActivity.equals("bakorma")) {
            System.out.print("Winner Rank: ");
        winnerRank = input.nextInt();
            if (winnerRank == 1 || winnerRank == 2 || winnerRank == 3) {
                if (NumberOfDocumentsUploaded >= 4) {
                    System.out.println("Congratulations " + studentName + "! You can receive the award funds.");
                } else {
                    System.out.println("status: Document is incomplete (minus " + (4 - NumberOfDocumentsUploaded) + " document). Award funds cannot be given.");
                }
            } else {
                System.out.println("Sorry " + studentName + ", you are not eligible for the awards funds due to your rank.");
            }
        
    input.close();
        }
    }

