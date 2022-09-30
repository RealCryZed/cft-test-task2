package techshop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import techshop.Model.Desktop;
import techshop.Repo.DesktopRepo;

@Service
public class DesktopService {
    @Autowired
    private DesktopRepo desktopRepo;

    public void saveDesktop(Desktop desktop) {
        desktopRepo.save(desktop);
    }
}
