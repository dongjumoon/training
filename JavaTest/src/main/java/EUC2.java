import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class EUC2 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String str1 = "여기";
        System.out.println(str1);
        EncodingTest utf = new EncodingTest();
        String str2 = utf.utfString(str1.getBytes("iso-8859-1"));
        System.out.println(str2);
    }

    public String euc2String(byte[] str, String string) throws UnsupportedEncodingException {
        System.out.println("string = " + string);
        System.out.println(Arrays.toString(string.getBytes("utf-8")));
        System.out.println("여기 eucString Fun . . = " + new String(str, "euc-kr"));
        System.out.println(Arrays.toString(str) + " = str");
        System.out.println(Arrays.toString("여기".getBytes("iso-8859-1")) + "in funtion 의 여기.");
        return new String(str, "utf-8");
    }
}
