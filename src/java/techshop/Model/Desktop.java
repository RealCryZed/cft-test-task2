package techshop.Model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class Desktop extends Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int desktop_id;
    private String form;
}
