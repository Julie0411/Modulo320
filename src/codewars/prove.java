package codewars;

public class prove {

    class Solution {
        public static String whoLikesIt(String... names) {
            String result = "";
            if (names == null) {
                result = "no one ";
            } else if (names.length <= 3) {
                for (String name : names) {
                    result += name + " ";
                }
            } else {
                int likes = 0;
                for (int i = 0; i < names.length; i++) {
                    for (int j = 0; j < 2; j++) {
                        result += names[j] + " ";
                    }
                    likes = i;
                }
                result += "and " + likes + " ";
            }
            return result + "like this";
        }
    }

}
