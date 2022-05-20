package ro.unibuc.pao.sample1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LicentaMain {

    public static void main(String[] args) {

        ArrayList<DiplomaLicenta> diplome = new ArrayList<>();

        diplome.add(new DiplomaLicenta("25", 2018, "Gigi", "FMI", "Info", 8.56));
        diplome.add(new DiplomaLicenta("25", 2018, "Vasile", "FMI", "Info", 4.56));
        diplome.add(new DiplomaLicenta("25", 2009, "Bau", "AC", "Info", 10.0));

        List<DiplomaLicenta> l1 = diplome.stream().filter(e -> e.getAn() >= 2000 && e.getAn() <= 2010).collect(Collectors.toList());
        l1.sort((o1, o2) -> (int)(o2.getMedie() - o1.getMedie()));

        for (DiplomaLicenta d : l1) {
            System.out.println(d);
        }

        Set<String> l2 = diplome.stream()
                .filter(e -> "FMI".equals(e.getFacultate()))
                .filter(e -> 2018 == e.getAn())
                .map(e -> e.getSpecializare())
                .collect(Collectors.toSet());

        for (String s : l2) {
            System.out.println(s);
        }

        List<String> l3 = diplome.stream()
                .filter(e -> e.getMedie() == 10.0)
                .map(e -> e.getAbsolvent())
                .collect(Collectors.toList());

        for (String s : l3) {
            System.out.println(s);
        }
    }
}
