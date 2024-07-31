package fishdistributionerpsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fishdistributionerpsystem.config.kafka.KafkaProcessor;
import fishdistributionerpsystem.domain.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.test.binder.MessageCollector;
import org.springframework.context.ApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.MimeTypeUtils;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RegisterSupplierTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(
        RegisterSupplierTest.class
    );

    @Autowired
    private KafkaProcessor processor;

    @Autowired
    private MessageCollector messageCollector;

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    public SupplierRegistrationRepository repository;

    @Test
    @SuppressWarnings("unchecked")
    public void test0() {
        //given:
        SupplierRegistration existingEntity = new SupplierRegistration();

        existingEntity.setSupplierId(null);
        existingEntity.setSupplierName(null);

        repository.save(existingEntity);

        //when:

        try {
            SupplierRegistration newEntity = new SupplierRegistration();

            newEntity.setSupplierId("12345");
            newEntity.setSupplierName("Supplier A");

            repository.save(newEntity);

            //then:

            Message<String> received = (Message<String>) messageCollector
                .forChannel(processor.outboundTopic())
                .poll();

            assertNotNull("Resulted event must be published", received);

            SupplierRegistered outputEvent = objectMapper.readValue(
                received.getPayload(),
                SupplierRegistered.class
            );

            // LOGGER.info("Response received: {}", received.getPayload());

            assertEquals(outputEvent.getSupplierId(), "12345");
            assertEquals(outputEvent.getSupplierName(), "Supplier A");
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            assertTrue("exception", false);
        }
    }
}
