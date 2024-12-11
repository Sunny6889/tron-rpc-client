package org.example.common.utils;

import org.apache.commons.lang3.StringUtils;
import org.example.common.crypto.Sha256Sm3Hash;

public class Utils {
    public static byte[] decodeFromBase58Check(String addressBase58) {
        if (StringUtils.isEmpty(addressBase58)) {
            System.out.println("Warning: Address is empty !!");
            return null;
        }

        return decode58Check(addressBase58);
    }

    private static byte[] decode58Check(String input) {
        byte[] decodeCheck = Base58.decode(input);
        if (decodeCheck.length <= 4) {
            return null;
        }
        byte[] decodeData = new byte[decodeCheck.length - 4];
        System.arraycopy(decodeCheck, 0, decodeData, 0, decodeData.length);
        byte[] hash0 = Sha256Sm3Hash.hash(decodeData);
        byte[] hash1 = Sha256Sm3Hash.hash(hash0);
        if (hash1[0] == decodeCheck[decodeData.length]
                && hash1[1] == decodeCheck[decodeData.length + 1]
                && hash1[2] == decodeCheck[decodeData.length + 2]
                && hash1[3] == decodeCheck[decodeData.length + 3]) {
            return decodeData;
        }
        return null;
    }
}
