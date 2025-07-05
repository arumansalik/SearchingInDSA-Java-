package LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Aruman";
        char target = 'm';
        System.out.println(search(name, target));
        char target1 = 'l';
        System.out.println(search1(name, target1));
    }


    static boolean search(String str, char target) {
        if(str.length() == 0) {
            return false;
        }
        for(int i=0; i<str.length(); i++) {
            if(target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean search1(String str, char target) {
        if(str.length() == 0) {
            return false;
        }
        for(char ch: str.toCharArray()) {
            if(ch == target) {
                return true;
            }
        }
        return false;
    }
}
