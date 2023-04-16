package Tugas04no1;

public class Profile {
    private String fullname,
                   hobby,
                   nickname;
    private int age;
    private User user;

    public Profile() {}
    public Profile(String fullname, int age, String hobby) {
        this.fullname = fullname;
        this.age = age;
        this.hobby = hobby;
        this.nickname = StringUtils.getNickname(fullname);
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
