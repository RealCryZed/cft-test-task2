package techshop.Model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class Notebook extends Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int notebook_id;
    private int size;
}