package Medium;

public class upvotesDownvotes {
    public static void main(String[] args) {

        System.out.println(getVoteCount(13,0));
    }
    public static int getVoteCount(int upvotes,int downvotes) {

        return upvotes - downvotes;
    }
}
