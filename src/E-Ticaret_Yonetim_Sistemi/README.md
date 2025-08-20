

## 1. Adım: Projenin Tanıtımı
- **Amaç:** Bir e-ticaret uygulaması oluşturarak, ürünlerin takibini ve sipariş oluşturmayı sağlamak.
- **Hedef:** POJO class oluşturmak, static ve instance değişkenler kullanmak ve constructor’larla nesne oluşturmayı anlamak.
---
## 2. Adım: POJO Class – Product (Ürün)
1. Yeni bir **Product** sınıfı oluşturun.
2. **Product** sınıfında aşağıdaki değişkenleri tanımlayın:
   - `static int productIdCounter`
   - `int productId`
   - `String name`
   - `String category`
   - `double price`
   - `int stock`
3. **Constructor** oluşturun:
   - Parametreler: `String name`, `String category`, `double price`, `int stock`
   - `productId` değerini otomatik artan bir sayı olarak ayarlayın.
4. Ürün bilgilerini döndürmek için `toString` metodu yazın.
---
## 3. Adım: POJO Class – Order (Sipariş)
1. Yeni bir **Order** sınıfı oluşturun.
2. **Order** sınıfında aşağıdaki değişkenleri tanımlayın:
   - `static int orderIdCounter`
   - `int orderId`
   - `Product product`
   - `int quantity`
   - `double totalPrice`
3. **Constructor** oluşturun:
   - Parametreler: `Product product`, `int quantity`
   - Toplam fiyatı hesaplayın ve atayın.
4. Sipariş bilgilerini döndürmek için `toString` metodu yazın.
---
## 4. Adım: Ana Program
1. Yeni bir **ECommerceApp** sınıfı oluşturun.
2. Aşağıdaki değişkenleri tanımlayın:
   - `static ArrayList<Product> productList`
   - `static ArrayList<Order> orderList`
   - `static int totalSoldProducts`
3. Bir menü oluşturun ve kullanıcıdan aşağıdaki işlemleri yapmasını isteyin:
   - 1: **Ürün Ekle**: Kullanıcıdan ürün bilgilerini alıp listeye ekleyin.
   - 2: **Ürünleri Listele**: Mevcut ürünleri yazdırın.
   - 3: **Sipariş Oluştur**: Kullanıcının seçtiği bir ürün için sipariş oluşturun.
   - 4: **Toplam Satılan Ürünleri Görüntüle**.
   - 5: **Çıkış**.
4. Her menü işlemi için uygun metotlar yazın.
