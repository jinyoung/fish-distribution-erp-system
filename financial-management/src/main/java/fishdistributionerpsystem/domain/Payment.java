package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.FinancialManagementApplication;
import fishdistributionerpsystem.domain.PaymentProcessed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Payment_table")
@Data
//<<< DDD / Aggregate Root
public class Payment {

    @Id
    private String paymentId;

    private String orderId;

    private Double amount;

    @PostPersist
    public void onPostPersist() {
        PaymentProcessed paymentProcessed = new PaymentProcessed(this);
        paymentProcessed.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static PaymentRepository repository() {
        PaymentRepository paymentRepository = FinancialManagementApplication.applicationContext.getBean(
            PaymentRepository.class
        );
        return paymentRepository;
    }
}
//>>> DDD / Aggregate Root
