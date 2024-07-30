package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import fishdistributionerpsystem.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class StockManaged extends AbstractEvent {

    private String stockId;
    private String fishId;
    private Integer quantity;

    public StockManaged(Stock aggregate) {
        super(aggregate);
    }

    public StockManaged() {
        super();
    }
}
//>>> DDD / Domain Event
