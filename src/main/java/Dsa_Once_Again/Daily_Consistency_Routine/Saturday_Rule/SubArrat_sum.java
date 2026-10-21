import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        // Key  -> Sorted String
        // Value -> List of original strings
        HashMap<String, List<String>> map = new HashMap<>();

        // Traverse every string
        for (String word : strs) {

            // Convert string into character array
            char[] arr = word.toCharArray();

            // Sort the character array
            Arrays.sort(arr);

            // Convert sorted character array back to String
            String key = new String(arr);

            // If key is not present, create a new empty list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add the original word into its anagram group
            map.get(key).add(word);
        }

        // Convert all map values into List<List<String>>
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> ans = groupAnagrams(strs);

        System.out.println(ans);
    }
}