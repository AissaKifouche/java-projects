import java.util.*;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<String>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if (myCollection.isEmpty() || theirCollection.isEmpty()) return false;
        if (myCollection.containsAll(theirCollection) || theirCollection.containsAll(myCollection)) return false;
        return !myCollection.equals(theirCollection);
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        if (collections.isEmpty()) return Set.of();
        Set<String> set = new HashSet<String>(collections.getFirst());
        for (Set<String> set1 : collections){
            set.retainAll(set1);
        }
        return set;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> set = new HashSet<>();
        for (Set<String> set1 : collections){
            set.addAll(set1);
        }
        return set;
    }
}
