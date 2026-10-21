class Longest_Palindrome {

    static void longestpalindrome(String str)
    {
        String ans = "";

        for(int k = 0; k < str.length(); k++)
        {
            int i = k;
            int j = k;

            // same two pointer logic
            while(i >= 0 && j < str.length()
                    && str.charAt(i) == str.charAt(j))
            {
                // longest palindrome store
                if((j - i + 1) > ans.length())
                {
                    ans = str.substring(i, j + 1);
				
                }

                i--;
                j++;
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args)
    {
        String str = "babad";

        longestpalindrome(str);
    }
}