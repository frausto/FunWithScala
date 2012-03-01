package com.fun

class HelloClass {
	def last[B](coolList: List[B]): B = {
		coolList.last
	}
	
	def lastRecursive[A](ls: List[A]): A = ls match {
	    case h :: Nil  => h
	    case _ :: tail => lastRecursive(tail)
	    case _         => throw new NoSuchElementException
	}
	
	def penultimate[A](ls: List[A]): A = {
	  return ls(ls.length - 2)
	}
	
	def penultimateRecursive[A](ls: List[A]): A = ls match {
		case h :: _ :: Nil  => h
		case _ :: tail => penultimateRecursive(tail)
		case _         => throw new NoSuchElementException
	}
	
	def and(first: Boolean, second: Boolean): Boolean = {
	  first && second
	}
	
	def gray(num: Int): List[String] = {
	  val ls:List[String] = List()
	  for(j<-0 to 2) {
	    for(k<-0 to 2) {
	      for(i<-0 to 2) {
	        ls :+ "" + j + "" + k + "" + i + ""
	      }
	    }
	  }
	  ls
	}
	
}