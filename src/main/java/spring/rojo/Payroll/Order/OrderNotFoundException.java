package spring.rojo.Payroll.Order;

class OrderNotFoundException extends RuntimeException {
    OrderNotFoundException(Long id) {
        super("Could not find Order with id " + id);
    }
}
