package techshop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import techshop.Model.Notebook;
import techshop.Repo.NotebookRepo;

@Service
public class NotebookService {
    @Autowired
    private NotebookRepo notebookRepo;

    public Notebook saveNotebook(Notebook notebook) {
        return notebookRepo.save(notebook);
    }
}
