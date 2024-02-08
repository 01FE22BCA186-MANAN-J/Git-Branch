public class Calculator2 {
  /**
   *
   * The function "addition" takes two float operands and returns their sum.
   * 
   * @param operand1 The first operand for addition. It is a float data type.
   * @param operand2 The second operand for the addition operation.
   * @return The sum of operand1 and operand2 is being returned.
   */
    float addition(float operand1,float operand2)
    {
return(operand1+operand2);
    }   



/**
 * The function performs subtraction between two float numbers.
 * 
 * @param operand1 The first operand for the subtraction operation.
 * @param operand2 The second operand in the subtraction operation.
 * @return the result of subtracting operand2 from operand1.
 */
float substraction(float operand1,float operand2)
{
return(operand1-operand2);
}  



/**
 * The function "multiplication" takes two float operands and returns their product.
 * 
 * @param operand1 The first operand for multiplication. It is a floating-point number.
 * @param operand2 The second operand in the multiplication operation.
 * @return the result of multiplying operand1 and operand2.
 */
    float multiplicaton(float operand1,float operand2)
{
return(operand1*operand2);
}   


/**
 * The division function takes two float operands and returns their quotient.
 * 
 * @param operand1 The first operand of the division operation. It is a floating-point number.
 * @param operand2 The second operand in the division operation.
 * @return The division of operand1 by operand2.
 */


float division(float operand1,float operand2)
{
return(operand1/operand2);
}   


float square(float side){
    return(side*side);
}

float cube(float side)
{
    return(side*side*side);
}

public static void main(String[] args){
Calculator2 calc = new Calculator2(); 
// The code is printing the results of various arithmetic operations performed using the Calculator2
// class.
System.out.println("Addition: " +calc.addition(5,10));
System.out.println("Subtraction: "+calc.substraction(15,3));
System.out.println("Multiplication:  "+calc.multiplicaton(4, 7));
System.out.println("Division: "+calc.division(10, 20));
System.out.println("Square: "+calc.square(25));
System.out.println("Cube : "+calc.cube(66));
}}