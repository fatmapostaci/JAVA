# E-Ticaret Projesi Geliştirme Adımları

Bu doküman, e-ticaret projesinin adım adım nasıl geliştirileceğini açıklamaktadır. 4 kişilik bir ekip için tasarlanmıştır.

## 1. Proje Yapısı ve Sınıfların Oluşturulması (1. Seans - 40 dk)

### 1.1 Model Sınıfları (1. Kişi)
- [ ] User.java sınıfını oluştur
  - Temel kullanıcı özelliklerini tanımla (id, username, password, email)
  - UserType enum'ını oluştur (ADMIN, SELLER, CUSTOMER)

### 1.2 Ürün Yönetimi (2. Kişi)
- [ ] Product.java sınıfını oluştur
  - Ürün özelliklerini tanımla (id, name, price, stock, description, sellerId)
- [ ] ProductService.java servis sınıfını oluştur
  - Ürün ekleme, silme, güncelleme metodlarını ekle
  - Ürün listeleme ve arama fonksiyonlarını ekle

### 1.3 Sepet Yönetimi (3. Kişi)
- [ ] Cart.java sınıfını oluştur
  - Sepet özelliklerini tanımla (customerId, items, totalAmount)
  - CartItem iç sınıfını oluştur
  - Sepete ürün ekleme/çıkarma metodlarını ekle

### 1.4 Test ve Dokümantasyon (4. Kişi)
- [ ] Test senaryolarını hazırla
- [ ] Temel sınıfların dokümantasyonunu oluştur

## 2. İş Mantığı ve Fonksiyonların Implementasyonu (2. Seans - 40 dk)

### 2.1 Kullanıcı İşlemleri (1. Kişi)
- [ ] Login sistemini implement et
- [ ] Kullanıcı rol kontrollerini ekle
- [ ] Menü yapısını oluştur

### 2.2 Ürün İşlemleri (2. Kişi)
- [ ] Ürün listeleme fonksiyonunu tamamla
- [ ] Stok kontrolü mantığını ekle
- [ ] Satıcıya özel ürün yönetimi ekle

### 2.3 Sepet ve Sipariş İşlemleri (3. Kişi)
- [ ] Sepet hesaplama mantığını implement et
- [ ] Sipariş oluşturma sürecini ekle
- [ ] Stok güncelleme işlemlerini ekle

### 2.4 Test ve Hata Kontrolü (4. Kişi)
- [ ] Hata kontrollerini ekle
- [ ] Test senaryolarını güncelle
- [ ] Kullanıcı girdisi validasyonlarını ekle

## 3. Test, Hata Ayıklama ve Tamamlama (3. Seans - 40 dk)

### 3.1 Sistem Entegrasyonu (1. ve 2. Kişi)
- [ ] Tüm modülleri entegre et
- [ ] Hata ayıklamalarını yap
- [ ] Eksik fonksiyonları tamamla

### 3.2 Test ve İyileştirme (3. ve 4. Kişi)
- [ ] Kapsamlı test senaryolarını çalıştır
- [ ] Hataları düzelt
- [ ] Performans iyileştirmeleri yap

### 3.3 Son Kontroller (Tüm Ekip)
- [ ] Kullanıcı deneyimini test et
- [ ] Dokümantasyonu tamamla
- [ ] Final testlerini yap

## Proje Çalıştırma Talimatları

1. Main.java dosyasını çalıştırın
2. Login menüsünden kullanıcı tipini seçin:
   - Admin (1)
   - Satıcı (2)
   - Müşteri (3)
3. İlgili menüden işlem seçin ve talimatları takip edin

## Önemli Notlar

- Her sınıf için gerekli Java doc yorumları eklenmelidir
- Kod yazarken clean code prensiplerine uyulmalıdır
- Her fonksiyon tek bir iş yapmalıdır
- Hata kontrolü önemlidir, try-catch blokları kullanılmalıdır
- Değişken ve metod isimleri anlamlı olmalıdır
