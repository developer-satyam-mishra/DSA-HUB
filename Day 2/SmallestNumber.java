class SmallestNumber{
    public static void main(String args[]){
        int a=74,b=87,c=258;
        if(a<b && a<c){
            System.out.print("a is smallest number");
        }
        else if(b<a && b<c){
            System.out.print("b is smallest  number");
        }
        else{
            System.out.print("c is smallest number");
        }
    }
}