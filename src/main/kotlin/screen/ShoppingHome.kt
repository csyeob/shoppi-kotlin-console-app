package screen

class ShoppingHome {

    fun start(){
        showWelcomeMessage()
        showCategories()
        /*
            Step 1. main 함수 -> 클래스의 함수
            Step 2. 화면별 클래스 분리
            Step 3. 선택한 카테고리 상품 목록 표시
         */

    }

    private fun showCategories() {
        /*
        Step 1. 상품 카테고리 표기
        Step 2. 사용자 입력 받기
        Step 3. 사용자가 기대하는 값을 입력하지 않는 경우에 대한 처리
         */
        val categories = arrayOf("패션", "전자기기", "반려동물용품")
        for (category in categories) {
            println(category)
        }
        println("=> 장바구니로 이동하시려면 #을 입력해주세요.")

        var selectedCategory = readLine()
        //사용자가 null type으로 아무것도 입력을 안 할수도 있기 때문에
        while (selectedCategory.isNullOrBlank()) {
            println("값을 입력해주세요")
            selectedCategory = readLine()
        }
        if (selectedCategory == "#") {
            //TODO 1. 장바구니 이동
        } else {
            //TODO 2. 카테고리 상품 목록 보여주기
            //TODO 3. 카테고리 목록에 없는 값을 입력하는 경우
        }
    }

    private fun showWelcomeMessage() {
        /*
        Step 1. 인사말 출력
        Step 2. 사용자 이름 받기
        Step 3. 입력 받은 사용자 이름 출력
        */
        println("안녕하세요, Shoppi에 오신 것을 환영합니다.")
        println("쇼핑을 계속 하시려면 이름을 입력해주세요 :)")

        val name = readLine()
        // 사용자 이름 받기
        println(
            """
            감사합니다. 반갑습니다,  $name 님
            원하시는 카테고리를 입력해주세요.
            ***=================================***
        """.trimIndent()
        )
    }
}