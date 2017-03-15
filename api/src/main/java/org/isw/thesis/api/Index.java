package org.isw.thesis.api;

import org.isw.thesis.core.Measurement;

/**
 * Author MichalS.
 * Mail: michas1991@gmail.com
 */
public class Index {

    private long id;
    private String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int[] getIntArray() {
        Measurement measurement = new Measurement();
        intArray = measurement.performMeasurement(id);
        return intArray;
    }

    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    private int[] intArray;
}
