package Comparators.Brasil;

import java.util.Comparator;

public class EstadoOrdemReversaComparator implements Comparator<Estado> {

    @Override
    public int compare(Estado o1, Estado o2) {
        return o2.getPopolacao() - o1.getPopolacao();
    }
}
