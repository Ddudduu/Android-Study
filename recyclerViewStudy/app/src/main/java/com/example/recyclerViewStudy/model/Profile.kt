package com.example.recyclerViewStudy.model

import java.util.*

class Profile(
  val image: Int,
  val name: String,
  val favorite: String,
  val uuid: String = UUID.randomUUID().toString(),
)