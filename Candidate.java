package electionExercises;

public class Candidate {

    String firstName;
    String lastName;
    String party;
    final int candidateId;

    int votes;

    public Candidate(String firstName, String lastName, String party, int candidateId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.party = party;
        this.candidateId = candidateId;
        int votes = 0;
    }

    public String getFullName() {
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }

    public void setFullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printInfo() {
        Utility.printInfo(this);
    }
}