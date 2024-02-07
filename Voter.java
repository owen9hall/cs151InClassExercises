package electionExercises;

public class Voter {
    final int voterId;
    String firstName;
    String lastName;
    boolean hasVoted;

    public Voter(String firstName, String lastName, int voterId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.voterId = voterId;
        hasVoted = false;
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
