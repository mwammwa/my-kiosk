package com.example.mykiosk


fun main() {
    var Coin = 0
    println("안녕하세요! AA분식점 입니다!")

    do {
        println("메뉴 선택에 앞서 저희 가게는 선불로 돈을 받고 있기 때문에 700원 이상의 소지금을 입력해 주세요")
        var Coin: Int = readln()!!.toInt()
    } while (Coin < 700)
    println("입력해주신 소지금은 ${Coin}원 입니다.")
    //이거 값을 readln에 친 값으로 해주고 싶은데 어떻게 해야할까 (아직 해결을 못했어요...)
    // 글자를 치면 오류가 떠요...

    fun Choice_() {
        println("현재 저희 분식집에서 주문이 가능한 메뉴의 대분류 및 선택지는 다음과 같습니다.")
        println("[0] 키오스크 종료 [1] 라면  [2] 김밥  [3] 식사류  [4] 음료  [5] 주문 완료 ")
        println("어떤 메뉴를 고르시겠어요?")

        var Choice = readln()!!.toString()

        // 이거 for문으로 어떻게 써야할지 모르겠어요..
        // 생각해보니 이거 소분류 갔다가 선택 하고 나면 다시 돌아오게 할수는 없나

        while (Choice > 0.toString()) {
            if (Choice == "1") {
                //아마? 인스턴스 생성!!
                var menuKind = MenuKind("메뉴", 0)
                menuKind.announcement1()

                break
                //나중에 소분류가 나오게 해보기
                // 소분류는 나오게 됐으니까 소분류 선택 할 수 있게 해보기
            } else if (Choice == "2") {
                var menuKind = MenuKind("메뉴", 0)
                menuKind.announcement2()
                //아마 클래스-기능을 만들고 여기에 break대신 추가하면 되지 않을까

            } else if (Choice == "3") {
                var menuKind = MenuKind("메뉴", 0)
                menuKind.announcement3()

            } else if (Choice == "4") {
                var menuKind = MenuKind("메뉴", 0)
                menuKind.announcement4()

            } else if (Choice == "5") {
                //여기는 계산 / 주문 종료 버튼으로

            } else if (Choice == "0") {
                // 이쪽은 종료 버튼
                // 어떻게 해야지 출력 할 수 있을까..
                // 주문 중에 종료를 누를 경우에 초기화하면서 되도록 하면 init를 쓸 수 있지 않을까
                println("키오스크를 종료합니다.")
                break
            } else {
                println("올바른 입력이 아닙니다. 다시 입력해 주세요.")
                Choice_()
                //오 이렇게 넣는거였구나
            }
        }
    }
    Choice_()
}


