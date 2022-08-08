public class Main {

    public static void main(String[] args) {
        // Хоть классы и связаны отношением наследования,
        // мы можем создать независимо объекты обоих этих классов
        A superObj = new A();
        B subObj = new B();

        // Суперкласс (базовый) класс может использоваться самостоятельно
        superObj.i = 10;
        superObj.j = 20;
        superObj.showij();

        // Подкласс имеет доступ ко всем открытым (!!!) членам своего
        // суперкласса
        subObj.i = 7;
        subObj.j = 8;
        subObj.k = 9;
        subObj.showij();
        subObj.showk();
        subObj.sum();
    }

}
