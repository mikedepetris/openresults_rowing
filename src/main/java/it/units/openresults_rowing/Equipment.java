package it.units.openresults_rowing;

import java.util.Collection;
import java.util.Objects;

public class Equipment {
    private Integer idEquipment;
    private String name;
    private String url;
    private Collection<Result> resultsByIdEquipment;

    public Integer getIdEquipment() {
        return idEquipment;
    }

    public void setIdEquipment(Integer idEquipment) {
        this.idEquipment = idEquipment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return Objects.equals(idEquipment, equipment.idEquipment) && Objects.equals(name, equipment.name) && Objects.equals(url, equipment.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEquipment, name, url);
    }

    public Collection<Result> getResultsByIdEquipment() {
        return resultsByIdEquipment;
    }

    public void setResultsByIdEquipment(Collection<Result> resultsByIdEquipment) {
        this.resultsByIdEquipment = resultsByIdEquipment;
    }
}
