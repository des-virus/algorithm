/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AI;

/**
 *
 * @author thuctap02
 */
public class Test {

    public int size = 3;
    public int POINT_NEAR_ONE = 10;
    public int POINT_BONUS = 10;
    public int ENEMY_VALUE = 1;
    public int MY_VALUE = 2;
    public int a[][];

    public Test() {
        a = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[i][j] = 0;
            }
        }

        a[0][2] = 1;
        a[2][0] = 1;
    }

    public int calHorizontalPoint(int i, int j) {
        int totalPoint = 0;
        int pointToLeft = 0;
        int pointToRight = 0;
        int nearL = 10;
        int nearR = 10;
        boolean first_time = true;

        for (int k = j; k < size; k++) {
            if (a[i][k] == ENEMY_VALUE) {
                pointToRight++;

            } else {
                if (!first_time) {
                    nearR = 0;
                }
            }
            if (first_time) {
                first_time = !first_time;
            }
            totalPoint += nearR;
        }

        first_time = true;
        for (int k = j; k >= 0; k--) {
            if (a[i][k] == ENEMY_VALUE) {
                pointToLeft++;
            } else {
                if (!first_time) {
                    nearL = 0;
                }
            }
            if (first_time) {
                first_time = !first_time;
            }
            totalPoint += nearL;
        }

        totalPoint = pointToLeft + pointToRight;
        if (totalPoint > 1) {
            totalPoint++;
        }
        return POINT_NEAR_ONE * totalPoint;
    }

    public int calVerticalPoint(int i, int j) {
        int totalPoint = 0;
        int pointToTop = 0;
        int pointToBottom = 0;

        for (int k = i; k < size; k++) {
            if (a[k][j] == ENEMY_VALUE) {
                pointToTop++;
            }
        }

        for (int k = i; k >= 0; k--) {
            if (a[k][j] == ENEMY_VALUE) {
                pointToBottom++;
            }
        }

        totalPoint = pointToTop + pointToBottom;
        if (totalPoint > 1) {
            totalPoint++;
        }
        return POINT_NEAR_ONE * totalPoint;
    }

    public int calMainDiagonalPoint(int i, int j) {
        int totalPoint = 0;
        int pointToTop = 0;
        int pointToBottom = 0;
        int k, l;

        for (k = i, l = j; k >= 0 && l >= 0; k--, l--) {
            if (a[k][l] == ENEMY_VALUE) {
                pointToTop++;
            }
        }

        for (k = i, l = j; k < size && l < size; k++, l++) {
            if (a[k][l] == ENEMY_VALUE) {
                pointToBottom++;
            }
        }

        totalPoint = pointToTop + pointToBottom;
        if (totalPoint > 1) {
            totalPoint++;
        }
        return POINT_NEAR_ONE * totalPoint;
    }

    public int calDiagonalPoint(int i, int j) {
        int totalPoint = 0;
        int pointToTop = 0;
        int pointToBottom = 0;
        int k, l;

        for (k = i, l = j; k >= 0 && l < size; k--, l++) {
            if (a[k][l] == ENEMY_VALUE) {
                pointToTop++;
            }
        }

        for (k = i, l = j; k < size && l >= 0; k++, l--) {
            if (a[k][l] == ENEMY_VALUE) {
                pointToBottom++;
            }
        }

        totalPoint = pointToTop + pointToBottom;
        if (totalPoint > 1) {
            totalPoint++;
        }
        return POINT_NEAR_ONE * totalPoint;

    }

    public static void main(String[] args) {
        Test t = new Test();

//        for (int i = 0; i < t.size; i++) {
//            for (int j = 0; j < t.size; j++) {
//                if (t.a[i][j] == 0) {
//                    int hori = t.calHorizontalPoint(i, j);
//                    int vert = t.calVerticalPoint(i, j);
//                    int md = t.calMainDiagonalPoint(i, j);
//                    int d = t.calDiagonalPoint(i, j);
//
//                    int max = Math.max(hori, vert);
//                    max = Math.max(md, max);
//                    max = Math.max(d, max);
//
//                    int total = hori + vert + md + d;
//
//                    System.out.print(total + "--");
//                } else {
//                    System.out.print("x--");
//                }
//            }
//            System.out.println();
//        }

         System.out.println(t.calHorizontalPoint(0, 1));
    }
}
