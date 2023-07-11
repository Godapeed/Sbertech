package reflection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataContainer {
    private int intValue;
    private String stringValue;
    private boolean booleanValue;
}
