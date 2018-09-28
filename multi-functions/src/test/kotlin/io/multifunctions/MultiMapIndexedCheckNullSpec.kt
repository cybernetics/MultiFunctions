package io.multifunctions

import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec
import io.multifunctions.models.*

class MultiMapIndexedCheckNullSpec : WordSpec() {

    init {

        "MapIndexedCheckNull" should {

            "produce a correct mapping from Pair" {
                val testData = listOf(Pair("one", "two"))

                testData.mapIndexedCheckNull { index, one, two ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"

                    Pair(one, two)
                } shouldBe testData
            }

            "produce a correct mapping from Triple" {
                val testData = listOf(Triple("one", "two", "three"))

                testData.mapIndexedCheckNull { index, one, two, three ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"

                    Triple(one, two, three)
                } shouldBe testData
            }

            "produce a correct mapping from Quad" {
                val testData = listOf(Quad("one", "two", "three", "four"))

                testData.mapIndexedCheckNull { index, one, two, three, four ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"

                    Quad(one, two, three, four)
                } shouldBe testData
            }

            "produce a correct mapping from Penta" {
                val testData = listOf(Penta("one", "two", "three", "four", "five"))

                testData.mapIndexedCheckNull { index, one, two, three, four, five ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"

                    Penta(one, two, three, four, five)
                } shouldBe testData
            }

            "produce a correct mapping from Hexa" {
                val testData = listOf(Hexa("one", "two", "three", "four", "five", "six"))

                testData.mapIndexedCheckNull { index, one, two, three, four, five, six ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"

                    Hexa(one, two, three, four, five, six)
                } shouldBe testData
            }

            "produce a correct mapping from Hepta" {
                val testData = listOf(Hepta("one", "two", "three", "four", "five", "six", "seven"))

                testData.mapIndexedCheckNull { index, one, two, three, four, five, six, seven ->
                    index shouldBe 0

                    one shouldBe "one"
                    two shouldBe "two"
                    three shouldBe "three"
                    four shouldBe "four"
                    five shouldBe "five"
                    six shouldBe "six"
                    seven shouldBe "seven"

                    Hepta(one, two, three, four, five, six, seven)
                } shouldBe testData
            }

            "handle null values" {
                val actual = listOf(Pair("one", null), Pair("one", "two"))
                val expected = listOf(Triple(1, "one", "two"))

                actual.mapIndexedCheckNull { index, one, two -> Triple(index, one, two) } shouldBe expected
            }
        }
    }
}