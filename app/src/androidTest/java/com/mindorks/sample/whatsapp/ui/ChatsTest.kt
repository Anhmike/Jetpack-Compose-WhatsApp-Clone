package com.mindorks.sample.whatsapp.ui

import androidx.ui.test.assertIsDisplayed
import androidx.ui.test.createComposeRule
import androidx.ui.test.findByText
import com.mindorks.sample.whatsapp.launchChats
import com.mindorks.sample.whatsapp.model.UserChat
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ChatsTest {
    @get:Rule
    val composeTestRule = createComposeRule()

   private val userChat = UserChat(1, "Himanshu")

    @Before
    fun setUp() {
        composeTestRule.launchChats(userChat)
    }

    @Test
    fun check_if_text_displayed() {
        findByText("Himanshu", true).assertIsDisplayed()
    }
}
