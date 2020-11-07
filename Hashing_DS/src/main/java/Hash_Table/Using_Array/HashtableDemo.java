package Hash_Table.Using_Array;

public class HashtableDemo {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        SimpleHashTable ht = new SimpleHashTable();
        ht.put("jones", janeJones);
        ht.put("doe", johnDoe);
        ht.put("smith", marySmith);
        ht.put("wilson", mikeWilson);
        ht.put("end", billEnd);

        ht.printHashtable();

        System.out.println("Retrieve key Wilson : "+ ht.get("wilson"));
        System.out.println("Retrieve key Smith : "+ ht.get("smith"));

    }
}
