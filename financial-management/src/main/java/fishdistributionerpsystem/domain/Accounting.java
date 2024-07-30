package fishdistributionerpsystem.domain;

import fishdistributionerpsystem.FinancialManagementApplication;
import fishdistributionerpsystem.domain.AccountingProcessed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Accounting_table")
@Data
//<<< DDD / Aggregate Root
public class Accounting {

    @Id
    private String accountId;

    private String data;

    @PostPersist
    public void onPostPersist() {
        AccountingProcessed accountingProcessed = new AccountingProcessed(this);
        accountingProcessed.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static AccountingRepository repository() {
        AccountingRepository accountingRepository = FinancialManagementApplication.applicationContext.getBean(
            AccountingRepository.class
        );
        return accountingRepository;
    }
}
//>>> DDD / Aggregate Root
