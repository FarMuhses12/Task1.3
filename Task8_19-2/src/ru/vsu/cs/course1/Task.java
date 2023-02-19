package ru.vsu.cs.course1;

public class Task {

    public static int[][] Process(int[][] matrix) {
        int[][] newArray = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newArray[j][i] = matrix[i][j];
            }
        }return newArray;
    }

}