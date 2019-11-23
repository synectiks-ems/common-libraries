package com.synectiks.commons.entities.cms;

import java.util.List;

public class LibraryFilterDataCache {

    private List<Department> departments;
    private List<Batch> batches;
    private List<Section> sections;
    private List<CmsSemesterVo> semesters;
    private List<Branch> branches;
    private List<Subject> subjects;
    private List<AcademicExamSetting> academicExamSettings;
    private List<Library> libraries;
    private List<Student> students;
    private List<CmsBook>  books;

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Batch> getBatches() {
        return batches;
    }

    public void setBatches(List<Batch> batches) {
        this.batches = batches;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public List<CmsSemesterVo> getSemesters() {
        return semesters;
    }
    public void setSemesters(List<CmsSemesterVo> semesters) {
        this.semesters = semesters;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<AcademicExamSetting> getAcademicExamSettings() {
        return academicExamSettings;
    }

    public void setAcademicExamSettings(List<AcademicExamSetting> academicExamSettings) {
        this.academicExamSettings = academicExamSettings;
    }

    public List<Library> getLibraries() {
        return libraries;
    }

    public void setLibraries(List<Library> libraries) {
        this.libraries = libraries;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<CmsBook> getBooks() {
        return books;
    }

    public void setBooks(List<CmsBook> books) {
        this.books = books;
    }
}
