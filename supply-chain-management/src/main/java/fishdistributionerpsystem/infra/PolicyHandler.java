package fishdistributionerpsystem.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import fishdistributionerpsystem.config.kafka.KafkaProcessor;
import fishdistributionerpsystem.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    SupplierRegistrationRepository supplierRegistrationRepository;

    @Autowired
    FishPurchasePlanRepository fishPurchasePlanRepository;

    @Autowired
    FishOrderRepository fishOrderRepository;

    @Autowired
    StockRepository stockRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}
}
//>>> Clean Arch / Inbound Adaptor
