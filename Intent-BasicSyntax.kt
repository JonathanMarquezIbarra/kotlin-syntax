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