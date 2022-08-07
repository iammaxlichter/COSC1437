package CHAPTER4;

import java.time.*;
public class TestFitnessTracker
{
   public static void main(String[] args)
   { 
      FitnessTracker exercise = new FitnessTracker();

      System.out.println(exercise.getActivity() + " " + exercise.getMinutes() +
         " minutes on " + exercise.getDate());
 
      LocalDate date = LocalDate.of(2020, 8, 20);
      FitnessTracker exercise2 = new FitnessTracker("bicycling", 35, date);

      System.out.println(exercise2.getActivity() + " " + exercise2.getMinutes() +
         " minutes on " + exercise2.getDate());
   }
}
