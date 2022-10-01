package techshop.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techshop.Model.Monitor;

import java.util.List;

@Repository
public interface MonitorRepo extends JpaRepository<Monitor, Integer> {
    List<Monitor> findAll();
}
