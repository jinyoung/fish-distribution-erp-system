package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import fishdistributionerpsystem.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class FishProductionStatusUpdated extends AbstractEvent {

    private String statusId;
    private String productionId;
    private String status;

    public FishProductionStatusUpdated(FishProductionStatus aggregate) {
        super(aggregate);
    }

    public FishProductionStatusUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
