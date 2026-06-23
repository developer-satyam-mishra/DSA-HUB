class Reverse{
    public static void main(String []args){
        int number=84594;
        int temp=number;
        int sum=0;
        while(temp!=0){
            int rem=temp%10;
            sum=sum*10+rem;
            temp=temp/10;
        }
        System.out.print("Reverse of the number is " +sum);
    }
}