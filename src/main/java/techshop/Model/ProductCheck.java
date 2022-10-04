package techshop.Model;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class ProductCheck {

    public final List<String> PRODUCT_TYPES =
            new ArrayList<>(Arrays.asList("ноутбук", "монитор", "жесткий диск", "настольный компьютер"));

    private final List<String> PC_FORM_FACTORS =
            new ArrayList<>(Arrays.asList("десктоп", "неттоп", "моноблок"));

    private final List<String> NOTEBOOK_SIZES =
            new ArrayList<>(Arrays.asList("13 дюймов", "14 дюймов", "15 дюймов", "17 дюймов"));
}
