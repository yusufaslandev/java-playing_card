import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public interface Sort {
    default List<Kart> sort(List<Kart> kart) {
        List<Kart> sortedList = kart.stream()
                .sorted(Comparator.comparing(Kart::getTip).thenComparing(Kart::getKagit))
                .collect(Collectors.toList());

        return sortedList;
    }
}
