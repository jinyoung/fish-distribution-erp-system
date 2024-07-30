package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.ProductManagementApplication;
import fishdistributionerpsystem.domain.ProductOrdered;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ProductOrder_table")
@Data
//<<< DDD / Aggregate Root
public class ProductOrder {

    @Id
    private String orderId;

    private String productId;

    private Integer quantity;

    private String orderStatus;

    @PostPersist
    public void onPostPersist() {
        ProductOrdered productOrdered = new ProductOrdered(this);
        productOrdered.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static ProductOrderRepository repository() {
        ProductOrderRepository productOrderRepository = ProductManagementApplication.applicationContext.getBean(
            ProductOrderRepository.class
        );
        return productOrderRepository;
    }
}
//>>> DDD / Aggregate Root
