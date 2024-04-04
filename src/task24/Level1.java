package task24;


import java.util.ArrayList;

public class Level1 {

    public static void main(String[] args) {
//        String[] Matrix = new String[]{"123456", "234567", "345678", "456789"};
//        MatrixTurn(Matrix, 4, 6, 1);
//        String[] Matrix = new String[]{"12", "34"};
//        MatrixTurn(Matrix, 2, 2, 1);
//        String[] Matrix = new String[]{"12345", "67890", "86421", "37540"};
//        MatrixTurn(Matrix, 4, 5, 1);
        String[] Matrix = new String[]{"5793018", "6787503", "1235487", "6543123", "5678901", "2135570"};
        MatrixTurn(Matrix, 6, 7, 1);

        System.out.println("++++++");
        for (int i = 0; i < Matrix.length; i++) {
            System.out.println(Matrix[i]);
        }
    }

    public static void MatrixTurn(String[] Matrix, int M, int N, int T) {

        String[][] strings = new String[M][N];
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length(); j++) {
                strings[i][j] = Character.toString(Matrix[i].charAt(j));
            }
        }
        String[][] strings1 = new String[M][N];
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
        ArrayList<String[]> list = new ArrayList<>();
        while (x > 0) {
            int index = 0;
            int index1 = 0;
            int index2 = 0;
            int index3 = 0;
            for (int i = y; i < strings.length - y; i++) {
                for (int j = y; j < strings[i].length - y; j++) {
                    if (j == y) {
                        left[index2] = strings[i][j];
                        index2++;
                    }
                    if (j == N - 1 - y) {
                        right[index3] = strings[i][j];
                        index3++;
                    }
                    if (i == y && j != y && j != N - 1 - y) {
                        top[index] = strings[i][j];
                        index++;
                    }
                    if (i == strings.length - 1 - y && j != y && j != N - 1 - y) {
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
            System.out.println("размер" + list.size());


//            if (M / 2 <= 1 || x == 1)
//            if (M / 2 <= 1)
////            if (x == 1)
//                break;
            if (x > 0) {
                System.out.println("((( " + number);
                res = new String[((M - number) + (N - number) - 2) * 2];
                left = new String[M - number];
                right = new String[M - number];
                number += 2;
                top = new String[strings[0].length - number];
                bottom = new String[strings[0].length - number];
            }
        }

//        int t = (M + N - 2) * 2;
//        while (T > t) {
//            T = T - t;
//        }
//        System.out.println(T);
//        if (T == t)
//            return;

        System.out.println("T " + T);
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


        for (int i = 0; i < M / 2; i++) {
            String[] array = list.get(i);
            int in = 0;
            int ind = 0;
            for (int v = i; v < strings1.length - i; v++) {
                for (int w = i; w < strings1[v].length - i; w++) {
                    if (w == i) {
//                        strings1[v + i][w + i] = array[in];
                        strings1[v][w] = array[in];
                        System.out.println("первый " + "v=" + v + " i=" + i + " w=" + w);
                        System.out.println("первый " + strings1[v][w]);
                        in++;
                        ind++;

                        System.out.println();
                        for (int j = 0; j < strings1.length; j++) {
                            for (int k = 0; k < strings1[j].length; k++) {
                                System.out.print(strings1[j][k]);
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }


                    if (v == i && w < strings1[i].length - 2) {
                        strings1[v][w + 1] = array[array.length - ind];
                        System.out.println("второй " + "v=" + v + " i=" + i + " w=" + w);
                        System.out.println("второй " + strings1[v][w + 1]);
                        ind++;

                        System.out.println();
                        for (int j = 0; j < strings1.length; j++) {
                            for (int k = 0; k < strings1[j].length; k++) {
                                System.out.print(strings1[j][k]);
                            }
                            System.out.println();
                        }
                        System.out.println();

                    }


                    if (w == strings1[v].length - 1 - i) {
                        strings1[v + i][w] = array[array.length - ind];
//                        strings1[v + i][w + i] = array[array.length - ind];
//                        System.out.println("Трет " + strings1[v - i][w - i]);
                        System.out.println("трет " + strings1[v + i][w]);
                        System.out.println("трет " + "v=" + v + " i=" + i + " w=" + w);
                        for (int j = 0; j < strings1.length; j++) {
                            for (int k = 0; k < strings1[j].length; k++) {
                                System.out.print(strings1[j][k]);
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }


                    if (v == strings1.length - 1 - i && w < strings1[i].length - 1 - i) {
                        strings1[v][w + 1] = array[in];
                        in++;

                        System.out.println(" чет " + strings1[v][w + 1]);
                        System.out.println("чет " + "v=" + v + " i=" + i + " w=" + w);
                        for (int j = 0; j < strings1.length; j++) {
                            for (int k = 0; k < strings1[j].length; k++) {
                                System.out.print(strings1[j][k]);
                            }
                            System.out.println();
                        }
                        System.out.println();
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


        for (int i = 0; i < strings1.length; i++) {
            String u = "";
            for (int j = 0; j < strings1[i].length; j++) {
                u += strings1[i][j];
            }
            Matrix[i] = u;
        }
    }
}