package com.fun
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.Spec
import org.junit.Before

@RunWith(classOf[JUnitRunner])
class HelloTest extends Spec with ShouldMatchers {
  describe("Fun problems") {
    var thing = new HelloClass
    
    it("should return last thing") {
      thing.last(List(1, 1, 2, 3, 5, 8)) should equal(8)
    }
    
    it("should work with strings and shit"){
      thing.last(List("1", 1, "2", 3, 5, "boom")) should equal("boom")
    }
    
    it("crazy recursive shit should work?"){
      thing.lastRecursive(List("1", 1, "2", 3, 5, "boom")) should equal("boom")
    }
    
    it("should return second last"){
      thing.penultimate(List(1, 1, 2, 3, 5, 8)) should equal(5)
    }
    
    it("should return second last using recursive"){
    	thing.penultimateRecursive(List(1, 1, 2, 3, 5, 8)) should equal(5)
    }
    
    it("should be an and") {
      thing.and(true, true) should be(true)
      thing.and(true, false) should be(false)  
    }
    
    it("be grey thing") {
      thing.gray(3) should equal(List("000", "001", "011", "010", "110", "111", "101", "100"))
      thing.gray(0) should equal(List())
      thing.gray(1) should equal(List("0", "1"))        
      thing.gray(2) should equal(List("00", "01", "11", "10"))       
    }
  }
}