package techshop.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techshop.Model.HardDrive;

import java.util.List;

@Repository
public interface HardDriveRepo extends JpaRepository<HardDrive, Integer> {
    List<HardDrive> findAll();
}
