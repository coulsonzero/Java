"""
@Author: Coulson
@Time: 2021/09/09 21:00
"""

import re
import numpy as np


class Solution:
    """
    Question 1：字符串转字典
    :param: String
    :return: Dict
    function: convert a String to a Dict
    """
    def func1(self, s):
        a = re.findall(r"(\w*) x (\d)", s)
        x = [i[0] for i in a]
        y = [int(i[1]) for i in a]
        d = {i: j for i, j in zip(x, y)}
        return d    # {'ITEM0001': 1, 'ITEM0013': 2, 'ITEM0022': 1}


    """
    Question 2: 计算总价
    :param: Dict
    :return: int
    """
    def func2(self, d):
        a = {'ITEM0001': 0, 'ITEM0013': 0, 'ITEM0022': 0}
        b = [10, 20, 30]
        for k, v in d.items():
            if k not in a.keys():
                return "ITEM 不合法! "
            a[k] = v
        self.c = [i for i in a.values()]
        return np.dot(np.array(b), np.array(self.c))

    """
    Question 3: 计算优惠
    :param: totalPrice
    :return: discounted price
    """
    def func3(self, totalPrice):
        try:
            if not(self.c[0] > 0 and self.c[-1] > 0):
                return f'{totalPrice}\n"很抱歉, 您暂时无法享受优惠”'

            # 优惠1
            b = [10, 0, 30]
            price1 = totalPrice - np.dot(np.array(b), np.array(self.c))//2


            # 优惠2
            price2 = totalPrice
            if totalPrice >= 100:
                price2 = totalPrice - ((totalPrice//100) * 30)
            return f'{price1}\n"优惠 1"' if price1 < price2 else f'{price2}\n"优惠 2"'
        except:
            return


if __name__ == '__main__':
    S = Solution()
    # string1 = '["ITEM0001 x 1", "ITEM0013 x 3", "ITEM0022 x 1"]'
    # string1 = '["ITEM0013 x 3", "ITEM0022 x 1"]'
    string1 = '["ITEM0006 x 1"]'

    # 题1
    d = S.func1(string1)
    print(f"obj = {d}")

    # 题2
    totalPrice = S.func2(d)
    print(totalPrice)

    # 题3
    discount = S.func3(totalPrice)
    print(discount)

    # 题4
    """
    DROP TABLE IF EXISTS 'Product';
    CREATE TABLE 'Product' (
        'id' int(10) NOT NULL AUTO_INCREMENT,
        'brandname' varchar(20) NOT NULL DEFAULT '' COMMENT '商品名称',
        'price' int(20) NOT NULL DEFAULT '' COMMENT '价格',
        PRIMARY KEY('id')
    ) ENGINE=InnoDB CHARAULT=UTF-8 COMMENT='商品信息';
    
    
    INSERT INTO 'Product' VALUES
    (1, 'ITEM0001', 10),
    (2, 'ITEM0013', 20),
    (3, 'ITEM0022', 30);
    """

    f"""
    INSERT INTO 'Product' VALUES
    (4, 'discount', "{discount}");
    """

