package xyz.terrific.utils

import xyz.terrific.Main

class Logger(private val loggerEntry: String) {
    val entry: String = loggerEntry


    fun success(message: String) {
        println("[$entry] (SUCCESS)   $message")
    }
    fun success(entry: String, message: String) {
        println("[$entry] (SUCCESS)   $message")
    }

    fun info(message: String) {
        println("[$entry] (INFO)   $message")
    }
    fun info(entry: String, message: String) {
        println("[$entry] (INFO)   $message")
    }


    fun debug(message: String) {
        if (Main.debug)
            println(" -> (DEBUG)   $message")
    }

    fun log(message: String) {
        println("[$entry] (LOG)   $message")
    }
    fun log(entry: String, message: String) {
        println("[$entry] (LOG)   $message")
    }

    fun warning(message: String) {
        println("[$entry] (WARNING)   $message")
    }
    fun warning(entry: String, message: String) {
        println("[$entry] (WARNING)   $message")
    }

    fun error(message: String) {
        println("[$entry] (ERROR)   $message")
    }
    fun error(entry: String, message: String) {
        println("[$entry] (ERROR)   $message")
    }

    companion object {
        fun success(entry: String, message: String) {
            println("[$entry] (SUCCESS)   $message")
        }
        fun info(entry: String, message: String) {
            println("[$entry] (INFO)   $message")
        }
        fun debug(message: String) {
            if (Main.debug)
                println(" -> (DEBUG)   $message")
        }
        fun log(entry: String, message: String) {
            println("[$entry] (LOG)   $message")
        }
        fun warning(entry: String, message: String) {
            println("[$entry] (WARNING)   $message")
        }
        fun error(entry: String, message: String) {
            println("[$entry] (ERROR)   $message")
        }
    }
}
