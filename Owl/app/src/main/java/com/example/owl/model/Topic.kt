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
data class Topic(
    val name: String,
    val courses: Int,
    val imageUrl: String
)

val topics = listOf(
    Topic("Cats", 9 ,  "https://media.giphy.com/media/g7YDlrD5YLqfe/giphy.gif"),
    Topic("Dogs" , 7 , "https://media.giphy.com/media/rD8R00QOKwfxC/giphy.gif")
)
