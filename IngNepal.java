

/**
 * Write a description of class IngNepal here.
 *
 * @author (shyam sundar nepal)
 * @version (2-6-2000)
 */
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
public class IngNepal extends JFrame implements ActionListener
{
    ArrayList<StaffHire> list=new ArrayList<StaffHire>();
    FullTimeStaffHire full;
    PartTimeStaffHire part;
     //JLabel,JTextField and JButton for fullTime
     public JButton fullTime,appoint,display,clear;
    
    public JLabel top,vacancyNum,designation,jobType,salary,workingHours,staffName,
    joiningDate,qualification,appointedBy,workingShifts,wagesPerHours;
    public JTextField txtVacancyNum,txtDesignation,txtJobType,txtSalary,txtWorkingHours,
    txtStaffName,txtJoiningDate,txtQualification,txtAppointedBy,txtWorkingShifts,
    txtWagesPerHours;
    //JLabel,JTextField and JButton for partTime
    public JLabel partTime, vacNum,desig,jobTyp,vacaNum,workingHour,staffNam,joiningDat,qualif,
    appoinBy,workingShif,wagesPerHour,vac;
    public JTextField txtVacNum,txtDesig,txtJobTyp,txtWorkingHour,txtStaffNam,txtVacaNum,
    txtJoiningDat,txtQualif,txtAppoinBy,txtWorkingShif,txtWagesPerHour,txtVac;
    public JButton terminate,addPartTime,appoin;
    public void m1(){
        JFrame frame=new JFrame();
    
    
   
   
    
    frame.setTitle("string");
    frame.setVisible(true);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(750,700);
   top=new JLabel("For full time Employee:");
   vacancyNum=new JLabel("Vacancy Number:");
   designation=new JLabel("Designation:");
   jobType=new JLabel("Job Type:");
   salary=new JLabel("Salary:");
   workingHours=new JLabel("Working Hours:");
   fullTime=new JButton("Add Staff Full Time");
   staffName=new JLabel("Staff Name:");
   joiningDate=new JLabel("Joining Date:");
   qualification=new JLabel("Qualification:");
   appointedBy=new JLabel("Appointed By:");
   appoint=new JButton("Appoint full Time");
   workingShifts=new JLabel("Vacancy Number:");
   wagesPerHours=new JLabel("Wages Per Hours:");
   txtVacancyNum=new JTextField();
   txtDesignation=new JTextField();
   txtJobType=new JTextField();
   txtSalary=new JTextField();
   txtWorkingHours=new JTextField();
   txtStaffName=new JTextField();
   txtJoiningDate=new JTextField();
   txtQualification=new JTextField();
   txtAppointedBy=new JTextField();
   txtWorkingShifts=new JTextField();
   txtWagesPerHours=new JTextField();
   //JLabel and JTextField for part time
   partTime=new JLabel("For Part Time Employee:");
   vacNum=new JLabel("Vacancy Number:");
   desig=new JLabel("Designation:");
   jobTyp=new JLabel("Job Type:");
   workingHour=new JLabel("Working Hours:");
   vacaNum=new JLabel("Vacancy Number:");
   staffNam=new JLabel("Staff Name:");
   joiningDat=new JLabel("DateOfJooined:");
   appoinBy=new JLabel("Appointed By:");
   workingShif=new JLabel("Shift:");
   wagesPerHour=new JLabel("Wages Per Hours:");
   qualif=new JLabel("Qualification:");
   vac=new JLabel("Vacancy Number:");
   txtQualif=new JTextField();
   txtVacNum=new JTextField();
   txtDesig=new JTextField();
   txtJobTyp=new JTextField();
   txtWorkingHour=new JTextField();
   txtVacaNum=new JTextField();
   txtStaffNam=new JTextField();
   txtJoiningDat=new JTextField();
   txtQualif=new JTextField();
   txtAppoinBy=new JTextField();
   txtWorkingShif=new JTextField();
   txtWagesPerHour=new JTextField();
   txtVac=new JTextField();
   addPartTime=new JButton("Add Staff Part Time");
   terminate=new JButton("Terminate");
   appoin=new JButton("Appoint part Time");
   clear=new JButton("clear");
   display=new JButton("Display"); 
   
   
   
   
   
   
   
   
   
   
   top.setBounds(200,10,200,30);
   frame.add(top);
   vacancyNum.setBounds(10,40,120,20);
   frame.add(vacancyNum);
   txtVacancyNum.setBounds(130,40,100,30);
   frame.add(txtVacancyNum);
   designation.setBounds(250,40,100,20);
   frame.add(designation);
   txtDesignation.setBounds(330,40,100,30);
   frame.add(txtDesignation);
   jobType.setBounds(440,40,100,20);
   frame.add(jobType);
   txtJobType.setBounds(500,40,100,30);
   frame.add(txtJobType);
   salary.setBounds(10,80,50,20);
   frame.add(salary);
   txtSalary.setBounds(130,80,100,30);
   frame.add(txtSalary);
   workingHours.setBounds(250,80,150,20);
   frame.add(workingHours);
   txtWorkingHours.setBounds(350,80,100,30);
   frame.add(txtWorkingHours);
   fullTime.setBounds(470,80,150,30);
   frame.add(fullTime);
   workingShifts.setBounds(10,130,150,20);
   frame.add(workingShifts);
   txtWorkingShifts.setBounds(130,130,100,30);
   frame.add(txtWorkingShifts);
   staffName.setBounds(250,130,100,20);
   frame.add(staffName);
   txtStaffName.setBounds(350,130,100,30);
   frame.add(txtStaffName);
   joiningDate.setBounds(470,130,100,20);
   frame.add(joiningDate);
   txtJoiningDate.setBounds(550,130,100,30);
   frame.add(txtJoiningDate);
   qualification.setBounds(10,180,100,20);
   frame.add(qualification);
   txtQualification.setBounds(110,180,100,30);
   frame.add(txtQualification);
   appointedBy.setBounds(220,180,100,20);
   frame.add(appointedBy);
   txtAppointedBy.setBounds(320,180,100,30);
   frame.add(txtAppointedBy);
   wagesPerHours.setBounds(440,180,150,20);
   frame.add(wagesPerHours);
   txtWagesPerHours.setBounds(550,180,100,30);
   frame.add(txtWagesPerHours);
   appoint.setBounds(510,220,150,30);
   frame.add(appoint);
   //set the position for part time staff hire
   partTime.setBounds(200,220,150,30);
   frame.add(partTime);
   vacNum.setBounds(10,260,150,20);
   frame.add(vacNum);
   txtVacNum.setBounds(130,260,100,30);
   frame.add(txtVacNum);
   desig.setBounds(250,260,100,20);
   frame.add(desig);
   txtDesig.setBounds(330,260,100,30);
   frame.add(txtDesig);
   jobTyp.setBounds(450,260,100,20);
   frame.add(jobTyp);
   txtJobTyp.setBounds(530,260,100,30);
   frame.add(txtJobTyp);
   workingHour.setBounds(10,300,100,20);
   frame.add(workingHour);
   txtWorkingHour.setBounds(130,300,100,30);
   frame.add(txtWorkingHour);
   wagesPerHour.setBounds(250,300,150,20);
   frame.add(wagesPerHour);
   txtWagesPerHour.setBounds(370,300,100,30);
   frame.add(txtWagesPerHour);
   workingShif.setBounds(490,300,50,20);
   frame.add(workingShif);
   txtWorkingShif.setBounds(550,300,100,30);
   frame.add(txtWorkingShif);
   addPartTime.setBounds(530,350,150,30);
   frame.add(addPartTime);
   vacaNum.setBounds(10,390,150,20);
   frame.add(vacaNum);
   txtVacaNum.setBounds(130,390,100,30);
   frame.add(txtVacaNum);
   staffNam.setBounds(250,390,100,20);
   frame.add(staffNam);
   txtStaffNam.setBounds(350,390,100,30);
   frame.add(txtStaffNam);
   joiningDat.setBounds(460,390,100,20);
   frame.add(joiningDat);
   txtJoiningDat.setBounds(560,390,100,30);
   frame.add(txtJoiningDat);
   qualif.setBounds(10,440,100,20);
   frame.add(qualif);
   txtQualif.setBounds(110,440,100,30);
   frame.add(txtQualif);
   appoinBy.setBounds(230,440,100,20);
   frame.add(appoinBy);
   txtAppoinBy.setBounds(350,440,100,30);
   frame.add(txtAppoinBy);
   appoin.setBounds(470,440,150,30);
   frame.add(appoin);
   vac.setBounds(10,490,150,20);
   frame.add(vac);
   txtVac.setBounds(130,490,100,30);
   frame.add(txtVac);
   terminate.setBounds(250,490,100,30);
   frame.add(terminate);
   clear.setBounds(10,550,100,30);
   frame.add(clear);
   display.setBounds(470,550,100,30);
   frame.add(display);
   
   
   
   
   
   
   
   
   
   
   
   fullTime.addActionListener(this);
   addPartTime.addActionListener(this);
   appoint.addActionListener(this);
   appoin.addActionListener(this);
   terminate.addActionListener(this);
   display.addActionListener(this);
   clear.addActionListener(this);
   } 
   public static void main(String[] args){
    IngNepal obj=new IngNepal();
    obj.m1();
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==fullTime){
            int vacancy,slary,workingHrs;
            String designation,jobType;
            boolean check;
            try{
            vacancy=Integer.parseInt(txtVacancyNum.getText());
            designation=txtDesignation.getText();
            jobType=txtJobType.getText();
            slary=Integer.parseInt(txtSalary.getText());
            workingHrs=Integer.parseInt(txtWorkingHours.getText());
            check=false;
            for(StaffHire var:list) {
        if(var.getVacancyNumber()==vacancy){
            check=true;
            break;
            }
        }
               if(check==false){
                 full=new FullTimeStaffHire(vacancy,designation,jobType,slary,workingHrs);
                list.add(full);
                 JOptionPane.showMessageDialog(null,"vacancy added "+list.size());
                }else{
                     JOptionPane.showMessageDialog(null,"input vacancy no is already in the list. "+list.size());
                    }
        }catch(Exception exp){
            JOptionPane.showMessageDialog(null,"please Enter all the fields");
        }
              
        }
        if(e.getSource()==addPartTime){
            int vacancynum,workingHour,wagesPerHour;
            String designation,jobType,shift;
            boolean checkDuplicateVacancyNum;
            try{
                vacancynum=Integer.parseInt(txtVacNum.getText());
                  designation=txtDesig.getText();
                  jobType=txtJobType.getText();
                  workingHour=Integer.parseInt(txtWorkingHour.getText());
                  wagesPerHour=Integer.parseInt(txtWagesPerHour.getText());
                  shift=txtWorkingShif.getText();
                 checkDuplicateVacancyNum=false;
                 System.out.println(vacancynum);
                 
                 for(StaffHire ob: list){
                 if(ob.getVacancyNumber()==vacancynum){
                 checkDuplicateVacancyNum=true;
                 break;
                   }
            }
             if(checkDuplicateVacancyNum==false){
                 part=new PartTimeStaffHire(vacancynum,designation,jobType,workingHour,wagesPerHour,shift);
                list.add(part);
                 JOptionPane.showMessageDialog(null,"vacancy added "+list.size());
                }else{
                     JOptionPane.showMessageDialog(null,"input vacancy no is already in the list. "+list.size());
                    }
            }catch(Exception exe){
                        JOptionPane.showMessageDialog(null,"please Enter all the fields");

            }
       }
       if(e.getSource()==appoint){
       try{
           int vacancynum=Integer.parseInt(txtWorkingShifts.getText());
           String name=txtStaffName.getText();
           String joiningDate=txtJoiningDate.getText();
           String qualification=txtQualification.getText();
           String appointBy=txtAppointedBy.getText();
           boolean vancynofound=false;
           
           for(StaffHire o: list){
                if(o.getVacancyNumber()==vacancynum){
                    vancynofound=true;
                    if(o instanceof FullTimeStaffHire){
                        FullTimeStaffHire full=(FullTimeStaffHire)o;
                        if(full.getJoined()==true){;
                        JOptionPane.showMessageDialog(null,"Staff is already hired.");
                       
                       
                    }  
                    else{
                        full.hireFullTimeStaff(name, joiningDate, qualification, appointBy);
                         JOptionPane.showMessageDialog(null,"Staff is successfully appointed.");
                        break;
                    }
                }else{
                JOptionPane.showMessageDialog(null,"not for full time staffHire");
                }
              }
           }
           if(!vancynofound){
            JOptionPane.showMessageDialog(null,"invalid vacancy");
            }
           
        }catch(Exception exp){
            JOptionPane.showMessageDialog(null,"please Enter all the fields");
        }
    }
    if(e.getSource()==appoin){
    try{
       int vacancyNum=Integer.parseInt(txtVacaNum.getText());
       String staffName=txtStaffNam.getText();
       String joiningDate=txtJoiningDat.getText();
       String qualification=txtQualif.getText();
       String appointBy=txtAppoinBy.getText();
       boolean checkvacnum=false;
       for(StaffHire ob:list){
           
                if(ob.getVacancyNumber()==vacancyNum){
                    checkvacnum=true;
                    if(ob instanceof PartTimeStaffHire){
                     part=(PartTimeStaffHire)ob;
                    if(part.getjoined()==true){
                        JOptionPane.showMessageDialog(null,"Staff is already hired.");
                    }else{
                    part.hirePartTimeStaff(staffName, joiningDate, qualification,appointBy);
                   
                    JOptionPane.showMessageDialog(null,"Staff is successfully appointed.");
                    break;
                           
                }  
            }else{
                     JOptionPane.showMessageDialog(null,"not for parttime staff hired");
                    break;
                }
            }
        }
        if(!checkvacnum){
            JOptionPane.showMessageDialog(null,"invalid vacancy");
        }
               
        
    }catch(Exception exe){
    JOptionPane.showMessageDialog(null,"please Enter all the fields");
        }
    }
    if(e.getSource()==terminate){
        try{
        int vNum=Integer.parseInt(txtVac.getText());
        boolean check=false;
        for(StaffHire oj:list){
            if(oj.getVacancyNumber()==vNum){
                    
                    if(oj instanceof PartTimeStaffHire){
                         part=(PartTimeStaffHire)oj;
                        if(part.getTerminated()==false){
                        part.terminatePartTimeStaff();
                        JOptionPane.showMessageDialog(null,"staff is terminate");
                        part.setTerminated(true);
                        break;
                        }else{
                            
                            JOptionPane.showMessageDialog(null,"staff is already terminate");
                            break;
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"part time object does not match ");
                        break;
                    }
            }else{
            JOptionPane.showMessageDialog(null,"vacnacy number does not match");
            }
        }
        
        }catch(Exception exe){
          JOptionPane.showMessageDialog(null,"please Enter all the fields");  
        }
       
       } 
    if(e.getSource()==display){
        for(StaffHire st: list){
            if(st instanceof FullTimeStaffHire){
                FullTimeStaffHire bb=(FullTimeStaffHire)st;
                bb.display();
            }
            if(st instanceof PartTimeStaffHire){
             part=(PartTimeStaffHire)st;
            part.display();
            }
        }
    }
    if(e.getSource()==clear){
           txtVacancyNum.setText("");
           txtDesignation.setText("");
           txtJobType.setText("");
           txtSalary.setText("");
           txtWorkingHours.setText("");
           txtWorkingShifts.setText("");
           txtStaffName.setText("");
           txtJoiningDate.setText("");
           txtQualification.setText("");
           txtAppointedBy.setText("");
           txtWagesPerHours.setText("");
           txtVacNum.setText("");
           txtDesig.setText("");
           txtJobType.setText("");
           txtWorkingHour.setText("");
           txtWagesPerHour.setText("");
           txtWorkingShif.setText("");
           txtVacaNum.setText("");
           txtStaffNam.setText("");
           txtJoiningDat.setText("");
           txtQualif.setText("");
           txtAppoinBy.setText("");
           txtVac.setText("");
           
           

        
    }
    }
}
