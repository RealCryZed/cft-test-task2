package techshop.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techshop.Model.Desktop;

import java.util.List;

@Repository
public interface DesktopRepo extends JpaRepository<Desktop, Integer> {
    List<Desktop> findAll();
}
