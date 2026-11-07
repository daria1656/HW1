import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if (array.length == 0) {
            return array;
    }
    if (move < 0) {
        move = -move;
        if (direction == 'L' || direction == 'l') {
            direction = 'R';
        } else if (direction == 'R' || direction == 'r') {
            direction = 'L';
        }
    }
    if (direction != 'L' && direction != 'R') {
        return array;
    }
    int n = array.length;
    move = move % n; // Normalize move to be within the array length
    if (move == 0) {
        return array; // No shift needed
    }
    int[] result = new int[n];
    for (int i = 0; i < n; i++) {
        if (direction == 'L') {
            result[i] = array[(i + move) % n];
        } else { // direction == 'R'
            result[i] = array[(i - move + n) % n];
        }
    }
    for(int i=0; i<n; i++){
        array[i] = result[i];
    }
    return array;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}