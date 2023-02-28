package it.units.openresults_rowing;

import java.util.Collection;
import java.util.Objects;

public class Weightclass {
    private String idWeightclass;
    private String name;
    private Collection<Result> resultsByIdWeightclass;

    public String getIdWeightclass() {
        return idWeightclass;
    }

    public void setIdWeightclass(String idWeightclass) {
        this.idWeightclass = idWeightclass;
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
        Weightclass that = (Weightclass) o;
        return Objects.equals(idWeightclass, that.idWeightclass) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idWeightclass, name);
    }

    public Collection<Result> getResultsByIdWeightclass() {
        return resultsByIdWeightclass;
    }

    public void setResultsByIdWeightclass(Collection<Result> resultsByIdWeightclass) {
        this.resultsByIdWeightclass = resultsByIdWeightclass;
    }
}
