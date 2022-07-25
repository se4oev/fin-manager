package ru.se4oev.common.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by se4oev on 25.07.2022
 * Description:
 */
@Entity
public class User {

    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

}
