package data

object CartItems {
    private val mutableProducts = mutableMapOf<Product, Int>() // 상품 수량까지 저장하기 위해서 map을 사용
    val products: Map<Product, Int> = mutableProducts // mutable 타입으로 외부에서는 수정 불가능 read only

    fun addProduct(product: Product){
        mutableProducts[product]?.let{
            mutableProducts[product] = it + 1 // 수량이 있을 시
        } ?: kotlin.run{
            mutableProducts[product] = 1
        }
    }

}