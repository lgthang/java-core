package lecture3;

public class example {
    public static void main(String[] args) {
        int myArray[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        /*for (int i = 0; i < myArray.length; i++) {
            System.out.printf("\nmyArray[%d] = %d", i, myArray[i]);
        }*/
        //System.out.println(myArray[2]);
        // chuổi từ mảng char
        /*String s = new String(new char[]{'L','ê','G','i','A','T','h','ắ','n','g'});
        System.out.println(s);*/
        //độ dài của chuỗi
        /*String s = "Lê Gia Thắng";
        int length = s.length();
        System.out.println(length);*/
        // hàm charAt(int inex) : chả về kí từ của chuỗi
        String s = "Lê Gia Thắng";
        String s1 = "chinhlaanhnhe";
        String s2 = "chinhlaanhnhe";
        String s4 = "Chinhlaanhnhe";
       /* char c = s.charAt(5);
        System.out.println(c);*/
        // boolean endswith(String suffix) : Kiểm tra xem chuỗi kết thúc bằng hậu tố hay ko
        /*boolean flag = s.endsWith("Thắng");
        System.out.println(flag);8*/
        //boolean equals(Object anObject); so sánh hai chuỗi
        /*if(s1.equals(s2)){
            System.out.println("OK");
        }else {
            System.out.println("Not OK");
        }*/
        //boolean equals(Object anObject); so sanh chữ in hoa in thường
        /*boolean glang = "Chinhlaanhnhe".equalsIgnoreCase("chinhlaanhnhe");
        System.out.println(glang);*/
            String s7 = "hello";
            char[] ch = s7.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                System.out.print(ch[i]);
            }
        }
    }


