package DataObject;

public enum DefaultUser implements IUser {
    Admin("Admin","admin123"),
    GiaoVien("Admin","admin123"),
    HocSinh("user","admin123")
    ;

    private final String username;
    private final String pass;

    DefaultUser(String username, String pass) {
        this.username = username;
        this.pass = pass;
    }

    public User toUser() {
        return new User(username, pass);
    }

    @Override
    public String getName() {
        return username;
    }

    @Override
    public String getPass() {
        return pass;
    }
}
