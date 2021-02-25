/*
 * Copyright 2021 The Android Open Source Project
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
package com.example.androiddevchallenge.data

import androidx.annotation.DrawableRes
import com.example.androiddevchallenge.R

data class Doggo(
    val id: Int,
    val name: String,
    val breed: String,
    val gender: String,
    val age: String,
    val description: String,
    val origin: String,
    @DrawableRes
    val originFlag: Int,
    val lifeSpan: String,
    @DrawableRes
    val image: Int,
    @DrawableRes
    val bigImage: Int,
)

val doggos = listOf<Doggo>(
    Doggo(
        id = 0,
        "Max",
        "Shiba Inu",
        "Male",
        "5",
        "The Shiba Inu (柴犬, Japanese: [ɕiba inɯ]) is a breed of hunting dog from Japan. A small-to-medium breed, it is the smallest of the six original and distinct spitz breeds of dog native to Japan.A small, alert and agile dog that copes very well with mountainous terrain and hiking trails, the Shiba Inu was originally bred for hunting.It looks similar to and is often mistaken for other Japanese dog breeds such as the Akita Inu or Hokkaido, but the Shiba Inu is a different breed with a distinct blood line, temperament, and smaller size than other Japanese dog breeds. The Shiba is double coated, with the outer coat being stiff and straight and the undercoat soft and thick. Fur is short and even on the fox-like face, ears, and legs. Guard hairs stand off the body and are about 4 to 5 cm (1 1⁄2 to 2 in) long at the withers. The purpose of the guard hairs is to protect their underlying skin and to repel rain or snow. Tail hair is slightly longer and stands open in a brush. Their tails are a defining characteristic and makes them stand apart from other dog breeds. Their tails help to protect them from the harsh winter weather. When they sleep, Shiba Inus curl up and use their tails to shield their face and nose in order to protect their sensitive areas from the cold.The Shiba is a relatively fastidious breed and feels the need to maintain itself in a clean state. They can often be seen licking their paws and legs, much as cats do. They generally go out of their way to keep their coats clean. Because of their fastidious and proud nature, Shiba puppies are easy to housebreak and in many cases will housebreak themselves. Having their owner simply place them outside after meal times and naps is generally enough to teach the Shiba the appropriate method of toileting.",
        "Japan",
        R.drawable.japan,
        "13–15 years",
        R.drawable.shiba,
        R.drawable.shiba_big,
    ),
    Doggo(
        id = 1,
        "Oscar",
        "Dalmation",
        "Male",
        "4",
        "The Dalmatian is a breed of large-sized dog,noted for its unique white coat marked with black or liver-colored spots. Originating as a hunting dog,[3] it was also used as a carriage dog in its early days. The origins of this breed can be traced back to Croatia and its historical region of Dalmatia.[4][5][6] It is thought that early ancestors of the breed were certain breeds of pointers and a spotted Great Dane. Today, it is a popular family pet and many dog enthusiasts enter Dalmatians into kennel club competitions. ",
        "Croatia",
        R.drawable.croatia,
        "10 – 13 years",
        R.drawable.dalmation,
        R.drawable.dalmatian_big,
    ),
    Doggo(
        id = 2,
        "Bella",
        "Golden Retriever",
        "Female",
        "8",
        "The Golden Retriever is a medium-large gun dog that was bred to retrieve shot waterfowl, such as ducks and upland game birds, during hunting and shooting parties. The name retriever refers to the breed's ability to retrieve shot game undamaged due to their soft mouth.  The breed's friendly, tolerant attitude makes them great family pets, and their intelligence makes them highly capable working dogs.",
        "United Kingdom",
        R.drawable.united_kingdom,
        "10 – 12 years",
        R.drawable.golden,
        R.drawable.golden_big,
    ),
    Doggo(
        id = 3,
        "Jack",
        "Siberian Husky",
        "Male",
        "9",
        "The Siberian Husky is a medium-sized working sled dog breed. The breed belongs to the Spitz genetic family. It is recognizable by its thickly furred double coat, erect triangular ears, and distinctive markings, and is smaller than the similar-looking Alaskan Malamute.",
        "Siberia",
        R.drawable.russia,
        "12 – 15 years",
        R.drawable.husky,
        R.drawable.husky_big,
    ),
    Doggo(
        id = 4,
        "Ruby",
        "German Shephard",
        "Female",
        "11",
        "The German Shepherd Dog is one of America’s most popular dog breeds — for good reasons. They’re intelligent and capable working dogs. Their devotion and courage are unmatched. And they’re amazingly versatile. The breed also goes by the name Alsatian. Despite their purebred status, you may find German Shepherds in shelters and breed specific rescues. So remember to adopt! Don’t shop if this is the breed for you.",
        "Germany",
        R.drawable.germany,
        "9–13 years",
        R.drawable.german,
        R.drawable.german_big,
    ),
    Doggo(
        id = 5,
        "Toby",
        "Doberman",
        "Male",
        "8",
        "The Dobermann, or Doberman Pinscher in the United States and Canada, is a medium-large breed of domestic dog that was originally developed around 1890 by Karl Friedrich Louis Dobermann, a tax collector from Germany. The Dobermann has a long muzzle. ",
        "Germany",
        R.drawable.germany,
        "10 – 13 years",
        R.drawable.doberman,
        R.drawable.doberman_big,
    ),
    Doggo(
        id = 6,
        "Bailey",
        "Poodle",
        "Female",
        "11",
        "The Poodle is a dog breed that comes in three varieties: Standard Poodle, Miniature Poodle, and Toy Poodle. The breed’s origin is disputed: whether it descends from Germany as a type of water dog, or from the French Barbet. ",
        "France",
        R.drawable.france,
        "12 – 15 years",
        R.drawable.poodle,
        R.drawable.poodle_big,
    ),
    Doggo(
        id = 7,
        "Milo",
        "Labrador",
        "Male",
        "5",
        "The Labrador Retriever, often abbreviated to Labrador, is a breed of retriever-gun dog from the United Kingdom that was developed from imported Canadian fishing dogs. The Labrador is one of the most popular dog breeds in a number of countries in the world, particularly in the Western world. ",
        "Canada",
        R.drawable.canada,
        "10 – 12 years",
        R.drawable.labrador,
        R.drawable.labrador_big,
    ),
)
