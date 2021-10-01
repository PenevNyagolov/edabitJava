package opit;

public class hotPicsOfDannyDeVito {
    public static void main(String[] args) {

        System.out.println(preventDistractions("How to ace BC Calculus in 5 Easy Steps"));
    }
    public static String preventDistractions(String args) {

        if (args.contains("anime")){
            return "NO!";
        }else if (args.contains("meme")){
            return "NO!";
        }else if (args.contains("vines")){
            return "NO!";
        }else if (args.contains("roasts")){
            return "NO!";
        }else if (args.contains("Danny DeVito")){
            return "NO!";
        }else{
            return "Safe watching!";
        }
    }
}

//preventDistractions("vines that butter my eggroll") ➞ "NO!"
//preventDistractions("Hot pictures of Danny DeVito") ➞ "NO!"
//preventDistractions("How to ace BC Calculus in 5 Easy Steps") ➞ "Safe watching!"
