public class Main {

    public static void main(String[] args) {
        //Обобщения Generics
        // Оболочки типов
        // int - Integer
        // char - Character

        Account acc1 = new Account(2334, 5000);
        int acc1Id = (int)acc1.getId();// Object преобразуется в int
        System.out.println(acc1Id);

        AccountString acc2 = new AccountString("sid12345", 6000);
        String acc2Id = (String)acc2.getId();
        System.out.println(acc2Id);

        Object obj = acc2.getId();
        System.out.println(obj);

        int i = (int)acc2.getId();

    }

}
