import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class EncodingTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        String str = "문자열";
//        try {
//            String crac = new String(str.getBytes("UTF-8"), "ISO-8859-1");
//            System.out.println(crac);
//            System.out.println(new String(crac.getBytes("ISO-8859-1"), "UTF-8"));
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        String str1 = "여기";
//        System.out.println(Arrays.toString(str1.getBytes("utf-8")));
//            System.out.println(new String(str1.getBytes("iso-8859-1"), "utf-8"));
//        EUC euc = new EUC();
//        String str2 = euc.eucString(str1.getBytes("iso-8859-1"));
//        System.out.println(str2);
        String str1 = "여기";
        System.out.println(str1);
        System.out.println(Arrays.toString(str1.getBytes("utf-8")));
        System.out.println(new String(str1.getBytes("iso-8859-1"), "utf-8"));
        Utf2 euc = new Utf2();
        String str2 = euc.eucString(str1.getBytes("iso-8859-1"));
        System.out.println(str2);
    }

    public String utfString(byte[] str) {
        String ss = new String(str);
        System.out.println("여기 utfString Fun . . = " + ss);
        return ss;
    }
}
