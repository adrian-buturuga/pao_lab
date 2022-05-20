package ro.unibuc.pao.sample1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DiplomaLicenta {

    private String serie;
    private int an;
    private String absolvent;
    private String facultate;
    private String specializare;
    private double medie;
}

