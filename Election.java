package electionExercises;
import  java.util.ArrayList;

import static electionExercises.Utility.printInfo;

public class Election {
    private ArrayList<Candidate> candidateList = new ArrayList<Candidate>();
    private ArrayList<Voter> voterList = new ArrayList<Voter>();

    private boolean electionOver = false;
    private void addCandidate(Candidate candidate) {
        if (electionOver){
            System.out.println("Election has ended, no more candidates can be added.");
            return;
        }
        candidateList.add(candidate);
    }

    private void enrollVoter(Voter voter) {
        voterList.add(voter);
    }

    private void castVote(Voter voter, String candidateName) {
        if (electionOver) {
            System.out.println("Election has ended, no more votes can be cast.");
            return;
        }
        else if (voter.hasVoted) {
            System.out.println("This voter has already voted.");
            return;
        }
        for (Candidate candidate : candidateList) {
            if (candidateName.toUpperCase().equals(candidate.getFullName())) {
                    candidate.votes++;
                    voter.hasVoted = true;
                return;
            }
        }
        System.out.println("The entered candidate name is invalid.");
    }

    private void endElection() {
        electionOver = true;
    }

    private void displayResults() {
        if (!electionOver) {
            System.out.println("Election has not ended, therefore the results cannot be displayed.");
            return;
        }

        System.out.println("\nELECTION RESULTS:");
        int voteTotal = 0;
        for (Candidate candidate : candidateList) {
            voteTotal += candidate.votes;
            printInfo(candidate);
        }
        System.out.println("Total election votes: " + voteTotal);
    }

    public static void main(String[] args) {
        // Create 2 candidates
        Candidate candidateA = new Candidate("Joseph", "Carnegie", "Democratic", 1);
        Candidate candidateB = new Candidate("Mary", "Smith", "Republican", 2);

        // Create 4 voters
        Voter voterA = new Voter("Sarah", "Johnson", 1);
        Voter voterB = new Voter("Kevin", "Patel", 2);
        Voter voterC = new Voter("Emily", "Thompson", 3);
        Voter voterD = new Voter("Alex", "Rodriguez", 4);

        // Create an election
        Election presidentialElection = new Election();

        // Add voters and candidates to the lists
        presidentialElection.addCandidate(candidateA);
        presidentialElection.addCandidate(candidateB);

        presidentialElection.enrollVoter(voterA);
        presidentialElection.enrollVoter(voterB);
        presidentialElection.enrollVoter(voterC);
        presidentialElection.enrollVoter(voterD);

        // Cast votes
        presidentialElection.castVote(voterA, "Mary Smith");
        presidentialElection.castVote(voterB, "Joseph Carnegie");
        presidentialElection.castVote(voterC, "Mary Smith");
        //presidentialElection.castVote(voterD, "Mary Smith");
        //presidentialElection.castVote(voterD, "Mary Smith"); //2 votes error test
        //presidentialElection.castVote(voterD, "Martin Smith"); //invalid vote error test

        // End election
        presidentialElection.endElection();
        //presidentialElection.castVote(voterD, "Mary Smith"); //election ended error test
        // Display results
        presidentialElection.displayResults();


    }
}
