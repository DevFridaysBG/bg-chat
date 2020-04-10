package bg.chat.app.db.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = Employee.TABLENAME)
public class Employee {

    public static final String TABLENAME = "employee";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String empId;
    private String empName;

}


//create table users (
//    username varchar(50) not null primary key,
//    password varchar(120) not null,
//    enabled boolean not null
//);
//
//create table authorities (
//    username varchar(50) not null,
//    authority varchar(50) not null,
//    foreign key (username) references users (username)
//);
