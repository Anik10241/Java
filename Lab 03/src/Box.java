

public class Box {
    int x;
    int y;
    public Box(int a,int b){
        this.x=a;
        this.y=b;

    }
    public static void main(String[] args){
        Box box=new Box(3,4);
        System.out.println(box.x+" "+box.y);
    }

}