package com.skillenza.parkinglotjava;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "parkinglots")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
public class ParkingLot {
	
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_at")
    private ZonedDateTime createdAt;

    @Column(name = "lot")
    private Integer lot;

    @Column(name = "partking_amount")
    private Integer partkingAmount;

    @Column(name = "partking_duration")
    private Integer partkingDuration;

    @Column(name = "updated_at")
    private ZonedDateTime updatedAt;

    @Column(name = "vehicle_number")
    private Integer vehicleNumber;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public ParkingLot createdAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getLot() {
        return lot;
    }

    public ParkingLot lot(Integer lot) {
        this.lot = lot;
        return this;
    }

    public void setLot(Integer lot) {
        this.lot = lot;
    }

    public Integer getPartkingAmount() {
        return partkingAmount;
    }

    public ParkingLot partkingAmount(Integer partkingAmount) {
        this.partkingAmount = partkingAmount;
        return this;
    }

    public void setPartkingAmount(Integer partkingAmount) {
        this.partkingAmount = partkingAmount;
    }

    public Integer getPartkingDuration() {
        return partkingDuration;
    }

    public ParkingLot partkingDuration(Integer partkingDuration) {
        this.partkingDuration = partkingDuration;
        return this;
    }

    public void setPartkingDuration(Integer partkingDuration) {
        this.partkingDuration = partkingDuration;
    }

    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    public ParkingLot updatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getVehicleNumber() {
        return vehicleNumber;
    }

    public ParkingLot vehicleNumber(Integer vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        return this;
    }

    public void setVehicleNumber(Integer vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParkingLot parkinglots = (ParkingLot) o;
        if (parkinglots.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), parkinglots.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Parkinglots{" +
            "id=" + getId() +
            ", createdAt='" + getCreatedAt() + "'" +
            ", lot=" + getLot() +
            ", partkingAmount=" + getPartkingAmount() +
            ", partkingDuration=" + getPartkingDuration() +
            ", updatedAt='" + getUpdatedAt() + "'" +
            ", vehicleNumber=" + getVehicleNumber() +
            "}";
    }
    
}
