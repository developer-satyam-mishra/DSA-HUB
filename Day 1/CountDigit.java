class CountDigit{
    public static void main(String args[]){
        int number=84594;
        int temp=number;
        int count=0;
        while(temp!=0){
            int rem=temp%10;
            count++;
            temp=temp/10;
        }
        System.out.print("Number of digits is " +count);
    }
}