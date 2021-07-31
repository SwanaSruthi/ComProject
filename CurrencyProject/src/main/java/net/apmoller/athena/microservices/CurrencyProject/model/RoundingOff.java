package net.apmoller.athena.microservices.CurrencyProject.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.*;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class RoundingOff
{
    @Id
    int rounding_off_rule;
    String round_off_rule;
    String created_by;
    String Last_updated_by;
    Date created_date;
    Date Last_updated_date ;
}
