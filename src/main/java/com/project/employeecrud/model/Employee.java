package com.project.employeecrud.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Employee {

    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer phoneNumber;
    private String address;

}
