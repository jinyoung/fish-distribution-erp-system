package fishdistributionerpsystem.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class ProcessAccountingCommand {

    private String accountId;
    private String data;
}
