package in.russia.demo.entity;


import java.util.Set;

public class User {

    private String username;
    private String email;
    private String password;
    private String city;
    private Set<Role> roles;

    public User(String username, String email, String password, String city, Set<Role> roles) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.city = city;
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
