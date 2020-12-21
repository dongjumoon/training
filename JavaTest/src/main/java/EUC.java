import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class EUC {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String str1 = "여기";
        System.out.println(str1);
        System.out.println(str1.toUpperCase());

        System.out.println(new String(str1.getBytes("euc-kr"), "utf-8"));

        byte[] bytes = new byte[6];
        bytes[0] = -20;
        bytes[1] = -107;
        bytes[2] = -120;
        bytes[3] = -21;
        bytes[4] = -123;
        bytes[5] = -107;

        System.out.println(Arrays.toString(str1.getBytes("euc-kr")));
        EUC2 utf = new EUC2();
        String str2 = utf.euc2String(str1.getBytes("euc-kr"), str1);
        System.out.println(str2);
    }

    public String eucString(byte[] str) throws UnsupportedEncodingException {
        System.out.println("여기 eucString Fun . . = " + new String(str, "euc-kr"));
        System.out.println(Arrays.toString(str) + " = str");
        System.out.println(Arrays.toString("여기".getBytes("iso-8859-1")) + "in funtion 의 여기.");
        return new String(str);
    }
}
