
/**
 * Write a description of class staffHire  here.
 *
 * @author (shyam sundar nepal)
 * @version (2020/01/13)
 */
class StaffHire{
    
    private String designation;
    private int vacancyNumber;
    private String jobType;
    
    /* creation of staffhire parameterized constructor which have three parameter they are vacancyNumber,desiganation and jobtype */
    public StaffHire(int vacancyNumber, String designation, String jobType) {
        this.vacancyNumber = vacancyNumber; 
        /*this keyword used because there are same instance variable name and constructor parameter name.this keyword help same variable name and same constructor name treat as different */
        this.designation = designation;
        this.jobType = jobType;
    }
    
    /*creation of accessor method (getter and setter)*/
    public void setVacancyNumber(int vacancyNumber) {
        this.vacancyNumber = vacancyNumber;
    }
    
    public int getVacancyNumber() {
        return vacancyNumber;
    }

      public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    public String getDesignation() {
        return designation;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }
    
    public String getJobType() {
        return jobType;
    }
    
    /* create display method to print vacancyNumber desigantion and jobtype */
    public void display(){
        System.out.println("Vacancy Number: "+ this.getVacancyNumber());
        System.out.println("Designation: "+ this.getDesignation());
        System.out.println("Job Type: "+ this.getJobType());
    }
}
