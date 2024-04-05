package task24;

import java.util.ArrayList;

public class Level1 {
    public static void MatrixTurn(String[] Matrix, int size, int stringLength, int stepsCount) {

        //создаем новую матрицу
        String[][] newMatrix = new String[size][stringLength];

        //Пробегаемся по исходной и записываем символы в новую
        for (int i = 0; i < Matrix.length; i++)
            for (int j = 0; j < Matrix[i].length(); j++)
                newMatrix[i][j] = Character.toString(Matrix[i].charAt(j));

        //создаем еще одну новую матрицу с такими же параметрами
        String[][] newMatrix2 = new String[size][stringLength];

        //по одному символу вначале и в конце не считаем
        int number = 2;

        //Создаем массивы для верхней, нижней, левой и правой частей матрицы
        //Верх и низ не будут содержать крайних элементов
        String[] topArray = new String[stringLength - 2];
        String[] bottomArray = new String[stringLength - 2];
        String[] leftArray = new String[size];
        String[] rightArray = new String[size];

        //какое-то число, равное половине размера матрицы
        int x = size / 2;

        //массив, содержащий строки в центральной части ???
        String[] res = new String[(size + stringLength - 2) * 2];

        //какой-то динамический массив
        ArrayList<String[]> list = new ArrayList<>();

        //какое-то число. Будет использоваться далее в цикле.
        int y = 0;

        //Цикл, работающий пока x > 0. Где-то х должен стать равным 0.
        while (x > 0) {

            //создаем какой-то набор индексов на каждой итерации
            int topArrayIndex = 0;
            int bottomArrayIndex = 0;
            int leftArrayIndex = 0;
            int rightArrayIndex = 0;

            //Создаем цикл на size-y повторений, будем пробегаться по всем строкам матрицы
            //При размере матрицы 4 будет работать сначала 4 раза, потом 3, потом 2, потом 1, потом завершится
            for (int i = y; i < size - y; i++)
                //Внутренний цикл работает по тому же принципу, что и внешний, но для каждой отдельной строки
                for (int innerIndex = y; innerIndex < stringLength - y; innerIndex++) {

                    //При каждом первом проходе внутреннего цикла заполняем левый столбец матрицы
                    if (innerIndex == y) {
                        leftArray[leftArrayIndex] = newMatrix[i][innerIndex];
                        leftArrayIndex++;
                    }

                    if (innerIndex == stringLength - 1 - y) {
                        rightArray[rightArrayIndex] = newMatrix[i][innerIndex];
                        rightArrayIndex++;
                    }
                    if (i == y && innerIndex != y && innerIndex != stringLength - 1 - y) {
                        topArray[topArrayIndex] = newMatrix[i][innerIndex];
                        topArrayIndex++;
                    }
                    if (i == newMatrix.length - 1 - y && innerIndex != y && innerIndex != stringLength - 1 - y) {
                        bottomArray[bottomArrayIndex] = newMatrix[i][innerIndex];
                        bottomArrayIndex++;
                    }
                }
            System.arraycopy(leftArray, 0, res, 0, leftArray.length);
            System.arraycopy(bottomArray, 0, res, leftArray.length, bottomArray.length);
            for (int v = 0; v < rightArray.length; v++)
                res[leftArray.length + bottomArray.length + v] = rightArray[rightArray.length - 1 - v];
            for (int w = 0; w < topArray.length; w++)
                res[leftArray.length + bottomArray.length + rightArray.length + w] = topArray[topArray.length - 1 - w];
            y++;
            x--;
            list.add(res);
            if (x > 0) {
                res = new String[((size - number) + (stringLength - number) - 2) * 2];
                leftArray = new String[size - number];
                rightArray = new String[size - number];
                number += 2;
                topArray = new String[newMatrix[0].length - number];
                bottomArray = new String[newMatrix[0].length - number];
            }
        }

        if (stepsCount < (size + stringLength - 2) * 2) {
            for (String[] strings3 : list) {
                for (int i = 0; i < stepsCount; i++) {
                    String temp = strings3[0];
                    for (int j = 0; j < strings3.length - 1; j++) {
                        strings3[j] = strings3[j + 1];
                    }
                    strings3[strings3.length - 1] = temp;
                }
            }
        }


        for (int outerIndex = 0; outerIndex < size / 2; outerIndex++) {
            String[] array = list.get(outerIndex);
            int in = 0;
            int ind = 1;
            for (int innerIndex = outerIndex; innerIndex < size - outerIndex; innerIndex++) {
                for (int w = outerIndex; w < stringLength - outerIndex; w++) {
                    if (!containsEmpty(newMatrix2[innerIndex])) continue;
                    if (w == outerIndex) {
                        if (newMatrix2[innerIndex][w] == null)
                            newMatrix2[innerIndex][w] = array[in];
                        in++;
                    }
                    if (innerIndex == outerIndex && w < stringLength - 2) {
                        if (newMatrix2[innerIndex][w + 1] == null)
                            newMatrix2[innerIndex][w + 1] = array[array.length - ind];
                        ind++;
                    }
                    if (w == stringLength - outerIndex - 1) {
                        if (newMatrix2[innerIndex][w] == null)
                            newMatrix2[innerIndex][w] = array[array.length - ind];
                        ind++;
                    }
                    if (innerIndex == size - outerIndex - 1 && w < stringLength - outerIndex - 1) {
                        if (newMatrix2[innerIndex][w + 1] == null)
                            newMatrix2[innerIndex][w + 1] = array[in];
                        in++;
                    }
                }
            }
        }

        //Запись в исходную
        for (int i = 0; i < newMatrix2.length; i++) {
            String u = "";
            for (int j = 0; j < newMatrix2[i].length; j++)
                u += newMatrix2[i][j];
            Matrix[i] = u;
        }
    }

    public static boolean containsEmpty(String[] array) {
        for (String s : array) {
            if (s == null || s.isEmpty()) return true;
        }
        return false;
    }
}