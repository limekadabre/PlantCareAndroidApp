package com.example.plantcareandroidapp1;

public class ProjectsModel {
    // string course_name for storing course_name
    // and imgid for storing image id.

    private String project_id;
    private String project_name;

    public ProjectsModel(String project_id, String project_name) {
        this.project_id = project_id;
        this.project_name = project_name;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }
}
