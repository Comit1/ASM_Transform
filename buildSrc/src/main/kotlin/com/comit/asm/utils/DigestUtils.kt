package com.comit.asm.utils

import org.gradle.internal.impldep.org.apache.commons.codec.binary.Hex
import java.io.File

/*
 * Created by 范伟聪 on 2022/3/16.
 */
object DigestUtils {

    fun generateJarFileName(jarFile: File): String {
        return getMd5ByFilePath(jarFile) + "_" + jarFile.name
    }

    fun generateClassFileName(classFile: File): String {
        return getMd5ByFilePath(classFile) + "_" + classFile.name
    }

    private fun getMd5ByFilePath(file: File): String {
        return Hex.encodeHexString(file.absolutePath.toByteArray()).substring(0, 8)
    }

}