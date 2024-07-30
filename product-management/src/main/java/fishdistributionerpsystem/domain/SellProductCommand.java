package fishdistributionerpsystem.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class SellProductCommand {

    private String saleId;
    private String productId;
    private Integer quantity;
}
