package it.units.openresults_rowing;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

public class Result {
    private Integer idResult;
    private String location;
    private Integer age;
    private String adaptiveclass;
    private Integer distance;
    private Time time;
    private Timestamp retrieved;
    private Integer athleteIdAthlete;
    private Integer equipmentIdEquipment;
    private Integer eventIdEvent;
    private String entered;
    private Byte veirfied;
    private String club;
    private String url;
    private String weightclassIdWeightclass;
    private String genderIdGender;
    private String adaptiveclassIdadaptiveclass;
    private Athlete athleteByAthleteIdAthlete;
    private Equipment equipmentByEquipmentIdEquipment;
    private Event eventByEventIdEvent;
    private Weightclass weightclassByWeightclassIdWeightclass;
    private Gender genderByGenderIdGender;
    private Adaptiveclass adaptiveclassByAdaptiveclassIdadaptiveclass;

    public Integer getIdResult() {
        return idResult;
    }

    public void setIdResult(Integer idResult) {
        this.idResult = idResult;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAdaptiveclass() {
        return adaptiveclass;
    }

    public void setAdaptiveclass(String adaptiveclass) {
        this.adaptiveclass = adaptiveclass;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Timestamp getRetrieved() {
        return retrieved;
    }

    public void setRetrieved(Timestamp retrieved) {
        this.retrieved = retrieved;
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

    public String getEntered() {
        return entered;
    }

    public void setEntered(String entered) {
        this.entered = entered;
    }

    public Byte getVeirfied() {
        return veirfied;
    }

    public void setVeirfied(Byte veirfied) {
        this.veirfied = veirfied;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getAdaptiveclassIdadaptiveclass() {
        return adaptiveclassIdadaptiveclass;
    }

    public void setAdaptiveclassIdadaptiveclass(String adaptiveclassIdadaptiveclass) {
        this.adaptiveclassIdadaptiveclass = adaptiveclassIdadaptiveclass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return Objects.equals(idResult, result.idResult) && Objects.equals(location, result.location) && Objects.equals(age, result.age) && Objects.equals(adaptiveclass, result.adaptiveclass) && Objects.equals(distance, result.distance) && Objects.equals(time, result.time) && Objects.equals(retrieved, result.retrieved) && Objects.equals(athleteIdAthlete, result.athleteIdAthlete) && Objects.equals(equipmentIdEquipment, result.equipmentIdEquipment) && Objects.equals(eventIdEvent, result.eventIdEvent) && Objects.equals(entered, result.entered) && Objects.equals(veirfied, result.veirfied) && Objects.equals(club, result.club) && Objects.equals(url, result.url) && Objects.equals(weightclassIdWeightclass, result.weightclassIdWeightclass) && Objects.equals(genderIdGender, result.genderIdGender) && Objects.equals(adaptiveclassIdadaptiveclass, result.adaptiveclassIdadaptiveclass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idResult, location, age, adaptiveclass, distance, time, retrieved, athleteIdAthlete, equipmentIdEquipment, eventIdEvent, entered, veirfied, club, url, weightclassIdWeightclass, genderIdGender, adaptiveclassIdadaptiveclass);
    }

    public it.units.openresults_rowing.Athlete getAthleteByAthleteIdAthlete() {
        return athleteByAthleteIdAthlete;
    }

    public void setAthleteByAthleteIdAthlete(it.units.openresults_rowing.Athlete athleteByAthleteIdAthlete) {
        this.athleteByAthleteIdAthlete = athleteByAthleteIdAthlete;
    }

    public Equipment getEquipmentByEquipmentIdEquipment() {
        return equipmentByEquipmentIdEquipment;
    }

    public void setEquipmentByEquipmentIdEquipment(Equipment equipmentByEquipmentIdEquipment) {
        this.equipmentByEquipmentIdEquipment = equipmentByEquipmentIdEquipment;
    }

    public Event getEventByEventIdEvent() {
        return eventByEventIdEvent;
    }

    public void setEventByEventIdEvent(Event eventByEventIdEvent) {
        this.eventByEventIdEvent = eventByEventIdEvent;
    }

    public Weightclass getWeightclassByWeightclassIdWeightclass() {
        return weightclassByWeightclassIdWeightclass;
    }

    public void setWeightclassByWeightclassIdWeightclass(Weightclass weightclassByWeightclassIdWeightclass) {
        this.weightclassByWeightclassIdWeightclass = weightclassByWeightclassIdWeightclass;
    }

    public Gender getGenderByGenderIdGender() {
        return genderByGenderIdGender;
    }

    public void setGenderByGenderIdGender(Gender genderByGenderIdGender) {
        this.genderByGenderIdGender = genderByGenderIdGender;
    }

    public Adaptiveclass getAdaptiveclassByAdaptiveclassIdadaptiveclass() {
        return adaptiveclassByAdaptiveclassIdadaptiveclass;
    }

    public void setAdaptiveclassByAdaptiveclassIdadaptiveclass(Adaptiveclass adaptiveclassByAdaptiveclassIdadaptiveclass) {
        this.adaptiveclassByAdaptiveclassIdadaptiveclass = adaptiveclassByAdaptiveclassIdadaptiveclass;
    }
}
