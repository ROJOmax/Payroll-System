package spring.rojo.Payroll;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.rojo.Payroll.Employee.Employee;
import spring.rojo.Payroll.Employee.EmployeeRepository;
import spring.rojo.Payroll.Order.Order;
import spring.rojo.Payroll.Order.OrderRepository;
import spring.rojo.Payroll.Order.Status;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository) {


        return args -> {
            employeeRepository.save(new Employee("Yassine", "Didou", "Pos Enginner"));
            employeeRepository.save(new Employee("Adel", "Didou", "Flutter Enginner"));

            employeeRepository.findAll().forEach(employee -> log.info("PreLoaded " + employee));

            orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
            orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));

            orderRepository.findAll().forEach(order -> {
                log.info("Preloaded " + order);
            });
        };
    }

}
