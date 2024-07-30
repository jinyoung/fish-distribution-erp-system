package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import fishdistributionerpsystem.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ProductOrdered extends AbstractEvent {

    private String orderId;
    private String productId;
    private Integer quantity;
    private String orderStatus;

    public ProductOrdered(ProductOrder aggregate) {
        super(aggregate);
    }

    public ProductOrdered() {
        super();
    }
}
//>>> DDD / Domain Event
