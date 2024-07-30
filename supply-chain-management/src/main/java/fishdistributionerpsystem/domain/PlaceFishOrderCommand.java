package fishdistributionerpsystem.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class PlaceFishOrderCommand {

    private String orderId;
    private String fishId;
    private Integer quantity;
}
