package sda.tarrjava6.todo.entity;


import javax.persistence.*;
import java.util.Date;

@Entity(name = "todolist")
public class ToDoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private boolean completed;

    @Temporal(TemporalType.DATE)
    private Date createDate;

    @ManyToOne()
//    @JoinColumn(name = "login_id")
    private ToDoEntity todo;

    @Column(nullable = true)
    @Temporal(TemporalType.DATE)
    private Date closeDate;

    public ToDoEntity() {
        createDate = new Date();
    }

    public ToDoEntity(String name, boolean completed) {
        this();
        this.name = name;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {

        if (this.completed) {
            return;
        }

        this.completed = completed;

        if (completed) {
            this.closeDate = new Date();
        }
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public ToDoEntity getTodo() {
        return todo;
    }

    public void setTodo(ToDoEntity todo) {
        this.todo = todo;
    }
}
