import java.util.*;
public class CalculatingDerivativesOfAPolynomial{
   public void startCalculator(){
      System.out.println("Ener the highest power of x in the whole equation");
      Scanner scanInt=new Scanner(System.in);
      int highestDegree=scanInt.nextInt();
      getArrayofCoefficients(highestDegree);
   }
   public void getArrayofCoefficients(int highestPowerofX){
      double arrayOfCoefficients[]=new double[highestPowerofX+1];
      getCoefficientsInArray(arrayOfCoefficients);
   }
   public void getCoefficientsInArray(double[] arrayOfCoefficients){
      Scanner scanCoef=new Scanner(System.in);
      for(int i=0;i<arrayOfCoefficients.length;i++){
         System.out.println("What is the coeffiecient of x^"+i+" in the equation:");
         arrayOfCoefficients[i]=scanCoef.nextDouble();
      }
      System.out.println("The polynomial you entered was:");
      printArray(arrayOfCoefficients);
      calculateDerivative(arrayOfCoefficients);
   }
   public void calculateDerivative(double[] arrayOfCoefficients){
      double[] derivateArray=new double[arrayOfCoefficients.length];
      for(int i=0;i<arrayOfCoefficients.length;i++){
         if(i!=arrayOfCoefficients.length-1){
            derivateArray[i]=arrayOfCoefficients[i+1]*(i+1);
         }
      }
      derivateArray[arrayOfCoefficients.length-1]=0;
      System.out.println("The derivative of the polynomial is:");
      printArray(derivateArray);
   }
   public void printArray(double[] derivateArray){
      //System.out.println("The derivative of the polynomial is:");
      for(int i=0;i<derivateArray.length;i++){
         System.out.print(derivateArray[i]+"x^"+i+"+");
      }
      System.out.print("0");
      System.out.println("");
   }
}