package opit;

public class volumeOfABox {
    public static void main(String[] args) {
int[]sizes = {2,5,1};
        System.out.println(volumeOfBox(sizes));
    }
    public static int volumeOfBox(int[] sizes) {

        int volume = 0;
        for (int i = 0; i < sizes.length; i++) {
            volume = sizes[0] * sizes[1] * sizes[2];
        }
        return volume;
    }
}

//volumeOfBox({ width: 2, length: 5, height: 1 }) ➞ 10
//volumeOfBox({ width: 4, length: 2, height: 2 }) ➞ 16
//volumeOfBox({ width: 1, length: 2, height: 3 }) ➞ 6
