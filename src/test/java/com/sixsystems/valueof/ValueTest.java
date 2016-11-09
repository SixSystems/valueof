package com.sixsystems.valueof;

import com.sixsystems.valueof.validator.IntValidator;
import com.sixsystems.valueof.validator.StringValidator;

import org.junit.Assert;
import org.junit.Test;

public class ValueTest {

    @Test
    public void it_should_have_validation_for_int() {
        // given
        int intValue = 1;

        // when
        IntValidator validator = Value.of(intValue);

        // then
        Assert.assertNotNull(validator);
    }

    @Test
    public void it_should_have_validation_for_string() {
        // given
        String stringValue = "string";

        // when
        StringValidator validator = Value.of(stringValue);

        // then
        Assert.assertNotNull(validator);
    }
}