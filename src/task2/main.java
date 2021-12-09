package task2;

import java.io.IOException;

public class main {
    public static void main(final String[] args) {
        try(final resource file = new resource("resource")){
            System.out.println(file);
            file.read();
        }catch (IOException e){
            System.err.println("Can't read file");
        }
    }
}
