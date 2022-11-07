package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.calculator.databinding.ActivityMainBinding


var value1: Any = 0
var value2: Any = 0

var point = false

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btn0.setOnClickListener { binding.tvResult.append("0") }
        binding.btn1.setOnClickListener { binding.tvResult.append("1") }
        binding.btn2.setOnClickListener { binding.tvResult.append("2") }
        binding.btn3.setOnClickListener { binding.tvResult.append("3") }
        binding.btn4.setOnClickListener { binding.tvResult.append("4") }
        binding.btn5.setOnClickListener { binding.tvResult.append("5") }
        binding.btn6.setOnClickListener { binding.tvResult.append("6") }
        binding.btn7.setOnClickListener { binding.tvResult.append("7") }
        binding.btn8.setOnClickListener { binding.tvResult.append("8") }
        binding.btn9.setOnClickListener { binding.tvResult.append("9") }
        binding.btnBack.setOnClickListener {
            binding.tvResult.setText(
                binding.tvResult.text.dropLast(
                    1
                )
            )
        }

        binding.btnPoint.setOnClickListener {
            if (point != true) {
                if (binding.tvResult.text.length == 0) {
                    binding.tvResult.append("0.")
                } else if (!binding.tvResult.text.toString().contains(".")) {
                    binding.tvResult.append(".")
                }
            } else {
                if (binding.tvNum.text.length == 0) {
                    binding.tvNum.append("0.")
                } else if (binding.tvNum.text.length != 0 && !binding.tvNum.text.toString()
                        .contains(".")
                ) {
                    binding.tvNum.append(".")
                }
            }
        }

        binding.btnC.setOnClickListener {
            value1 = 0
            value2 = 0
            binding.tvResult.text = ""
            binding.tvNum.text = ""
            binding.tvResult2.text = ""
        }





        binding.btnPlus.setOnClickListener {
            if (binding.tvResult.text.length != 0) {
                binding.tvResult2.text = "+"
                if (value1 == 0) {
                    value1 = binding.tvResult.text.toString().toDouble()
                    binding.tvResult.text = ""
                } else if (value1 != 0 && value2 == 0) {
                    value2 = binding.tvResult.text.toString().toDouble()
                    binding.tvResult.text = ""
                    binding.tvNum.text =
                        "${
                            (value1.toString().toDouble() + value2.toString()
                                .toDouble())
                        }"
                    value1 = binding.tvNum.text.toString().toDouble()
                    value2 = 0
                }
            }
        }
        binding.btnMinus.setOnClickListener {
            binding.tvResult2.text = "-"
            if (binding.tvResult.text.length != 0) {
                if (value1 == 0) {
                    value1 = binding.tvResult.text.toString().toDouble()
                    binding.tvResult.text = ""
                } else if (value1 != 0 && value2 == 0) {
                    value2 = binding.tvResult.text.toString().toDouble()
                    binding.tvResult.text = ""
                    binding.tvNum.text =
                        "${
                            (value1.toString().toDouble() - value2.toString()
                                .toDouble())
                        }"
                    value1 = binding.tvNum.text.toString().toDouble()
                    value2 = 0
                }
            }
        }
        binding.btnMult.setOnClickListener {
            binding.tvResult2.text = "x"
            if (binding.tvResult.text.length != 0) {
                if (value1 == 0) {
                    value1 = binding.tvResult.text.toString().toDouble()
                    binding.tvResult.text = ""
                } else if (value1 != 0 && value2 == 0) {
                    value2 = binding.tvResult.text.toString().toDouble()
                    binding.tvResult.text = ""
                    binding.tvNum.text =
                        "${
                            (value1.toString().toDouble() * value2.toString()
                                .toDouble())
                        }"
                    value1 = binding.tvNum.text.toString().toDouble()
                    value2 = 0
                }
            }
        }
        binding.btnDivision.setOnClickListener {
            binding.tvResult2.text = "÷"

            if (binding.tvResult.text.length != 0) {
                if (value1 == 0) {
                    value1 = binding.tvResult.text.toString().toDouble()
                    binding.tvResult.text = ""
                } else if (value1 != 0 && value2 == 0) {
                    value2 = binding.tvResult.text.toString().toDouble()
                    binding.tvResult.text = ""
                    binding.tvNum.text =
                        "${
                            (value1.toString().toDouble() / value2.toString()
                                .toDouble())
                        }"
                    value1 = binding.tvNum.text.toString().toDouble()
                    value2 = 0
                }
            }
        }
        binding.btnPercent.setOnClickListener {
            binding.tvResult2.text = "%"
            if (binding.tvResult.text.length != 0) {
                if (value1 == 0) {
                    value1 = binding.tvResult.text.toString().toDouble()
                    binding.tvResult.text = ""
                } else if (value1 != 0 && value2 == 0) {
                    value2 = binding.tvResult.text.toString().toDouble()
                    binding.tvResult.text = ""
                    binding.tvNum.text =
                        "${
                            (value1.toString().toDouble() % value2.toString()
                                .toDouble())
                        }"
                    value1 = binding.tvNum.text.toString().toDouble()
                    value2 = 0
                }
            }
        }
    }

}
 