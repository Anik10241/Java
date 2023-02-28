public class Example {
    private int var;

    public Example(){
        this.var=6;
    }

    public Example(int num){
        this.var=num;
    }
    public int getvalue(){
        return var;
    }
    public static void main(String[] args){

        Example obj=new Example(10);
        System.out.println("ver is "+obj.getvalue());
    }
}