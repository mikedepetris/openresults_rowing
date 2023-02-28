package it.units.openresults_rowing;

import java.io.Serializable;
import java.util.Objects;

public class ResultPK implements Serializable {
    private Integer idResult;
    private Integer athleteIdAthlete;
    private Integer equipmentIdEquipment;
    private Integer eventIdEvent;
    private String weightclassIdWeightclass;
    private String genderIdGender;

    public Integer getIdResult() {
        return idResult;
    }

    public void setIdResult(Integer idResult) {
        this.idResult = idResult;
    }

    public Integer getAthleteIdAthlete() {
        return athleteIdAthlete;
    }

    public void setAthleteIdAthlete(Integer athleteIdAthlete) {
        this.athleteIdAthlete = athleteIdAthlete;
    }

    public Integer getEquipmentIdEquipment() {
        return equipmentIdEquipment;
    }

    public void setEquipmentIdEquipment(Integer equipmentIdEquipment) {
        this.equipmentIdEquipment = equipmentIdEquipment;
    }

    public Integer getEventIdEvent() {
        return eventIdEvent;
    }

    public void setEventIdEvent(Integer eventIdEvent) {
        this.eventIdEvent = eventIdEvent;
    }

    public String getWeightclassIdWeightclass() {
        return weightclassIdWeightclass;
    }

    public void setWeightclassIdWeightclass(String weightclassIdWeightclass) {
        this.weightclassIdWeightclass = weightclassIdWeightclass;
    }

    public String getGenderIdGender() {
        return genderIdGender;
    }

    public void setGenderIdGender(String genderIdGender) {
        this.genderIdGender = genderIdGender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultPK resultPK = (ResultPK) o;
        return Objects.equals(idResult, resultPK.idResult) && Objects.equals(athleteIdAthlete, resultPK.athleteIdAthlete) && Objects.equals(equipmentIdEquipment, resultPK.equipmentIdEquipment) && Objects.equals(eventIdEvent, resultPK.eventIdEvent) && Objects.equals(weightclassIdWeightclass, resultPK.weightclassIdWeightclass) && Objects.equals(genderIdGender, resultPK.genderIdGender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idResult, athleteIdAthlete, equipmentIdEquipment, eventIdEvent, weightclassIdWeightclass, genderIdGender);
    }
}
