package br.com.StudentAPI.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import jakarta.persistence.Entity;

@Entity
public class Student extends AbstractEntity{

    @NotEmpty(message = "O campo nome do estudante é obrigatório")
    private String name;

    @NotEmpty(message = "O campo email do estudante é obrigatório")
    @Email(message = "Email com formato incorreto")
    private String email;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
