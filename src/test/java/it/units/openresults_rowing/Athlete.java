package it.units.openresults_rowing;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Athlete {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idAthlete", nullable = false)
    private Integer idAthlete;
    @Basic
    @Column(name = "name", nullable = true, length = 45)
    private String name;
    @Basic
    @Column(name = "logbookId", nullable = true)
    private Integer logbookId;
    @Basic
    @Column(name = "birthdate", nullable = true)
    private Date birthdate;
    @Basic
    @Column(name = "country", nullable = true, length = 45)
    private String country;
    @Basic
    @Column(name = "location", nullable = true, length = 45)
    private String location;
    @Basic
    @Column(name = "height", nullable = true)
    private Integer height;
    @Basic
    @Column(name = "weight", nullable = true)
    private Integer weight;
    @Basic
    @Column(name = "membersince", nullable = true)
    private Date membersince;
    @Basic
    @Column(name = "retrieved", nullable = true)
    private Timestamp retrieved;
    @Basic
    @Column(name = "url", nullable = true, length = 255)
    private String url;
    @OneToMany(mappedBy = "athleteByAthleteIdAthlete")
    private Collection<Result> resultsByIdAthlete;

    public Integer getIdAthlete() {
        return idAthlete;
    }

    public void setIdAthlete(Integer idAthlete) {
        this.idAthlete = idAthlete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLogbookId() {
        return logbookId;
    }

    public void setLogbookId(Integer logbookId) {
        this.logbookId = logbookId;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Date getMembersince() {
        return membersince;
    }

    public void setMembersince(Date membersince) {
        this.membersince = membersince;
    }

    public Timestamp getRetrieved() {
        return retrieved;
    }

    public void setRetrieved(Timestamp retrieved) {
        this.retrieved = retrieved;
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
        Athlete athlete = (Athlete) o;
        return Objects.equals(idAthlete, athlete.idAthlete) && Objects.equals(name, athlete.name) && Objects.equals(logbookId, athlete.logbookId) && Objects.equals(birthdate, athlete.birthdate) && Objects.equals(country, athlete.country) && Objects.equals(location, athlete.location) && Objects.equals(height, athlete.height) && Objects.equals(weight, athlete.weight) && Objects.equals(membersince, athlete.membersince) && Objects.equals(retrieved, athlete.retrieved) && Objects.equals(url, athlete.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAthlete, name, logbookId, birthdate, country, location, height, weight, membersince, retrieved, url);
    }

    public Collection<Result> getResultsByIdAthlete() {
        return resultsByIdAthlete;
    }

    public void setResultsByIdAthlete(Collection<Result> resultsByIdAthlete) {
        this.resultsByIdAthlete = resultsByIdAthlete;
    }
}
