package account.entity;

public class User {
    protected static int autoID = 1;
    protected int id;
    protected String username;
    protected String email;
    protected String address;
    protected String phone;
    protected String password;
    protected String role;

    public User() {
        this.id = autoID++;
    }

    public User(String username, String email, String address, String phone, String password, String role) {
        this.username = username;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.password = password;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    //Nhập thông tin user
    public void inputInfo() {

    }
}
