package com.borymskyi.trail.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * JavaBean domain object that represents Trail.
 *
 * @author Dmitrii Borymskyi
 * @version 1.0
 */

@Entity
@Data
public class Trail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDateTime update_time;

    @ManyToOne
    @JoinColumn(name = "profile")
    @JsonIgnore
    private Profile profile;

    public void replaceTitle (String str) {
        this.setTitle(str);
    }
}
