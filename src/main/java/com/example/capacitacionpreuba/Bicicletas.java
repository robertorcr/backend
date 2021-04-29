package com.example.capacitacionpreuba;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="free_bike_status")
public class Bicicletas {
    private String dataBikesId;
    private String dataBikeName;
    private float dataBikesLon;
    private float dataBikesLat;
    private int dataBikeIsReserved;
    private int dataBikeIsDisabled;


    public Bicicletas(String dataBikesId, String dataBikeName, float dataBikesLon, float dataBikesLat, int dataBikeIsReserved, int dataBikeIsDisabled) {
        this.dataBikesId = dataBikesId;
        this.dataBikeName = dataBikeName;
        this.dataBikesLon = dataBikesLon;
        this.dataBikesLat = dataBikesLat;
        this.dataBikeIsReserved = dataBikeIsReserved;
        this.dataBikeIsDisabled = dataBikeIsDisabled;
    }

    public Bicicletas() {
    }


    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "databikesid")
    public String getDataBikesId() {
        return this.dataBikesId;
    }

    public void setDataBikesId(String dataBikeId) {
        this.dataBikesId = dataBikeId;
    }

    @Column(name="databikesname")
    public String getDataBikeName() {
        return this.dataBikeName;
    }

    public void setDataBikeName(String dataBikeName) {
        this.dataBikeName = dataBikeName;
    }

    @Column(name="databikeslon")
    public float getDataBikesLon() {
        return this.dataBikesLon;
    }

    public void setDataBikesLon(float dataBikesLon) {
        this.dataBikesLon = dataBikesLon;
    }

    @Column(name="databikeslat")
    public float getDataBikesLat() {
        return this.dataBikesLat;
    }

    public void setDataBikesLat(float dataBikesLat) {
        this.dataBikesLat = dataBikesLat;
    }

    @Column(name = "databikesisreserved")
    public int getDataBikeIsReserved() {
        return this.dataBikeIsReserved;
    }

    public void setDataBikeIsReserved(int dataBikeIsReserved) {
        this.dataBikeIsReserved = dataBikeIsReserved;
    }

    @Column(name="databikesisdisabled")
    public int getDataBikeIsDisabled() {
        return this.dataBikeIsDisabled;
    }

    public void setDataBikeIsDisabled(int dataBikeIsDisabled) {
        this.dataBikeIsDisabled = dataBikeIsDisabled;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Bicicletas)) {
            return false;
        }
        Bicicletas bicicletas = (Bicicletas) o;
        return Objects.equals(dataBikesId, bicicletas.dataBikesId) && Objects.equals(dataBikeName, bicicletas.dataBikeName) && dataBikesLon == bicicletas.dataBikesLon && dataBikesLat == bicicletas.dataBikesLat && dataBikeIsReserved == bicicletas.dataBikeIsReserved && dataBikeIsDisabled == bicicletas.dataBikeIsDisabled;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataBikesId, dataBikeName, dataBikesLon, dataBikesLat, dataBikeIsReserved, dataBikeIsDisabled);
    }


    @Override
    public String toString() {
        return "{" +
            " dataBikesId='" + getDataBikesId() + "'" +
            ", dataBikeName='" + getDataBikeName() + "'" +
            ", dataBikesLon='" + getDataBikesLon() + "'" +
            ", dataBikesLat='" + getDataBikesLat() + "'" +
            ", dataBikeIsReserved='" + getDataBikeIsReserved() + "'" +
            ", dataBikeIsDisabled='" + getDataBikeIsDisabled() + "'" +
            "}";
    }


}
