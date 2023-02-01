package org;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        String[] names = new String[5];

        Optional<String> checkNull = Optional.ofNullable(names[3]);
        if (checkNull.isPresent()) {
            String x = names[3].toLowerCase();
            System.out.println(x);
        } else {
            System.out.println("The value is not present");
        }
    }
}
