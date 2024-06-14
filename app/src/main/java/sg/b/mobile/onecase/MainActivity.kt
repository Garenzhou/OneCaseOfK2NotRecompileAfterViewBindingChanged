package sg.b.mobile.onecase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import sg.b.mobile.onecase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var aView: View? = null
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        aView = binding.tvHello
    }
}