package com.example.recycleview

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<Data>()

        data.add(Data("Name", "Description", R.drawable.image))
        data.add(Data("Name2", "Description2", R.drawable.image))
        data.add(Data("Name3", "Description3", R.drawable.image))
        data.add(Data("Name4", "Description4", R.drawable.image))
        data.add(Data("Name5", "Description5", R.drawable.image))
        data.add(Data("Name6", "Description6", R.drawable.image))
        data.add(Data("Name7", "Description7", R.drawable.image))
        data.add(Data("Name8", "Description8", R.drawable.image))
        data.add(Data("Name9", "Description9", R.drawable.image))
        data.add(Data("Name10", "Description10", R.drawable.image))
        data.add(Data("Name11", "Description11", R.drawable.image))
        data.add(Data("Name12", "Description12", R.drawable.image))
        data.add(Data("Name13", "Description13", R.drawable.image))
        data.add(Data("Name14", "Description14", R.drawable.image))
        data.add(Data("Name15", "Description15", R.drawable.image))
        data.add(Data("Name16", "Description16", R.drawable.image))
        data.add(Data("Name17", "Description17", R.drawable.image))
        data.add(Data("Name18", "Description18", R.drawable.image))
        data.add(Data("Name19", "Description19", R.drawable.image))
        data.add(Data("Name20", "Description20", R.drawable.image))
        data.add(Data("Name21", "Description21", R.drawable.image))

        var dataAdapter = DataAdapter(data)
        binding.recyclerView.adapter = dataAdapter

        dataAdapter.onClick = {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("name", it.name)
            intent.putExtra("detail", it.detail)
            intent.putExtra("image", it.image)
            startActivity(intent)
        }
    }
}