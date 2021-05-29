package kmap;

import java.util.LinkedList;

public class Solver {

    LinkedList<String> list;
    LinkedList<String> TEMP;
    LinkedList<LinkedList<String>> listOfLists;
    LinkedList<String> result;

    Solver() {
        list = new LinkedList<>();
        TEMP = new LinkedList<>();
        listOfLists = new LinkedList<>();
        result = new LinkedList<>();
    }

    private String showResult(int sopORpos, int abcdORwxyz, int var) {
        String[] abcd = new String[4];
        String one = "A";
        String two = "B";
        String three = "C";
        String four = "D";
        abcd[0] = one;
        abcd[1] = two;
        abcd[2] = three;
        abcd[3] = four;
        String tempResult = "";
        if (sopORpos == 1) {
            for (int counter = 0; counter < result.size(); counter++) {
                one = abcd[0];
                two = abcd[1];
                three = abcd[2];
                four = abcd[3];
                for (int index = 0; index < result.get(counter).length() - 1; index++) {
                    switch (result.get(counter).charAt(index)) {
                        case '1':
                            tempResult = tempResult.concat(one);
                            break;
                        case '0':
                            tempResult = tempResult.concat(one + "'");
                            break;
                        default:
                            break;
                    }
                    one = two;
                    two = three;
                    three = four;
                }
                if (counter != result.size() - 1) {
                    tempResult = tempResult.concat("+");
                }
            }
        } else {
            for (int counter = 0; counter < result.size(); counter++) {
                one = abcd[0];
                two = abcd[1];
                three = abcd[2];
                four = abcd[3];
                tempResult = tempResult.concat("(");
                for (int index = 0; index < result.get(counter).length() - 1; index++) {

                    switch (result.get(counter).charAt(index)) {
                        case '1':
                            tempResult = tempResult.concat(one);
                            break;
                        case '0':
                            tempResult = tempResult.concat(one + "'");
                            break;
                        default:
                            break;
                    }

                    if (index < result.get(counter).length() - 2 && result.get(counter).charAt(index) != 'x') {
                        if (result.get(counter).charAt(index + 1) != 'x' || (result.get(counter).charAt(index + 2) == '0' || result.get(counter).charAt(index + 2) == '1')) {
                            tempResult = tempResult.concat("+");
                        }
                    }

                    one = two;
                    two = three;
                    three = four;
                }
                tempResult = tempResult.concat(")");

            }
        }
        if (abcdORwxyz == 0) {
            if (var == 2) {
                tempResult = tempResult.replaceAll("A", "X");
                tempResult = tempResult.replaceAll("B", "Y");
            } else if (var == 3) {
                tempResult = tempResult.replaceAll("A", "X");
                tempResult = tempResult.replaceAll("B", "Y");
                tempResult = tempResult.replaceAll("C", "Z");
            } else if (var == 4) {
                tempResult = tempResult.replaceAll("A", "W");
                tempResult = tempResult.replaceAll("B", "X");
                tempResult = tempResult.replaceAll("C", "Y");
                tempResult = tempResult.replaceAll("D", "Z");
            }

        }
        return tempResult;
    }

    public String prepare2(int sopORpos, int abcdORwxyz, int var) {
        result = new LinkedList<>();
        listOfLists = new LinkedList<>();
        list.sort(String::compareToIgnoreCase);
        if (isThereMainterm() && list.size() == 4) {
            return "1";
        } else if (list.size() == 0 || !isThereMainterm()) {
            return "0";
        } else {
            findRe();
            finish();
            removeDub();
            //removeDontCare();
            return showResult(sopORpos, abcdORwxyz, var);
        }
    }

    public String prepare3(int sopORpos, int abcdORwxyz, int var) {
        result = new LinkedList<>();
        listOfLists = new LinkedList<>();
        list.sort(String::compareToIgnoreCase);
        if (isThereMainterm() && list.size() == 8) {
            return "1";
        } else if (list.size() == 0 || !isThereMainterm()) {
            return "0";
        } else {
            findRe();
            finish();
            removeDub();
            TEMP = list;
            list = result;
            result = new LinkedList<>();
            listOfLists = new LinkedList<>();
            findRe();
            finish();
            removeDub();
            //removeDontCare();
            list = TEMP;
            return showResult(sopORpos, abcdORwxyz, var);
        }
    }

    public String prepare4(int sopORpos, int abcdORwxyz, int var) {
        result = new LinkedList<>();
        listOfLists = new LinkedList<>();
        list.sort(String::compareToIgnoreCase);
        if (isThereMainterm() && list.size() == 16) {
            return "1";
        } else if (list.size() == 0 || !isThereMainterm()) {
            return "0";
        } else {
            findRe();
            finish();
            removeDub();
            TEMP = list;
            list = result;
            result = new LinkedList<>();
            listOfLists = new LinkedList<>();
            findRe();
            finish();
            removeDub();
            list = result;
            result = new LinkedList<>();
            listOfLists = new LinkedList<>();
            findRe();
            finish();
            removeDub();
            removeDub();
            //removeDontCare();
            list = TEMP;
            return showResult(sopORpos, abcdORwxyz, var);
        }
    }

