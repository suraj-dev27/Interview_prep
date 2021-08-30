class Solution {
    public static int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        if(needleLength > haystackLength){
            return -1;
        }else{
        for(int i=0; i<=haystackLength-needleLength; i++){
            int j;
            for(j=0; j<needleLength; j++){
                if(haystack.charAt(i+j)!=needle.charAt(j))
                    break;
            }
            if(j==needleLength){
                return i;
            }
        }
        return -1;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(strStr("hello", "ll"));

	}

}
