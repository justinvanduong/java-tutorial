package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Justin on 2/15/2018
 */
public class FileStuff {
    // Property declaration
    File file;

    public FileStuff(String filename) throws IOException {
        // super(); Calls constructor of parent of class, only used when extending
        this.file = new File(filename);
        this.file.createNewFile();
    }

    /**
     * ^
     * /|\
     * /|\
     */

    public void writeTree() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(this.file.getName()));
        writer.write("   *   \n");
        writer.write("  ***  \n");
        writer.write(" ***** \n");
        writer.write("*******\n");
        writer.write(" ***** \n");
        writer.write("  ***  \n");
        writer.write("   *   \n");
        writer.flush();
    }
}