    public void finish() {

        for (LinkedList<String> list11 : listOfLists) {
            switch (list11.size()) {
                case 1:

                    if (list11.get(0).charAt(list11.get(0).length() - 1) == 'm') {
                        result.add(list11.get(0));
                    }

                    break;

                default:
                    for (int row = 1; row < list11.size(); row++) {
                        String temp = "";
                        for (int counter = 0; counter < list11.get(row).length(); counter++) {
                            char element = ' ';
                            if (counter == list11.get(row).length() - 1) {
                                if (list11.get(0).charAt(counter) != list11.get(row).charAt(counter)) {
                                    element = 'm';
                                } else {
                                    element = list11.get(0).charAt(counter);
                                }
                            } else if (list11.get(0).charAt(counter) == list11.get(row).charAt(counter)) {
                                element = list11.get(0).charAt(counter);
                            } else {
                                element = 'x';
                            }

                            temp = temp.concat(element + "");
                        }
                        result.add(temp);
                    }
            }
        }

    }

    public void findRe() {

        setUp();

        for (int row = 0; row < list.size(); row++) {
            listOfLists.get(row).add(list.get(row));
            for (int column = 0; column < list.size(); column++) {
                if (column != row) {
                    int def = 0;
                    for (int counter = 0; counter < list.get(row).length() - 1; counter++) {
                        if (list.get(row).charAt(counter) != list.get(column).charAt(counter)) {
                            def++;
                        }
                    }
                    if (def < 2) {
                        listOfLists.get(row).add(list.get(column));
                    }
                }
            }
        }
    }

    public void setUp() {
        for (String list2 : list) {
            listOfLists.add(new LinkedList<String>());
        }
    }

    //===================================================
    public boolean isThereMainterm() {
        boolean temp = false;
        for (String list1 : list) {
            if (list1.charAt(list1.length() - 1) == 'm') {
                temp = true;
            }
        }
        return temp;
    }

    //===================================================
    //removeDub
    public void removeDub() {
        for (int index = 0; index < result.size(); index++) {
            for (int counter = 0; counter < result.size(); counter++) {
                if (index != counter) {
                    if (result.get(index).equals(result.get(counter))) {
                        result.remove(counter);
                    }
                }
            }
        }
    }
    //===================================================
    //fill the arrays

    public void add2(int temp, String condition) {
        switch (temp) {
            case 0:
                list.add("00" + condition);
                break;
            case 1:
                list.add("01" + condition);
                break;
            case 2:
                list.add("10" + condition);
                break;
            case 3:
                list.add("11" + condition);
                break;
            default:
                throw new AssertionError();
        }
    }

    public void add3(int temp, String condition) {
        switch (temp) {
            case 0:
                list.add("000" + condition);
                break;
            case 1:
                list.add("001" + condition);
                break;
            case 2:
                list.add("010" + condition);
                break;
            case 3:
                list.add("011" + condition);
                break;
            case 4:
                list.add("100" + condition);
                break;
            case 5:
                list.add("101" + condition);
                break;
            case 6:
                list.add("110" + condition);
                break;
            case 7:
                list.add("111" + condition);
                break;
            default:
                throw new AssertionError();
        }

    }

    public void add4(int temp, String condition) {
        switch (temp) {
            case 0:
                list.add("0000" + condition);
                break;
            case 1:
                list.add("0001" + condition);
                break;
            case 2:
                list.add("0010" + condition);
                break;
            case 3:
                list.add("0011" + condition);
                break;
            case 4:
                list.add("0100" + condition);
                break;
            case 5:
                list.add("0101" + condition);
                break;
            case 6:
                list.add("0110" + condition);
                break;
            case 7:
                list.add("0111" + condition);
                break;
            case 8:
                list.add("1000" + condition);
                break;
            case 9:
                list.add("1001" + condition);
                break;
            case 10:
                list.add("1010" + condition);
                break;
            case 11:
                list.add("1011" + condition);
                break;
            case 12:
                list.add("1100" + condition);
                break;
            case 13:
                list.add("1101" + condition);
                break;
            case 14:
                list.add("1110" + condition);
                break;
            case 15:
                list.add("1111" + condition);
                break;
            default:
                throw new AssertionError();
        }
    }

    public void findAndRemove(String toBeRemoved) {
        for (String list1 : list) {
            if (list1.equals(toBeRemoved)) {
                list.remove(list1);
                break;
            }
        }
    }
}
