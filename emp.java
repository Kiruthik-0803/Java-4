class e1{
    String ename;
    int id;
    int workingdays;
    float perdaysalary;
    e1(String ename, int id, int workingdays, int perdaysalary) {
        this.ename=ename;
        this.id=id;
        this.workingdays=workingdays;
        this.perdaysalary=perdaysalary;
     
    }
    float calculate(){

          return (float) (workingdays * perdaysalary);
    }
    void display(){
        System.out.println("NAME OF THE WORKER: "+ename);
        System.out.println("ID OF THE WORKER: "+id);
        System.out.println("NO .OF WORKING DAYS: "+workingdays);
        System.out.println("SALARY PER DAY: "+perdaysalary);
        System.out.println("MONTHLY SALARY: "+calculate());
    }


}

public class emp {
    public static void main(String[] args) {
        e1 obj=new e1("RAM",123,23,1000);
        obj.display();
    }    
}
