package ex06;
// 구구단을 출력하는 프로그램을 중첩 for문을 이용하여 작성하세요.
public class hw_3 {
    public static void main(String[] args) {
        for(int i=2;i<10;i++){
            for(int j=1;j<10;j++){
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }
}