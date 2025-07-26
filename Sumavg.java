public class Sumavg{
    public static void main(String args[]){
        int sum1=0;
        float avg1=0;
        for(int i=1;i<=10;i++){
            sum1+=i;
        }
        avg1=sum1/10;
        System.out.println("Average= "+avg1);
        System.out.println("Sum= "+sum1);

    }
}