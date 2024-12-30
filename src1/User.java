public class User extends Person {
    String email;
    String password;
    Role role;

    public User(String id, String name, int age, String email, String password, Role role) {
        super(id, name, age);
        this.email = email;
        this.password = password;
        this.role = role;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;

    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
