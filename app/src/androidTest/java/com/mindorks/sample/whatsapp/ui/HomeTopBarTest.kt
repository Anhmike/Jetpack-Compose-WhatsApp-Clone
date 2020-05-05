package com.mindorks.sample.whatsapp.ui

import androidx.ui.test.assertIsDisplayed
import androidx.ui.test.createComposeRule
import androidx.ui.test.findByText
import com.mindorks.sample.whatsapp.launchHomeTopAppBar
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
class HomeTopBarTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setUp() {
        composeTestRule.launchHomeTopAppBar()
    }

    @Test
    fun check_if_text_displayed() {
        findByText("WhatsApp", true).assertIsDisplayed()
    }
}
