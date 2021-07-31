package net.apmoller.athena.microservices.CurrencyProject.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.*;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class CurrencyCode
{
    @Id
    int currency_code;
    String currency_description;
    int currency_count;
    int conversion_key;
    int rounding_off_point;
    String created_by;
    String Last_updated_by;
    Date created_date;
    Date Last_updated_date ;
}
