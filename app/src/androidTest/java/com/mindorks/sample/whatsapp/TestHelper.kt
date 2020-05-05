package com.mindorks.sample.whatsapp

import androidx.ui.test.ComposeTestRule
import com.mindorks.sample.whatsapp.model.UserChat
import com.mindorks.sample.whatsapp.screen.chat.Chats
import com.mindorks.sample.whatsapp.screen.main.HomeTopBar

fun ComposeTestRule.launchHomeTopAppBar() {
    setContent {
        HomeTopBar()
    }
}

fun ComposeTestRule.launchChats(chat: UserChat) {
    setContent {
        Chats(chat)
    }
}
