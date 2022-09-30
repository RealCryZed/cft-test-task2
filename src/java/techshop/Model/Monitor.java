package techshop.Model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class Monitor extends Desktop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int monitor_id;
    private int diagonal;
}