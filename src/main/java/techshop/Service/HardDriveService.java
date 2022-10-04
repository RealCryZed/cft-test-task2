package techshop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import techshop.Model.HardDrive;
import techshop.Repo.HardDriveRepo;

@Service
public class HardDriveService {
    @Autowired
    private HardDriveRepo hardDriveRepo;

    public HardDrive saveHardDrive(HardDrive hardDrive) {
        return hardDriveRepo.save(hardDrive);
    }
}
