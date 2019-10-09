package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.synectiks.commons.interfaces.IESEntity;

/**
 * A Country.
 */
@Document(indexName = "country")
public class Country implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String countryName;

	@NotNull
	private String countryCode;
	private String isdCode;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public Country countryName(String countryName) {
		this.countryName = countryName;
		return this;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public Country countryCode(String countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getIsdCode() {
		return isdCode;
	}

	public Country isdCode(String isdCode) {
		this.isdCode = isdCode;
		return this;
	}

	public void setIsdCode(String isdCode) {
		this.isdCode = isdCode;
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
		Country country = (Country) o;
		if (country.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), country.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "Country{" + "id=" + getId() + ", countryName='" + getCountryName() + "'"
				+ ", countryCode='" + getCountryCode() + "'" + ", isdCode='"
				+ getIsdCode() + "'" + "}";
	}
}
