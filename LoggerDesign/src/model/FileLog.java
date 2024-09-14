package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLog implements Log {
    private String filePath;


    public FileLog(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void debug(String message) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(this.filePath));
            writer.println(message);
        } catch (IOException exception) {

        }
    }

    @Override
    public void warn(String message) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(this.filePath));
            writer.println(message);
        } catch (IOException exception) {

        }
    }

    @Override
    public void trace(String message) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(this.filePath));
            writer.println(message);
        } catch (IOException exception) {

        }
    }

    @Override
    public void info(String message) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(this.filePath));
            writer.println(message);
        } catch (IOException exception) {

        }
    }

    @Override
    public void error(String message) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(this.filePath));
            writer.println(message);
        } catch (IOException exception) {

        }
    }
}
