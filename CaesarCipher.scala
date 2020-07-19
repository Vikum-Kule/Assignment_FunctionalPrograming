object CaesarCipher extends App{

	val Alphabet = Array('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');

	val Encrypt = (letter:Char,shift:Int,arr:Array[Char])=>
		arr((arr.indexOf(letter.toUpper)+shift)%arr.length);

	val Decrypt = (letter:Char,shift:Int,arr:Array[Char])=>
		arr((arr.indexOf(letter.toUpper)-shift+arr.length)% arr.length);

	val function = (algo:(Char,Int,Array[Char])=>Char,txt:String,shift:Int,arr:Array[Char])=>
	txt.map(algo(_,shift,arr));

	val E = function(Encrypt,"vikum",2,Alphabet);
	val D = function(Decrypt,"vikum",2,Alphabet);
	println("vikum >> "+ E);
	println("vikum >> "+ D);
}