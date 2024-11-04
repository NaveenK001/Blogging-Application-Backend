package com.demoBlog.App.entities;



import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Role {

    @Id
    private int id;

    private String name;
}
