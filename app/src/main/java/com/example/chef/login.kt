package com.example.chef
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.view.View
import com.example.chef.databinding.ActivityLoginBinding

class login : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityLoginBinding
    var chef: String = "chef"

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_login -> login()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener(this)
    }

    private fun login() {
        val username = binding.inpUsername.text.toString()
        val password = binding.inpPassword.text.toString()

        when {
            username == chef && password == chef -> {
                startActivity(Intent(this, dasboardchef::class.java))
                Toast.makeText(this, "Login sebagai Chef", Toast.LENGTH_SHORT).show()
                true
            }
//            username == admin && password == admin -> {
//                startActivity(Intent(this, dashboardadmin::class.java))
//                Toast.makeText(this, "Login sebagai Admin", Toast.LENGTH_SHORT).show()
//                true
//            }
            else -> {
                Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
