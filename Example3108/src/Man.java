public class Man {

    private int dnaCode;

    public Man(int dnaCode) {
        this.dnaCode = dnaCode;
    }

    public int getDnaCode() {
        return dnaCode;
    }

    //Object obj = man1;
    @Override
    public boolean equals(Object obj) {
        // Проверим, ссылается ли переменная ссылочного типа obj
        // на объект класса Man
        if (obj instanceof Man) {
            // Является объектом класса Man
            Man tempMan = (Man) obj;
            return dnaCode == tempMan.getDnaCode();
        } else {
            // Не является объектом класса Man
            return false;
        }
    }
}
