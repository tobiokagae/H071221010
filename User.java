package Tugas04no1;

public class User {
    private String username,
                   password;
    private Profile profile;
    
    public User() {}
    public User(String username, String password, Profile profile) {
        this.username = username;
        this.password = password;
        this.profile = profile;
    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    String getUsername() {
        return username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    String getPassword() {
        return password;
    }
    public void setProfile(Profile profile) {
        this.profile = profile;
    }
    Profile getProfile() {
        return profile;
    }
}

