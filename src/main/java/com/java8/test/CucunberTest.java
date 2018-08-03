package com.java8.test;
//package com.winterbe.java8.samples.test;
//
//public class CucunberTest {
//
//    Feature: Clawback Job
//
//#Case1
//    Scenario: Clawback Events exist
//    Given following clawback Events
//      | 1M_number                            | adj_miles        | adj_date   |   adj_time |
//            | 1M0000001                            | 1000             | 12/12/2021 |   10:31:00 |
//    When Clawback Job executes
//    Then following Clawback Event are created
//      | event_id                             | adj_miles        | adj_date   |   event_type | 1M_number |
//            | 1M0000001_12122021_103100            | 1000             | 12/12/2021 |   Clawback   | 1M0000001 |
//    Then Job Status table has an entry
//
//#Case2
//    Scenario: Clawback Events doesn't exist
//    Given following clawback Events
//      | 1M_number                            | adj_miles        | adj_date   |   adj_time |
//    When Clawback Job executes
//    Then following Clawback Event are created
//      | event_id                             | adj_miles        | adj_date   |   event_type | 1M_number |
//    Then Job Status table has an entry
//
//    #Case3
//    Scenario: Clawback Events Two exist
//    Given following clawback Events
//      | 1M_number                            | adj_miles        | adj_date   |   adj_time |
//            | 1M0000001                            | 1000             | 12/12/2021 |   10:31:00 |
//            | 1M0000002                            | 2000             | 12/12/2021 |   10:31:00 |
//    When Clawback Job executes
//    Then following Clawback Event are created
//      | event_id                             | adj_miles        | adj_date   |   event_type | 1M_number |
//            | 1M0000001_12122021_103100            | 1000             | 12/12/2021 |   Clawback   | 1M0000001 |
//            | 1M0000002_12122021_103100            | 2000             | 12/12/2021 |   Clawback   | 1M0000002 |
//    Then Job Status table has an entry
//
//#Case4
//    Scenario: Clawback Events Job runs with DB error
//    Given following clawback Events
//      | 1M_number                            | adj_miles        | adj_date   |   adj_time |
//            | 1M0000001                            | 1000             | 12/12/2021 |   10:31:00 |
//    When Clawback Job executes with DB error
//    Then following Clawback Event are created
//      | event_id                             | adj_miles        | adj_date   |   event_type | 1M_number |
//    Then Job Status table has no entry
//
//#############################  Kafka Testing Error########################################
//            #Case5
//    Scenario: Clawback Events Job runs with Kafka error
//    Given following clawback Events
//      | 1M_number                            | adj_miles        | adj_date   |   adj_time |
//            | 1M0000001                            | 1000             | 12/12/2021 |   10:31:00 |
//    When Clawback Job executes with Kafka error
//    Then following Clawback Event are created
//      | event_id                             | adj_miles        | adj_date   |   event_type | 1M_number |
//    Then Job Status table has no entry
//################################## ClawbackJob IT Kafka ####################################
//            #Case6
//    Scenario: IT-Clawback Event updated to Kafka
//    Given following clawback Events for Kafka
//      | 1M_number                            | adj_miles        | adj_date   |   adj_time |
//            | 1M0000001                            | 1000             | 12/12/2021 |   10:31:00 |
//    When Clawback Job executes with Kafka
//    Then following Clawback Event are updated to Kafka
//      | event_id                             | adj_miles        | adj_date   |   event_type | 1M_number |
//            | 1M0000001_12122021_103100            | 1000             | 12/12/2021 |   Clawback   | 1M0000001 |
//
//            #Case7
//    Scenario: IT-Clawback Event updated to Kafka with 2 records
//    Given following clawback Events for Kafka
//      | 1M_number                            | adj_miles        | adj_date   |   adj_time |
//            | 1M0000001                            | 1000             | 12/12/2021 |   10:31:00 |
//            | 1M0000002                            | 2000             | 12/12/2021 |   10:31:00 |
//    When Clawback Job executes with Kafka
//    Then following Clawback Event are updated to Kafka
//      | event_id                             | adj_miles        | adj_date   |   event_type | 1M_number |
//            | 1M0000001_12122021_103100            | 1000             | 12/12/2021 |   Clawback   | 1M0000001 |
//            | 1M0000002_12122021_103100            | 2000             | 12/12/2021 |   Clawback   | 1M0000002 |
//            ################################## ClawbackJob IT testing ####################################
//            #Case8
//    Scenario: IT-Clawback Job processes Event
//    Given following clawback Events for Kafka
//      | 1M_number                            | adj_miles        | adj_date   |   adj_time |
//            | 1M0000001                            | 1000             | 12/12/2021 |   10:31:00 |
//    When ClawbackEventFetchJob executes
//    Then following Clawback Event are updated to Kafka
//      | event_id                             | adj_miles        | adj_date   |   event_type | 1M_number |
//            | 1M0000001_12122021_103100            | 1000             | 12/12/2021 |   Clawback   | 1M0000001 |
//    And Job Status table has an entry
//
//    #Case9
//    Scenario: IT-Clawback Job processes Events with 2 rows
//    Given following clawback Events for Kafka
//      | 1M_number                            | adj_miles        | adj_date   |   adj_time |
//            | 1M0000001                            | 1000             | 12/12/2021 |   10:31:00 |
//            | 1M0000002                            | 2000             | 12/12/2021 |   10:31:00 |
//    When ClawbackEventFetchJob executes
//    Then following Clawback Event are updated to Kafka
//      | event_id                             | adj_miles        | adj_date   |   event_type | 1M_number |
//            | 1M0000001_12122021_103100            | 1000             | 12/12/2021 |   Clawback   | 1M0000001 |
//            | 1M0000002_12122021_103100            | 2000             | 12/12/2021 |   Clawback   | 1M0000002 |
//    And Job Status table has an entry
//
//    #Case10
//    Scenario: Validating Integration checkpoints
//    Given Status table has been purged
//    And Following 1 Clowback Event has been inserted into MF DB
//      | 1M_number                            | adj_miles        | adj_date   |   adj_time |
//            | 1M0000001                            | 1000             | 12/12/2021 |   10:31:00 |
//    And ClawbackEventFetchJob executes
//    And Job Status table has 2 entry
//    And Kafka Topic has 1 entry
//      | event_id                             | adj_miles        | adj_date   |   event_type | 1M_number |
//            | 1M0000001_12122021_103100            | 1000             | 12/12/2021 |   Clawback   | 1M0000001 |
//    And No Clawback Events fetched
//    And ClawbackEventFetchJob executes
//    And Job Status table has 4 entries
//    And Kafka Topic has 0 entry
//      | event_id                             | adj_miles        | adj_date   |   event_type | 1M_number |
//
//            # #Case11
//    Scenario: Validating MF DB Store procedure
//    Given Store Procedure deletes Event from MF DB
//    And Store Procedure inserts Event into MF DB
//    And Store Procedure fetches Event from MF DB
//
// #Case12
//    @Demo
//    Scenario: Demo test case to validate Clawback Job Scheduler
//    Given Insert Event into MF DB
//    | accNumber |
//            | 1M00789987 |
//            | 1M00999999 |
//
//            #Case 13
//    Scenario: Clawback Job throws error when no entries in JobStatus table
//    Given following clawback Events
//      | 1M_number                            | adj_miles        | adj_date   |   adj_time |
//            | 1M0000001                            | 1000             | 12/12/2021 |   10:31:00 |
//            | 1M0000002                            | 2000             | 12/12/2021 |   10:31:00 |
//    When ClawbackEventFetchJob executes while JobStatus is empty
//    Then Invalid start date Exception will be thrown
//    And Job Status table has Failed entry
//
//#Case 14
//    Scenario: Clawback Job throws error when retry exceed limit
//    Given following clawback Events
//      | 1M_number                            | adj_miles        | adj_date   |   adj_time |
//            | 1M0000001                            | 1000             | 12/12/2021 |   10:31:00 |
//            | 1M0000002                            | 2000             | 12/12/2021 |   10:31:00 |
//    When ClawbackEventFetchJob executes with 0 Retry count
//    Then Retries exceeded Exception will be thrown
//    And Job Status table has Failed entry
//
//
/////!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//package com.aexp.loyalty.earn.capprocessor.test.component;
//
//import com.aexp.loyalty.earn.capprocessor.configuration.CapProcessorConfiguration;
//import com.fasterxml.jackson.databind.DeserializationFeature;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.opentable.db.postgres.embedded.FlywayPreparer;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//import io.dropwizard.testing.ResourceHelpers;
//import io.dropwizard.testing.junit.DropwizardAppRule;
//import org.apache.kafka.clients.consumer.ConsumerConfig;
//import org.apache.kafka.clients.consumer.KafkaConsumer;
//import org.apache.kafka.clients.producer.KafkaProducer;
//import org.apache.kafka.clients.producer.ProducerConfig;
//import org.apache.kafka.common.serialization.StringDeserializer;
//import org.apache.kafka.common.serialization.StringSerializer;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.ClassRule;
//import org.junit.rules.RuleChain;
//import org.junit.rules.TestRule;
//import org.junit.runner.RunWith;
//import org.skife.jdbi.v2.DBI;
//
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.Properties;
//
//    @RunWith(Cucumber.class)
//    @CucumberOptions(features = { "src/test/resources/featuresClawbackJob" },
//            format = { "json:target/cucumber.json",    "html:target/cucumber" },
//            glue = "com.aexp.loyalty.earn.capprocessor.component.steps" ,
//            tags = { "~@Demo" })
//    public class RunCukesClawbackJobTest {
//
//        private static final String REQUEST_TOPIC = "earn-cap-processor-inbound";
//        public static final String BROKER_LIST = "localhost:9092";
//        private static SharedStepsDetails details = SharedStepsDetails.getInstance();
//        private static KafkaProducer<String, String> producer;
//
//        public static PostgresDbRule POSTGRES_RULE = new PostgresDbRule(50054, "target/postgres",
//                FlywayPreparer.forClasspathLocation("db/"));
//
//        public static CapProcessorKafkaServer KAFKA_RULE = new CapProcessorKafkaServer();
//
//        public static final DropwizardAppRule<CapProcessorConfiguration> DROPWIZARD_RULE = new DropwizardAppRule<CapProcessorConfiguration>(
//                CapProcessorApplicationTest.class, ResourceHelpers.resourceFilePath("cap-processor-test-config-e0.yml"));
//
//        @ClassRule
//        public static final TestRule RULE_CHAIN = RuleChain.outerRule(POSTGRES_RULE).around(KAFKA_RULE)
//                .around(DROPWIZARD_RULE);
//
//        @BeforeClass
//        public static void setup() throws Exception {
//
///////////////////  E2E test - need to stop background processes that affect Kafka Topic
//// /////////////   messages duplicated due to background jobs /////////////////
//            CapProcessorApplicationTest.eventConsumer.stop();
//            CapProcessorApplicationTest.capProcessorJobManagerE2E.stop();
//
//
//            Properties producerProps = new Properties();
//            producerProps.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BROKER_LIST);
//            producerProps.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
//            producerProps.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
//            producer = new KafkaProducer<>(producerProps);
//            ObjectMapper mapperWithRoot = new ObjectMapper();
//            mapperWithRoot.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
//            mapperWithRoot.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
//            details.setProducer(producer);
////    KafkaConsumer<String, String> consumer = createConsumer("SharedKafka1_200003816_LDL-request-topic-it",0);
//            KafkaConsumer<String, String> consumer = createConsumer(REQUEST_TOPIC,0);
//            details.setConsumer(consumer);
//
//            KafkaConsumer<String, String> capTrackerConsumer = createConsumer("earn-reload-cap-tracker",1);
//            details.setCapTrackerConsumer(capTrackerConsumer);
//
//            Thread.sleep(3000);
//
//
//      /*DataSource ds = POSTGRES_RULE.getDataSource();
//      DBI dbi = new DBI(ds);
//      Handle handle = dbi.open();
//
//      handle.execute("script/DDL_Scripts_Postgres.sql");
//      handle.commit();
//      dbi.close(handle);
//      handle.close();*/
//
//            DBI dbiOracle = new DBI("jdbc:hsqldb:mem:db1","sa","sa");
//
//        }
//
//        private static KafkaConsumer<String, String> createConsumer(String topic, int id) {
//            String[] topics = {topic};
//
//            Properties consumerProps = new Properties();
//            consumerProps.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, BROKER_LIST);
//            consumerProps.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "group" + id);
//            consumerProps.setProperty(ConsumerConfig.CLIENT_ID_CONFIG, "consumer" + id);
//            consumerProps.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
//            consumerProps.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
//            consumerProps.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
//            KafkaConsumer<String, String> consumer = new KafkaConsumer<>(consumerProps);
//            consumer.subscribe(Arrays.asList(topics));
//
//            return consumer;
//        }
//        @AfterClass
//        public static void cleanUp() throws IOException {
//
//            producer.close();
//        }
//    }
/////!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//    import com.aexp.earn.capprocessor.domain.cap.AccountDetails;
//import com.aexp.earn.capprocessor.domain.cap.CapResource;
//import com.aexp.earn.capprocessor.domain.cap.ClawbackEvent;
//import com.aexp.loyalty.earn.capprocessor.dao.MFClawbackEventsDAO;
//import com.aexp.loyalty.earn.capprocessor.dao.impl.CapProcessorDao;
//import com.aexp.loyalty.earn.capprocessor.scheduler.ClawbackEventFetchJob;
//import com.aexp.loyalty.earn.capprocessor.service.CapProcessorProducerService;
//import com.aexp.loyalty.earn.capprocessor.service.impl.CapProcessorManagementDao;
//import com.aexp.loyalty.earn.capprocessor.service.impl.CapProcessorProducerServiceImpl;
//import com.aexp.loyalty.earn.capprocessor.test.component.CapProcessorApplicationTest;
//import com.aexp.loyalty.earn.capprocessor.test.component.RunCukesClawbackJobTest;
//import com.aexp.loyalty.earn.capprocessor.test.component.SharedStepsDetails;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.jayway.awaitility.Awaitility;
//import cucumber.api.DataTable;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import gherkin.formatter.model.DataTableRow;
//import org.apache.kafka.clients.consumer.ConsumerRecord;
//import org.apache.kafka.clients.consumer.ConsumerRecords;
//import org.apache.kafka.clients.producer.KafkaProducer;
//import org.apache.kafka.clients.producer.ProducerRecord;
//import org.junit.Assert;
//import org.mockito.ArgumentCaptor;
//import org.mockito.Mockito;
//import org.quartz.*;
//import org.quartz.impl.JobExecutionContextImpl;
//import org.quartz.spi.OperableTrigger;
//import org.quartz.spi.TriggerFiredBundle;
//import org.skife.jdbi.v2.DBI;
//
//import java.io.IOException;
//import java.sql.Timestamp;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.time.LocalDateTime;
//import java.util.*;
//import java.util.Calendar;
//import java.util.concurrent.TimeUnit;
//import java.util.stream.IntStream;
//
//import static org.assertj.core.api.Java6Assertions.assertThat;
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Matchers.any;
//import static org.mockito.Mockito.*;
//
//    public class JobStepDefs {
//
//        List<String> capDataList = new ArrayList<>();
//        private List<CapResource> sharedClawbackResources = new ArrayList<>();
//        ArgumentCaptor<String> stringEventCaptor = null;
//        ArgumentCaptor<List> listEventCaptor = null;
//        private final static String JOB_STATUS_COMPLETED = "COMPLETED";
//        private final static String JOB_STATUS_FAILED = "FAILED";
//        private Exception error;
//
//        private CapProcessorProducerService mockCapProcessorProducerService = null;
//        private CapProcessorManagementDao capProcessorManagementDao =
//                new DBI(RunCukesClawbackJobTest.POSTGRES_RULE.getDataSource()).onDemand(CapProcessorManagementDao.class);
//        private CapProcessorDao processorDao =
//                new DBI(RunCukesClawbackJobTest.POSTGRES_RULE.getDataSource()).onDemand(CapProcessorDao.class);
//        private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
//
//        private static final String REQUEST_TOPIC = "earn-cap-processor-inbound";
//        private static SharedStepsDetails details = SharedStepsDetails.getInstance();
//        private static KafkaProducer kafkaProducer = details.getProducer();
//        private static CapProcessorProducerService sharedCapProcessorProducerServiceIT =
//                new CapProcessorProducerServiceImpl(details.getProducer(), REQUEST_TOPIC);
//
//        @Given("^following clawback Events$")
//        public void clawbackEvents(DataTable table) throws Exception {
//            capProcessorManagementDao.deleteAllJobStatus(CapProcessorApplicationTest.postgressSchema);
//            stringEventCaptor = ArgumentCaptor.forClass(String.class);
//            listEventCaptor = ArgumentCaptor.forClass(List.class);
//            mockCapProcessorProducerService = mock(CapProcessorProducerService.class);
//
//            IntStream.range(1, table.getGherkinRows().size()).forEach(i -> {
//                DataTableRow row = table.getGherkinRows().get(i);
//                CapResource capResource = new CapResource();
//                AccountDetails accountDetails = new AccountDetails();
//                accountDetails.setLytyAcctNumber(row.getCells().get(0));
//                capResource.setAccountDetails(accountDetails);
//                capResource.setEventType("Clawback");
//                capResource.setEventPublishDate(row.getCells().get(2));
//                capResource.setEventId(row.getCells().get(0) + "_" + row.getCells().get(2).replaceAll("/", "")
//                        + "_" + row.getCells().get(3).replaceAll(":", ""));
//                ClawbackEvent clawbackEvent = new ClawbackEvent();
//                clawbackEvent.setAdjustAm(Double.valueOf(row.getCells().get(1)));
//                clawbackEvent.setLoyaltyAcctNumber(row.getCells().get(0));
//
//                capResource.setClawbackEvent(clawbackEvent);
//                sharedClawbackResources.add(capResource);
//            });
//        }
//
//        @Given("^Clawback Job executes$")
//        public void clawbackJobExecutes() throws Exception {
//            Timestamp insertTS = Timestamp.valueOf(LocalDateTime.now());
//            Timestamp endTS = Timestamp.valueOf(LocalDateTime.now());
//            String jobExecId = UUID.randomUUID().toString();
//            processorDao.handleInsertJobStatusExce(CapProcessorApplicationTest.postgressSchema, jobExecId, insertTS,
//                    insertTS, endTS, JOB_STATUS_COMPLETED, "XA1234A", insertTS);
//
//            MFClawbackEventsDAO mfClawbackEventsDAOProxy = mock(MFClawbackEventsDAO.class);
//            when(mfClawbackEventsDAOProxy.getClawbackEvents(any(), any())).thenReturn(sharedClawbackResources);
//            new ClawbackEventFetchJob(mfClawbackEventsDAOProxy, processorDao, mockCapProcessorProducerService,
//                    CapProcessorApplicationTest.postgressSchema, 3).doJob(getContext());
//
//        }
//
//        @Given("^Clawback Job executes with DB error$")
//        public void clawbackJobDBErrors() throws Exception {
//            error = null;
//            Timestamp insertTS = Timestamp.valueOf(LocalDateTime.now());
//            Timestamp endTS = Timestamp.valueOf(LocalDateTime.now());
//            String jobExecId = UUID.randomUUID().toString();
//            processorDao.handleInsertJobStatusExce(CapProcessorApplicationTest.postgressSchema, jobExecId, insertTS,
//                    insertTS, endTS, JOB_STATUS_COMPLETED, "XA1234A", insertTS);
//
//            MFClawbackEventsDAO mfClawbackEventsDAOProxy = mock(MFClawbackEventsDAO.class);
//            when(mfClawbackEventsDAOProxy.getClawbackEvents(any(), any())).thenThrow(new RuntimeException("DB Error Exception"));
//            try {
//                new ClawbackEventFetchJob(mfClawbackEventsDAOProxy, processorDao, mockCapProcessorProducerService,
//                        CapProcessorApplicationTest.postgressSchema, 3).doJob(getContext());
//            } catch (JobExecutionException exception) {
//                error = exception;
//            }
//
//        }
//
//
//        @Given("^Clawback Job executes with Kafka error$")
//        public void clawbackJobKafkaErrors() throws Exception {
//            error = null;
//            Timestamp insertTS = Timestamp.valueOf(LocalDateTime.now());
//            Timestamp endTS = Timestamp.valueOf(LocalDateTime.now());
//            String jobExecId = UUID.randomUUID().toString();
//            processorDao.handleInsertJobStatusExce(CapProcessorApplicationTest.postgressSchema, jobExecId, insertTS,
//                    insertTS, endTS, JOB_STATUS_COMPLETED, "XA1234A", insertTS);
//
//            MFClawbackEventsDAO mfClawbackEventsDAOProxy = mock(MFClawbackEventsDAO.class);
//            when(mfClawbackEventsDAOProxy.getClawbackEvents(any(), any())).thenReturn(sharedClawbackResources);
//            doThrow(new RuntimeException("Kafka Exception")).when(mockCapProcessorProducerService).send(anyString());
//            doThrow(new RuntimeException("Kafka Exception")).when(mockCapProcessorProducerService).send(anyList());
//            try {
//                new ClawbackEventFetchJob(mfClawbackEventsDAOProxy, processorDao, mockCapProcessorProducerService,
//                        CapProcessorApplicationTest.postgressSchema, 3).doJob(getContext());
//            } catch (JobExecutionException exception) {
//                error = exception;
//            }
//
//        }
//
//
//        @Given("^following Clawback Event are created$")
//        public void clawbackEventsAreCreated(DataTable table) throws Exception {
//            List<String> events = new ArrayList<>();
//            if (table.getGherkinRows().size() >= 2) {
//                verify(mockCapProcessorProducerService, times(1)).send(listEventCaptor.capture());
//                events.addAll(listEventCaptor.getAllValues().get(0));
//            } else {
//                verify(mockCapProcessorProducerService, times(table.getGherkinRows().size() - 1))
//                        .send(stringEventCaptor.capture());
//                events.addAll(stringEventCaptor.getAllValues());
//            }
//
//            assertEquals(table.getGherkinRows().size() - 1, events.size());
//
//            IntStream.range(1, table.getGherkinRows().size()).forEach(i -> {
//                DataTableRow row = table.getGherkinRows().get(i);
//                CapResource capResource = getCapResource(events.get(i - 1));
//                assertEquals(row.getCells().get(0), capResource.getEventId());
//                assertEquals(Double.valueOf(row.getCells().get(1)), capResource.getClawbackEvent().getAdjustAm());
//                assertEquals(row.getCells().get(2), capResource.getEventPublishDate());
//                assertEquals(row.getCells().get(3), capResource.getEventType());
//                assertEquals(row.getCells().get(4), capResource.getAccountDetails().getLytyAcctNumber());
//            });
//
//        }
//
//        @Given("^Job Status table has an entry$")
//        public void jobStatusEntry() throws Exception {
//            assertEquals(Integer.valueOf(2), processorDao.getCountJobStatus(CapProcessorApplicationTest.postgressSchema, JOB_STATUS_COMPLETED));
//        }
//
//        @Given("^Job Status table has no entry$")
//        public void jobStatusNoEntry() throws Exception {
//            Assert.assertTrue(error.getMessage().contains("Exception"));
//        }
//
//        ////////////////////////// Kafka Topic Update Test///////////////////////////////
//        @Given("^following clawback Events for Kafka$")
//        public void followingClawbackEventsForKafka(DataTable table) throws Exception {
//            List<DataTableRow> listRow = table.getGherkinRows();
//            capDataList.clear();
//            capProcessorManagementDao.deleteAllJobStatus(CapProcessorApplicationTest.postgressSchema);
//
//            IntStream.range(1, table.getGherkinRows().size()).forEach(i -> {
//                DataTableRow row = table.getGherkinRows().get(i);
//                CapResource capResource = new CapResource();
//                AccountDetails accountDetails = new AccountDetails();
//                accountDetails.setLytyAcctNumber(row.getCells().get(0));
//                capResource.setAccountDetails(accountDetails);
//                capResource.setEventType("Clawback");
//                capResource.setEventPublishDate(row.getCells().get(2));
//                capResource.setEventId(row.getCells().get(0) + "_" + row.getCells().get(2).replaceAll("/", "")
//                        + "_" + row.getCells().get(3).replaceAll(":", ""));
//                ClawbackEvent clawbackEvent = new ClawbackEvent();
//                clawbackEvent.setAdjustAm(Double.valueOf(row.getCells().get(1)));
//                clawbackEvent.setLoyaltyAcctNumber(row.getCells().get(0));
//
//                capResource.setClawbackEvent(clawbackEvent);
//                sharedClawbackResources.add(capResource);
//                try {
//                    capDataList.add(OBJECT_MAPPER.writeValueAsString(capResource));
//                } catch (JsonProcessingException e) {
//                    assertThat(true).isFalse();
//                }
//            });
//        }
//
//
//        @Given("^Clawback Job executes with Kafka$")
//        public void clawbackJobExecutesWithKafka() throws Exception {
//            //Produce the messages
//            ProducerRecord<String, String> data;
//            KafkaProducer<String, String> producer = details.getProducer();
//            for (String request : capDataList) {
//                data = new ProducerRecord<>(REQUEST_TOPIC, request.toString());
//                producer.send(data);
//            }
//            //Wait to get the process all the Request.
//            Awaitility.await().atMost(5, TimeUnit.SECONDS);
//
//        }
//
//        @Given("^following Clawback Event are updated to Kafka$")
//        public void followingClawbackEventAreUpdatedToKafka(DataTable table) throws Exception {
//            CapResource capRecord;
//            Integer loop = 0;
//
//            List<DataTableRow> listRow = table.getGherkinRows();
//            DataTableRow row1 = listRow.get(1);
//            List<String> rowStr1 = row1.getCells();
//
//            ConsumerRecords<String, String> records = details.getConsumer().poll(1000);
//
//            assertThat(records).isNotEmpty();
//
//            assertEquals(table.getGherkinRows().size() - 1, records.count());
//
//            for (ConsumerRecord<String, String> record : records) {
//                loop = loop + 1;
//                capRecord = OBJECT_MAPPER.readValue(record.value(), CapResource.class);
//                DataTableRow row = table.getGherkinRows().get(loop);
//
//                assertEquals(row.getCells().get(0), capRecord.getEventId());
//                assertEquals(Double.valueOf(row.getCells().get(1)), capRecord.getClawbackEvent().getAdjustAm());
//                assertEquals(row.getCells().get(2), capRecord.getEventPublishDate());
//                assertEquals(row.getCells().get(3), capRecord.getEventType());
//                assertEquals(row.getCells().get(4), capRecord.getAccountDetails().getLytyAcctNumber());
//                assertEquals(row.getCells().get(4), capRecord.getClawbackEvent().getLoyaltyAcctNumber());
//                return;
//            }
//            details.getConsumer().commitSync();
//        }
//
//        ////////////////////////// IT ClawBack Processor test//////////////////////////////
//        @Given("^ClawbackEventFetchJob executes$")
//        public void clawbackeventfetchjobExecutes() throws Exception {
//            error = null;
//            Timestamp insertTS = Timestamp.valueOf(LocalDateTime.now());
//            Timestamp endTS = Timestamp.valueOf(LocalDateTime.now());
//            String jobExecId = UUID.randomUUID().toString();
//            processorDao.handleInsertJobStatusExce(CapProcessorApplicationTest.postgressSchema, jobExecId, insertTS,
//                    insertTS, endTS, JOB_STATUS_COMPLETED, "XA1234A", insertTS);
//
//            MFClawbackEventsDAO mfClawbackEventsDAOProxy = mock(MFClawbackEventsDAO.class);
//            when(mfClawbackEventsDAOProxy.getClawbackEvents(any(), any())).thenReturn(sharedClawbackResources);
//            try {
//                new ClawbackEventFetchJob(mfClawbackEventsDAOProxy, processorDao, sharedCapProcessorProducerServiceIT,
//                        CapProcessorApplicationTest.postgressSchema, 3).doJob(getContext());
//            } catch (JobExecutionException exception) {
//                error = exception;
//            }
//        }
//
//
//        /////////////   E1 test ///////////////////////////////////////
//        @Given("^Status table has been purged$")
//        public void statusTableHasBeenPurged() throws Exception {
//            capProcessorManagementDao.deleteAllJobStatus(CapProcessorApplicationTest.postgressSchema);
//        }
//
//        @And("^Following 1 Clowback Event has been inserted into MF DB$")
//        public void followingClowbackEventHasBeenInsertedIntoMFDB(DataTable table) throws Exception {
//            List<DataTableRow> listRow = table.getGherkinRows();
//            capDataList.clear();
//            capProcessorManagementDao.deleteAllJobStatus(CapProcessorApplicationTest.postgressSchema);
//
//            IntStream.range(1, table.getGherkinRows().size()).forEach(i -> {
//                DataTableRow row = table.getGherkinRows().get(i);
//                CapResource capResource = new CapResource();
//                AccountDetails accountDetails = new AccountDetails();
//                accountDetails.setLytyAcctNumber(row.getCells().get(0));
//                capResource.setAccountDetails(accountDetails);
//                capResource.setEventType("Clawback");
//                capResource.setEventPublishDate(row.getCells().get(2));
//                capResource.setEventId(row.getCells().get(0) + "_" + row.getCells().get(2).replaceAll("/", "")
//                        + "_" + row.getCells().get(3).replaceAll(":", ""));
//                ClawbackEvent clawbackEvent = new ClawbackEvent();
//                clawbackEvent.setAdjustAm(Double.valueOf(row.getCells().get(1)));
//                clawbackEvent.setLoyaltyAcctNumber(row.getCells().get(0));
//
//                capResource.setClawbackEvent(clawbackEvent);
//                sharedClawbackResources.add(capResource);
//            });
//        }
//
//        @And("^Job Status table has 2 entry$")
//        public void jobStatusTableHasEntry() throws Exception {
//            assertEquals(Integer.valueOf(2), processorDao.getCountJobStatus(CapProcessorApplicationTest.postgressSchema, JOB_STATUS_COMPLETED));
//        }
//
//        @And("^Kafka Topic has 1 entry$")
//        public void kafkaTopicHasEntry(DataTable table) throws Exception {
//            CapResource capRecord;
//            Integer loop = 0;
//
//            List<DataTableRow> listRow = table.getGherkinRows();
//            DataTableRow row1 = listRow.get(1);
//            List<String> rowStr1 = row1.getCells();
//
//            ConsumerRecords<String, String> records = details.getConsumer().poll(1000);
//
//            assertThat(records).isNotEmpty();
//            assertEquals(table.getGherkinRows().size() - 1, records.count());
//
//            for (ConsumerRecord<String, String> record : records) {
//                loop = loop + 1;
//                capRecord = OBJECT_MAPPER.readValue(record.value(), CapResource.class);
//                DataTableRow row = table.getGherkinRows().get(loop);
//
//                assertEquals(row.getCells().get(0), capRecord.getEventId());
//                assertEquals(Double.valueOf(row.getCells().get(1)), capRecord.getClawbackEvent().getAdjustAm());
//                assertEquals(row.getCells().get(2), capRecord.getEventPublishDate());
//                assertEquals(row.getCells().get(3), capRecord.getEventType());
//                assertEquals(row.getCells().get(4), capRecord.getAccountDetails().getLytyAcctNumber());
//                assertEquals(row.getCells().get(4), capRecord.getClawbackEvent().getLoyaltyAcctNumber());
//                return;
//            }
//            details.getConsumer().commitSync();
//        }
//
//        @And("^No Clawback Events fetched$")
//        public void noClawbackEventsFetched() throws Exception {
//            sharedClawbackResources.clear();
//        }
//
//        @And("^Job Status table has 4 entries$")
//        public void jobStatusTableHasEntries() throws Exception {
//            assertEquals(Integer.valueOf(4), processorDao.getCountJobStatus(CapProcessorApplicationTest.postgressSchema, JOB_STATUS_COMPLETED));
//        }
//
//        @And("^Kafka Topic has 0 entry$")
//        public void kafkaTopicHas2Entry(DataTable table) throws Exception {
//            List<DataTableRow> listRow = table.getGherkinRows();
//            ConsumerRecords<String, String> records = details.getConsumer().poll(1000);
//
//            assertThat(records).isEmpty();
//            assertEquals(table.getGherkinRows().size() - 1, records.count());
//            details.getConsumer().commitSync();
//        }
//
//        ////////////////////// Store Procedure test ////////////////////////////
//        @Given("^Store Procedure deletes Event from MF DB$")
//        public void storeProcedureFlashesMFDB() throws Exception {
//            Integer sqlCode;
//            String accNumber = "1M00789987";
//            String dateFrom = "02/22/2018";
//            String timeFrom = "19:15:30";
//            sqlCode = CapProcessorApplicationTest.storeProcedure.deleteAllEvents(accNumber, dateFrom, timeFrom);
//            assertThat(sqlCode).isBetween(0, 100);
//        }
//
//        @And("^Store Procedure inserts Event into MF DB$")
//        public void storeProcedureInsertsEventIntoMFDB() throws Exception {
//            Integer sqlCode;
//            String accNumber = "1M00789987";
//            String dateFrom = "02/22/2018";
//            String timeFrom = "19:15:30";
//            sqlCode = CapProcessorApplicationTest.storeProcedure.insertEvents(accNumber, dateFrom, timeFrom);
//            assertThat(sqlCode).isEqualTo(0);
//        }
//
//        @And("^Store Procedure fetches Event from MF DB$")
//        public void storeProcedureFetchesEventFromMFDB() throws Exception {
//            Timestamp startTS = convertStringToTimestamp("02/22/2018");
//            Timestamp endTS = convertStringToTimestamp("02/23/2018");
//            List<CapResource> result;
//            result = CapProcessorApplicationTest.storeProcedure.getClawbackEvents(startTS, endTS);
//            assertThat(result).isNotEmpty();
//        }
//
//        @Given("^Insert Event into MF DB$")
//        public void insertIntoMFDB(DataTable table) throws Exception {
//
//            IntStream.range(1, table.getGherkinRows().size()).forEach(i -> {
//                Integer sqlCode;
//                String accNumber;
//                DataTableRow row = table.getGherkinRows().get(i);
//                accNumber = row.getCells().get(0);
//                sqlCode = CapProcessorApplicationTest.storeProcedure.insertEvents(accNumber
//                        , new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime())
//                        , new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
//                assertThat(sqlCode).isEqualTo(0);
//            });
//        }
//
//        ////////////////////////// Testing negative scenarios
//        @When("^ClawbackEventFetchJob executes while JobStatus is empty$")
//        public void clawbackeventfetchjobExecutesWhileJobStatusIsEmpty() throws Exception {
//            error = null;
//            MFClawbackEventsDAO mfClawbackEventsDAOProxy = mock(MFClawbackEventsDAO.class);
//            when(mfClawbackEventsDAOProxy.getClawbackEvents(any(), any())).thenReturn(sharedClawbackResources);
//            try {
//                new ClawbackEventFetchJob(mfClawbackEventsDAOProxy, processorDao, sharedCapProcessorProducerServiceIT,
//                        CapProcessorApplicationTest.postgressSchema, 3).doJob(getContext());
//            } catch (JobExecutionException exception) {
//                error = exception;
//            }
//        }
//
//        @Then("^Invalid start date Exception will be thrown$")
//        public void invalidStartDateExceptionWillBeThrown() throws Exception {
////        assertEquals(Integer.valueOf(1), processorDao.getCountJobStatus(CapProcessorApplicationTest.postgressSchema,JOB_STATUS_FAILED));
//            Assert.assertTrue(error.getMessage().contains("Invalid start date"));
//        }
//
//        @When("^ClawbackEventFetchJob executes with (\\d+) Retry count$")
//        public void clawbackeventfetchjobExecutesWithRetryCount(int retry_count) throws Exception {
//            error = null;
//            MFClawbackEventsDAO mfClawbackEventsDAOProxy = mock(MFClawbackEventsDAO.class);
//            when(mfClawbackEventsDAOProxy.getClawbackEvents(any(), any())).thenReturn(sharedClawbackResources);
//            try {
//                new ClawbackEventFetchJob(mfClawbackEventsDAOProxy, processorDao, sharedCapProcessorProducerServiceIT,
//                        CapProcessorApplicationTest.postgressSchema, retry_count).doJob(getContext());
//            } catch (JobExecutionException exception) {
//                error = exception;
//            }
//        }
//
//        @Then("^Retries exceeded Exception will be thrown$")
//        public void retriesExceededExceptionWillBeThrown() throws Exception {
//            Assert.assertTrue(error.getMessage().contains("Retries exceeded"));
//        }
//
//        @And("^Job Status table has Failed entry$")
//        public void jobStatusTableHasFailedEntry() throws Exception {
//            assertEquals(Integer.valueOf(1), processorDao.getCountJobStatus(CapProcessorApplicationTest.postgressSchema,JOB_STATUS_FAILED));
//        }
//
//        ////////////////////////// Instance methods //////////////////////////////
//        private CapResource getCapResource(String input) {
//            CapResource capResource;
//            try {
//                return OBJECT_MAPPER.readValue(input, CapResource.class);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//        private JobExecutionContext getContext() {
//            JobExecutionContext context;
//            Scheduler scheduler1 = mock(Scheduler.class);
//            JobDetail job1 = JobBuilder.newJob(ClawbackEventFetchJob.class).withIdentity("job1", "group1").build();
//            OperableTrigger trigger = mock(OperableTrigger.class);
//            Map<String, Object> keyValuePairs = new HashMap<String, Object>();
//            keyValuePairs.put("count", 1);
//            JobDataMap jobDataMap = new JobDataMap(keyValuePairs);
//            doReturn(jobDataMap).when(trigger).getJobDataMap();
//            TriggerFiredBundle firedBundle = Mockito.spy(new TriggerFiredBundle(job1, trigger, null, false, null, null, null, null));
//            Job job = mock(com.aexp.loyalty.earn.capprocessor.scheduler.Job.class);
//            context = Mockito.spy(new JobExecutionContextImpl(scheduler1, firedBundle, job));
//            return context;
//        }
//
//        private String getClawbackEventAsString(CapResource capResource) {
//            try {
//                return OBJECT_MAPPER.writeValueAsString(capResource);
//            } catch (JsonProcessingException e) {
//                e.printStackTrace();
//            }
//            return null;
//        }
//
//        public Timestamp convertStringToTimestamp(String str_date) {
//            try {
//                DateFormat formatter;
//                formatter = new SimpleDateFormat("MM/dd/yyyy");
//                // you can change format of date
//                Date date = formatter.parse(str_date);
//                java.sql.Timestamp timeStampDate = new Timestamp(date.getTime());
//
//                return timeStampDate;
//            } catch (ParseException e) {
//                System.out.println("Exception :" + e);
//                return null;
//            }
//        }
//
//
//    }
//}
