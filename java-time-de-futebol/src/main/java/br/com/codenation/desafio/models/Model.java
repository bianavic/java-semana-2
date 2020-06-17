package br.com.codenation.desafio.models;

import java.util.Objects;

public abstract class Model implements Comparable<Long> {
    protected Long id;

    public Long getId() {
        Long id = this.id;
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Model)) return false;
        Model model = (Model) o;
        return id.equals(model.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public abstract void add(Time time);
}
