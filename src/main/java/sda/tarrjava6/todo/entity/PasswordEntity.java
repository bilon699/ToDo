package sda.tarrjava6.todo.entity;


import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity(name = "Password")
public class PasswordEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Min(8)
    private String Password;

    @OneToOne
    @JoinColumn(name = "login_id")
    private LoginEntity login;

    public PasswordEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
