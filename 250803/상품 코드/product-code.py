class Codetree :
    def __init__ (self, name = "codetree", price = 50) :
        self.name = name;
        self.price = price;


name, price = map(str, input().split());

price = int(price);

codetree1 = Codetree();
codetree2 = Codetree(name, price);

print(f"product {codetree1.price} is {codetree1.name}")
print(f"product {codetree2.price} is {codetree2.name}")

