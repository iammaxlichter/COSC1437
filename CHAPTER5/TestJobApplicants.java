package CHAPTER5;

public class TestJobApplicants
{
   public static void main(String[] args)
   {
      JobApplicant app1 = new JobApplicant("Johnson", "312-345-9875",
            true, false, true, false);
      JobApplicant app2 = new JobApplicant("Kermit", "312-543-1275",
            true, false, false, false);
      JobApplicant app3 = new JobApplicant("Lawrence", "608-288-09125",
            true, false, true, true);
      JobApplicant app4 = new JobApplicant("Mitchell", "815-288-3881",
            true, true, true, true);
      String qualifiedMsg = "is qualified for an interview   ";
      String notQualifiedMsg = "is not qualified for an interview at this time   ";

      if(isQualified(app1)){
            System.out.println(app1.getName() + qualifiedMsg);
      }
      else{
            System.out.println(app1.getName() + notQualifiedMsg);
      }
      if(isQualified(app2)){
            System.out.println(app2.getName() + qualifiedMsg);
      }
      else{
            System.out.println(app2.getName() + notQualifiedMsg);
      }
      if(isQualified(app3)){
            System.out.println(app3.getName() + qualifiedMsg);
      }
      else{
            System.out.println(app3.getName() + notQualifiedMsg);
      }
      if(isQualified(app4)){
            System.out.println(app4.getName() + qualifiedMsg);
      }
      else{
            System.out.println(app4.getName() + notQualifiedMsg);
      }
   }
   public static boolean isQualified(JobApplicant app){
      int count = 0;

      if(app.getHasWordSkill())
            count++;
      if(app.getHasSpreadsheetSkill())
            count++;
      if(app.getHasDatabaseSkill())
            count++;
      if(app.getHasGraphicsSkill())
            count++;

      if(count>=3){
            return true;
      }
      else{
            return false;
      }
   }
   public static void display(JobApplicant app, String msg)
   {
      System.out.println(app.getName() + " " + msg +
         "  Phone: " + app.getPhone());
   }
}