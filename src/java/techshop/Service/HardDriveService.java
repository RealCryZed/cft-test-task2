package techshop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import techshop.Model.HardDrive;
import techshop.Repo.HardDriveRepo;

@Service
public class HardDriveService {
    @Autowired
    private HardDriveRepo hardDriveRepo;

    public void saveHardDrive(HardDrive hardDrive) {
        hardDriveRepo.save(hardDrive);
    }
}
