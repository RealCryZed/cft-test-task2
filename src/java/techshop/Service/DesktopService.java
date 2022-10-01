package techshop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import techshop.Model.Desktop;
import techshop.Repo.DesktopRepo;

import java.util.List;

@Service
public class DesktopService {
    @Autowired
    private DesktopRepo desktopRepo;

    public Desktop saveDesktop(Desktop desktop) {
        return desktopRepo.save(desktop);
    }

    public List<Desktop> getAll() {
        return desktopRepo.findAll();
    }
}
