package electionExercises;

public class Utility {

    public static void printInfo(Candidate candidate) {
        System.out.println("Candidate name: " + candidate.getFullName());
        System.out.println("Candidate party: " + candidate.party);
        System.out.println("Candidate ID: " + candidate.candidateId);
        System.out.println("Total votes: " + candidate.votes);
        System.out.println("<><><><><><><>");


    }

    public static void printInfo(Voter voter) {
        System.out.println("Voter name: " + voter.getFullName());
        System.out.println("Has Voted: " + voter.hasVoted);
        System.out.println("Voter ID: " + voter.voterId);
        System.out.println("<><><><><><><>");
    }
}
