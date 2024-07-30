package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.SupplyChainManagementApplication;
import fishdistributionerpsystem.domain.StockManaged;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Stock_table")
@Data
//<<< DDD / Aggregate Root
public class Stock {

    @Id
    private String stockId;

    private String fishId;

    private Integer quantity;

    @PostPersist
    public void onPostPersist() {
        StockManaged stockManaged = new StockManaged(this);
        stockManaged.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static StockRepository repository() {
        StockRepository stockRepository = SupplyChainManagementApplication.applicationContext.getBean(
            StockRepository.class
        );
        return stockRepository;
    }
}
//>>> DDD / Aggregate Root
