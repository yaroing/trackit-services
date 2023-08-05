package com.yarolab.transfertservice.repositories;

import com.yarolab.transfertservice.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long>{
}
