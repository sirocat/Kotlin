package com.example.Study.blog.service

import com.example.Study.blog.dto.BlogDto
import org.springframework.stereotype.Service

@Service
class BlogService {
    fun searchKaKao(blogDto: BlogDto): String?{
        println(blogDto.toString())
        return "SearchKaKao"
    }
}