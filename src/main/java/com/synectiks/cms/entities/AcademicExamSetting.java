package com.synectiks.cms.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.synectiks.cms.entities.enumeration.GradeType;
import com.synectiks.cms.entities.enumeration.SemesterEnum;
import com.synectiks.commons.interfaces.IESEntity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A AcademicExamSetting.
 */
@Entity
@Table(name = "academic_exam_setting")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "academicexamsetting")
public class AcademicExamSetting implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
	@SequenceGenerator(name = "sequenceGenerator")
	private Long id;

	@NotNull
	@Column(name = "exam_name", nullable = false)
	private String examName;

	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = "semester", nullable = false)
	private SemesterEnum semester;

	@NotNull
	@Column(name = "exam_date", nullable = false)
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate examDate;

	@NotNull
	@Column(name = "start_time", nullable = false)
	private String startTime;

	@NotNull
	@Column(name = "end_time", nullable = false)
	private String endTime;

	@Enumerated(EnumType.STRING)
	@Column(name = "grade_type")
	private GradeType gradeType;

	@NotNull
	@Column(name = "total", nullable = false)
	private Integer total;

	@NotNull
	@Column(name = "passing", nullable = false)
	private Integer passing;

	@Column(name = "actions")
	private String actions;

	@Column(name = "groupvalue")
	private Long groupvalue;

	@NotNull
	@Column(name = "countvalue", nullable = false)
	private Long countvalue;

	@ManyToOne
	@JsonIgnoreProperties("academicExamSettings")
	private Branch branch;

	@ManyToOne
	@JsonIgnoreProperties("academicExamSettings")
	private Subject subject;

	@ManyToOne
	@JsonIgnoreProperties("academicExamSettings")
	private Department department;

	@ManyToOne
	@JsonIgnoreProperties("academicExamSettings")
	private TypeOfGrading typeOfGrading;

	@ManyToOne
	@JsonIgnoreProperties("academicExamSettings")
	private AcademicYear academicyear;

	@ManyToOne
	@JsonIgnoreProperties("academicExamSettings")
	private Section section;

	@ManyToOne
	@JsonIgnoreProperties("academicExamSettings")
	private Batch batch;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExamName() {
		return examName;
	}

	public AcademicExamSetting examName(String examName) {
		this.examName = examName;
		return this;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public SemesterEnum getSemester() {
		return semester;
	}

	public AcademicExamSetting semester(SemesterEnum semester) {
		this.semester = semester;
		return this;
	}

	public void setSemester(SemesterEnum semester) {
		this.semester = semester;
	}

	public LocalDate getExamDate() {
		return examDate;
	}

	public AcademicExamSetting examDate(LocalDate examDate) {
		this.examDate = examDate;
		return this;
	}

	public void setExamDate(LocalDate examDate) {
		this.examDate = examDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public AcademicExamSetting startTime(String startTime) {
		this.startTime = startTime;
		return this;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public AcademicExamSetting endTime(String endTime) {
		this.endTime = endTime;
		return this;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public GradeType getGradeType() {
		return gradeType;
	}

	public AcademicExamSetting gradeType(GradeType gradeType) {
		this.gradeType = gradeType;
		return this;
	}

	public void setGradeType(GradeType gradeType) {
		this.gradeType = gradeType;
	}

	public Integer getTotal() {
		return total;
	}

	public AcademicExamSetting total(Integer total) {
		this.total = total;
		return this;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPassing() {
		return passing;
	}

	public AcademicExamSetting passing(Integer passing) {
		this.passing = passing;
		return this;
	}

	public void setPassing(Integer passing) {
		this.passing = passing;
	}

	public String getActions() {
		return actions;
	}

	public AcademicExamSetting actions(String actions) {
		this.actions = actions;
		return this;
	}

	public void setActions(String actions) {
		this.actions = actions;
	}

	public Long getGroupvalue() {
		return groupvalue;
	}

	public AcademicExamSetting groupvalue(Long groupvalue) {
		this.groupvalue = groupvalue;
		return this;
	}

	public void setGroupvalue(Long groupvalue) {
		this.groupvalue = groupvalue;
	}

	public Long getCountvalue() {
		return countvalue;
	}

	public AcademicExamSetting countvalue(Long countvalue) {
		this.countvalue = countvalue;
		return this;
	}

	public void setCountvalue(Long countvalue) {
		this.countvalue = countvalue;
	}

	public Branch getBranch() {
		return branch;
	}

	public AcademicExamSetting branch(Branch branch) {
		this.branch = branch;
		return this;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Subject getSubject() {
		return subject;
	}

	public AcademicExamSetting subject(Subject subject) {
		this.subject = subject;
		return this;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Department getDepartment() {
		return department;
	}

	public AcademicExamSetting department(Department department) {
		this.department = department;
		return this;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public TypeOfGrading getTypeOfGrading() {
		return typeOfGrading;
	}

	public AcademicExamSetting typeOfGrading(TypeOfGrading typeOfGrading) {
		this.typeOfGrading = typeOfGrading;
		return this;
	}

	public void setTypeOfGrading(TypeOfGrading typeOfGrading) {
		this.typeOfGrading = typeOfGrading;
	}

	public AcademicYear getAcademicyear() {
		return academicyear;
	}

	public AcademicExamSetting academicyear(AcademicYear academicYear) {
		this.academicyear = academicYear;
		return this;
	}

	public void setAcademicyear(AcademicYear academicYear) {
		this.academicyear = academicYear;
	}

	public Section getSection() {
		return section;
	}

	public AcademicExamSetting section(Section section) {
		this.section = section;
		return this;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public Batch getBatch() {
		return batch;
	}

	public AcademicExamSetting batch(Batch batch) {
		this.batch = batch;
		return this;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
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
		AcademicExamSetting academicExamSetting = (AcademicExamSetting) o;
		if (academicExamSetting.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), academicExamSetting.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "AcademicExamSetting{" + "id=" + getId() + ", examName='" + getExamName()
				+ "'" + ", semester='" + getSemester() + "'" + ", examDate='"
				+ getExamDate() + "'" + ", startTime='" + getStartTime() + "'"
				+ ", endTime='" + getEndTime() + "'" + ", gradeType='" + getGradeType()
				+ "'" + ", total=" + getTotal() + ", passing=" + getPassing()
				+ ", actions='" + getActions() + "'" + ", groupvalue=" + getGroupvalue()
				+ ", countvalue=" + getCountvalue() + "}";
	}
}
