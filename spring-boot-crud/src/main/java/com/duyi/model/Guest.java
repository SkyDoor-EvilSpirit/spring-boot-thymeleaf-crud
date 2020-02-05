package com.duyi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity/**告诉spring-boot-jpa，这有实体类*/
@Data@AllArgsConstructor@NoArgsConstructor
public class Guest implements Serializable {
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String role;
}
