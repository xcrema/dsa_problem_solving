package models;

public class User {
    private String userId;
    private String name;
    private String mobile;
    private String email;

    public User() {
    }

    public User(String userId, String name, String mobile, String email) {
        this.userId = userId;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
