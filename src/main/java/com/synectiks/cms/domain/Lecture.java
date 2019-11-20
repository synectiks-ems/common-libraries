package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A Lecture.
 */
@Document(indexName = "lecture")
public class Lecture implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private LocalDate lecDate;

	@NotNull
	private LocalDate lastUpdatedOn;

	@NotNull
	private String lastUpdatedBy;

	@NotNull
	private String startTime;

	@NotNull
	private String endTime;

	@JsonIgnoreProperties("lectures")
	private AttendanceMaster attendancemaster;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getLecDate() {
		return lecDate;
	}

	public Lecture lecDate(LocalDate lecDate) {
		this.lecDate = lecDate;
		return this;
	}

	public void setLecDate(LocalDate lecDate) {
		this.lecDate = lecDate;
	}

	public void setLecDate(String date) {
		this.lecDate = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public LocalDate getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	public Lecture lastUpdatedOn(LocalDate lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
		return this;
	}

	public void setLastUpdatedOn(LocalDate lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public void setLastUpdatedOn(String date) {
		this.lastUpdatedOn = LocalDate.parse(date,
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public Lecture lastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
		return this;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public String getStartTime() {
		return startTime;
	}

	public Lecture startTime(String startTime) {
		this.startTime = startTime;
		return this;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public Lecture endTime(String endTime) {
		this.endTime = endTime;
		return this;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public AttendanceMaster getAttendancemaster() {
		return attendancemaster;
	}

	public Lecture attendancemaster(AttendanceMaster attendanceMaster) {
		this.attendancemaster = attendanceMaster;
		return this;
	}

	public void setAttendancemaster(AttendanceMaster attendanceMaster) {
		this.attendancemaster = attendanceMaster;
	}
	// jhipster-needle-entity-add-getters-setters - JHipster will add getters
	// and setters here, do not remove

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Lecture lecture = (Lecture) o;
		if (lecture.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), lecture.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Lecture{" + "id=" + getId() + ", lecDate='" + getLecDate() + "'"
				+ ", lastUpdatedOn='" + getLastUpdatedOn() + "'" + ", lastUpdatedBy='"
				+ getLastUpdatedBy() + "'" + ", startTime='" + getStartTime() + "'"
				+ ", endTime='" + getEndTime() + "'" + "}";
	}
}
