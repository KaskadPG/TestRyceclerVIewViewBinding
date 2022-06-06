package ru.dgu.testryceclerviewviewbinding


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import ru.dgu.testryceclerviewviewbinding.databinding.ActivityMainBinding
import ru.dgu.testryceclerviewviewbinding.networking.MarvelService
import ru.dgu.testryceclerviewviewbinding.networking.RetrofitBuilder


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private var listUsers: MutableList<ModelMebel.Item> = mutableListOf<ModelMebel.Item>()
    private var adapter: MainAdapter? = null
    lateinit var mService: MarvelService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        mService = RetrofitBuilder.retrofitService
        listUsers = mutableListOf()
        binding.recyclerview.layoutManager = LinearLayoutManager(this@MainActivity)
        adapter = MainAdapter (this, listUsers)
        binding.recyclerview.adapter = adapter

        getUsersData()

    }

    private fun getUsersData() {

        mService.getMovieList().enqueue(object : Callback<MutableList<ModelMebel.Item>> {
            override fun onFailure(call: Call<MutableList<ModelMebel.Item>>, t: Throwable) {
            }

            override fun onResponse(
                call: Call<MutableList<ModelMebel.Item>>,
                response: Response<MutableList<ModelMebel.Item>>
            ) {
                val usersResponse = response.body()
                listUsers.clear()
                usersResponse?.let { listUsers.addAll(it) }
                adapter?.notifyDataSetChanged()
            }
        })
    }
}