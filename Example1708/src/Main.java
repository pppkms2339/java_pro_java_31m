public class Main {

    public static void main(String[] args) {
        Account acc1 = new Account("2334", 5000);
        String acc1Id = acc1.getId();
        System.out.println(acc1Id);

        Accountable<String> acc2 = new Account("sid12345", 6000);
        String acc2Id = acc2.getId();
        System.out.println(acc2Id);

        //int i = (int)acc2.getId();

    }

}
