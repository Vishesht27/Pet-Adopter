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

@Immutable // Tell Compose runtime that this object will not change so it can perform optimizations
data class Course(
    val id: Long,
    val name: String,
    val subject: String,
    val thumbUrl: String,
    val thumbContentDesc: String,
    val description: String = "",
    val steps: Int,
    val step: Int,
    val instructor: String = "https://i.pravatar.cc/112?$id"
)

/**
 * A fake repo
 */
object CourseRepo {
    fun getCourse(courseId: Long): Course = courses.find { it.id == courseId }!!
    fun getRelated(@Suppress("UNUSED_PARAMETER") courseId: Long): List<Course> = courses
}

val courses = listOf(
    Course(
        id = 0,
        name = "Oliver",
        subject = "kitten",
        thumbUrl = "https://cutt.ly/ZlDQFjI",
        thumbContentDesc = "",
        steps = 7,
        step = 1
    ),
    Course(
        id = 0,
        name = "Leo",
        subject = "kitten",
        thumbUrl = "https://cutt.ly/nlDUpGo",
        thumbContentDesc = "",
        steps = 7,
        step = 1
    ),
    Course(
        id = 0,
        name = "Milo",
        subject = "kitten",
        thumbUrl = "https://cutt.ly/glDAer9",
        thumbContentDesc = "",
        steps = 7,
        step = 1
    ),
    Course(
        id = 0,
        name = "Charlie",
        subject = "kitten",
        thumbUrl = "https://cutt.ly/2lDAsf0",
        thumbContentDesc = "",
        steps = 7,
        step = 1
    ),
    Course(
        id = 0,
        name = "Simba",
        subject = "kitten",
        thumbUrl = "https://cutt.ly/elDAlce",
        thumbContentDesc = "",
        steps = 7,
        step = 1
    ),
    Course(
        id = 0,
        name = "Max",
        subject = "kitten",
        thumbUrl = "https://cutt.ly/MlDAEnw",
        thumbContentDesc = "",
        steps = 7,
        step = 1
    ),
    Course(
        id = 0,
        name = "Jack",
        subject = "kitten",
        thumbUrl = "https://cutt.ly/elDAA9g",
        thumbContentDesc = "",
        steps = 7,
        step = 1
    ),
    Course(
        id = 0,
        name = "Tiger",
        subject = "kitten",
        thumbUrl = "https://cutt.ly/ElDACg6",
        thumbContentDesc = "",
        steps = 7,
        step = 1
    ),
    Course(
        id = 0,
        name = "Jasper",
        subject = "kitten",
        thumbUrl = "https://cutt.ly/xlDA2A2",
        thumbContentDesc = "",
        steps = 7,
        step = 1
    ),
    Course(
        id = 0,
        name = "Oscar",
        subject = "kitten",
        thumbUrl = "https://cutt.ly/MlDSeAy",
        thumbContentDesc = "",
        steps = 7,
        step = 1
    ),
    Course(
        id = 0,
        name = "Ollie",
        subject = "kitten",
        thumbUrl = "https://cutt.ly/ylDSaTn",
        thumbContentDesc = "",
        steps = 7,
        step = 1
    ),
    Course(
        id = 0,
        name = "Ace",
        subject = "kitten",
        thumbUrl = "https://cutt.ly/ilDKVnm",
        thumbContentDesc = "",
        steps = 7,
        step = 1
    ),
    Course(
        id = 0,
        name = "Apollo",
        subject = "puppy",
        thumbUrl = "https://cutt.ly/DlDHbYC",
        thumbContentDesc = "",
        steps = 7,
        step = 1
    ),
    Course(
        id = 0,
        name = "Bailey",
        subject = "puppy",
        thumbUrl = "https://cutt.ly/8lDHOfP",
        thumbContentDesc = "",
        steps = 7,
        step = 1
    ),
    Course(
        id = 0,
        name = "Bandit",
        subject = "puppy",
        thumbUrl = "https://cutt.ly/klDHHHd",
        thumbContentDesc = "",
        steps = 7,
        step = 1
    ),
    Course(
        id = 0,
        name = "Bear",
        subject = "puppy",
        thumbUrl = "https://cutt.ly/2lDHMNm",
        thumbContentDesc = "",
        steps = 7,
        step = 1
    ),
    Course(
        id = 0,
        name = "Blue",
        subject = "puppy",
        thumbUrl = "https://cutt.ly/klDJux0",
        thumbContentDesc = "",
        steps = 7,
        step = 1
    ),
    Course(
        id = 0,
        name = "Romeo",
        subject = "puppy",
        thumbUrl = "https://cutt.ly/llDJTxK",
        thumbContentDesc = "",
        steps = 7,
        step = 1
    ),
    Course(
        id = 0,
        name = "Rocky",
        subject = "puppy",
        thumbUrl = "https://cutt.ly/qlDKopd",
        thumbContentDesc = "",
        steps = 7,
        step = 1
    ),
    Course(
        id = 0,
        name = "Hank",
        subject = "puppy",
        thumbUrl = "https://cutt.ly/alDKgTT",
        thumbContentDesc = "",
        steps = 7,
        step = 1
    ),
    Course(
        id = 0,
        name = "Henry",
        subject = "puppy",
        thumbUrl = "https://cutt.ly/9lDKvnT",
        thumbContentDesc = "",
        steps = 7,
        step = 1
    )
)
