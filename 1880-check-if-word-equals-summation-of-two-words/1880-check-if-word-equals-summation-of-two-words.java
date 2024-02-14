class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return getValue(firstWord) + getValue(secondWord) == getValue(targetWord);      
    }

    public int getValue(String s)
    {
        int returningInt = 0 ;
        for(char ch : s.toCharArray())
        {
            returningInt = returningInt * 10 + (ch - 'a');
        }
        return returningInt;
    }
}