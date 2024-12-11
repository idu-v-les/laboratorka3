public class Polyclinic {
    private String name; // Название поликлиники
    private String address; // Адрес поликлиники
    private String patientLastName; // Фамилия пациента
    private String policyNumber; // Номер полиса
    private String inspectionDate; // Дата осмотра
    private String doctorLastName; // Фамилия врача
    private String doctorPosition; // Должность врача
    private String diagnosis; // Диагноз

    // Конструктор
    public Polyclinic(String name, String address, String patientLastName, String policyNumber,
                      String inspectionDate, String doctorLastName, String doctorPosition, String diagnosis) {
        this.name = name;
        this.address = address;
        this.patientLastName = patientLastName;
        this.policyNumber = policyNumber;
        this.inspectionDate = inspectionDate;
        this.doctorLastName = doctorLastName;
        this.doctorPosition = doctorPosition;
        this.diagnosis = diagnosis;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(String inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public String getDoctorLastName() {
        return doctorLastName;
    }

    public void setDoctorLastName(String doctorLastName) {
        this.doctorLastName = doctorLastName;
    }

    public String getDoctorPosition() {
        return doctorPosition;
    }

    public void setDoctorPosition(String doctorPosition) {
        this.doctorPosition = doctorPosition;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    // Переопределение toString
    @Override
    public String toString() {
        return String.format("Поликлиника: %s\nАдрес: %s\nПациент: %s\nНомер полиса: %s\nДата осмотра: %s\n" +
                        "Врач: %s (%s)\nДиагноз: %s",
                name, address, patientLastName, policyNumber, inspectionDate, doctorLastName, doctorPosition, diagnosis);
    }
}