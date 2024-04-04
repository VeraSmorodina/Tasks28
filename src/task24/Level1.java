package task24;


import java.util.ArrayList;

public class Level1 {
    //    public static String[][] strings;
    public static void main(String[] args) {
        String[] s = new String[]{"123456", "234567", "345678", "456789"};
        ArrayList<String[]> arrayList = MatrixTurn(s, 4, 6, 1);
        for (String[] strings : arrayList) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }

    public static ArrayList<String[]> MatrixTurn(String[] Matrix, int M, int N, int T) {

        String[][] strings = new String[M][N];
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length(); j++) {
                strings[i][j] = Character.toString(Matrix[i].charAt(j));
            }
        }
        String[][] strings1 = new String[M][N];
//        for (int i = 0; i < strings.length; i++) {
//            for (int j = 0; j < strings[i].length; j++) {
//                strings1[i][j] = strings[i][j];
//            }
//        }
//        выводим в консоль
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                System.out.print(strings[i][j]);
            }
            System.out.println();
        }

        int number = 2;
        String[] top = new String[strings[0].length - number];
        String[] bottom = new String[strings[0].length - number];
        String[] left = new String[M];
        String[] right = new String[M];
        int y = 0;
        int x = M / 2;
        String[] res = new String[(M + N - 2) * 2];
//        ArrayList<String> res = new ArrayList<>();
        ArrayList<String[]> list = new ArrayList<>();
        while (x > 0) {
            int index = 0;
            int index1 = 0;
            int index2 = 0;
            int index3 = 0;
            for (int i = 0 + y; i < strings.length - y; i++) {
                for (int j = 0 + y; j < strings[i].length - y; j++) {
                    if (j == 0 + y) {
                        left[index2] = strings[i][j];
                        index2++;
                    }
                    if (j == N - 1 - y) {
                        right[index3] = strings[i][j];
                        index3++;
                    }
                    if (i == 0 + y && j != 0 + y && j != N - 1 - y) {
                        top[index] = strings[i][j];
                        index++;
                    }
                    if (i == strings.length - 1 - y && j != 0 + y && j != N - 1 - y) {
                        bottom[index1] = strings[i][j];
                        index1++;
                    }
                }
            }
            System.out.print("top:");
            for (String s : top) {
                System.out.print(s);
            }
            System.out.println();
            System.out.print("bottom:");
            for (String s : bottom) {
                System.out.print(s);
            }
            System.out.println();
            System.out.print("left:");
            for (String s : left) {
                System.out.print(s);
            }
            System.out.println();
            System.out.print("right:");
            for (String s : right) {
                System.out.print(s);
            }
            System.out.println();

            System.arraycopy(left, 0, res, 0, left.length);
            System.arraycopy(bottom, 0, res, left.length, bottom.length);
            for (int v = 0; v < right.length; v++)
                res[left.length + bottom.length + v] = right[right.length - 1 - v];
            for (int w = 0; w < top.length; w++)
                res[left.length + bottom.length + right.length + w] = top[top.length - 1 - w];
            y++;
            x--;


            for (String re : res) {
                System.out.print(re);
            }
            System.out.println();
            System.out.println();


            list.add(res);
////            нужно очистить res?
//            for (String re : res) {
//                re = null;
//            }


//            res = new String[((M - 2) + (N  - 2) - 2) * 2 ];
//            res = new String[((M - number) + (N  - number) - 2) * 2 ];
            res = new String[((M - number) + (N - number) - 2) * 2];
            left = new String[M - number];
            right = new String[M - number];
            number += 2;
            top = new String[strings[0].length - number];
            bottom = new String[strings[0].length - number];
        }
//        int turn = 0;
//        if (T > (M + N - 2) * 2){
//            turn = T - ((M + N - 2) * 2);
//        }

//        int turn = (M + N - 2) * 2;
//        while ( T > turn) {
//            turn = T - turn;
//        }
        int t = (M + N - 2) * 2;
        while (T > t) {
            T = T - t;
        }
        System.out.println(T);
        if (T == t)
            return list;
        if (T < (M + N - 2) * 2) {
            for (String[] strings2 : list) {
                for (int i = 0; i < T; i++) {
                    String temp = strings2[0];
                    for (int j = 0; j < strings2.length - 1; j++) {
                        strings2[j] = strings2[j + 1];
                    }
                    strings2[strings2.length - 1] = temp;
                }
            }
        }
        for (String[] strings2 : list) {
            for (String s : strings2) {
                System.out.print(s);
            }
            System.out.println();
        }
        System.out.println();

        int in = 0;



        for (int i = 0; i < M / 2; i++) {
            String[] array = list.get(i);
            for (int v = i; v < strings1.length - i; v++) {
                for (int w = i; w < strings1[v].length - i; w++) {
                    if (w == i) {
                        strings1[v + i][w + i] = array[in];
                        in++;
                    }
                    if (v == i && w != strings1[i].length - 1 - i) {
                        strings1[v + i][strings1[v].length - 1 - i - w - 1] = array[in];
                        in++;
                    }
                    if (w == strings1[v].length - 1 - i) {
                        strings1[strings1.length - 1 - i - v][w + i] = array[in];
                        in++;
                    }
                    if (v == strings1.length - 1 - i  && w != strings1[i].length - 1 - i){
                        strings1[v][w] = array[in];
                        in++;
                    }
                }
            }
        }

        for (String[] strings2 : strings1) {
            for (String s : strings2) {
                System.out.print(s);
            }
            System.out.println();
        }
        System.out.println();
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < list.get(i).length; j++) {
//                for (int v = 0 + i; v < strings1.length - i; v++) {
//                    for (int w = 0 + i; w < strings1[i].length - i; w++) {
//                        if (j < M){
//                            strings1[i][0 + i] = list.get(i).;
//                        }
//
//
//
//                    }
//                }
//            }
//        }

//        for (String[] strings2 : list) {
//            for (String s : strings2) {
//                for (int v = 0 + i; v < strings1.length - i; v++) {
//                    for (int w = 0 + i; w < strings1[i].length - i; w++) {
//                        if (j < M){
//                            strings1[0 + i] =
//                        }
//
//
//
//                    }
//                }
//            }
//        }


        return list;
    }
}
