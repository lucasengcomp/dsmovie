package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tb_score")
public class Score implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private ScorePK id = new ScorePK(); // chave composta
    private Double value;

    public Score() {
    }

    public Score(ScorePK id, Double value) {
        this.id = id;
        this.value = value;
    }

    // Possibilita fazer a associação do filme com o Score
    public void setMovie(Movie movie) {
        this.id.setMovie(movie);
    }

    // Possibilita fazer a associação do User com o Score
    public void setUser(User user) {
        this.id.setUser(user);
    }

    public ScorePK getId() {
        return id;
    }

    public void setId(ScorePK id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
