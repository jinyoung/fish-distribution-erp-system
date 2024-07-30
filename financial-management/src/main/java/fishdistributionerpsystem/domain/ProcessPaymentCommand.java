package fishdistributionerpsystem.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class ProcessPaymentCommand {

    private String paymentId;
    private String orderId;
    private Double amount;
}
