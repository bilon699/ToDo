package sda.tarrjava6.todo.entity;


import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

@Entity (name = "Login")
public class LoginEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(nullable = false)
    @Email
    private String Login;

    @OneToOne //(mappedBy = "password")
    private PasswordEntity password;

    @OneToMany
    @JoinColumn(name = "todo_id")
    List <ToDoEntity> todo;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }
}
