package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.domain.*;
import fishdistributionerpsystem.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class HarvestInformationEntered extends AbstractEvent {

    private String harvestId;
    private String fishId;
    private Integer quantity;

    public HarvestInformationEntered(HarvestInformation aggregate) {
        super(aggregate);
    }

    public HarvestInformationEntered() {
        super();
    }
}
//>>> DDD / Domain Event
