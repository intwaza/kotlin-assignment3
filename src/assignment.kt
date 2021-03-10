fun main(){
    school()
    Intro("Belyse",20)
    var word=size("codehive")
    println(word)
    my_name("belyse")
    my_name("Belyse")
}
fun school(){
    var name="akirachix"
    print(name[0])
    print(name[2])
    println(name[3])
}
fun Intro(x:String,y:Int){
    println("Hi, my name is $x and I am $y years old")
}
fun size(word:String): Int {
    var size= word.length
    return size
}
fun my_name(name:String){
    if(name =="Belyse"){
        println("that's me!")
    }
    else{
        println("I don't know who is that")
    }
}
