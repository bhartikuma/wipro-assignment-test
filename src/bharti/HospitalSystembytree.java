package bharti;

import java.util.HashMap;
import java.util.Map;

public class HospitalSystembytree {
    private int patientId;
    private String name;
    private int age;

    public HospitalSystembytree(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    static Map<Integer, HospitalSystembytree> patients = new HashMap<>();

    public static void registraionPatient(HospitalSystembytree patient) {
        if (patients.containsKey(patient.patientId)) {
            System.out.println("error: patient id" + patient.patientId + " already exist");
        } else {
            patients.put(patient.patientId, patient);
            System.out.println("successfully Added " + patient.name);
        }
    }

    public static void displayPatients() {
        System.out.println(" patient record");
        for (Map.Entry<Integer, HospitalSystembytree> entry : patients.entrySet()) {
            System.out.println("id " + entry.getKey() + "  " + entry.getValue());
        }
    }
    public String toString() {
        return "Name: " + name + "Age: " + age;
    }

    public static void main(String[] args) {
        registraionPatient(new HospitalSystembytree(9, "hu", 30));
        registraionPatient(new HospitalSystembytree(97, "ji", 25));
        registraionPatient(new HospitalSystembytree(12, "ko", 40)); 

        displayPatients();
    }
}
