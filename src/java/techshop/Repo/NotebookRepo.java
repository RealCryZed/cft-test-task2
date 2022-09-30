package techshop.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import techshop.Model.Notebook;

@Repository
public interface NotebookRepo extends CrudRepository<Notebook, Integer> {
}
