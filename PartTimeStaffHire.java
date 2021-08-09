


/**
 * Write a description of class partTimeStaffHire here.
 *
 * @author (shyam sundar nepal)
 * @version (2020/01/13)
 */
/* This class(partTimeStaffHire) inherits StaffHire class */

public class PartTimeStaffHire extends StaffHire {
    private int wagesPerHour;
    private int workingHour;
    private String joiningDate;
    private String staffName;
    private String shifts;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    private boolean terminated;

    /* PartTimeStaffHire Constructor with six parameters in which three are inherited from StaffHire superclass */
    public PartTimeStaffHire(int vacancyNumber, String designation, String jobType, int workingHour, int wagesPerHour, String shifts) {
        /* Variables vacancyNumber, designation and jobType are inherited from StaffHire class*/
        super(vacancyNumber, designation, jobType);
        /* Setting values from parameter to own variables */
        this.workingHour = workingHour;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        /* Assigning values to other variables from own class */
        staffName="";
        joiningDate = "";
        qualification = "";
        appointedBy = "";
        joined = false;
        terminated = false;
    }

    //Accessor methods
    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }
    
    public int getWorkingHour() {
        return workingHour;
    }
  
    public void setWagesPerHour(int wagesPerHour) {
        this.wagesPerHour = wagesPerHour;
    }

    public int getWagesPerHour() {
        return wagesPerHour;
    }
    
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
    
    public String getStaffName() {
        return staffName;
    }
  
    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getAppointedBy() {
        return appointedBy;
    }

    public void setAppointedBy(String appointedBy) {
        this.appointedBy = appointedBy;
    }

    public String getShifts() {
        return shifts;
    }

    public void setShifts(String shifts) {
        
        if (joined==false){
          this.shifts = shifts;
          joined = true;
        }
        else{
            System.out.println(this.staffName + " is" +" already appointed.");
            System.out.println();
        }
        
    }

    public boolean getjoined() {
        return joined;
    }

    public void setJoined(boolean joined) {
        this.joined = joined;
    }

    public boolean getTerminated() {
        return terminated;
    }

    public void setTerminated(boolean terminated) {
        this.terminated = terminated;
    }

    /* The following is a method to hire part time staff for the organization. This method accept four parameter they are 
       staffName,joiningDate,qualification,appointedBy. if staff is already appointed print the message staff is already appointed.
       if staff is not appointed , the staff name, join date, qualification,appointed by are required
     * to update by the parameter values input to the method and the joining status of the staff is 
     * changed to true.
       */
    public void hirePartTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy){
        if (joined == false){
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.joined = true;
        } else {
            System.out.println(this.staffName + " is" +" already appointed.");
            System.out.println();
        }
    }

    /* terminatePartTimeStaff method terminated the staff. If the staff is already terminated, a
     * suitable message is displayed.if staff is not terminated staff name, join date, qualification,
     * appointed by are set to an empty string. Similarly, the joined status is set to false
     * while the terminated status is changed to true. */
    public void terminatePartTimeStaff(){
        if(terminated==true){
            System.out.println("Staff is already terminated");
        } else {
            terminated = true;
            joined = false;
            this.staffName = "";
            this.joiningDate = "";
            this.qualification = "";
            this.appointedBy = "";
        }
    }
    
    /* This is the method to display the details of the staffs hired part time by the company.
     * It has same signature as the display method in StaffHire. It first calls the method display()
     * in StaffHire to display its three attributes: vacancyNumber, designation and jobType. In 
     * addition its own attributes are also displayed if the staff has joined. */
    public void display(){
        if (joined==true){
            /* Calls display() from StaffHire class */
            super.display();
            /* Displays its own attributes adding to the ones displayed from the method called above */
            System.out.println("Staff Name: " + this.getStaffName());
            System.out.println("Wages per hour: " + this.getWagesPerHour());
            System.out.println("Working Hour: " + this.getWorkingHour());
            System.out.println("Joining Date: " + this.getJoiningDate());
            System.out.println("Qualification: " + this.getQualification());
            System.out.println("Appointed By: " + this.getAppointedBy());
            System.out.println("Income per day: "+ (this.getWorkingHour()*getWagesPerHour()));
            System.out.println();
        }
    }
}
