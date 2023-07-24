package love2code.exercises.output.exercise5;

public class Exercise5 {
    public static void main(String[] args) {

    }
}

class SalaryCalculationException extends Exception {

}

class Person {
    public void calculateSalary() throws SalaryCalculationException{

    }
}

class Company {
    public void paySalaries() throws SalaryCalculationException {
        new Person().calculateSalary();
    }
}