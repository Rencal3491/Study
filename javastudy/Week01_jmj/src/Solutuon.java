public  class  Solutuon {
    public static int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag==true){
            answer = a+b;
            System.out.println(answer);
        }else {
            answer = a-b;
            System.out.println(answer);
        }return answer;
    }

    public static void main(String[] args) {
        solution(1,2,true);
    }
}