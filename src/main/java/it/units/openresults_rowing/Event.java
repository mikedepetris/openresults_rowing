package it.units.openresults_rowing;

import java.util.Collection;
import java.util.Objects;

public class Event {
    private Integer idEvent;
    private String name;
    private Collection<Result> resultsByIdEvent;

    public Integer getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Integer idEvent) {
        this.idEvent = idEvent;
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
        Event event = (Event) o;
        return Objects.equals(idEvent, event.idEvent) && Objects.equals(name, event.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEvent, name);
    }

    public Collection<Result> getResultsByIdEvent() {
        return resultsByIdEvent;
    }

    public void setResultsByIdEvent(Collection<Result> resultsByIdEvent) {
        this.resultsByIdEvent = resultsByIdEvent;
    }
}
