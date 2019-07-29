package greg.exercises.exercise;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TableDto {
    private char table;

    @JsonProperty("no")
    private String number;
    @JsonProperty("effectiveDate")
    private LocalDate created;

    List<RateDto> rates;

    public char getTable() {
        return table;
    }

    public void setTable(char table) {
        this.table = table;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public List<RateDto> getRates() {
        return rates;
    }

    public void setRates(List<RateDto> rates) {
        this.rates = rates;
    }
}
