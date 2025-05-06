package com.example.test;

import java.util.List;
import java.util.Objects;

public class TestDTO {

    @Override
    public String toString() {
        return "TestDTO{" +
                "eName='" + eName + '\'' +
                ", role='" + role + '\'' +
                ", eAge=" + eAge +
                ", male=" + male +
                '}';
    }

    private String eName;
    private String role;
    private int eAge;
    private boolean male;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TestDTO testDTO = (TestDTO) o;
        return eAge == testDTO.eAge && male == testDTO.male && Objects.equals(eName, testDTO.eName) && Objects.equals(role, testDTO.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eName, role, eAge, male);
    }



    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int geteAge() {
        return eAge;
    }

    public void seteAge(int eAge) {
        this.eAge = eAge;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }



    public TestDTO() {

    }

    public TestDTO(String eName, String role, int eAge, boolean male) {
        this.eName = eName;
        this.role = role;
        this.eAge = eAge;
        this.male = male;
    }


}
