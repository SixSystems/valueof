package com.sixsystems.valueof.validator;

import com.sixsystems.valueof.Value;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringValidatorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void it_should_success_passes_startsWith() {
        // given
        String value = "SomeString";

        // when
        Value.of(value).should.startsWith("Some");

        // then
        Assert.assertTrue(true);
    }

    @Test
    @Ignore
    public void it_should_fails_on_startsWith() {
        // given
        String value = "SomeString";
        String diffValue = "Different";

        // expect
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("String [" + value + "] doesn't starts with [" + diffValue + "]");

        // when
        Value.of(value).should.startsWith(diffValue);
    }

    @Test
    public void it_should_success_passes_lengthBetween() {
        // given
        String value = "SomeString";

        // when
        Value.of(value).should.lengthBetween(1, 5);

        // then
        Assert.assertTrue(true);
    }

    @Test
    public void it_should_success_passes_length() {
        // given
        String value = "SomeString";

        // when
        Value.of(value).should.have.length(5);

        // then
        Assert.assertTrue(true);
    }
}