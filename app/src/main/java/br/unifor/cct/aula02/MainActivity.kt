package br.unifor.cct.aula02

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar

class MainActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {

    private var progressRed: Int = 0
    private var progressBlue: Int = 0
    private var progressGreen: Int = 0

    private lateinit var mShowColor:      View
    /*private lateinit var mShowColorRed:   View
    private lateinit var mShowColorGreen: View
    private lateinit var mShowColorBlue:  View */
    private lateinit var mChooseColorR: SeekBar
    private lateinit var mChooseColorG: SeekBar
    private lateinit var mChooseColorB: SeekBar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mShowColor      = findViewById(R.id.main_view_showcolor)
     /* mShowColorRed   = findViewById(R.id.main_view_showcolor_red)
        mShowColorGreen = findViewById(R.id.main_view_showcolor_green)
        mShowColorBlue  = findViewById(R.id.main_view_showcolor_blue) */
        mChooseColorR = findViewById(R.id.main_seek_choosecolorR)
        mChooseColorG = findViewById(R.id.main_seek_choosecolorG)
        mChooseColorB = findViewById(R.id.main_seek_choosecolorB)

        mChooseColorR.setOnSeekBarChangeListener(this)
        mChooseColorG.setOnSeekBarChangeListener(this)
        mChooseColorB.setOnSeekBarChangeListener(this)

    }

    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, isUser: Boolean) {
        Log.i("App","O valor do seekbar é $progress")
        if(seekBar == mChooseColorB){
            progressBlue = progress
        }
        if (seekBar == mChooseColorG){
            progressGreen = progress
        }
        if (seekBar == mChooseColorR){
            progressRed = progress
        }
        mShowColor.setBackgroundColor(Color.rgb(progressRed, progressGreen, progressBlue))

    }

    override fun onStartTrackingTouch(seekBar: SeekBar) {
        Log.i("App","Seekbar foi clicado")

    }

    override fun onStopTrackingTouch(seekBar: SeekBar) {
    }
}