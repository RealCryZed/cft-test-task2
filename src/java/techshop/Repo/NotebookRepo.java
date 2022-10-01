package techshop.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techshop.Model.Notebook;

import java.util.List;

@Repository
public interface NotebookRepo extends JpaRepository<Notebook, Integer> {
    List<Notebook> findAll();
}
