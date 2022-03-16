package com.comit.asm.utils

import java.io.File

/*
 * Created by 范伟聪 on 2022/3/16.
 */
object ClassUtils {

    private fun isAndroidGeneratedClass(className: String): Boolean {
        return className.contains("R$") ||
                className.contains("R2$") ||
                className.contains("R.class") ||
                className.contains("R2.class") ||
                className == "BuildConfig.class"
    }

    fun isLegalJar(file: File): Boolean {
        return file.isFile &&
                file.length() > 0L &&
                file.name != "R.jar" &&
                file.name.endsWith(".jar")
    }

    fun isLegalClass(file: File): Boolean {
        return file.isFile && isLegalClass(file.name)
    }

    fun isLegalClass(fileName: String): Boolean {
        return fileName.endsWith(".class") && !isAndroidGeneratedClass(fileName)
    }

}