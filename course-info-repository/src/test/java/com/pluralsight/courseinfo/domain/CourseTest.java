package com.pluralsight.courseinfo.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @ParameterizedTest
    @CsvSource(textBlock = """
            '', '', ''
            null, null, null
            '', null, ''
            """, nullValues = {"null"})
    void testCourseNullEmptyFieldsException(String id, String name, String url) {
        assertThrows(IllegalArgumentException.class, () -> new Course(id, name, 0L, url, Optional.empty()));
    }
}