package com.atuluttam.TaskManager.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
@jakarta.persistence.Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String title;
    private boolean completed;
}
