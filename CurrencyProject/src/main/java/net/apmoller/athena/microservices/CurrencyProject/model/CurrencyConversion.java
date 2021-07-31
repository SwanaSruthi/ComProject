package net.apmoller.athena.microservices.CurrencyProject.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.*;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class CurrencyConversion
{
    @Id
    String Conversion_Key;
    int Conversion_factor;
    boolean status;
    String created_by;
    Date created_date;
    Date effective_date;
    Date expiry_date;
    String Last_updated_by;
    Date last_updated_time;

    public void setId(String id) {
    }
}
