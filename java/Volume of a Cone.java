// Create a function that returns the volume of a cone from its height and radius. Use the formula Math.PI × radius² × height ÷ 3 and round the result to two decimal places.

// Examples
// Program.coneVolume(3, 2) ➞ 12.57

// Program.coneVolume(15, 6) ➞ 565.49

// Program.coneVolume(18, 0) ➞ 0.0
// Notes
// Height and radius are non-negative integers.
// Use Math.PI.
// A zero height or radius returns 0.0.

public class Program {
    public static double coneVolume(int height, int radius) {
      double vol=Math.PI*radius*radius*height;
      vol/=3.0;
      if(height==0.0||radius==0.0)
        return 0.0;
      else{
        return Math.round(vol*100.0)/100.0;
      }
    }
}
