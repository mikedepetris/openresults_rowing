package it.units.openresults_rowing;

import java.util.Collection;
import java.util.Objects;

public class Adaptiveclass {
    private String idadaptiveclass;
    private String name;
    private Collection<Result> resultsByIdadaptiveclass;

    public String getIdadaptiveclass() {
        return idadaptiveclass;
    }

    public void setIdadaptiveclass(String idadaptiveclass) {
        this.idadaptiveclass = idadaptiveclass;
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
        Adaptiveclass that = (Adaptiveclass) o;
        return Objects.equals(idadaptiveclass, that.idadaptiveclass) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idadaptiveclass, name);
    }

    public Collection<Result> getResultsByIdadaptiveclass() {
        return resultsByIdadaptiveclass;
    }

    public void setResultsByIdadaptiveclass(Collection<Result> resultsByIdadaptiveclass) {
        this.resultsByIdadaptiveclass = resultsByIdadaptiveclass;
    }
}
