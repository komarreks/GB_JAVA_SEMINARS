package seminar03;

import java.util.ArrayList;
import java.util.List;

public class Part03 {
    public static void main(String[] args) {
        List<List<String>> catalog = new ArrayList<>();
        addBook(catalog, "adventure", "LOTR");
        addBook(catalog, "roman", "Мастер и Маргарита");
        addBook(catalog, "politic", "Государь");
        addBook(catalog, "adventure", "Hobbit");
        System.out.println(catalog);
    }

    static void addBook(List<List<String>> catalog, String genre, String name) {
        for (int i = 0; i < catalog.size(); i++) {
            List<String> innerCatalog = catalog.get(i);
            if (innerCatalog.get(0).equals(genre)) {
                innerCatalog.add(name);
                return;
            }
        }
        List<String> newInnerCatalog = new ArrayList<>();
        newInnerCatalog.add(genre);
        newInnerCatalog.add(name);
        catalog.add(newInnerCatalog);
    }
}
