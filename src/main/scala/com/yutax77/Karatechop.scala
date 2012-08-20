package com.yutax77

object KarateChop {
    def chop(target:Int, array:Array[Int]):Int = {
        if(array.isEmpty)
          return -1

        return chopImpl(target, array, 0, array.size)
     }

    private def chopImpl(target:Int, array:Array[Int], start:Int, end:Int):Int = {
        if(start == end)
          return -1

        val pivot = (end - start) / 2
        val value = array(pivot)
        if(target == value){
            return pivot
        }
        else if(target > value){
            return chopImpl(target, array, pivot, array.size)
        }
        else{
            return chopImpl(target, array, 0, pivot)
        }
    }
}
