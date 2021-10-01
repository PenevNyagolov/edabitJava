public class countSyllables {
    public static void main(String[] args) {
        System.out.println(numberSyllables("beau-ti-ful"));
    }
 	public static int numberSyllables(String word) {
		String[] str = word.split("-");
      int a = 0;
      for(int i = 0;i <= str.length;i++){
            a = i;
      }
      return a;
	}
}
//numberSyllables("buf-fet") ➞ 2
//numberSyllables("beau-ti-ful") ➞ 3
//numberSyllables("mon-u-men-tal") ➞ 4
//numberSyllables("on-o-mat-o-poe-ia") ➞ 6