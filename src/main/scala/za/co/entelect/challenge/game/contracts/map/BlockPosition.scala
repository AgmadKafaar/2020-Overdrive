package za.co.entelect.challenge.game.contracts.map

class BlockPosition(lane: Int, blockNumber: Int) {
    def getLane(): Int = {
        return lane;
    }

    def getBlockNumber(): Int = {
        return blockNumber;
    }

    override def toString() : String = { 
        val stringRepresentation = 
            "lane: " + lane + 
            " blockNumber: " + blockNumber; 
        return stringRepresentation;
    }
}