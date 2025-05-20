package com.campusdual.classroom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class FreshMerchandiseTest {

    private FreshMerchandise fm;

    @BeforeEach
    void setUp() {
        fm = new FreshMerchandise("Item 1", "001-9", "Big Bussines", 8,
                "C", "114D", 53, new Date(1683194400000L));
    }

    @Test
    @DisplayName("Test if FreshMerchandise expiration date is 04-05-2023")
    void testFormatDate() {
        assertEquals("04-05-2023", this.fm.getFormattedDate(this.fm.getExpirationDate()), "Formatted expiration date is not 04-05-2023");
    }

    @Test
    @DisplayName("Test if FreshMerchandise getSpecificData() contains expiration date 04-05-2023")
    void testGetSpecificData() {
        assertTrue(this.fm.getSpecificData().toString().contains("04-05-2023"), "Specific data String does not contain correct expiration date → 04-05-2023");
    }
}