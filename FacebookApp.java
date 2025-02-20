public class FacebookApp {
    public static void main(String[] args) {
        ProfileManager profileManager = new ProfileManager();

        // Creating profiles
        Profile john = new Profile(new Name("John", "Doe"), "My name is John.");
        Profile jane = new Profile(new Name("Jane", "Doe"), "My name is Jane.");
        Profile billy = new Profile(new Name("Billy", "Bob"), "My name is Billy Bob!");
        Profile johnSmith = new Profile(new Name("John", "Smith"), "My name is also John.");

        // NEW PROFILES (with statuses)
        Profile mahad = new Profile(new Name("Mahad", "Mushtaq"), "Hi, my name is Mahad Mushtaq.");
        Profile sarah = new Profile(new Name("Sarah", "Tabani"), "Hi, my name is Sarah Tabani.");
        Profile wajdan = new Profile(new Name("Wajdan Omer", "Adil"), "Hi, my name is Wajdan Omer Adil.");
        Profile tyla = new Profile(new Name("Tyla", "O'Connor"), "Hi, my name is Tyla O'Connor.");
        Profile varisha = new Profile(new Name("Varisha", "Shams"), "Hi, my name is Varisha Shams.");

        // Adding profiles
        System.out.println("Creating profiles and adding to the network...");
        profileManager.addProfile(john);
        profileManager.addProfile(jane);
        profileManager.addProfile(billy);
        profileManager.addProfile(johnSmith);
        profileManager.addProfile(mahad);
        profileManager.addProfile(sarah);
        profileManager.addProfile(wajdan);
        profileManager.addProfile(tyla);
        profileManager.addProfile(varisha);
        profileManager.displayAllProfiles();
        System.out.println("-------------------------------------");

        // Creating friendships
        System.out.println("Creating friendships.");
        profileManager.createFriendship(john, jane);
        profileManager.createFriendship(john, johnSmith);
        profileManager.createFriendship(jane, billy);
        profileManager.createFriendship(jane, johnSmith);
        profileManager.createFriendship(billy, johnSmith);

        // NEW FRIENDSHIPS
        profileManager.createFriendship(mahad, sarah);
        profileManager.createFriendship(wajdan, tyla);
        profileManager.createFriendship(wajdan, varisha);

        profileManager.displayAllProfiles();
        System.out.println("-------------------------------------");

        // ... (rest of your code remains the same)
    }
}
