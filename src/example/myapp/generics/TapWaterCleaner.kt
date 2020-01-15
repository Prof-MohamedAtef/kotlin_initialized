package example.myapp.generics

class TapWaterCleaner:Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) =waterSupply.addChemicalCleaners()
}