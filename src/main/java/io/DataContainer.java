package io;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataContainer {
    private int intValue;
    private String stringValue;
    private boolean booleanValue;

    public void writeToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("intValue: " + intValue);
            writer.newLine();
            writer.write("stringValue: " + stringValue);
            writer.newLine();
            writer.write("booleanValue: " + booleanValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
