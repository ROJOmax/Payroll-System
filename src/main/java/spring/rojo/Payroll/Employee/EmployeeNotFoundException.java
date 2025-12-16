package spring.rojo.Payroll.Employee;

class EmployeeNotFoundException extends RuntimeException {

    EmployeeNotFoundException(Long id) {
        super("Could not find employee with id " + id);
    }
}
