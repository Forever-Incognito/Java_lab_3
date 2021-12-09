package task2;

import java.io.Closeable;
import java.io.IOException;
import java.util.Objects;

public class resource implements Closeable {
    private String nameOfFile;

    //Constructor
    public resource(final String nameOfFile) {
        this.nameOfFile = nameOfFile;
    }

    //Getter
    public String getNameOfFile() {
        return nameOfFile;
    }

    //Setter
    public void setNameOfFile(final String nameOfFile) {
        this.nameOfFile = nameOfFile;
    }

    @Override
    public void close(){
        System.out.println("Resource is closed");
    }

    public void read() throws IOException{
        throw new IOException();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final resource resource = (resource) o;
        return Objects.equals(nameOfFile, resource.nameOfFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfFile);
    }

    @Override
    public String toString() {
        return "Name of file: " + nameOfFile;
    }
}