package fishdistributionerpsystem.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class ManageStockCommand {

    private String stockId;
    private String fishId;
    private Integer quantity;
}
