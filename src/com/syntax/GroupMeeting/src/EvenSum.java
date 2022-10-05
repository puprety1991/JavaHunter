public class EvenSum {//if we put 5--2+4 =6
    int sumEven(int num){///int type behavior
        int sum = 0;
        for(int i=2; i<=num;i++){
            if(i%2==0){
                sum+=i;
            }
    //sum+=i --> sum = sum+i -->0+2-->2+4--6
        }
        return sum;
    }
    public static void main(String[] args){
        EvenSum calculate = new EvenSum();
        int totalSum = calculate.sumEven(5);
        System.out.println(totalSum);
    }
}
