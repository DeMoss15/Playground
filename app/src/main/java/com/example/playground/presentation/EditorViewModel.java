package com.example.playground.presentation;

import androidx.lifecycle.ViewModel;

import com.example.playground.user.impl.PublishArticleUC;

public class EditorViewModel extends ViewModel {

    private PublishArticleUC publishArticleUC;

    public EditorViewModel(PublishArticleUC publishArticleUC) {
        this.publishArticleUC = publishArticleUC;
    }


    /**
     * @return title String from {@link StubData}
     */
    public String getTitle() {
        return "";
    }

    /**
     * publish content from {@link StubData} via {@link #publishArticleUC} with
     */
    public void publishArticle() {

    }

    // TODO create task with modules

}
