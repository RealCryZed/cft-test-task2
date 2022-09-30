package techshop.Model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class HardDrive extends Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int harddrive_id;
    private int capacity;
}