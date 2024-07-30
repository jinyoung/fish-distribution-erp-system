package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.ProductManagementApplication;
import fishdistributionerpsystem.domain.ProductRegistered;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Product_table")
@Data
//<<< DDD / Aggregate Root
public class Product {

    @Id
    private String productId;

    private String productName;

    private String description;

    @PostPersist
    public void onPostPersist() {
        ProductRegistered productRegistered = new ProductRegistered(this);
        productRegistered.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static ProductRepository repository() {
        ProductRepository productRepository = ProductManagementApplication.applicationContext.getBean(
            ProductRepository.class
        );
        return productRepository;
    }
}
//>>> DDD / Aggregate Root
