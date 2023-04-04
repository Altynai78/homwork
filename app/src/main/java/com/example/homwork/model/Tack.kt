package com.example.homwork.model

@Entity
                data class Task(
@PrimaryKey(autoGenerate = true)
val id:Int?=null,
var title:String?=null,
var desc:String?=null
):java.io.Serializable
