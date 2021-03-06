package screen

import LINE_DIVIDER
import extensions.getNotEmptyString

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
       val shoppingCategory = ShoppingCategory()
        shoppingCategory.showCategories()
    }

    private fun showWelcomeMessage() {
        /*
        Step 1. 인사말 출력
        Step 2. 사용자 이름 받기
        Step 3. 입력 받은 사용자 이름 출력
        */
        println("안녕하세요, Shoppi에 오신 것을 환영합니다.")
        println("쇼핑을 계속 하시려면 이름을 입력해주세요 :)")

        val name = readLine().getNotEmptyString()
        // 사용자 이름 받기
        println(
            """
            감사합니다. 반갑습니다,  $name 님
            원하시는 카테고리를 입력해주세요.
            $LINE_DIVIDER
        """.trimIndent()
        )
    }
}