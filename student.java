import java.util.*;

class Student{
     private int sno;
     private String sname;
     private Date Dob;
     private Date Doj;
     Student(int sno, String sname, Date Dob, Date Doj ){
     this.sno = sno;
     this.sname = sname;
     this.Dob = Dob;
     this.Doj = Doj;
     }
     public int getSno(){
          return sno;
     }
     public String getSname(){
          return sname;
     }
     public Date getDob(){
          return Dob;
     }
     public Date getDoj(){
          return Doj;
     }
     public String toString(){
          return sno+" "+sname+" "+Dob+" "+Doj;
     }
}
class StudentDemo{
     public static void main(String[] args)
     {
          List<Student> c = new ArrayList<Student>();
          Scanner s = new Scanner(System.in);
          Scanner S1 =new Scanner(System.in);
          int ch;
          do{
               System.ut.println("1.INSERT");
               System.ut.println("2.DISPLAY");
               System.ut.println("3.SEARCH");
               System.ut.println("4.DELETE");
               System.ut.println("5.UPDATE");
               System.ut.println("Enter your choice: ");
               ch = s.nextInt();

               switch(ch){
                    case 1:
                         System.ut.println("Enter sno: ");
                         int sno = s.nextInt();
                         System.ut.println("Enter sname: ");
                         String sname = S1.nextString();
                         System.ut.println("Enter Dob: ");
                         Date Dob = s.nextDate();
                         System.ut.println("Enter Doj: ");
                         Date Doj = s.nextDate();

                         c.add(new Student(sno,sname,Dob,Doj));
                    break;
                    case 2:
                         System.ut.println(".......................................");
                         Iteratar<Student> i = c.Iteratar();
                         while(i.hasNext())
                         {
                              Student c = i.next();
                              System.out.println(e);
                         }
                         System.out.println("..........................................");
                         break;   
                         case 3:
                         boolean found =false;
                         System.out.println("Enter sno to search: ");
                         sno = s.nextInt();
                         System.ut.println(".......................................");
                         i = c.Iteratar();
                         while(i.hasNext())
                         {
                              Student c = i.next();
                              if(e.getSno == sno)
                              {
                               System.out.println(e);
                               found = true;
                              }
                         }
                         if(!found)
                         {
                             System.out.println("Record not found");
                         }
                         System.out.println("..........................................");      
                    break;  
                    case 4:
                           found =false;
                           System.out.println("Enter sno to delete: ");
                           sno = s.nextInt();
                           System.ut.println(".......................................");
                           i = c.Iteratar();
                          while(i.hasNext())
                         {
                           Student c = i.next();
                         if(e.getSno == sno)  
                         {
                             i.remove();
                           found = true;
                         }
                    }
                            if(!found)
                    {
                            System.out.println("Record not found");
                    }
                       else{
                            System.out.println("Record is deleted sucessfully....!");
                       }
                    System.out.println("..........................................");     
               break;    
               case 5:
                           found =false;
                           System.out.println("Enter sno to update: ");
                           sno = s.nextInt();
                           LisIteratar<Student>li = c.listIteratar();
                          while(li.hasNext())
                         {
                           Student c = li.next();
                         if(e.getSno (== sno))
                         {
                             System.out.print("Enter new name: ");
                             sname = s1.nextString();

                             System.out.print("Entet new Date of birth: ");
                             Dob = s.nextDate();
                             System.out.print("Enter new Date of joing: ");
                             Doj = s.nextDate();
                             li.set(new Student(sno, sname, Dob, Doj));
                            found = true;
                         }
                    }
                            if(!found)
                    {
                            System.out.println("Record not found");
                    }
                       else{
                            System.out.println("Record is upadeted sucessfully....!");
                       }      
               break;    
                    
               } 
          }
          while(ch!=0);
     }
}