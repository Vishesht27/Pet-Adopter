/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.owl.model

import androidx.compose.runtime.Immutable

@Immutable
data class Lesson(
    val title: String,
    val formattedStepNumber: String,
    val length: String,
    val imageUrl: String,
    val imageContentDescription: String = ""
)

/**
 * A fake repo
 */
object LessonsRepo {
    fun getLessons(@Suppress("UNUSED_PARAMETER") courseId: Long) = lessons
}

val lessons = listOf(
    Lesson(
        title = "How to take care of kittens",
        formattedStepNumber = "01",
        length = "5:50",
        imageUrl = "https://cdn.pixabay.com/photo/2017/07/25/01/22/cat-2536662_1280.jpg"
    ),
    Lesson(
        title = "How to take care of Puppies",
        formattedStepNumber = "02",
        length = "6:19",
        imageUrl = "https://cdn.pixabay.com/photo/2016/01/05/17/51/maltese-1123016__480.jpg"
    )
)
