package com.example.Study.blog.dto

import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue

class BlogDto(
    val query: String,
    val sort: String,
    val page: Int,
    val size: Int
)