package day20.api.lang.str;

import java.util.Locale;

public class StrEx {

    public static void main(String[] args) {

        String str = "Hello! java";

        //str.value[0]처럼 해당인덱스에 접근하고 싶을 때(이 방식은 안되서 밑에 처럼 써야함)
        //char At(index): 문자열 인덱스에 따른 글자 반환
        char c = str.charAt(7);
        System.out.println("c = " + c);

        //subString(): 문자열의 특정 범위를 추출
        //뭘 넣어야 할 지 모르겠으면 해당 코드에서 ctrl P 하면 뜬다

        //n 번부터 끝까지 추출
        String ss1 = str.substring(4);
        System.out.println("ss1 = " + ss1);

        //n 번부터 n2 번 미만
        String ss2 = str.substring(0, 5);
        System.out.println("ss2 = " + ss2);

        //length() : 문자열의 총 길이 반환
        int len = str.length();
        System.out.println("len = " + len);

        //indexOf(), lastIndexOf(): 특정 문자나 단어의 첫글자 인덱스 반환환
        int first = str.indexOf("l");
        int last = str.lastIndexOf("l");

        System.out.println("first = " + first);
        System.out.println("last = " + last);

        //찾는 단어가 포함되어있다면 첫글자 인덱스, 없으면 -1 반환
        int java = str.indexOf("java");
        System.out.println("'j'ava = " + java);

        //일괄 대소문자 변환
        String str2 = "HeLLo PoRORo";
        System.out.println(str2.toLowerCase());
        System.out.println(str2.toUpperCase());


        //# 이런건 언제 쓰는건데? - 실제 업무에서 쓰는것 중 예시
        //파일 경로에서 확장자를 추출하는 경우
        String filePath = "C:/local/img/2021/09./17/야야호호호.gif";
        String filePath2 = "C:/local/img/2021/09./17/한글파일.HWP";
        //확장자는 항상 . 뒤에 나오니까 마지막 . 의 인덱스를 알아온 후 + 1 하면 g가 나온다.
        System.out.println(filePath + "에서 확장자명 찾기");
        String ext = filePath.substring(filePath.lastIndexOf(".") + 1);
        String ext2 = filePath2.substring(filePath2.lastIndexOf(".") + 1);

        System.out.println("ext = "+ ext);
        System.out.println("ext2 = "+ ext2);

        switch (ext.toUpperCase()) {
            case "JPG" : case "GIF" : case "PNG":
                System.out.println("이미지파일");
                break;
            default:
                System.out.println("기타파일");
        }

        switch (ext2.toUpperCase()) {
            case "JPG" : case "GIF" : case "PNG":
                System.out.println("이미지파일");
                break;
            default:
                System.out.println("기타파일");
        }

        //replace(old, new): 문자열 내부에 old 문자를 찾아서 new 문자로 변경
        String msg = "java study, java program, java coffee";
        System.out.println(msg.replace("java", "자바"));
        System.out.println(msg.replace("java", ""));//빈문자열 입력 => 찾아서 지워라

        //예시 중 일부 : msg.replace("\n", "<br>");

        //




    }}
