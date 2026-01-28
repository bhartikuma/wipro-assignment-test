package bharti;


import java.util.HashMap;
import java.util.Map;
import java.util.Set; 

public class HospitalSystem {
    private int patientId;
    private String name;
    private int age;
    static Map<Integer, HospitalSystem> patients = new HashMap<>();

    public HospitalSystem(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public static void registraionPatient(HospitalSystem patient) {
        if (patients.containsKey(patient.patientId)) {
            System.out.println("error: patient id " + patient.patientId + " already exist");
        } else {
            
            patients.put(patient.patientId, patient);
            System.out.println("successfully Added " + patient.name);
        }
    }

    public static void displayPatients() {
        System.out.println("List of Unique Registered Patients:");
        for (HospitalSystem p : patients.values()) {
            System.out.println(p);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        HospitalSystem other = (HospitalSystem) obj;
        return this.patientId == other.patientId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(patientId);
    }

    @Override
    public String toString() {
        return "Patient [ID=" + patientId + ", Name=" + name + ", Age=" + age + "]";
    }

    public static void main(String[] args) {
        HospitalSystem p1 = new HospitalSystem(101, "Ravi", 30);
        HospitalSystem p2 = new HospitalSystem(102, "Ram", 30);
        HospitalSystem p3 = new HospitalSystem(103, "Ramesh", 30);
        HospitalSystem p4 = new HospitalSystem(101, "Ravi Duplicate", 30); 

        registraionPatient(p1);
        registraionPatient(p2);
        registraionPatient(p3);
        registraionPatient(p4); 

        System.out.println();
        displayPatients();
    }
}

