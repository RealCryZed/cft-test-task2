package techshop.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import techshop.Model.Desktop;

@Repository
public interface DesktopRepo extends CrudRepository<Desktop, Integer> {

}
