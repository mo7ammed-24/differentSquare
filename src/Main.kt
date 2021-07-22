fun main() {
    print(differentSquares(mutableListOf(mutableListOf(1, 2, 1),mutableListOf(2, 2, 2),mutableListOf(2, 2, 2),mutableListOf(1, 2, 3),mutableListOf(2, 2, 1))))
}

fun differentSquares(matrix: MutableList<MutableList<Int>>): Int {
    var i=0
    var finalList=mutableListOf<MutableList<MutableList<Int>>>()
    while(i!=matrix.size-1){
        var j=0
        while(j!=matrix[0].size-1){
            var insteadList=mutableListOf<MutableList<Int>>()
            for(k in i..i+1){
                var mylist=mutableListOf<Int>()
                for(z in j..j+1){
                    mylist.add(matrix[k][z])
                }
                insteadList.add(mylist)
            }
            if(finalList==null)
                finalList.add(insteadList)
            if(insteadList!in finalList)
                finalList.add(insteadList)
            j++
        }

        i++
    }

    return finalList.size
}
