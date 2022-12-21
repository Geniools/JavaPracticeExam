package core;

import core.Article;

import java.util.HashMap;
import java.util.HashSet;

public class Intratuin {
	private HashSet<Article> articles;

	public Intratuin(){
		this.articles = new HashSet<>();
	}

	public HashSet<Article> getArticles() {
		return this.articles;
	}

	public void addArticle(Article article){
		this.articles.add(article);
	}

	public HashMap<String, Double> getArticlesDetails(){
		return null;
	}
}
