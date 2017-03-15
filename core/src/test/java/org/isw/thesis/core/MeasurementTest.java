package org.isw.thesis.core;

import org.junit.Assert;
import org.junit.Test;

/**
 * Author MichalS.
 * Mail: michas1991@gmail.com
 */
public class MeasurementTest {

    @Test
    public void performMeasurementTest() {

        //given
        final long arraySize = 5;
        Measurement measurement = new Measurement();

        //when
        int[] actualResult = measurement.performMeasurement(arraySize);

        //then
        Assert.assertNotNull(actualResult[4]);
        Assert.assertTrue(actualResult.length == 5);

    }
}
