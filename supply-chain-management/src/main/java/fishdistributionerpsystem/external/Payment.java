package fishdistributionerpsystem.external;

import java.util.Date;
import lombok.Data;

@Data
public class Payment {

    private String paymentId;
    private String orderId;
    private Double amount;
}
