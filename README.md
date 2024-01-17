# Arzum UI Test Projesi

Bu proje, Java programlama dili, Cucumber, TestNG, Selenium kütüphaneleri başta olmak üzere aşağıdaki kütüphaneler kullanılarak [Arzum](https://www.arzum.com.tr/) sitesinin örnek UI testi için yazılmıştır.

## Kullanılan Kütüphaneler

- **Selenium:** Web uygulamalarını test etmek için kullanılan açık kaynaklı bir otomasyon aracı.
  
- **Cucumber:** BDD (Behavior Driven Development) yaklaşımını destekleyen bir test çerçevesi. Gherkin dilini kullanarak senaryolar yazmayı sağlar.
  
- **TestNG:** Java tabanlı bir test çerçevesi. Test sırasını kontrol etmek, gruplama yapmak ve raporlama gibi özellikleri sağlar.
  
- **Apache Commons:** Apache POI ile birlikte çalışan kütüphane
  
- **Apache POI:** Microsoft Office dosyalarını okumak ve yazmak için Java kütüphanesi. Bu proje kapsamında hassas olan bilgileri (kullanici adı, şifre) Excel dosyaları üzerinden almak için kullanılmıştır.
  
- **Grasshopper ExtentReports Cucumber:** Cucumber test raporları oluşturmak için kullanılan eklenti.

## Proje Detayları

- **BDD Yaklaşımı:** Proje, BDD yaklaşımını benimseyerek, feature dosyasında Gherkin dilini kullanarak yazılmış test senaryosunu içermektedir.
  
- **Test Çalıştırma:** Proje, .feature dosyalarından çalıştırılabilir. Ayrıca, CrossBrowserTest.xml dosyasını kullanarak cross-browser testleri veya TestRunner class'larını kullanarak testleri başlatmak mümkündür.
- Not: Test cross-browser olarak çalıştırılacak ise XML dosyasi kullanilmalidir
  
- **Test Raporları:** Testlerin sonuçları ExtentReports klasörü altında `spark.html` olarak ve ek olarak PDF formatında raporlanmaktadır.

## Kullanılan Teknolojiler

- **Programlama Dili:** Java 8
- **Proje Yönetim Aracı:** Apache Maven

## Nasıl Çalıştırılır

1. **.feature Dosyaları İle:** src/test/java/FeatureFiles dosyası altındaki .feature dosyası ile test çalıştırılır


2. **Cross-Browser Testi İle:** src/test/java/XML dosyası altındaki CrossBrowserTest.xml dosyasından çalıştırılır

## Raporlar

- Raporlar, test çalıştırıldıktan sonra ExtentReports klasörü altında bulunabilir.

  - `spark.html`: HTML formatında detaylı rapor
  - `test-raporu.pdf`: PDF formatında genel bir rapor (Cross-browser testlerde pdf hata verebilir)

## Gereksinimler

- Java 8 yüklü olmalıdır.
- Apache Maven yüklü olmalıdır.

## İletişim

Ek bilgi veya sorularınız için lütfen "emrahguney1993@gmail.com" adresine mail atınız
