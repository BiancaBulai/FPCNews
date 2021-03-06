package com.frontpagenews.services;

import com.frontpagenews.models.ArticleModel;

import java.util.List;

public interface ArticleService extends CrudService<ArticleModel>{
    public ArticleModel getOneByTag(String tag);
    public List<String> getDistinctTags();
    public List<String> getDistinctLanguages();
    public List<ArticleModel> getByTagIn(List<String> tags);
    public List<ArticleModel> getAllSorted(String language);
    public ArticleModel getByTitle(String title);
    public List<ArticleModel> getByTagInSorted(List<String> tags, String language);
}
