package greg.exercises.exercise;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.logging.log4j2.Log4J2LoggingSystem;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Collection;

@Service
//@Slf4j
public class NbpService implements ExchangeRate{

    private static final String NBP_API_TABLE = "http://api.nbp.pl/api/exchangerates/tables/a/last/5?format=json";

    @Override
    public void getDataFromTable() {

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<TableDto[]> forEntity = restTemplate.getForEntity(NBP_API_TABLE, TableDto[].class);

        TableDto[] body = forEntity.getBody();

        Arrays.stream(body).map(TableDto::getRates).flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
