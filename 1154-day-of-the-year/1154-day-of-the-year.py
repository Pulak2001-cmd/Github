class Solution:
    def checkLeapYear(self, y):
        if y%400 == 0:
            return True
        else:
            if y%100 == 0:
                return False
            else:
                if y%4 == 0:
                    return True
                else:
                    return False
    def dayOfYear(self, date: str) -> int:
        dicts = {
            1: 31,
            2: 28,
            3: 31,
            4: 30, 
            5: 31,
            6: 30,
            7: 31,
            8: 31,
            9: 30,
            10: 31,
            11: 30,
            12: 31
        }
        y = int(date[:4])
        m = int(date[5:7])
        dt = int(date[-2:])
        print(y, m, dt)
        if self.checkLeapYear(y):
            dicts[2] = 29
        count = 0
        for i in range(1, m):
            count += dicts[i]
        count += dt
        return count
        