package com.synectiks.commons.entities.cms;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.synectiks.commons.entities.cms.enumeration.Status;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A Holiday.
 */
@Entity
@Table(name = "holiday")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "holiday")
public class Holiday implements Serializable, IESEntity {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(name = "holiday_desc", nullable = false)
    private String holidayDesc;

    @NotNull
    @Column(name = "holiday_date", nullable = false)
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate holidayDate;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "holiday_status", nullable = false)
    private Status holidayStatus;

    @ManyToOne
    @JsonIgnoreProperties("holidays")
    private AcademicYear academicyear;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHolidayDesc() {
        return holidayDesc;
    }

    public Holiday holidayDesc(String holidayDesc) {
        this.holidayDesc = holidayDesc;
        return this;
    }

    public void setHolidayDesc(String holidayDesc) {
        this.holidayDesc = holidayDesc;
    }

    public LocalDate getHolidayDate() {
        return holidayDate;
    }

    public Holiday holidayDate(LocalDate holidayDate) {
        this.holidayDate = holidayDate;
        return this;
    }

    public void setHolidayDate(LocalDate holidayDate) {
        this.holidayDate = holidayDate;
    }

    public Status getHolidayStatus() {
        return holidayStatus;
    }

    public Holiday holidayStatus(Status holidayStatus) {
        this.holidayStatus = holidayStatus;
        return this;
    }

    public void setHolidayStatus(Status holidayStatus) {
        this.holidayStatus = holidayStatus;
    }

    public AcademicYear getAcademicyear() {
        return academicyear;
    }

    public Holiday academicyear(AcademicYear academicYear) {
        this.academicyear = academicYear;
        return this;
    }

    public void setAcademicyear(AcademicYear academicYear) {
        this.academicyear = academicYear;
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
        Holiday holiday = (Holiday) o;
        if (holiday.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), holiday.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Holiday{" +
            "id=" + getId() +
            ", holidayDesc='" + getHolidayDesc() + "'" +
            ", holidayDate='" + getHolidayDate() + "'" +
            ", holidayStatus='" + getHolidayStatus() + "'" +
            "}";
    }
}
