package techshop.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import techshop.Model.Monitor;

@Repository
public interface MonitorRepo extends CrudRepository<Monitor, Integer> {
}
