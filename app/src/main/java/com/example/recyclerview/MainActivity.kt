package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listStudent = arrayListOf(
            MyContact("Alpian SC1","20102007","+62895 3841 72467", "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg"),
            MyContact("Budi Santoso","20104011","+62812 3456 7890", "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg"),
            MyContact("Dina Kartika","20105012","+62877 1234 5678", "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg"),
            MyContact("Eko Prasetyo","20102023","+62812 3456 7890", "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg"),
            MyContact("Fajar Mahendra","20104008","+62877 2345 6789", "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg"),
            MyContact("Gita Permata","20103017","+62813 4567 8901", "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg"),
            MyContact("Hendra Maulana","20105009","+62895 3841 72467", "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg"),
            MyContact("Indra Setiawan","20102034","+62812 3456 7890", "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg"),
            MyContact("Joko Santoso","20104019","+62877 2345 6789", "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg"),
            MyContact("Alpian Sah","20102017","+62895 3841 72467", "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg"),
            MyContact("Aditya Maulana","21101723","+62896 2345 6789", "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg"),
            MyContact("Bambang Setia","20102018","+62877 1234 5678", "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg"),
            MyContact("Citra Dewi","22101119","+62878 3456 7890", "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg"),
            MyContact("Dinda Pratiwi","23101220","+62895 4567 8901", "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg"),
            MyContact("Eko Budiyanto","24101321","+62896 5678 9012", "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg"),
            MyContact("Fitriyani Nurul","25101422","+62877 6789 0123", "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg"),
            MyContact("Gita Putri","26101523","+62878 7890 1234", "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg"),
            MyContact("Hendra Wirawan","27101624","+62895 8901 2345", "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg"),
            MyContact("Indah Wijaya","28101725","+62896 9012 3456", "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg"),
            MyContact("Joko Priyono","29101826","+62877 0123 4567", "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg"),
            MyContact("Cindy Yuliana","20103005","+62813 4567 8901", "https://blog-static.mamikos.com/wp-content/uploads/2022/06/Foto-Profil-WA-Keren_2.jpg"),
        )
         listView(listStudent)
    }

    private fun listView(value : ArrayList<MyContact>){
        val adapter = ListViewAdapter(this, value)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }

    private fun gridView(value : ArrayList<MyContact>){
        val adapter = GridViewAdapter(this,value)

        val layoutManager = GridLayoutManager(this, 2, LinearLayoutManager.VERTICAL, false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }

    private fun cardView(value : ArrayList<MyContact>){
        val adapter = CardViewAdapter(this, value)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }
}
