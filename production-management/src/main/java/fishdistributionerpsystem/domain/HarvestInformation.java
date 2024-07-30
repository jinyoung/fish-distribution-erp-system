package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.ProductionManagementApplication;
import fishdistributionerpsystem.domain.HarvestInformationEntered;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "HarvestInformation_table")
@Data
//<<< DDD / Aggregate Root
public class HarvestInformation {

    @Id
    private String harvestId;

    private String fishId;

    private Integer quantity;

    @PostPersist
    public void onPostPersist() {
        HarvestInformationEntered harvestInformationEntered = new HarvestInformationEntered(
            this
        );
        harvestInformationEntered.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static HarvestInformationRepository repository() {
        HarvestInformationRepository harvestInformationRepository = ProductionManagementApplication.applicationContext.getBean(
            HarvestInformationRepository.class
        );
        return harvestInformationRepository;
    }
}
//>>> DDD / Aggregate Root
