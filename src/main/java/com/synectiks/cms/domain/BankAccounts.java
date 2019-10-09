package com.synectiks.cms.domain;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.commons.interfaces.IESEntity;

/**
 * A BankAccounts.
 */
@Document(indexName = "bankaccounts")
public class BankAccounts implements Serializable, IESEntity {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull
	private String nameOfBank;

	@NotNull
	private Long accountNumber;

	@NotNull
	private String typeOfAccount;

	@NotNull
	private String ifscCode;

	@NotNull
	private String branchAddress;

	@NotNull
	private Integer corporateId;

	@JsonIgnoreProperties("bankAccounts")
	private Branch branch;

	@JsonIgnoreProperties("bankAccounts")
	private College college;

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not
	// remove
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameOfBank() {
		return nameOfBank;
	}

	public BankAccounts nameOfBank(String nameOfBank) {
		this.nameOfBank = nameOfBank;
		return this;
	}

	public void setNameOfBank(String nameOfBank) {
		this.nameOfBank = nameOfBank;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public BankAccounts accountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
		return this;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getTypeOfAccount() {
		return typeOfAccount;
	}

	public BankAccounts typeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
		return this;
	}

	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public BankAccounts ifscCode(String ifscCode) {
		this.ifscCode = ifscCode;
		return this;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public BankAccounts branchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
		return this;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public Integer getCorporateId() {
		return corporateId;
	}

	public BankAccounts corporateId(Integer corporateId) {
		this.corporateId = corporateId;
		return this;
	}

	public void setCorporateId(Integer corporateId) {
		this.corporateId = corporateId;
	}

	public Branch getBranch() {
		return branch;
	}

	public BankAccounts branch(Branch branch) {
		this.branch = branch;
		return this;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public College getCollege() {
		return college;
	}

	public BankAccounts college(College college) {
		this.college = college;
		return this;
	}

	public void setCollege(College college) {
		this.college = college;
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
		BankAccounts bankAccounts = (BankAccounts) o;
		if (bankAccounts.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), bankAccounts.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "BankAccounts{" + "id=" + getId() + ", nameOfBank='" + getNameOfBank()
				+ "'" + ", accountNumber=" + getAccountNumber() + ", typeOfAccount='"
				+ getTypeOfAccount() + "'" + ", ifscCode='" + getIfscCode() + "'"
				+ ", branchAddress='" + getBranchAddress() + "'" + ", corporateId="
				+ getCorporateId() + "}";
	}
}
