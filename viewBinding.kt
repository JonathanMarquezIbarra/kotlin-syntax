// Implementacion basica de view binding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
}

//Implementacion de dependencias en el build.gradle.module.app
// debajo de Build types

viewBinding{
        enable = true
    }