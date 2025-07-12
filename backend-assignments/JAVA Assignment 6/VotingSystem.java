import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        Map <String, Integer> votes = new HashMap<>();

        votes.put("Babu", 100000);
        votes.put("Mohan", 75000);
        votes.put("Kalyan", 25000);

        String winner = "";
        int highestVoteCount = Integer.MIN_VALUE;

        for (Map.Entry<String,Integer> vote : votes.entrySet()) {
            if (vote.getValue() > highestVoteCount) {
                highestVoteCount = vote.getValue();
                winner = vote.getKey();
            }
        }

        System.out.println("The Winner of Voting is : " + winner + " with vote count of : " + highestVoteCount);
    }
}