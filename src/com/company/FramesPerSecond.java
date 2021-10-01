package opit;

public class FramesPerSecond {

	public static void main(String[] args) {
		
		System.out.println(frames(10, 25));

	}

	public static int frames(int min, int fps) {
       
		if (fps == 1) {
			return min * 60;
		}else {
			int number = (min * 60) * fps;
			return number;
		}
	}
}
