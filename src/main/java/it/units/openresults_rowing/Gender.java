package it.units.openresults_rowing;

import java.util.Collection;
import java.util.Objects;

public class Gender {
    private String idGender;
    private String name;
    private Collection<Result> resultsByIdGender;

    public String getIdGender() {
        return idGender;
    }

    public void setIdGender(String idGender) {
        this.idGender = idGender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gender gender = (Gender) o;
        return Objects.equals(idGender, gender.idGender) && Objects.equals(name, gender.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGender, name);
    }

    public Collection<Result> getResultsByIdGender() {
        return resultsByIdGender;
    }

    public void setResultsByIdGender(Collection<Result> resultsByIdGender) {
        this.resultsByIdGender = resultsByIdGender;
    }
}
