package birds;

import java.util.Arrays;
import java.util.List;

abstract class WaterFowl extends NearWaterBirds {
    protected String[] specific_c;
    private static String[] SHARED_C = {""};
    private static List<String> valid = Arrays.asList("freshwater", "saltwater");

    public WaterFowl(String nameOfWaterBody) {
        if (!valid.contains(nameOfWaterBody)) {
            throw new IllegalArgumentException("This is not a waterfowl!");
        }
    }

    @Override
    public String[] getCharacteristic() {
        int specificLen = specific_c.length;
        int sharedLen = SHARED_C.length;
        String[] added_c = new String[specificLen + sharedLen];

        System.arraycopy(SHARED_C, 0, added_c, 0, sharedLen);
        System.arraycopy(specific_c, 0, added_c, sharedLen, specificLen + sharedLen);
        return added_c;
    }
}
