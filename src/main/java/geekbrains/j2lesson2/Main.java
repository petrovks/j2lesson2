package geekbrains.j2lesson2;

import javax.naming.PartialResultException;

public class Main {
    public static void main(String[] args) {
            try{
                array(new String[][] {
                        {"1", "2", "3", "4"},
                        {"1", "2", "3", "4"},
                        {"1", "2", "3", "4"},
                        {"1", "2", "3", "4"}
                });
            }
            catch (MyArrayDataException myArrayDataException) {
                myArrayDataException.printStackTrace();
            }
            catch (MyArraySizeException myArraySizeException) {
                myArraySizeException.printStackTrace();
            }
    }

    public static void array(String[][] strings) throws MyArraySizeException, MyArrayDataException{
        int sum = 0;
        if (strings.length != 4) {
            throw new MyArraySizeException("Не соответствующий размер массива");
        }

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                if (strings[i].length != 4) {
                    throw new MyArraySizeException("Не соответствующий размер массива");
                }
                    try {
                        sum += Integer.parseInt(strings[i][j]);
                    }
                    catch (NumberFormatException numberFormatException){
                        throw new MyArrayDataException("Не числовой формат в ячейке [" + i + "][" + j + "]");
                    }
            }
        }

    }
}
