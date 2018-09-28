package io.multifunctions

import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec
import io.multifunctions.models.*

class MultiForEachIndexedSpec : WordSpec() {

    init {

        "MultiForEachIndexed" should {

            "produce a correct mapping from Pair" {
                val testData = listOf(Pair("one", "two"))

                testData.forEachIndexed { index, one, two ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"
                } shouldBe Unit
            }

            "produce a correct mapping from Triple" {
                val testData = listOf(Triple("one", "two", "three"))

                testData.forEachIndexed { index, one, two, three ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                } shouldBe Unit
            }

            "produce a correct mapping from Quad" {
                val testData = listOf(Quad("one", "two", "three", "four"))

                testData.forEachIndexed { index, one, two, three, four ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                } shouldBe Unit
            }

            "produce a correct mapping from Penta" {
                val testData = listOf(Penta("one", "two", "three", "four", "five"))

                testData.forEachIndexed { index, one, two, three, four, five ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                } shouldBe Unit
            }

            "produce a correct mapping from Hexa" {
                val testData = listOf(Hexa("one", "two", "three", "four", "five", "six"))

                testData.forEachIndexed { index, one, two, three, four, five, six ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"
                } shouldBe Unit
            }

            "produce a correct mapping from Hepta" {
                val testData = listOf(Hepta("one", "two", "three", "four", "five", "six", "seven"))

                testData.forEachIndexed { index, one, two, three, four, five, six, seven ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"
                    seven shouldBe "seven"
                } shouldBe Unit
            }

            "handle null values" {
                val actual = listOf(Pair("one", null))

                actual.forEachIndexed { _, one, two ->
                    one shouldBe "one"
                    two shouldBe null
                } shouldBe Unit
            }

            "not effect kotlin forEachIndexed" {
                val actual = listOf("something")

                actual.forEachIndexed { index, elem ->
                    index shouldBe 0
                    elem shouldBe "something"
                } shouldBe Unit
            }
        }
    }
}