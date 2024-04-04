package L33_StaticKeyword;

// static = modifier. A single copy of a variable/method is created and shared.
//          The class "owns" the static member

public class StaticKeyword {

    public static void main (String[] args)
    {
        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");

        // NOTE: static --> it will display the TOTAL number of friends
        System.out.println(Friend.numberOfFriends);
        // System.out.println(friend1.numberOfFriends);

        Friend.displayFriends();

    }
}
