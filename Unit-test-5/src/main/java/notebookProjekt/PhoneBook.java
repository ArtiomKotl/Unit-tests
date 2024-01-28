package notebookProjekt;

import java.util.*;

public class PhoneBook {
    private static Map<String, ArrayList<String>> contacts = new HashMap<> ();

    public static void addContact(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            ArrayList<String> list = contacts.get(name);
            list.add(phoneNumber);
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(phoneNumber);
            contacts.put(name, list);
        }
    }

    public List<String> getContact(String name) {
        return contacts.get(name);
    }

    public void delContact(String name) {
        contacts.remove(name);
    }

    public void changeContact(String name, String newPhone) {
        List<String> phones = contacts.get(name);
        if (phones != null) {
            phones.set(0, newPhone);
        }
    }

    public String getList() {
        System.out.println("List of all contacts:");
        System.out.print("\n");
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : contacts.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    void sortedPrint() {
        Comparator<Map.Entry<String, ArrayList<String>>> valueComparator = ((obj1, obj2) ->
                Integer.compare(obj2.getValue().size(), obj1.getValue().size()));
        List<Map.Entry<String, ArrayList<String>>> sortedList = new ArrayList<>(contacts.entrySet());
        sortedList.sort(valueComparator);
        System.out.println("Sorted by number of phones in descending order:");
        System.out.print ("\n");
        sortedList.forEach(System.out::println);
    }
}
