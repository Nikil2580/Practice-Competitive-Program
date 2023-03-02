package Day4.CheckAnagram;
public class IsAnagram {
    public boolean check(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        int[] hash = new int[256];
        for(int i = 0; i < str1.length(); i++){
            hash[str1.charAt(i)]++;
            hash[str2.charAt(i)]--;
        }
        for(int i : hash){
            if(i != 0) return false;
        }
        return true;
    }
}
