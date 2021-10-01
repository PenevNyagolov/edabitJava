 
public class makeMyWayHome{
    public static void main(String[] args) {
        int[] a = {3, 4, -5, -2};
        System.out.println(distanceHome(a));
    }
  
  public static int distanceHome(int[] dist) {
		int result = 0;
      for(int i = 0;i < dist.length;i++){
      result += dist[i];
      }
      return Math.abs(result);
	}
  
}

//distanceHome([2, 4, 2, 5]) ➞ 13

//distanceHome([-1, -4, -3, -2]) ➞ 10

//distanceHome([3, 4, -5, -2]) ➞ 0