import java.util.Scanner;
public class Associate{
private int associateid;
private String associatename;
private String workstatus;
    public Associate(){
        
    }
    public void setassociateid(int associateid){
     this.associateid=associateid;   
    }
    public void setworkstatus( String workstatus){
     this.workstatus= workstatus;   
    }
    public void setassociatename(String associatename){
     this.associatename= associatename;   
    }
    public int getassociateid(){
        return associateid;
    }
    public String getassociatename(){
        return associatename;
    }
    public String getworkstatus(){
        return workstatus;
    }
    public void trackassociatestatus(int days)
    {
        if (days<=20)
        setworkstatus("Core skills");
        else if(days<=40)
        setworkstatus("Advanced module");
        else if(days<=60)
        setworkstatus("project phase");
        else
        setworkstatus("deployed in project");
    }
    public static void main(String[] args)
    {
        System.out.println("Enter  the associateid:");
        Scanner s=new Scanner(System.in);
        Associate a=new Associate();
        a.setassociateid(s.nextInt());
        System.out.println("Enter the associate name ");
        s.nextLine();
        a.setassociatename(s.nextLine());
        System.out.println("Enter the number of days");
        a.trackassociatestatus(s.nextInt());
        System.out.println("The associate"+a.getassociatename()+"work status"+a.getworkstatus());
}
}