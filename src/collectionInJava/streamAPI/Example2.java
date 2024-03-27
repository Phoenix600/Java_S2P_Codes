package collectionInJava.streamAPI;


import java.util.*;
import java.util.stream.Stream;

class Transaction {
    public static final String GROCERY = "grocery";
    public static final String ELECTRONICS = "electronics";
    public  static final String MEDICAL = "medical";
    public static final String SPORTS = "sports";

    private int id;
    private String type;
    private Double value;

    public Transaction(int id, String type, Double value) {
        this.id = id;
        this.type = type;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}

public class Example2 {
    public static void main(String[] args) {

        Transaction[] transactions = new Transaction[10];

        transactions[0] = new Transaction(12,Transaction.GROCERY,1000.00);
        transactions[1] = new Transaction(17,Transaction.GROCERY,6000.00);
        transactions[2] = new Transaction(101,Transaction.ELECTRONICS,12000.00);
        transactions[3] = new Transaction(22,Transaction.GROCERY,3000.00);
        transactions[4] = new Transaction(34,Transaction.GROCERY,6000.00);
        transactions[5] = new Transaction(90,Transaction.GROCERY,12000.00);
        transactions[6] = new Transaction(90,Transaction.SPORTS,25000.00);
        transactions[7] = new Transaction(90,Transaction.GROCERY,12000.00);
        transactions[8] = new Transaction(90,Transaction.GROCERY,4000.00);
        transactions[9] = new Transaction(90,Transaction.ELECTRONICS,60000.00);


        List<Transaction> groceryTransaction = new LinkedList<>();

        for (Transaction x : transactions)
        {
            if(x.getType() == Transaction.GROCERY)
            {
                groceryTransaction.add(x);
            }
        }

        Collections.sort(groceryTransaction, new Comparator<Transaction>() {
            @Override
            public int compare(Transaction o1, Transaction o2) {
                if(o1.getValue() == o2.getValue())
                       return 0;
                if(o1.getValue() > o2.getValue())
                    return 1;
                return -1;
            }
        });


        System.out.println(groceryTransaction);

        List<Integer>transactionId = new ArrayList<>();
        for (Transaction x: groceryTransaction)
        {
            transactionId.add(x.getId());
        }

        System.out.println(transactionId);


        // After  Java 8
        System.out.println("Streams....");
        Stream<Transaction> s = Arrays.stream(transactions);
        Stream<Transaction> groceryTransactions =  s.filter(data->data.getType() == Transaction.GROCERY);
        groceryTransactions.sorted(new Comparator<Transaction>() {
            @Override
            public int compare(Transaction o1, Transaction o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        }).forEach(data-> System.out.println(data.getId()));

    }
}
