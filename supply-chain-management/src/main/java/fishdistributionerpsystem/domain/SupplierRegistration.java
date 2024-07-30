package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.SupplyChainManagementApplication;
import fishdistributionerpsystem.domain.SupplierRegistered;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "SupplierRegistration_table")
@Data
//<<< DDD / Aggregate Root
public class SupplierRegistration {

    @Id
    private String supplierId;

    private String supplierName;

    @PostPersist
    public void onPostPersist() {
        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        fishdistributionerpsystem.external.Payment payment = new fishdistributionerpsystem.external.Payment();
        // mappings goes here
        SupplyChainManagementApplication.applicationContext
            .getBean(fishdistributionerpsystem.external.PaymentService.class)
            .processPayment(payment);

        SupplierRegistered supplierRegistered = new SupplierRegistered(this);
        supplierRegistered.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static SupplierRegistrationRepository repository() {
        SupplierRegistrationRepository supplierRegistrationRepository = SupplyChainManagementApplication.applicationContext.getBean(
            SupplierRegistrationRepository.class
        );
        return supplierRegistrationRepository;
    }
}
//>>> DDD / Aggregate Root
