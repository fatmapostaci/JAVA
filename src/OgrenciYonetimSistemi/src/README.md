# Öğrenci Yönetim Sistemi Projesi

## Proje Genel Bakış
**Proje Başlığı:** Öğrenci Yönetim Sistemi  
**Amaç:** Öğrencilerin kayıtlarını, notlarını ve derslerini yönetebileceği bir sistem geliştirmek.

## Grup Rolleri
1. **Grup Üyesi 1: Öğrenci Yönetimi**  
   - `Student` sınıfını ve ilgili işlevselliği uygulamaktan sorumlu.
   - Öğrenci ekleme, çıkarma ve arama işlemlerini yönetecek.

2. **Grup Üyesi 2: Ders Yönetimi**  
   - `Course` sınıfını ve ilgili işlevselliği uygulamaktan sorumlu.
   - Ders ekleme, çıkarma ve öğrencilerin derslerini görüntüleme işlemlerini yönetecek.

3. **Grup Üyesi 3: Servis Katmanı ve İstisna Yöntimi**  
   - Servis arayüzlerini ve istisna yönetimini uygulamaktan sorumlu.
   - `IStudentService` ve `ICourseService` arayüzlerini oluşturacak ve istisnaları yönetecek.

## Oturumların Dağılımı
### Oturum 1 (40 dakika)
**Görevler:**
- **Grup Üyesi 1:** `Student` sınıfını oluşturun; `id`, `isim`, `soyisim`, `email` gibi özellikleri ekleyin.
- **Grup Üyesi 2:** `Course` sınıfını oluşturun; `courseId`, `courseName`, `credits` gibi özellikleri ekleyin.
- **Grup Üyesi 3:** `StudentNotFoundException` ve `CourseNotFoundException` gibi özel istisnaları oluşturun.

### Oturum 2 (40 dakika)
**Görevler:**
- **Grup Üyesi 1:** `Student` sınıfında `toString` yöntemini uygulayın.
- **Grup Üyesi 2:** `Course` sınıfında `toString` yöntemini uygulayın.
- **Grup Üyesi 3:** `ICourseService` arayüzünü uygulayın.

### Oturum 3 (40 dakika)
**Görevler:**
- **Grup Üyesi 1:** Öğrencilerin derslerini görüntülemek için bir yöntem oluşturun.
- **Grup Üyesi 2:** `Course` sınıfında dersin kredilerini kontrol edecek bir yöntem oluşturun.
- **Grup Üyesi 3:** Öğrenci ve ders yönetimi için basit bir komut satırı arayüzü oluşturun.

## Metotlar ve Sabitler için Yol Haritası
1. **Student Sınıfı:**
   - Metotlar: `addStudent()`, `removeStudent()`, `searchStudent()`, `toString()`

2. **Course Sınıfı:**
   - Metotlar: `addCourse()`, `removeCourse()`, `searchCourse()`, `toString()`

3. **Servis Arayüzleri:**
   - `IStudentService`: `addStudent(Student student)`, `removeStudent(String id)`, `searchStudent(String id)`
   - `ICourseService`: `addCourse(Course course)`, `removeCourse(String courseId)`, `searchCourse(String courseId)`
