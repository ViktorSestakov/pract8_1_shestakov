fun main(){
    //первый объект
    val car1:Automobile = Automobile("LADA", 4000.0, 10000000000000.0)

    println("Введите размер скидки для первого автоимобиля:")
    var razmer_skidki:Double = readln()!!.toDouble()
    println("при скидке в $razmer_skidki% стоимость первого автомобиля = " + car1.skidka(razmer_skidki))

    println("Введите сколько месяцев будет выплачиваться кредит для первого автоимобиля:")
    var mesyacy:Int = readln()!!.toInt()
    println("при длительности кредита в $mesyacy - каждый месяц вам придется выплачивать " + car1.kredit(mesyacy))

    println("Введите сколько месяцев будет длиться страховка для первого автоимобиля:")
    var mesyacy_na_strahovku:Int = readln()!!.toInt()
    println("при длительности cтраховки в $mesyacy_na_strahovku - вам нужно заплатить " + car1.stoimost_strahovki(mesyacy_na_strahovku))

    println("Марка вашего первого автомобля: " + car1.marka)
    println("Мощность вашего первого автомобля: " + car1.moshnost)
    println("Стоимость вашего первого автомобля: " + car1.stoimost)

    //второй объект
    val car2:Automobile = Automobile("MERCEDES", 250.0, 2500000.0)

    println("Введите размер скидки для второго автоимобиля:")
    var razmer_skidki2:Double = readln()!!.toDouble()
    println("при скидке в $razmer_skidki2% стоимость второго автомобиля = " + car2.skidka(razmer_skidki2))

    println("Введите сколько месяцев будет выплачиваться кредит для второго автоимобиля:")
    var mesyacy2:Int = readln()!!.toInt()
    println("при длительности кредита в $mesyacy2 - каждый месяц вам придется выплачивать " + car1.kredit(mesyacy2))

    println("Введите сколько месяцев будет длиться страховка для второго автоимобиля:")
    var mesyacy_na_strahovku2:Int = readln()!!.toInt()
    println("при длительности cтраховки в $mesyacy_na_strahovku2 - вам нужно заплатить " + car2.stoimost_strahovki(mesyacy_na_strahovku2))

    println("Марка вашего второго автомобля: " + car2.marka)
    println("Мощность вашего второго автомобля: " + car2.moshnost)
    println("Стоимость вашего второго автомобля: " + car2.stoimost)

    //третий объект
    val car3:Automobile = Automobile("BMW", 150.0, 1000000.0)

    println("Введите размер скидки для третьего автоимобиля:")
    var razmer_skidki3:Double = readln()!!.toDouble()
    println("при скидке в $razmer_skidki3% стоимость третьего автомобиля = " + car3.skidka(razmer_skidki3))

    println("Введите сколько месяцев будет выплачиваться кредит для третьего автоимобиля:")
    var mesyacy3:Int = readln()!!.toInt()
    println("при длительности кредита в $mesyacy3 - каждый месяц вам придется выплачивать " + car1.kredit(mesyacy3))

    println("Введите сколько месяцев будет длиться страховка для третьего автоимобиля:")
    var mesyacy_na_strahovku3:Int = readln()!!.toInt()
    println("при длительности cтраховки в $mesyacy_na_strahovku3 - вам нужно заплатить " + car2.stoimost_strahovki(mesyacy_na_strahovku3))

    println("Марка вашего третьего автомобля: " + car3.marka)
    println("Мощность вашего третьего автомобля: " + car3.moshnost)
    println("Стоимость вашего третьего автомобля: " + car3.stoimost)
}