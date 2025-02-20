import java.util.ArrayList;

public class Profile {
    private static int idCounter = 0;
    public int id;
    public Name profileName;
    public String status;
    public ArrayList<Profile> friends;

    public Profile(Name profileName, String status) {
        this.id = idCounter++;
        this.profileName = profileName;
        this.status = status;
        this.friends = new ArrayList<>();
    }

    public void addFriend(Profile friend) {
        friends.add(friend);
    }

    public void removeFriend(Profile friend) {
        friends.remove(friend);
    }

    public void displayProfile() {
        System.out.println("Name: " + profileName.toString());
        System.out.println("\tStatus: " + status);
        System.out.println("\t# of friends: " + friends.size());
        System.out.println("Friends:");
        for (Profile friend : friends) {
            System.out.println("\t" + friend.profileName.toString());
        }
    }
}
