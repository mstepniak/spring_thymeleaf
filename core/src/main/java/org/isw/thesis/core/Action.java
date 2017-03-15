package org.isw.thesis.core;

import org.springframework.stereotype.Component;

/**
 * Author MichalS.
 * Mail: michas1991@gmail.com
 */
@Component
public class Action {

    private void initAction() {
        System.out.println("action initiated!");
    }

    public int getResult() {
        result = 7;
        return result;
    }

    private int result;
}
