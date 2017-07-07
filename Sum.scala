object Sum {

	def main(args: Array[String]){
		println(addInt(4,5))
	}

	def addInt(a:Int, b:Int): Int = {
		var sum: Int = 0
		sum = a + b
		return sum
	}

}