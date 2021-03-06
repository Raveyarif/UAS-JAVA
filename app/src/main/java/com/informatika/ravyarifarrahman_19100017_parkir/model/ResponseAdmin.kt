package com.informatika.ravyarifarrahman_19100017_parkir.model

import com.google.gson.annotations.SerializedName

data class ResponseAdmin(

	@field:SerializedName("pesan")
	val pesan: String? = null,

	@field:SerializedName("data")
	val data: List<DataItem1?>? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class DataItem1(

	@field:SerializedName("password")
	val password: String? = null,

	@field:SerializedName("username")
	val username: String? = null
)
