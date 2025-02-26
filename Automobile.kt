class Automobile(_marka:String, _moshonst:Double, _stoimost:Double) {
    val marka:String
    init{
        marka = _marka
    }
    val moshnost:Double
    init{
        moshnost = _moshonst
    }
    val stoimost:Double
    init{
        stoimost = _stoimost
    }

    fun skidka(razmer_skidki:Double) : Double{
        return stoimost - (stoimost * (razmer_skidki / 100))
    }

    fun kredit(vremya_kredita:Int) : Double{
        return stoimost / (vremya_kredita * 2.583)
    }

    fun stoimost_strahovki(vremya_strahovki:Int) : Double{
        return 1646.0 * vremya_strahovki / moshnost * 100.0
    }
}