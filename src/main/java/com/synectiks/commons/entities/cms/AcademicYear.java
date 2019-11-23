package com.synectiks.commons.entities.cms;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;

import java.time.LocalDate;
import java.util.Objects;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.synectiks.commons.entities.cms.enumeration.Status;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A AcademicYear.
 */
@Entity
@Table(name = "academic_year")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "academicyear")
public class AcademicYear implements Serializable, IESEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(name = "jhi_year", nullable = false)
    private String year;

    @NotNull
    @Column(name = "start_date", nullable = false)
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate startDate;

    @NotNull
    @Column(name = "end_date", nullable = false)
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate endDate;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public AcademicYear year(String year) {
        this.year = year;
        return this;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public AcademicYear startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public AcademicYear endDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Status getStatus() {
        return status;
    }

    public AcademicYear status(Status status) {
        this.status = status;
        return this;
    }

    public void setStatus(Status status) {
        this.status = status;
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
        AcademicYear academicYear = (AcademicYear) o;
        if (academicYear.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), academicYear.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "AcademicYear{" +
            "id=" + getId() +
            ", year='" + getYear() + "'" +
            ", startDate='" + getStartDate() + "'" +
            ", endDate='" + getEndDate() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }
}
