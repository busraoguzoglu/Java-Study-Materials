import java.util.ArrayList;

public class ArrayListFromString {

    public static void main(String[] args){

        String str = "iamthebestthereeverwas";
        int length = str.length();
        int totSum = 0;

        ArrayList<String> result = new ArrayList<>();

        for(int i = 0; totSum < length ; i++){
            totSum += i;
            String substring = "";
            try {
                substring = str.substring(0, i);
                str = str.substring(i);
            }
            catch (Exception e) {
                substring = str;
            }
            result.add(substring);
        }

        System.out.println(result);
    }
}
