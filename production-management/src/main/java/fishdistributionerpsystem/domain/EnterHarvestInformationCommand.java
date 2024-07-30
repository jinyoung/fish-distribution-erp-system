package fishdistributionerpsystem.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class EnterHarvestInformationCommand {

    private String harvestId;
    private String fishId;
    private Integer quantity;
}
