package bharti;

import java.util.*;

class Patient {
    private int id;
    private String name;

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Only ID decides uniqueness
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient p = (Patient) o;
        return this.id == p.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Patient{id=" + id + ", name='" + name + "'}";
    }
}

public class registerID2 {
    public static void main(String[] args) {

        Set<Patient> patients = new HashSet<>();

        addPatient(patients, new Patient(101, "Amit"));
        addPatient(patients, new Patient(102, "Neha"));
        addPatient(patients, new Patient(101, "Rahul")); // duplicate ID

        System.out.println("\nList of unique registered patients:");
        for (Patient p : patients) {
            System.out.println(p);
        }
    }

    private static void addPatient(Set<Patient> patients, Patient p) {
        if (patients.contains(p)) {
            System.out.println("Patient with ID " + p + " already registered");
        } else {
            patients.add(p);
            System.out.println("Patient added to system: " + p);
        }
    }
}

