package fishdistributionerpsystem.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class UpdateFishProductionStatusCommand {

    private String statusId;
    private String productionId;
    private String status;
}
