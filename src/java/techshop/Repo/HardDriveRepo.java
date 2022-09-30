package techshop.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import techshop.Model.HardDrive;

@Repository
public interface HardDriveRepo extends CrudRepository<HardDrive, Integer> {
}
