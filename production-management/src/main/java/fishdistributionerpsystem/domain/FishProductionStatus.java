package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.ProductionManagementApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "FishProductionStatus_table")
@Data
//<<< DDD / Aggregate Root
public class FishProductionStatus {

    @Id
    private String statusId;

    private String productionId;

    private String status;

    @PrePersist
    public void onPrePersist() {}

    public static FishProductionStatusRepository repository() {
        FishProductionStatusRepository fishProductionStatusRepository = ProductionManagementApplication.applicationContext.getBean(
            FishProductionStatusRepository.class
        );
        return fishProductionStatusRepository;
    }

    //<<< Clean Arch / Port Method
    public void updateFishProductionStatus(
        UpdateFishProductionStatusCommand updateFishProductionStatusCommand
    ) {
        //implement business logic here:

        FishProductionStatusUpdated fishProductionStatusUpdated = new FishProductionStatusUpdated(
            this
        );
        fishProductionStatusUpdated.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
