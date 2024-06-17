package com.example.mykiosk

open class Menu(val name: String, var coin: Int) {
    var Menulist = mutableListOf<String>("참치 라면", "치즈 라면", "비빔 라면", "불고기 김밥", "떙초 김밥", "오이 김밥","돈까스","쫄면","우동","물","탄산음료","수정과")
    var Menucoin = mutableListOf<Int>(3500, 4000, 3700, 2800, 2300, 2500,6000,4500,4500,700,1000,1500)
}
//저것도 더 길어지면 불편할 것 같은데 정리할 방법이 있나...


