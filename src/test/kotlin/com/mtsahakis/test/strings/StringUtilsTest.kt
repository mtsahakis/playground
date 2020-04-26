package com.mtsahakis.test.strings

import com.mtsahakis.strings.StringUtils
import org.junit.Assert.*
import org.junit.Test
import java.util.*

class StringUtilsTest {

    @Test
    fun testReverseInPlace() {
        // null string
        val strNull: String? = null
        assertNull(StringUtils.reverseInPlace(strNull))

        // empty string
        val strEmpty = ""
        assertEquals("", StringUtils.reverseInPlace(strEmpty))

        // normal use case
        val strToTest = "manos"
        val strExpected = "sonam"
        assertEquals(strExpected, StringUtils.reverseInPlace(strToTest))
    }

    @Test
    fun testReverseWithRecursion() {
        // null string
        val strNull: String? = null
        assertNull(StringUtils.reverseWithRecursion(strNull))

        // empty string
        val strEmpty = ""
        assertEquals("", StringUtils.reverseWithRecursion(strEmpty))

        // normal use case
        val strToTest = "manos"
        val strExpected = "sonam"
        assertEquals(strExpected, StringUtils.reverseWithRecursion(strToTest))
    }

    @Test
    fun testDuplicateCharacters() {
        // null string
        val strNull: String? = null
        assertEquals(Collections.EMPTY_MAP, StringUtils.duplicateCharacters(strNull))

        // empty string
        val strEmpty = ""
        assertEquals(Collections.EMPTY_MAP, StringUtils.duplicateCharacters(strEmpty))

        // normal use case
        val strToTest = "java"
        val result = StringUtils.duplicateCharacters(strToTest)
        assert(result['a'] == 2)

        // print duplicates
        val anotherStrToTest = "12312312333456789"
        StringUtils.duplicateCharacters(anotherStrToTest).entries.filter { it.value >= 2 }.forEach { println(it) }
    }

    @Test
    fun testIsAnagramWithArrays() {
        // null string
        val str1Null: String? = null
        val str2Null: String? = null
        assertFalse(StringUtils.isAnagramWithArrays(str1Null, str2Null))

        // empty string
        val str1Empty = ""
        val str2Empty = ""
        assertFalse(StringUtils.isAnagramWithArrays(str1Empty, str2Empty))

        // normal use case
        var str1ToTest = "javacc"
        var str2ToTest = "kotlin"
        assertFalse(StringUtils.isAnagramWithArrays(str1ToTest, str2ToTest))

        str1ToTest = "javac"
        str2ToTest = "cavja"
        assertTrue(StringUtils.isAnagramWithArrays(str1ToTest, str2ToTest))
    }

    @Test
    fun testIsAnagramByRemovingChars() {
        // null string
        val str1Null: String? = null
        val str2Null: String? = null
        assertFalse(StringUtils.isAnagramByRemovingChars(str1Null, str2Null))

        // empty string
        val str1Empty = ""
        val str2Empty = ""
        assertFalse(StringUtils.isAnagramByRemovingChars(str1Empty, str2Empty))

        // normal use case
        var str1ToTest = "javacc"
        var str2ToTest = "kotlin"
        assertFalse(StringUtils.isAnagramByRemovingChars(str1ToTest, str2ToTest))

        str1ToTest = "javac"
        str2ToTest = "avjac"
        assertTrue(StringUtils.isAnagramByRemovingChars(str1ToTest, str2ToTest))
    }

    @Test
    fun testPermutations() {
        // normal use case
        val strToTest = "123"
        StringUtils.permutations(strToTest, "")
    }

    @Test
    fun testCountVowels() {
        // null string
        val strNull: String? = null
        assert(StringUtils.countVowels(strNull) == 0)

        // empty string
        val strEmpty = ""
        assert(StringUtils.countVowels(strEmpty) == 0)

        // normal use cases
        val strToTest1 = "java"
        assert(StringUtils.countVowels(strToTest1) == 2)
        val strToTest2 = "kotlin"
        assert(StringUtils.countVowels(strToTest2) == 2)
        val strToTest3 = "foobar"
        assert(StringUtils.countVowels(strToTest3) == 3)
    }

    @Test
    fun testStringToInt() {
        val input = "123"
        assert(StringUtils.stringToInt(input) == 123)
    }

    @Test
    fun testRemoveDuplicateCharacters() {
        // normal use cases
        val strToTest1 = "123"
        assertEquals(StringUtils.removeDuplicateCharacters(strToTest1), strToTest1)
        val strToTest2 = "123123"
        assertEquals(StringUtils.removeDuplicateCharacters(strToTest2), "123")
        val strToTest3 = "aaaa"
        assertEquals(StringUtils.removeDuplicateCharacters(strToTest3), "a")
    }

}