public class owofiedAsentence {
    public static void main(String[] args) {
        
        System.out.println(owofied("I'm gonna ride 'til I can't no more"));
    }
   public static String owofied(String sentence) {
		String a = sentence.replace("i","wi");
      return a.replace("e","we") + " owo";
	}
   
}

//owofied("I'm gonna ride 'til I can't no more")
//➞ "I'm gonna rwidwe 'twil I can't no morwe owo"

//owofied("Do you ever feel like a plastic bag")
//➞ "Do you wevwer fwewel lwikwe a plastwic bag owo"

//owofied("Cause baby you're a firework")
//➞ "Causwe baby you'rwe a fwirwework owo"