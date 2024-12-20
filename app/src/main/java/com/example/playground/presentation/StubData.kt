package com.example.playground.presentation

import com.example.playground.articles.api.model.ArticleContent

const val EDITOR_SCREEN_TITLE = "Create your title"

class StubData {

    companion object {
        val articleContent = com.example.playground.articles.api.model.ArticleContent(
            title = "Lorem Ipsum",
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse aliquam arcu id diam dictum malesuada. Donec vel augue elit. Fusce at lorem ac quam convallis fermentum. Sed mauris ligula, tincidunt quis placerat nec, pulvinar ut felis. Aenean posuere erat luctus, ultrices quam a, iaculis ligula. Ut rutrum vehicula ante non sollicitudin. Sed fringilla vehicula purus, eget laoreet nulla egestas a. Nam a facilisis ligula, in sodales felis. Morbi et dolor lacus. Suspendisse sit amet scelerisque arcu. Vestibulum non ex eu mi convallis rutrum.",
            illustrationLink = null
        )
    }

}