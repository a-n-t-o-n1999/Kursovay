public class Employee {
    private String fullName;
    private int numOtdel;
    private int zP;
    private static int counterEmployee=0;
    private int idEmployee;
    Employee(String fullName,int numOtdel,int zP)
    {
        this.fullName=fullName;
        this.numOtdel=numOtdel;
        this.zP=zP;
        counterEmployee++;
        idEmployee=counterEmployee;
    }
    public void setNumOtdel(int numOtdel) {
        this.numOtdel=numOtdel;
    }
    public void setZP(int zP) {
        this.zP=zP;
    }
    public String getFullName() {
        return fullName;
    }
    public int getNumOtdel() {
        return numOtdel;
    }
    public int getZP() {
        return zP;
    }
    public int getIdEmployee() {
        return idEmployee;
    }
    public boolean equals(Employee employee) {
        return this.getIdEmployee()==employee.getIdEmployee();
    }
    public int hashCode(){
        return idEmployee;
    }
    public String toString() {
        return "Employee{" +
                "fullName = " + fullName +
                ", numOtdel = " + numOtdel +
                ", zP = " + zP +
                ", idEmployee = " + idEmployee ;
    }
}
