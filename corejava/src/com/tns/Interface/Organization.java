package com.tns.Interface;

interface TechnicalRole {
    void designArchitect();
}

interface ManagementRole {
    void ManageTeam();
}

class ProjectManager implements TechnicalRole, ManagementRole {

    private String name;
    private String Projectname;
    private int teamsize;
    private double projectBudget;

    public ProjectManager(String name, String projectname, int teamsize, double projectbudget) {
        super();
        this.name = name;
        this.Projectname = projectname;
        this.teamsize = teamsize;
        this.projectBudget = projectbudget;
    }

    @Override
    public void ManageTeam() {
        System.out.println("Managing a team of " + teamsize + " Developers");
    }

    @Override
    public void designArchitect() {
        System.out.println(name + " is architect for " + Projectname);
    }

    void checkBudget() {
        if (projectBudget > 100000) {
            System.out.println("High Budget Project");
        } else {
            System.out.println("Standard budget project");
        }
    }

    void displayProjectdetails() {
        System.out.println("Manager: " + name);
        System.out.println("Project: " + Projectname);
        System.out.println("Team: " + teamsize);
        System.out.println("Budget: " + projectBudget);
    }
}

public class Organization {
    public static void main(String[] args) {

        ProjectManager m = new ProjectManager(
            "MANU",
            "Ecommerce platform",
            9,
            230000
        );

        m.designArchitect();
        m.ManageTeam();
        m.checkBudget();
        m.displayProjectdetails();
    }
}
