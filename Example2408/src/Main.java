import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(4);
        a.add(2);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(7);
        b.add(7);
        b.add(4);

//        int number = getNumber(a);
//        System.out.println(number);
//        System.out.println(getArrayList(number));
//        System.out.println(getNumber2(a));

        // Решение
        int number1 = getNumber(a);
        int number2 = getNumber2(b);
        int answer = number1 + number2;
        System.out.println(getArrayList(answer));

        // Решение с помощью улучшенного алгоритма
        System.out.println(sum(a, b));
    }

    private static ArrayList<Integer> sum(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>();
        int remainder = 0;
        int i = a.size() - 1, j = b.size() - 1;
        while (i >= 0 || j >= 0) {
            int value1 = 0;
            if (i >= 0) {
                value1 = a.get(i);
                i--;
            }
            int value2 = 0;
            if (j >= 0) {
                value2 = b.get(j);
                j--;
            }
            result.add(0, (value1 + value2 + remainder) % 10);
            remainder = (value1 + value2 + remainder) / 10;
        }
        if (remainder > 0) {
            result.add(0, remainder);
        }
        return result;
    }

    // Реализуем алгоритм получения числа по разрядам, хранящимся
    // в ArrayList.
    private static int getNumber(ArrayList<Integer> a) {
        String str = "";
        for (int i = 0; i < a.size(); i++) {
            str = str + a.get(i);
        }
        return Integer.parseInt(str);
    }

    private static int getNumber2(ArrayList<Integer> a) {
        int answer = 0;
        for (int i = a.size() - 1; i >= 0; i--) {
            answer = answer + a.get(i) * (int) Math.pow(10, a.size() - i - 1);
        }
        return answer;
    }

    private static ArrayList<Integer> getArrayList(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        String str = String.valueOf(n);
        for (int i = 0; i < str.length(); i++) {
            // '7' -> "7" -> 7
            answer.add(Integer.parseInt("" + str.charAt(i)));
        }
        return answer;
    }


}
