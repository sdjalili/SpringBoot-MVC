package SD.Spring.Security.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
