package com.restapi.rottentomatoes;

import lombok.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "data")
public class Data implements Serializable {
    @Column(name = "id")
    @Id
    private int id;
}
