package fishdistributionerpsystem.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class PlaceProductOrderCommand {

    private String orderId;
    private String productId;
    private Integer quantity;
}
