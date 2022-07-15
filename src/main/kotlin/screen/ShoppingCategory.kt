package screen

class ShoppingCategory {
      fun showCategories() {
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
            if(categories.contains(selectedCategory)) {
                //TODO 2. 카테고리 상품 목록 보여주기}
            }else {
                showErrorMessage(selectedCategory)
            }
        }
    }

    private fun showErrorMessage(selectedCategory: String?) {
        //TODO 3. 카테고리 목록에 없는 값을 입력하는 경우
        println("[$selectedCategory] : 존재하지 않는 카테고리 입니다. 다시 입력해주세요.")
        showCategories()
    }
}