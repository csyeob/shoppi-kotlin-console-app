package extensions

// top level의 함수를 호출하기 위해 file 형식으로 생성
// string 쪽에서 null인 경우
// int에서 null인경우
fun String?.getNotEmptyString(): String{
    var input = this
    while (input.isNullOrBlank()){
        println("값을 입력해주세요.")
        input = readLine()
    }
    return input.trim()
}
fun String?.getNotEmptyInt(): Int{
    var input = this?.trim()
    while(input.isNullOrEmpty() || input.toIntOrNull() == null){
        println("값을 입력해주세요")
        input = readLine()
    }
    return input.toInt()
}