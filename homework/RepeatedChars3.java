package com.alexCazares;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Alejandro Cazares
 */
public class RepeatedChars3 {

    public static void main(String...args) {
        //System.out.println(new RepeatedChars3().eval("abcdefghiabcdefghi", "fghi"));
        //System.out.println(new RepeatedChars3().eval("te", "testtesttest"));
        System.out.println(new RepeatedChars3().eval(args[0],args[1]));
    }

    public Set<String> preEval(String a, String b) {
        return a.length() < b.length() ? eval(a, b) : eval(b, a);
    }

    public Set<String> eval(String min, String maj) {
        Set<String> valids = new HashSet<String>();
        for (int i = 0; i < min.length(); i++) {
            if (maj.indexOf(min.charAt(i)) >= 0) {
                valids.add(min.charAt(i) + "");
            }
        }
        return valids;
    }
}
