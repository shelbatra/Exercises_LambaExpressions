package be.intecbrussel.LambdaExercise_3;

    public class Employee {

        private long salary;

        Employee(int salary) {
            this.salary = salary;
        }

        long getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{" + "salary=" + salary + '}';
        }

    }

