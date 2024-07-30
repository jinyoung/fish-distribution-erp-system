package fishdistributionerpsystem.external;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class ProcessPaymentCommand {

    @Id
    private String paymentId;

    private String orderId;
    private Double amount;
}
