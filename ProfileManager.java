import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ProfileManager {
    public ArrayList<Profile> allProfiles;
    public HashMap<Integer, HashSet<Integer>> friendships;

    public ProfileManager() {
        this.allProfiles = new ArrayList<>();
        this.friendships = new HashMap<>();
    }

    public void addProfile(Profile profile) {
        allProfiles.add(profile);
        friendships.put(profile.id, new HashSet<>());
    }

    public void removeProfile(Profile profile) {
        allProfiles.remove(profile);
        friendships.remove(profile.id);
        for (HashSet<Integer> friends : friendships.values()) {
            friends.remove(profile.id);
        }
    }

    public void createFriendship(Profile profile1, Profile profile2) {
        profile1.addFriend(profile2);
        profile2.addFriend(profile1);
        friendships.get(profile1.id).add(profile2.id);
        friendships.get(profile2.id).add(profile1.id);
    }

    public void endFriendship(Profile profile1, Profile profile2) {
        profile1.removeFriend(profile2);
        profile2.removeFriend(profile1);
        friendships.get(profile1.id).remove(profile2.id);
        friendships.get(profile2.id).remove(profile1.id);
    }

    public void displayAllProfiles() {
        for (Profile profile : allProfiles) {
            profile.displayProfile();
        }
    }

    public void displayFriendsOfFriends(Profile profile) {
        HashSet<Integer> friendsOfFriends = new HashSet<>();
        for (Profile friend : profile.friends) {
            friendsOfFriends.addAll(friendships.get(friend.id));
        }
        friendsOfFriends.remove(profile.id);

        System.out.println("Friends of " + profile.profileName.toString() + "'s friends:");
        for (int id : friendsOfFriends) {
            Profile friendOfFriend = null;
            for (Profile p : allProfiles) {
                if (p.id == id) {
                    friendOfFriend = p;
                    break;
                }
            }
            if (friendOfFriend != null && !profile.friends.contains(friendOfFriend)) {
                System.out.println(friendOfFriend.profileName.toString());
            }
        }
    }
}
