package com.example.mykiosk

class MenuKind(name: String, coin: Int) : Menu(name, coin) {
    fun announcement1() {
        println("선택하신 [1] 라면의 종류는 다음과 같습니다.")
        println("[1-1] ${Menulist[0]}, ${Menucoin[0]}원")
        println("[1-2] ${Menulist[1]}, ${Menucoin[1]}원")
        println("[1-3] ${Menulist[2]}, ${Menucoin[2]}원")
        var pickme = Pickme(0..3)
    }

    fun announcement2() {
        println("선택하신 [2] 김밥의 종류는 다음과 같습니다.")
        println("[2-1] ${Menulist[3]}, ${Menucoin[3]}원")
        println("[2-2] ${Menulist[4]}, ${Menucoin[4]}원")
        println("[2-3] ${Menulist[5]}, ${Menucoin[5]}원")
        var pickme = Pickme(0..3)
    }

    fun announcement3() {
        println("선택하신 [2] 식사류의 종류는 다음과 같습니다.")
        println("[3-1] ${Menulist[6]}, ${Menucoin[6]}원")
        println("[3-2] ${Menulist[7]}, ${Menucoin[7]}원")
        println("[3-3] ${Menulist[8]}, ${Menucoin[8]}원")
        var pickme = Pickme(0..3)
    }

    fun announcement4() {
        println("선택하신 [2] 음료의 종류는 다음과 같습니다.")
        println("[4-1] ${Menulist[9]}, ${Menucoin[9]}원")
        println("[4-2] ${Menulist[10]}, ${Menucoin[10]}원")
        println("[4-3] ${Menulist[11]}, ${Menucoin[11]}원")
        var pickme = Pickme(0..3)
    }

    class Pickme(Pickme: Any) {
        init {
            println("메뉴를 선택 하시겠습니까?")
            println("1, 2, 3또는 돌아가기 - 0번을 눌러주세요")
            var Pickme = readln()!!

            if (Pickme == "1") {
                println("@@을 선택하셨습니다.")
                //아직 특정한 하나를 선택 했을 때를 못 구현 했어요..
            } else if (Pickme == "2") {
                println("@@을 선택하셨습니다.")

            } else if (Pickme == "3") {
                println("@@을 선택하셨습니다.")

            } else if (Pickme == "0") {
                println("이전 메뉴로 이동합니다")
                println("현재 저희 분식집에서 주문이 가능한 메뉴의 대분류 및 선택지는 다음과 같습니다.")
                println("[0] 키오스크 종료 [1] 라면  [2] 김밥  [3] 식사류  [4] 음료  [5] 주문 완료 ")
                println("어떤 메뉴를 고르시겠어요?")


            } else {
                println("잘못된 입력입니다.")
                //여기서 대분류로 이동이 아니라 소분류로 이동해야하는데....
            }
        }
    }
//이제 메뉴를 나오게 해야하는데 어떻게 해야할까...

}

