package com.example.testlayout.presentation

import android.content.Context
import android.media.MediaPlayer
import android.media.MediaRecorder
import android.media.MediaRecorder.AudioSource
import android.media.MediaRecorder.OutputFormat
import android.os.Build
import android.os.Environment
import android.util.Log
import androidx.annotation.RequiresApi
import java.io.File
import java.io.FileInputStream


class Rescord(val context: Context) {
    private var recorder: MediaRecorder? = null

    private fun createRecorder(): MediaRecorder {
        return if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            MediaRecorder(context)
        } else MediaRecorder()
    }

    fun start() {
      val filePath=context.filesDir.absolutePath+File.separator+"bbb"
        val file=File(filePath)

        createRecorder().apply {
            setAudioSource(MediaRecorder.AudioSource.MIC)
            setOutputFormat(MediaRecorder.OutputFormat.MPEG_4)
            setAudioEncoder(MediaRecorder.AudioEncoder.AAC)
            setOutputFile(file)
            prepare()
            start()
        }
    }

    fun stop() {
        recorder?.stop()
        recorder?.reset()
        recorder = null
    }
}
class PlaySong(val context: Context){
    var mediaPlayer:MediaPlayer?=MediaPlayer()
    fun Play(file: File){

    }
    fun StopPlayer(){

    }
}
class  Dfe(){}
