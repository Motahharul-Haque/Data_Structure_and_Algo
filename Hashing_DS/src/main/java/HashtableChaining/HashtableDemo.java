package HashtableChaining;

public class HashtableDemo {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);


        ChainedHashtable ht = new ChainedHashtable();
        ht.put("jones", janeJones);
        ht.put("doe", johnDoe);
        ht.put("smith", marySmith);
        ht.put("wilson", mikeWilson);


        ht.printHashtable();

//        System.out.println("Retrieve key Smith : "+ ht.get("smith"));
//
//        ht.remove("wilson");
//        ht.remove("jones");
//        ht.printHashtable();
//
//        System.out.println("Retrieve key Wilson : "+ ht.get("wilson"));



    }
}
