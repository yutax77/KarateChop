package com.yutax77
import org.scalatest.FlatSpec

class KaratechopTest extends FlatSpec {
    it should "be able binarySearch" in {
        assert(KarateChop.chop(3, Array()) === -1)
        assert(KarateChop.chop(3, Array(1)) === -1)
        assert(KarateChop.chop(1, Array(1)) === 0)

        assert(KarateChop.chop(1, Array(1, 3, 5)) === 0)
        assert(KarateChop.chop(3, Array(1, 3, 5)) === 1)
        assert(KarateChop.chop(5, Array(1, 3, 5)) === 2)
        assert(KarateChop.chop(0, Array(1, 3, 5)) === -1)
        assert(KarateChop.chop(2, Array(1, 3, 5)) === -1)
        assert(KarateChop.chop(4, Array(1, 3, 5)) === -1)
        assert(KarateChop.chop(6, Array(1, 3, 5)) === -1)

        assert(KarateChop.chop(1, Array(1, 3, 5, 7)) === 0)
        assert(KarateChop.chop(3, Array(1, 3, 5, 7)) === 1)
        assert(KarateChop.chop(5, Array(1, 3, 5, 7)) === 2)
        assert(KarateChop.chop(7, Array(1, 3, 5, 7)) === 3)
        assert(KarateChop.chop(0, Array(1, 3, 5, 7)) === -1)
        assert(KarateChop.chop(2, Array(1, 3, 5, 7)) === -1)
        assert(KarateChop.chop(4, Array(1, 3, 5, 7)) === -1)
        assert(KarateChop.chop(6, Array(1, 3, 5, 7)) === -1)
        assert(KarateChop.chop(8, Array(1, 3, 5, 7)) === -1)
    }
}
