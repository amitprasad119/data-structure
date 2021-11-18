package com.amit.learning.exception;

class VoterException extends  Exception {
    @Override
    public String toString() {
        return "Voter should be >17 years old";
    }
}
public class ArithmaticExample {

    public static void main(String[] args) throws VoterException {
        ArithmaticExample obj = new ArithmaticExample();
        int result = obj.callDivide(19,0);
        System.out.println("Result:"+result);
        obj.ageValidator(17);
    }

    public void ageValidator(int age) throws VoterException {
        if(age < 18)
            throw  new VoterException();
    }

     int callDivide(int a , int b) {
                try {
                   return divide(a,b);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
         return -1;
     }
    int divide(int a, int b)  throws Exception{
        if(b == 0)
            throw new Exception("Number is passed 0");
       return a/b;
    }
}
