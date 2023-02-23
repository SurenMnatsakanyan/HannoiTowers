class Person(_firstName: String, _lastName: String){
    val firstName: String = _firstName
    val lastName: String = _lastName
    var nickName: String? = null
        set(value){
            field = value
            println("The new nickname is $value")
        }
        get(){
            println("The return value is $field")
            return field
        }

    constructor(): this("Peter", "Parker"){
        println("secondary constructor")
    }
}