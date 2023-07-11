public class Computer {
    int storage;
    String printer = null;
    public Computer(int storage,String printer){
        this.storage = storage;
        this.printer = printer;
    }
    public int getStorage(){
        return this.storage;
    }
    public void setPrinter(String updatedPrinter) {
        this.printer = updatedPrinter;
    }
    public String getPrinter(){
        return this.printer;
    }
    public void printMessage(String message){
        if(printer != null){
            System.out.println(message);
        }
    }
}
