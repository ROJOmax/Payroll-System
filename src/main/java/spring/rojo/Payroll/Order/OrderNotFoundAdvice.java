package spring.rojo.Payroll.Order;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
class OrderNotFoundAdvice {
    @ExceptionHandler(OrderNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String orderNotFoundHandler(OrderNotFoundException ex) {
        return ex.getMessage();
    }
}




//@RestControllerAdvice
//class EmployeeNotFoundAdvice {
//    @ExceptionHandler(EmployeeNotFoundException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    String employeeNotFoundHandler(EmployeeNotFoundException ex) {
//        return ex.getMessage();
//    }
//}