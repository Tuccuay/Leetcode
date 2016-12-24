import Foundation

class Solution {
    
    func hammingDistance(_ x: Int, _ y: Int) -> Int {
        
        return String(x ^ y, radix: 2).characters.reduce(0) {
            $0 + ($1 == "1" ? 1 : 0)
        }
    }
}

let solution = Solution()
solution.hammingDistance(1, 4)

