package com.example.Study.blog.repository

import com.example.Study.blog.entity.Wordcount
import org.springframework.data.repository.CrudRepository

interface WordRepository : CrudRepository<Wordcount,String>