public class Rectangle {
    int length;
    int width;
    boolean result;


    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int area(int length,int width){
        return length*width;
    }

    public boolean squareCheck(int length,int width){
        if(length == width){
            result = true;
        } else {
            result = false;
        }
        return result;
    }

}
