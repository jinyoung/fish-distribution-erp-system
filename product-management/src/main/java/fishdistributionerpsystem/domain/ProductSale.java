package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.ProductManagementApplication;
import fishdistributionerpsystem.domain.ProductSold;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ProductSale_table")
@Data
//<<< DDD / Aggregate Root
public class ProductSale {

    @Id
    private String saleId;

    private String productId;

    private Integer quantity;

    @PostPersist
    public void onPostPersist() {
        ProductSold productSold = new ProductSold(this);
        productSold.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static ProductSaleRepository repository() {
        ProductSaleRepository productSaleRepository = ProductManagementApplication.applicationContext.getBean(
            ProductSaleRepository.class
        );
        return productSaleRepository;
    }
}
//>>> DDD / Aggregate Root
