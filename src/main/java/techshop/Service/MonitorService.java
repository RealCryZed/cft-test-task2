package techshop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import techshop.Model.Monitor;
import techshop.Repo.MonitorRepo;

@Service
public class MonitorService {
    @Autowired
    private MonitorRepo monitorRepo;

    public Monitor saveMonitor(Monitor monitor) {
        return monitorRepo.save(monitor);
    }
}
