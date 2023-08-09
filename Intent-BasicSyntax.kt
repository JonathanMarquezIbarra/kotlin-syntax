//Basic Intent syntax

//from the activity that generates value
binding.btnCalculate.setOnClickListener {
            // val intent = Intent(context, ActivityForLaunch::class.java)
            // intent.putExtra("KeyName", valueToSentForAnotherActivity)

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("INTENT_NAME", binding.tvResultKilometersHour.text)

            //send intent to launch Activity
            startActivity(intent)
        }

//get value from another activity
fun getKilometersHour(){
        val bundle = intent.extras
        val kilometersHour = bundle?.get("INTENT_NAME")

        binding.tvResultScreen.text = kilometersHour.toString()

    }
//Note:            don't forget call the function from onCreate()
