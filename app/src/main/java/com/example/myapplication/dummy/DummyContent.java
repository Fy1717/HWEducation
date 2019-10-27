package com.example.myapplication.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        List<DummyItem> eduList = new ArrayList<>();

        eduList.add(new DummyItem("1","GNU/LINUX DERSLERİ", "\n" +
                "KONULAR\n" +
                "\n" +
                "\n" +
                "1- Giriş Düzey Terminal Komutları\n" +
                "2- Temelde Dizinler \n" +
                "3- Depo Eklemek\n" +
                "4- Program Kurmak\n" +
                "5- Program Kaldırmak\n" +
                "6- Program Çalıştırmak\n" +
                "7- Dosya İndirmek\n" +
                "8- Depoda Farklı Sürüm Program Aramak \n" +
                "9- Aptitude Açıklaması\n" +
                "10- Paketleri Güncellemek\n" +
                "11- Listeleme İşlemleri\n" +
                "12- Dizinler Arası Hareket\n" +
                "13- Dizinde Arama Yapmak\n" +
                "14- Dizin ve Dosya Oluşturmak\n" +
                "15- Farklı Komutları Tek Satırda Çalıştırmak\n" +
                "16- Dosya Yetkilendirmeleri Görmek\n" +
                "17- Donanım Bilgilerini Görüntülemek\n" +
                "18- Kernel Bilgisi Görüntüleme\n" +
                "19- Sistem Monitörünü Görüntüleme\n" +
                "20- sudo nedir ?\n" +
                "\n" +
                "GİRİŞ DÜZEY TERMİNAL KOMUTLARI \n" +
                "\n" +
                "* help : Girilen komut için yardım penceresi görüntülenir.\n" +
                "* clear : Ekranı temizler.\n" +
                "* man : Bazı dosyaların daha düzenli görünmesini sağlar.\n" +
                "* exit : Terminal penceresini kapatır.\n" +
                "* sudo su : Kullanıcıya root yetkisi kazandırır.\n" +
                "* ifconfig : Ip adresleri görüntülenir\n" +
                "* echo : Kendinden sonra yazılanları ekrana basar.\n" +
                "\n" +
                "Kısayollar\n" +
                "\n" +
                "* ctrl -r : Yazacağımız komutla ilgili geçmişimiz görüntülenir.\n" +
                "* ctrl -a : Komutun başına gider.\n" +
                "* ctrl -e : Komutun sonuna gider.\n" +
                "* ctrl -z : Yapılan işlemi durdurur.\n" +
                "* ctrl -c : Yapılan işlemi durdurur.\n" +
                "* ctrl + : Ekranı büyütür.\n" +
                "* ctrl - : Ekranı küçültür.\n" +
                "* ctrl o : Ekranı normal boyuta getirir.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "TEMEL DİZİNLER\n" +
                "\n" +
                "/bin : Temel komut binary dosyaları bulunur.\n" +
                "/boot : Sistemin boot edilmesi için gerekli veriler bulunur.\n" +
                "/dev : Harici sürücü dosyalarının dosyasıdır.\n" +
                "/etc : Local sistemlerimiz için gerekli dosyalar.\n" +
                "/home : Kullanıcı dizinlerini barındırır.\n" +
                "/lib : Paylaştırılmış kütüphane dosyaları bulunur.\n" +
                "/mnt : Geçici bağlantı noktası sağlamak için oluşturulmuştur.\n" +
                "/proc : Dosya sisteminin işlem bilgileri dizinidir.\n" +
                "/root : root kullanıcısının kök dizinidir.\n" +
                "/sbin : Çalıştırılabilir önemli sistem dosyaları bulunur.\n" +
                "/tmp : Geçici saklama alanımız.\n" +
                "/usr : Programlar bulunur.\n" +
                "/var : Değişken veri bölgesidir.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "DEPO EKLEMEK\n" +
                "\n" +
                "İndirmek istediğiniz program linuxunuz paket yöneticisi tarafından tercih edilmemiş yada internet üzerinde herhangi bir geliştirici tarafından yüklenmiş olabilir .\n" +
                "Bu tip durumlarda hata almamak için istediğimiz programın yüklü olduğu adresi terminalden\n" +
                "ppa (Kişisel Paket Arşivi) olarak ekleyebiliriz.\n" +
                "\n" +
                "Örnek :\n" +
                "\n" +
                "* sudo apt-add-repository ppa :ubuntu-wine/ppa\n" +
                "\n" +
                "* ppa : [kullanıcı adı] / [ppa adı]\n" +
                "\n" +
                "\n" +
                "Bilgisayarın öz programlarına başka bir sürümün programını ekleyebiliriz . Eklemeyi yaparken depomuzun bulunduğu etc dizinimizi kullanacağız. Terminalden etc dizinini kullanabilmek için sudo komutunu kullanıp root yetkisine erişmemiz gerekiyor . Yazılım kaynaklarımızın listesi buradadır.\n" +
                "\n" +
                "* sudo gedit /etc/apt/sources.list\n" +
                "\n" +
                "Ufak bir ayrıntı vermek gerekirse internet üzerinde hazır .deb uzantılı depolar bulunur.\n" +
                "Bize adres verilerek yol gösterilebilir .\n" +
                "\n" +
                "Örnek :\n" +
                "\n" +
                "* sudo apt-add-repository 'deb http://liveusb.info/multsystem/depo all main\n" +
                "\n" +
                "NOT :\n" +
                "\n" +
                "Depoyu silmek istersek yazılım kaynaklarına ulaşıp listeden kaldırmamız gerekir.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "PROGRAM KURMAK\n" +
                "\n" +
                "* sudo apt-get install [PROGRAM ADI]\n" +
                "\n" +
                "komutu ile paketlerimizin desteklediği programları kurabiliriz .\n" +
                "\n" +
                "Örnek :\n" +
                "\n" +
                "* sudo apt-get install VLC kdenlive firefox\n" +
                "\n" +
                "komutunu yazarak bu üç programı indirebiliriz.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "PROGRAM KALDIRMAK\n" +
                "\n" +
                "\n" +
                "* sudo apt-get autoremove --purge kdenlive\n" +
                "\n" +
                "* sudo apt-get autoclean\n" +
                "\n" +
                "* sudo apt-get clean\n" +
                "\n" +
                "komutlarını sıralayarak kdenlive programını kaldırabiliriz.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "PROGRAM ÇALIŞTIRMAK\n" +
                "\n" +
                "Normal şartlarda terminale programın ismini yazmamız onu çalıştırmak için yeterlidir.\n" +
                "Ancak sadece ismi ile çalıştırabilmemiz için bu programın usr dizininde kayıtlı olması gerekir.\n" +
                "Yoksa çalışmaz. Çalıştırmak istediğimiz programın başına ./ eklememiz yeterlidir .\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "DOSYA İNDİRMEK\n" +
                "\n" +
                "İndirmek istediğimiz dosya linkinin başına wget koyarsak indirebiliriz . Ancak internet bağlantısı koptuğunda vs yarıda kalan indirmenin devam etmesi için -c ekleriz .\n" +
                "\n" +
                "* wget -c [link]\n" +
                "\n" +
                "\n" +
                "İndirme işleminde hız limiti belirleyebiliriz . Komutun sonuna ekleme yapmamız gerekecek.\n" +
                "\n" +
                "* wget -c http:// ... --limit -rate=20k \n" +
                "komutu ile hız sınırını 20 kb ile sınırlayabiliriz .\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "DEPODA FARKLI PROGRAMIN FARKLI SÜRÜMÜNÜ ARAMAK\n" +
                "\n" +
                "Herhangi bir programın farklı sürümlerini görüntüleyip yükleme yapabiliriz . Kütüphaneleri görmemek için de extra bir komut yazarız .\n" +
                "\n" +
                "* sudo apt-cache search --names-only nvidia\n" +
                "\n" +
                "komutundan sonra nvidia nın sürümleri listelenir\n" +
                "\n" +
                "Daha sonra istediğimiz bir sürümünü apt-get install ile yükleyebiliriz.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "APTITUDE AÇIKLAMASI\n" +
                "\n" +
                "Biraz da eğlence ..\n" +
                "\n" +
                "* apt-get aletinin bir benzeridir . Bize bir arayüz sunar .Çalışmalarımızı burada yapabiliriz.\n" +
                "\n" +
                "Aynı şekilde apt-get yerine kullanabiliriz . Program kurup kaldırmamıza yarar.\n" +
                "\n" +
                "* aptitude komutu ile arayüze erişebilirsiniz .\n" +
                "\n" +
                "Bunuda deneyin : * aptitude -v moo\n" +
                "\n" +
                "Sonra v leri çoğaltın ..\n" +
                "\n" +
                "Süper İnek Gücünde Değiliz :D\n" +
                "\n" +
                "\n" +
                "\n" +
                "-\n" +
                "\n" +
                "PAKETLERİ GÜNCELLEMEK \n" +
                "\n" +
                "* sudo apt-get upgrade \n" +
                "\n" +
                "komutu ile paketlerimi güncelleyebiliriz .\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "LİSTELEME İŞLEMLERİ\n" +
                "\n" +
                "* ls : Bulunduğumuz dizinin içindeki görünebilir dosya ve içerikleri listeler .\n" +
                "\n" +
                "* ls -a : Bulunduğumız dizinde tüm dosya ve klasörleri listeler .\n" +
                "\n" +
                "* ls \"dizin\" : Dizininin içindekileri listeler.\n" +
                "\n" +
                "* ls /usr : usr dizininin içindekileri listeler .\n" +
                "\n" +
                "* ls / : Kök dizininin içindekileri listeler .\n" +
                "\n" +
                "* ls .. : Bir üst dizinin içindekileri listeler .\n" +
                "\n" +
                "* ls -l : Ayrıntılı listeleme yapar . Dosyaların oluşturulma zamanını görebiliriz .\n" +
                "\n" +
                "* ls -1 : Sütun halinde listeleme yapar .\n" +
                "\n" +
                "* ls -s : Dosyaları boyutuna göre listeler .\n" +
                "\n" +
                "* ls -s1a : Bulunulan dizindeki tüm dosyaları sütun halinde boyutuna göre listeler .\n" +
                "\n" +
                "* ls -R : İçindeki dizin ve dosyaların içeriğindekiler de görüntülenir .\n" +
                "\n" +
                "* ls > \"metin belgesi\" : O dizinde metin belgesi adında belge oluşturup listeyi buraya yazdırır.\n" +
                "\n" +
                "* ls > Masaüstü / \"metin belgesi\" : Masaüstü dizinine oluşturulan belgenin içerisine yazdırır .\n" +
                "\n" +
                "* ls >> Masaüstü / \"metin belgesi\" : Masaüstü dizinine oluşturulan belgenin içerisine belgenin \n" +
                "\n" +
                "içindekileri silmeden üstüne ekleyerek yazdırır .\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "DİZİNLER ARASI HAREKET\n" +
                "\n" +
                "* pwd : Hangi dizinde olduğumuzu görebiliriz .\n" +
                "\n" +
                "* cd : Ev dizinine döner .\n" +
                "\n" +
                "* cd Masaüstü : Masaüstü dizinine gider (Arada dizin varsa eklenmesi gerekir)\n" +
                "\n" +
                "* cd .. : Bir üst dizine geçer .\n" +
                "\n" +
                "* cd - : Bir önceki dizine geçer .\n" +
                "\n" +
                "* cd / : Ana dizine hdd bağlanma noktasına gider .\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "DİZİNDE ARAMA YAPMAK\n" +
                "\n" +
                "\n" +
                "* which \"program adı\" : Programın nerden çalıştığını gösterir .\n" +
                "\n" +
                "* whereis \"program adı\" : Which in yanında etkileşimli olunan yerleri de gösterir . \n" +
                "\n" +
                "* locate \"isim\" : İsmin geçtiği heryeri görüntüler .\n" +
                "\n" +
                "* find /\"dizin\" -iname \"*.x\" > Desktop/liste : Belirttiğimiz dizin ve x uzantısındaki bütün dosyaların\n" +
                "listelerini masaüstündeki liste adındaki belgeye kaydeder .\n" +
                "\n" +
                "* grep arananKelime arananMetinBelgesi : Kelimemizi metin belgesi içinde arar .\n" +
                "\n" +
                "\n" +
                "--\n" +
                "\n" +
                "\n" +
                "DİZİN VE DOSYA OLUŞTURMAK\n" +
                "\n" +
                "\n" +
                "* > metin adı.x : Bulunduğumuz dizinde belirttiğimiz x uzantılı bir belge oluşturur .\n" +
                "\n" +
                "* echo 'metin' > \"dosya adı \".uzantısı : Metnin içeriğindekileri dosyaya yazar .\n" +
                "\n" +
                "* echo -e \"1\\n22\\333\" >> sunum.odt : Sunum word belgemizin içindekilere alt alta 1,22,333 yazar . \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "FARKLI KOMUTLARI TEK SATIRDA ÇALIŞTIRMAK\n" +
                "\n" +
                "örnek:\n" +
                "\n" +
                "* 1. işlem && 2. işlem && 3. işlem \n" +
                "\n" +
                "Ve aracı ile yan yana işlemleri tek satırda yaptık .\n" +
                "\n" +
                "\n" +
                "örnek:\n" +
                "\n" +
                "* clear && echo \"Hello World\" && ....\n" +
                "\n" +
                "\n" +
                "örnek:\n" +
                "\n" +
                "* 1. işlem | 2. işlem \n" +
                "\n" +
                "Bu birleşik komutta 2. işlemin girdisi olarak 1. işlemin sonucu kullanılmıştır .\n" +
                "\n" +
                "\n" +
                "örnek:\n" +
                "\n" +
                "* ls -1 | grep.x > dizin > metin belgesi \n" +
                "\n" +
                "x uzantılı dosyaların listesinin çıkarıp metin belgesine yazdırdı .\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "DOSYA YETKİLENDİRMELERİNİ GÖRMEK\n" +
                "\n" +
                "\n" +
                "Öncelikle arayüzde dosyanın üzerinde sağ tıklayıp özelliklerden permission kısmındaa ayarlar \n" +
                "\n" +
                "kontrol edilebilir . \n" +
                "\n" +
                "* ls -1l komutu ile dosyalara verilen izinleri ayrıntısı ile görebiliriz .\n" +
                "\n" +
                "okuma izni : 4\n" +
                "yazma izni : 2\n" +
                "çalıştırma : 1 \n" +
                "\n" +
                "Kullanıcıya göre bu rakamlar toplanır . \n" +
                "\n" +
                "dosya izni 754 olan bir dosya için ;\n" +
                "\n" +
                "ilk rakam - ikinci rakam - üçüncü rakam\n" +
                "\n" +
                "(dosya sahibi) (ortak grup ) (diğerleri)\n" +
                "\n" +
                "olarak kişilere göre gruplanır . Buradan da dosya sahibinin bütün yetkilere sahip olduğunu \n" +
                "\n" +
                "çıkarabiliriz . \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "DONANIM BİLGİLERİNİ GÖRÜNTÜLEMEK \n" +
                "\n" +
                "Kullanabileceğimiz 5 temel komut var . \n" +
                "\n" +
                "ls , inxi , dmidecode , df , xinput \n" +
                "\n" +
                "\n" +
                "* cat /etc/os-release : Sistemin kaynak kodunu , sürümünü vs görüntüler \n" +
                "\n" +
                "Aynı zamanda yazılım merkezi de görülür .\n" +
                "\n" +
                "* lshw short : Kısa genel bilgilendirme görüntülenir .\n" +
                "\n" +
                "* inxi -M : Makine sistem ürün versiyon bilgileri için kullanılır .\n" +
                "\n" +
                "* inxi -F : Daha ayrıntılı görünüm içindir .\n" +
                "\n" +
                "* inxi -v 0-7 : Spesifik ayrıntılar için . \n" +
                "\n" +
                "* inxi -G : Ekran kartı bilgileri için .\n" +
                "\n" +
                "* dmidecode -t \"numara yada isim\" : Sistem , BIOS , makine vs ayrıntıları içindir . \n" +
                "\n" +
                "* dmidecode -t bios : BIOS hakkında bilgi elde edebilirsiniz .\n" +
                "\n" +
                "* lsusb : Usb bağlantıları hakkında bilgi verir .\n" +
                "\n" +
                "* lsblk : Hard disk hakkında bilgi verir .\n" +
                "\n" +
                "\n" +
                "--\n" +
                "\n" +
                "\n" +
                "KERNEL BİLGİSİ GÖRÜNTÜLEMEK\n" +
                "\n" +
                "\n" +
                "Özel olarak değiştirmediğimiz sürece sabit kalan bilgimizdir . Tüm paketler bu bilgiye göre alınır \n" +
                "\n" +
                "* uname -a \n" +
                "\n" +
                "* uname -r \n" +
                "\n" +
                "\n" +
                "Kernel ve diğer uyumluluk paketlerini yükleyip sistemin temel taşlarını yükseltmek için ;\n" +
                "\n" +
                "sudo apt-get dist-upgrade komutu kullanılır .\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "SİSTEM MONİTÖRÜNÜ GÖRÜNTÜLEMEK\n" +
                "\n" +
                "\n" +
                "Sistemin hangi iş için hangi öncelikte ne kadar CPU kullandığını arayüzde görmek için ;\n" +
                "\n" +
                "* free -m \n" +
                "\n" +
                "* top \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "SUDO NEDİR\n" +
                "\n" +
                "\n" +
                "\" Super user do \"\n" +
                "\n" +
                "Komutlarımızı root kullanıcı yetkisi ile gerçekleştirmek için kullanırız .\n" +
                "\n" +
                "Sürekli olarak sudoyu kullanmak yerine komutlarımızı yazmadan önce bir defalığına \n" +
                "\n" +
                "* sudo su komutunu yazmamız yeterli olacaktır .\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n"));

        eduList.add(new DummyItem("2","GIT DERSLERİ", "\t\tGIT EĞİTİMİ\n" +
                "\n" +
                "\n" +
                "   İçindekiler\n" +
                "\n" +
                "\n" +
                " 1- Git Nedir, Nasıl Çalışır ?\n" +
                " 2- Git Projesi Oluşturma\n" +
                " 3- Commit Etme ve Logları Görme\n" +
                " 4- Geçiş Bölgesi İnceleme Status \n" +
                " 5- Yapılan Değişiklikleri Görme\n" +
                " 6- Değişiklikleri Geri Alma \n" +
                " 7- Versiyon Değiştirme\n" +
                " 8- GitHub Deposuna Proje Göndermek\n" +
                " 9- Projede Branche (Dal) Oluşturma\n" +
                " 10- GitHub Arayüzünde Bazı İşlevler\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "BÖLÜM-1\n" +
                "\n" +
                "\n" +
                "                GIT NEDİR , NASIL ÇALIŞIR ?\n" +
                "\n" +
                "\n" +
                " * Git bir versiyon kontrol sistemidir\n" +
                "\n" +
                " * Profesyonel kod ve proje geliştirmede projelerin versiyonlarını tutmamıza\n" +
                " yarar\n" +
                " \n" +
                " * Onlar üzerinde oynamalar yapmamıza , bir sorunla karşılaştığımızda eski \n" +
                " versiyonlara geri dönebilmemize imkan verir.\n" +
                " \n" +
                " * Linus Torvalds (Linux İşletim Sistemi Çekirdeğinin Geliştiricisi) tarafından\n" +
                " açık kaynak kodlu olarak geliştirilmiştir.\n" +
                "\n" +
                " * Normal şartlarda projelerimizde önlem amaçlı olarak kopyalama yöntemine\n" +
                " başvururuz. Git teknolojisi burada yardımımıza koşar ve bu karmaşıklığa mahal\n" +
                " kalmaz.\n" +
                "\n" +
                " * Projemizi git teknolojisi ile paylaşıma açarak takım çalışmalarımızda\n" +
                " son derece rahat veri iletişimi aktarımı sağlayabiliriz.\n" +
                "\n" +
                " * Çalışma mantığını açıklayacak olursak ;\n" +
                "\n" +
                " - Elimizde bir proje dosyası olduğunu düşünelim. \n" +
                " - Biz bu dosyanın içerisine git teknolojisini entegre ederiz.\n" +
                " - Daha sonra bu dosya üzerinde yapılan değişiklikler üzerinden farklar hesaplanarak\n" +
                " versiyonlama yapılır.\n" +
                " - Eski versiyonlara dönüş yapılırken de bu versiyona göre olan değişiklikler \n" +
                " kaldırılıyor silinmiş dosyalar getri getiriliyor.\n" +
                " - Böylece hiç bir şey olmamış  gibi projelerimize sağlıklı şekilde devam ediyoruz.\n" +
                "\n" +
                " * Versiyonların tutulma şekli kısaca ;\n" +
                "\n" +
                " [ Versiyonİsmi  VersiyonlamaZamanı  VersiyonlayanKişi ]\n" +
                "\n" +
                " diyebiliriz.\n" +
                "\n" +
                " * Git kurulumu için ;\n" +
                "\n" +
                " https://git-scm.com/downloads  \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                " \n" +
                "\n" +
                "BÖLÜM-2\n" +
                "\n" +
                "\n" +
                "\t\t\tGIT PROJESİ OLUŞTURMA \n" +
                "\n" +
                "\n" +
                " * Öncelikle git sisteme kendimizi tanıtmalı konfigürasyon ayarlarını yapmalıyız\n" +
                " ki alınan versiyonların kime ait olduğu bilinsin karışıklık yaşanmasın\n" +
                "\n" +
                " * Windowsta çalışıyor iseniz başlat menüsünden git bash uygulamasını açın. \n" +
                " Linuxta çalışıyorsanız terminal yeterli olacaktır. Daha sonra ;\n" +
                "\n" +
                " >> git config --global user.name \"Furkan Yıldız\"\n" +
                " >> git config --global user.email \"1.618@gmail.com\"\n" +
                "\n" +
                " komutlarıyla konfigürasyon ayarında kullanıcı adımı ve emailimi belirledim.\n" +
                " \n" +
                " * Kontrol amaçlı olarak;\n" +
                " \n" +
                " >> git config --global user.name \n" +
                "\n" +
                " komutunu çalıştırıp örneğin kullanıcı adınızı görebilirsiniz.\n" +
                "\n" +
                " * Şimdiye kadar yapılandırma ayarlarımızı tamamlamış olduk . Proje içinde \n" +
                " kullanımına geçebiliriz\n" +
                "\n" +
                " * Diyelimki masaüstümüzde bir mobil proje dosyamız var. Biz bu projeyi git\n" +
                " versiyon kontrol sistemiyle kontrol etmek yeni versiyonlar üretmek vs istiyoruz\n" +
                "\n" +
                " * Adım  adım gidelim ;\n" +
                "\n" +
                " Adım 1-\n" +
                "\n" +
                "  Git bash yada terminalimiz üzerinden pwd , ls , cd komutlarını kullanarak\n" +
                " bu proje dosyasının içine giriyoruz. (bilgi edinmek için linux eğitim yazımda\n" +
                " 12.kısma göz atabilirsiniz.)\n" +
                "\n" +
                " Adım 2-\n" +
                "\n" +
                "  >> git init \n" +
                " komutunu çalıştırarak projemizin bir git projesi olduğunu bildiriyoruz .\n" +
                " Böylece git dosyaları gizli dosya formatında proje dosyamızın içerisine \n" +
                " yerleştiriliyor.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Bölüm-3\n" +
                "\n" +
                "\n" +
                "\t \tCOMMMIT ETME VE LOGLARI GÖRME\n" +
                "\n" +
                " \n" +
                " * Bu kısımda projemizi önce geçiş bölgesine taşıyıp sonra da depomuza koyup\n" +
                " versiyonlamış olacağız.\n" +
                "\n" +
                " * Terminalde aynı dizindeyiz bütün işlemleri projemizin ana dizininde yapacağız\n" +
                "\n" +
                " * Projemizin içinde yeni bir metod yazdığımızı düşünelim \n" +
                "\n" +
                " * Bu proje artık ilk halinden farklı olmuş oldu . Metodu depoya eklemek için ;\n" +
                "\n" +
                "  Başta ;\n" +
                "\n" +
                "  >> git add .\n" +
                " \n" +
                " komutu ile geçiş bölgesine koyduk . Geçiş bölgesi Staging Area denen çalışma alanı\n" +
                " ile depo arasındaki kontrol noktasıdır. Komuttaki \".\" tüm dosyalar manasını taşır.\n" +
                " \n" +
                "  Sonra ;\n" +
                "\n" +
                "  >> git commit -m \"v.1.0 ilk commit\" \n" +
                " \n" +
                " bu komutla oluşturduğumuz metodu da içine katarak yeni ve ilk versiyonumuzu \n" +
                " oluşturmuş olduk. Parantez içindeki mesaj o versiyonu açıklar nitelikte olmalıdır.\n" +
                "\n" +
                " * Proje üzerinde örnekteki gibi istediğimiz şekilde oynama ekleme çıkarma yaparak\n" +
                " birçok versiyon yaratabiliriz.\n" +
                "\n" +
                " * Oluşturduğumuz versiyon kayıtlarını görebilmek için ;\n" +
                "\n" +
                "  >> git log \n" +
                "\n" +
                " komutunu çalıştırmamız yeterlidir. Açılan ekranda versiyon hash kodu versiyon notu \n" +
                " kimin ne zaman versiyonladığı gibi önemli bilgiler yer alır. Örnek olarak ;\n" +
                "\n" +
                "  Commit  32454312432\n" +
                "  Author  Furkan Yıldız <1.618@gmail.com>\n" +
                "  Date    Tue Sep 08  17:15:01 2018 +0300\n" +
                "  \n" +
                "    v.1.0 ilk commit\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Bölüm-4\n" +
                "\n" +
                "\t\tGEÇİŞ BÖLGESİ İNCELEME STATUS\n" +
                "\n" +
                "\n" +
                " * Projemizde direkt olarak ;\n" +
                "\n" +
                "  >> git status \n" +
                "\n" +
                " komutunu çalıştırırsak eğer bizim çalışma dizinimizle geçiş bölgesi arasında olan\n" +
                " farklılıklar görülecektir.\n" +
                " \n" +
                " * Bunun anlamı ; \n" +
                "  \" Sen projende bir değişiklik yapmıssın . Senin bu değişiklikleri \n" +
                " kaydetmen için önce geçiş bölgesine yüklemen gerekiyor \" \n" +
                "\n" +
                " * Status komutundan sonra listelenenleri geçiş bölgesine taşımak için ;\n" +
                " \n" +
                " >> git add listedekidosyanınismi\n" +
                "\t\t\tveya\n" +
                " >> git add .\n" +
                "\n" +
                " * İki farklı şekilde belirtmemin sebebi isterseniz değişikliklerin bi kısmını \n" +
                " kaydetmek istemeyebilirsiniz.\n" +
                "\n" +
                " * Bundan sonra tekrar ;\n" +
                " \n" +
                " >> git status \n" +
                " \n" +
                " komutunu çalıştırırsak bu defa değişikliklerin geçiş bölgesine taşınmış \n" +
                " artık bunları commit etmeye hazır olduğunu söyleyen mesajla karşılaşırız \n" +
                "\n" +
                " * Devamında versiyonlamamızı yapalım ve loglara bakalım ;\n" +
                "\n" +
                " >> git commit -m \"v.1.1 yeni versiyonumuz\"\n" +
                "\n" +
                " >> git log \n" +
                "\n" +
                " * En son tekrar status komutunu çalıştırdığımızda ;\n" +
                "\n" +
                " >> git status \n" +
                "\n" +
                " geçiş bölgesine eklenecek dosyanın olmaadığını görürüz.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Bölüm-5\n" +
                "\n" +
                "\t\t\tYAPILAN DEĞİŞİKLİKLERİ GÖRME \n" +
                "\n" +
                "\n" +
                " * Projemize bir metod eklediğimizi varsayalım\n" +
                "\n" +
                " * >> git status \n" +
                "\n" +
                " komutundan sonra geçiş bölgesine konulmaya hazır olan bu metodumuzun ismi \n" +
                " görünecektir . \n" +
                " \n" +
                " * >> git diff\n" +
                " \n" +
                " komutundan sonra ise bu metodun açık halini eklenmiş çıkarılmış şeklinde ayırarak\n" +
                " bize + yada - şeklinde belirterek gösterir.\n" +
                " \n" +
                " * >> git add .\n" +
                "\n" +
                " diyerek metodumuzu geçiş bölgesine alalım .\n" +
                "\n" +
                " * >> git commit -m \"metod eklendi v.2.0\"\n" +
                "\n" +
                " komutuyla versiyonlamış olalım.\n" +
                "\n" +
                " * >> git status\n" +
                "\n" +
                " oluşan farklılıkları geçiş bölgesine alıp versiyonlama yaptığımızdan dolayı\n" +
                " bu komuttan sonra birşey göremeyiz.\n" +
                "\n" +
                " * >> git diff \n" +
                "\n" +
                " geçiş bölgesine konacak farklılık olmadığından bu komuttan da herangi birşey\n" +
                " elde edemeyiz.\n" +
                "\n" +
                " * Projemizden metodu silelim daha sonra da tekrar\n" +
                " \n" +
                " >> git diff\n" +
                "\n" +
                " diyelim. Silinen alanlar tek tek başında - işaretiyle beraber belirtilecektir.\n" +
                "\n" +
                "\n" +
                " NOT :\n" +
                "\n" +
                "\n" +
                "  Projede değişiklik yapıp bunları geçiş bölgesine aldıktan sonra diff komutunu \n" +
                " çalıştırırsak herangi birşey göremeyiz. Çünkü komutun yalın hali bize çalışma\n" +
                " alanımız ile geçiş bölgemizin arasındaki farkı gösterir.\n" +
                "\n" +
                "\n" +
                "  Geçiş bölgesiyle git deposu arasındaki farkları görmek için ise ;\n" +
                "\n" +
                " >> git diff --staged \n" +
                "\n" +
                " komutunu çalıştırmalıyız. Commit ettikten sonra çalıştırdığımızda bu komuttan da\n" +
                " herangi birşey elde edemeyiz.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Bölüm-6\n" +
                "\n" +
                "\t\t\t DEĞİŞİKLİKLERİ GERİ ALMA \n" +
                "\n" +
                "\n" +
                " * Projemizin içinden bir metodu veya metodun içinden bir parça kodu yanlışlıkla \n" +
                " sildik diyelim . Ama hala geçiş bölgesine almamış veya versiyonlamamış olalım .\n" +
                "\n" +
                " *  >> git status \n" +
                " komutuyla yanlışlıkla silme yaptığımız metodumuzu görebiliriz.\n" +
                "\n" +
                " * >> git checkout -- metodunAdı \n" +
                " komutuyla silinen yerleri geri getirdik.\n" +
                "\n" +
                " * Peki metodu sildikten sonra üstüne bir de yanlışlıkla geçş bölgesine taşıdığımızı\n" +
                " düşünelim . Şimdi nasıl geri getireceğiz ?\n" +
                "\n" +
                " * Mantıken önce geçiş bölgesinden geri çalışma alanımıza taşıyıp daha sonra da\n" +
                " yukarda yazdığımız checkout komutunu çalıştırmak yeterli olacaktır. Bunun yolu;\n" +
                "\n" +
                " >> git reset HEAD metodunAdı \n" +
                " diyerek add işleminin tersini yaptık \n" +
                "\n" +
                " >> git checkout metodunAdı\n" +
                " sonra da bu komutla eski haline getirmiş olduk.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Bölüm-7\n" +
                "\n" +
                "\t\t\t  VERSİYON DEĞİŞTİRME  \n" +
                "\n" +
                "\n" +
                "  * Daha önceden projemizin versiyonlarını almıştık . Elimizde V1,V2,V3 adında\n" +
                " versiyonlarımız olsun . V3 te çalıştığımızı varsayıyoruz \n" +
                "\n" +
                "  * Bir sorun çıktı ve V2 versiyonuna geri dönmemiz gerekti \n" +
                "\n" +
                "  >> git checkout V2ninHashKodu .\n" +
                " komutu ile dönüş yapabiliriz \n" +
                "\n" +
                "  * Burada mantık V2 nin bir kopyasını yaratıp devam etmektir\n" +
                "\n" +
                "  * V2ninHashKodu olarak belirttiğimiz alan ;\n" +
                " \n" +
                "  >> git log \n" +
                "\n" +
                "  komutunda çıkan versiyonların bilgileri arasında bulunan commit yazısının yanındaki\n" +
                "  uzun koddur.\n" +
                "\n" +
                "  * Bir projede yalnızca bir metodun eski versiyondaki halini almasını istersek \n" +
                "\n" +
                "  >> git checkout V2ninHashKodu metodunAdı \n" +
                "  komutu yeterli olacaktır.\n" +
                "\n" +
                "  \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Bölüm-8\n" +
                "\n" +
                "\t\t\t GITHUB DEPOSUNA PROJE GÖNDERMEK \n" +
                "\n" +
                "\n" +
                "  * Öncelikle kendinize bir github hesabı açmalısınız . Daha sonra arayüzünden new \n" +
                " repository tuşuyla boş bir depo oluşturun ve bir isim verin .\n" +
                "\n" +
                "  * GitHubda oluşturduğumuz depoyu açıp adres uzantısını kopyalayalım . \n" +
                "\n" +
                "  * Terminalimizi açıp github deposuna göndereceğimiz proje dizinine gelelim .\n" +
                "\n" +
                "  * Burada ilk olarak uzak bağlantıyı belirtmemiz gerekiyor. \n" +
                "\n" +
                "  >> git remote add herhangiTakmaAd gitHubDepomuzunUzantısı \n" +
                "\n" +
                " komutunu çalıştırdıktan sonra \n" +
                " \n" +
                "  >> git remote \n" +
                "\n" +
                " komutu ile bağlantının eklenip eklenmediğini kontrol edebiliriz .\n" +
                "\n" +
                "  * Artık projemizi gitHuba gönderebiliriz . Bunun için ;\n" +
                "\n" +
                "  >> git push -u herhangiTakmaAd master \n" +
                "\n" +
                " komutuyla projemizi master özellikte depomuza koymamız için bilgilerimizi\n" +
                " isteyecektir . Giriş yaptığımızda projemiz depomuza eklenmiş olur .\n" +
                "\n" +
                "  * GitHub sayfamıza gelip depomuzu açtığımızda dosyalarımızın eklendiğini görürüz .    \n" +
                "  \n" +
                "  * Yerelimizde dosyamız üzerinde silme ekleme vs işlemleri yapıp tekrar son komutu\n" +
                " girerseniz dosyalarınız senkronize şekilde eşitlenmiş olacaktır . \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Bölüm-9\n" +
                "\n" +
                "\t\t\t PROJEDE BRANCHE (DAL) OLUŞTURMA\n" +
                "\n" +
                "\n" +
                "  * Projemizi başta master olarak belirtmiştik . Master gövde görevi görmektedir. \n" +
                " Anlaşılacağı gibi projenin ana kısmını masterda tutarız . \n" +
                "  \n" +
                "  * Daha sonra ana daldaki projenin bir kopyasını alarak üzerinde değişiklikler\n" +
                " farklı testler vs yaparak işlev görmesini sağlayabiliriz . İstersek bu dalı sonradan\n" +
                " master olarak da atayabiliriz . \n" +
                "\n" +
                "  * Dallanma en çok takım çalışmalarında kullanılan yöntemdir . Bu yöntem sayesinde \n" +
                " farklı görevleri üstlenmiş olan insanlar bir arada rahatlıkla çalışabilecek \n" +
                " kod paylaşımlarını çok hızlı ve verimli hale getirebileceklerdir . \n" +
                "\n" +
                "  * GitHub sayfanızın arayüzünden yeni bir dal oluşturup dosyalar yaratıp daha sonra \n" +
                " bu dalı master dalıyla birleştirebilirsiniz. Birleştirme esnasında iki dal arasındaki\n" +
                " farkları görmenize de imkan verilir . \n" +
                "\n" +
                "  * GitHubda projemiz üzerinde değişiklik yapmış olalım ve bu projenin son halini \n" +
                " localimize nasıl taşıyacağımıza bakalım .\n" +
                "\n" +
                "  >> git pull \n" +
                "\n" +
                "  bu kadar basit bir kod ile githubdaki alanla localimizi eşitlemiş oluruz .\n" +
                "\n" +
                "\n" +
                "  * Terminal kullanarak dal oluşturalım .\n" +
                " \n" +
                "  >> git branche \n" +
                " \n" +
                "  komutuyla yerelde mevcut olan dallarımızı görürüz.\n" +
                "\n" +
                "  >> git branche  --all \n" +
                "\n" +
                "  komutuyla uzak depomuz da dahil tüm dallarımızı görürüz.\n" +
                "\n" +
                "  >> git branche yeniDal\n" +
                "\n" +
                "  ile yeni bir dal oluşturmuş oluruz.\n" +
                "\n" +
                "\n" +
                "  * Tekrar komut çalıştırarak kontrol yapabiliriz. Şimdilik halen master dalındayız . \n" +
                " Oluşturduğumuz dala geçiş yapmak için ;\n" +
                "\n" +
                "  >> git checkout yeniDal \n" +
                "\n" +
                "  komutuyla geçiş yaptık. \n" +
                "\n" +
                "\n" +
                "  * Yeni dalımızdayken projemizde değişiklikler yaptıktan sonra commit edebilir\n" +
                " versiyonlama işlemi yapabiliriz . \n" +
                "\n" +
                " \n" +
                "  * Dallarımızı birleştirmek için öncelikle master dalımıza geçmemiz gerekiyor \n" +
                "\n" +
                "  >> git checkout master \n" +
                "\n" +
                "  ile master dalına dönüş yaptık .\n" +
                "\n" +
                "  >> git diff master yeniDal \n" +
                "\n" +
                "  komutuyla ana ve yan dalımız arasındaki farklılıkları görebiliriz . \n" +
                "\n" +
                "  >> git merge yeniDal \n" +
                "\n" +
                "  ile de master ve yan dalımızı birleştirmiş olduk . \n" +
                "\n" +
                "\n" +
                "  * Yaptığımız değişikliklerimizi uzak depomuzla eşitleyelim .\n" +
                "\n" +
                "  >> git push -u herhangiTakmaAd master \n" +
                "\n" +
                "  komutumuzla depomuzla localimizi eşitlemiş oluruz.  \n" +
                "\n" +
                "\n" +
                "  \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Bölüm-10\n" +
                "\n" +
                "                     GITHUB ARAYÜZÜNDE BAZI İŞLEVLER\n" +
                "\n" +
                "\n" +
                "\n" +
                "  * GitHub arayüzünüzde projenize bir Readme dosyası ekleyerek paylaşım yaptığınız\n" +
                " kişilerin kodlarınızı okumadan bir ön bilgi edinmesini sağlayabilirsiniz . \n" +
                "\n" +
                "\n" +
                "  * Farklı projeler üzerinde incelemeler yaparken üst kısımda bulunan watch tuşunu aktif\n" +
                " ederseniz bu proje üzerinde yapılan değişiklikler hakkında bilgi edinmeniz sağlanır.\n" +
                "\n" +
                "  \n" +
                "  * Star tuşunu aktif ediğinizde projeyi beğenmiş olursunuz ve ayrıca daha sonra\n" +
                " bu projeyi ayrıntılı inceleyebilmeniz için hesabınızdaki stars alanına eklenmiş \n" +
                " olur. \n" +
                "\n" +
                "  \n" +
                "  * Fork tuşu ile de projeninbir kopyasını hesabınıza alabilirsiniz.\n" +
                "\n" +
                "\n" +
                "  * Issues alanında projenizle ilgili bir problem açıklaması yaparak problem için\n" +
                " diğer bir kategori belirleyerek insanların yada var ise takım arkadaşlarınızın bu \n" +
                " açıklamaları görüp projede o kısımda çalışarak size dönüş yapmalarını sağlayabilirsiniz .  \n" +
                "\n" +
                "\n" +
                "\n"));

        eduList.add(new DummyItem("3","FIREBASE DERSLERİ", " \t   FIREBASE  EĞİTİMİ\n" +
                "\n" +
                "    \n" +
                "   İçindekiler\n" +
                "  \n" +
                "\n" +
                " 1- Başlarken\n" +
                " 2- Firebase İle Bağlantı Sağlamak\n" +
                " 3- Veri Eklemek\n" +
                " 4- Veri Okumak\n" +
                " 5- Sınıf İle Kayıt Yapmak\n" +
                " 6- Sınıf Kayıtlarını Görmek\n" +
                "\n" +
                "\n" +
                "\n" +
                "BÖLÜM-1\n" +
                "\n" +
                "\t         BAŞLARKEN\n" +
                "\n" +
                "\n" +
                " * Firebase'in kendi sitesinden proje oluştur diyerek başlayalım.\n" +
                "Daha sonra yönlendirmeleri takip ederek kullanacağımız alanı seçebiliriz.\n" +
                " \n" +
                " * Android ios ve web projeleri için kullanılabiliyor. Uygulamanın paket \n" +
                "adını vermemiz gerekecek. Bu paket adı android projesinde en üst satırdaki\n" +
                "alandır (package alınmaz). \n" +
                "\n" +
                " * Firebase'in kendi sayfasından database kısmına girdiğinizde veritabanı \n" +
                "işlemlerinde üzerinde oynama yapacağınız alanı görürsünüz\n" +
                "   \n" +
                " * Firebasein veritabanı tasarımı alışagelmişin dışında bir yapıya sahiptir. \n" +
                "NoSql tarzda ağaç yapısıyla temsil görülen bir görünümdedir.\n" +
                " \n" +
                " * Site içinde veritabanına ekleme çıkarma yapmadan önce kurallar kısmından kimlerin \n" +
                "bu izinlere sahip olacaklarını tanımlamamız gerekiyor.\n" +
                "Read ve write kısımlarını true yapmalısınız.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "BÖLÜM-2\n" +
                "\n" +
                "        FIREBASE İLE BAĞLANTI SAĞLAMAK\n" +
                "\n" +
                "\n" +
                " * Daha sonra firebase uygulamamızla entegre için\n" +
                "bir json dosyası sunar bizlere . bu dosyayı app dosyasının içine bırakmamız \n" +
                "gerekiyor.\n" +
                " \n" +
                " * Project gradle ve app gradle dosyalarının içine eklememiz gerek classpath ve \n" +
                "apply plugin eklentilerini yapıştırmamız gerekiyor.\n" +
                "   \n" +
                " * Projemiz içinde;\n" +
                "\n" +
                " FirebaseDatabase db;  \n" +
                " db= FirebaseDatabase.getInstance(); \n" +
                "\n" +
                " // Diyerek sınıftan bir örnek çıkarıp instance alarak\n" +
                " // Projemizi firebasee bağlamış oluruz\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "BÖLÜM-3\n" +
                "\n" +
                "\t        VERİ EKLEMEK\n" +
                "\n" +
                "\n" +
                " * Ekleme Metodumuz içinde;\n" +
                "  \n" +
                "  public void ekleme(String eklenecek){\n" +
                "\n" +
                "     DatabaseReference dbRef = db.getReference(\"Eklenenler\"); \n" +
                "     //Hangi başlık altına eklenecekse.\n" +
                "\n" +
                "     String key = dbRef.push().getKey();\n" +
                "     DatabaseReference dbRefYeni = db.getReference(\"Eklenecekler/\"+key);\n" +
                "     // Bu kısım database üzerine ekleme yaparken verilerin\n" +
                "     // Üst üste yazılmaması için kullandık.\n" +
                "\n" +
                "     dbRefYeni.setValue(eklenecek); // eklenecek veriyi de value olarak dala atarız\n" +
                "  \n" +
                "  }\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "BÖLÜM-4\n" +
                "\n" +
                "\t        VERİ OKUMAK\n" +
                "\n" +
                "\n" +
                " * Okuma Metodumuz içinde;\n" +
                "\n" +
                "  public void oku(){\n" +
                "     DatabaseReference okuma = db.getReference(\"Eklenecekler\");\n" +
                "     okuma.addValueEventListener(new ValueEventListener()){\n" +
                "         @Override\n" +
                "         public void onDataChange(DataSnapshot dataSnapshot){\n" +
                "\n" +
                "             gör.setText(\"\"); \n" +
                " \t     // Okuduğumuz verileri daha önce oluşturduğumuz bu textboxa yazlım\n" +
                "\n" +
                "             Iterable<DataSnapshot> keys = dataSnapshot.getChildren();\n" +
                " \t     // Bu iterable örneği sayesinde dallardaki childleri aldık\n" +
                "  \t\t\n" +
                "             for (DataSnapshot key: keys){\n" +
                "        \t  gör.append(key.getValue().toString()+\"\\n\");\n" +
                "\t\t  // Alınan keylerin değerlerini tek tek yazdırdık.\n" +
                "\t      }\n" +
                "           }     \n" +
                "       }\n" +
                "   }\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "BÖLÜM-5\n" +
                "\n" +
                "\t\tSINIF İLE KAYIT YAPMAK \n" +
                "\n" +
                " \n" +
                " * Ekleme Metodumuz içinde;\n" +
                "  \n" +
                "  public void ekleme(String ad,String soyad,int yas){\n" +
                "\n" +
                "     DatabaseReference dbRef = db.getReference(\"Kisiler\"); \n" +
                "     //Hangi başlık altına eklenecekse.\n" +
                "\n" +
                "     String key = dbRef.push().getKey();\n" +
                "     DatabaseReference dbRefYeni = db.getReference(\"Kisiler/\"+key);\n" +
                "     // Bu kısım database üzerine ekleme yaparken verilerin\n" +
                "     // Üst üste yazılmaması için kullandık.\n" +
                "\n" +
                "     dbRefYeni.setValue(new Kisi(ad,soyad,yas)); \n" +
                "     // Önceden oluşturulup getter setter metodları yazılmış Kisi sınıfı mevcut\n" +
                "     // Bu sınıfın değerlerini value olarak dala atarız\n" +
                "     // Tek key içerisine 3 ayrı değer atanır\n" +
                "     // Böylece sınıf halinde verileri eklemiş oluruz\n" +
                "  \n" +
                "  }\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "BÖLÜM-6\n" +
                "\n" +
                "\t\tSINIF KAYITLARINI GÖRMEK\n" +
                "\n" +
                " * Okuma Metodumuz içinde;\n" +
                "\n" +
                "  public void oku(){\n" +
                "     DatabaseReference alınanlar = db.getReference(\"Kisiler\");\n" +
                "     alınanlar.addListenerForSingleValueEvent(new ValueEventListener()){\n" +
                "         @Override\n" +
                "         public void onDataChange(DataSnapshot dataSnapshot){\n" +
                "\n" +
                "             for (DataSnapshot key: databaseSnapshot.getChildren()){\n" +
                "        \t   \n" +
                "\t\t  gör.append(alınanlar.getValue(Kisi.class).getAd()+\"\\n\");\n" +
                "\t          gör.append(alınanlar.getValue(Kisi.class).getSoyad()+\"\\n\");\n" +
                "\t\t  gör.append(alınanlar.getValue(Kisi.class).getYas()+\"\\n\\n\\n\");\n" +
                "\t\n" +
                "\t      }\n" +
                "           }     \n" +
                "       }\n" +
                "   }\n" +
                "\n" +
                "\n"));
        eduList.add(new DummyItem("4","XAMARIN DERSLERİ", "\n" +
                "\n" +
                "İçindekiler\n" +
                "\n" +
                "\n" +
                "Bölüm-1\n" +
                "   1. Tanıtım\n" +
                "   2. İçerik\n" +
                "   3. Yapılar\n" +
                "   4. Projelere Başlarken\n" +
                "   5. İlk Projemiz  \n" +
                "   6. Sınıf İçinde Görsel Tasarım\n" +
                "   7. Tabbed Page Örneği\n" +
                "   8. Master Page Örneği\n" +
                "\n" +
                "Bölüm-2\n" +
                "   1. Buton Kontrolü\t\n" +
                "   2. DatePicker Kullanımı\n" +
                "   3. Entry Kullanımı\n" +
                "   4. Picker Kullanımı\n" +
                "   5. Progress Bar Oluşturmak\n" +
                "   6. Slider Oluşturmak\n" +
                "   7. Switch Kullanımı\n" +
                "   8. Time Picker Oluşturmak\n" +
                "   9. WebView Oluşturmak\n" +
                "   10. Özel Kontrol Örnekleri\n" +
                "   11. Görseller İçin Ortak Kaynak Oluşturmak\n" +
                "\n" +
                "Bölüm-3\n" +
                "   1. ListView Kullanımı\n" +
                "   2. ListViewa Başlık Vermek\n" +
                "   3. ListView İçinde Butona Event Atamak\n" +
                "   4. Footer Oluşturmak\n" +
                "   5. Sayfa Yenilenmesi Refresh Oluşturmak \n" +
                "   \n" +
                "Bölüm-4\n" +
                "   1. Dependency Servis \n" +
                "   2. Renderer Açıklaması\n" +
                "   3. SQLite Kullanımı \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\tBÖLÜM-1\n" +
                "\n" +
                "\n" +
                "                                    TANITIM \n" +
                "\n" +
                "\n" +
                "* Tamamen C# dili kullanılır . Birçok platformu birleştirip tek bir platform gibi\n" +
                " çalışma imkanı sağlar.\n" +
                "\n" +
                "* Hybrid değildir %100 Native çalışır. Visual Studio editörü xamarin için uygun\n" +
                "tavsiye edilen bir editördür. Aynı zamanda Xamarin Studio da kullanabiliriz.\n" +
                "\n" +
                "* Akıllı saat ve televizyonnlarda kullanılabilir. 15 binden fazla kurum ve kuruluş\n" +
                "üzerinde çalışmaktadır.\n" +
                "\n" +
                "* 2 farklı proje türü vardır \n" +
                " \n" +
                " 1. Traditional Xamarin :\n" +
                "\n" +
                "Android , iOS , Winphone hangisini istiyorsak bunları C# ile kodlamamızı sağlar.\n" +
                "\n" +
                " 2. Xamarin Forms :\n" +
                "\n" +
                "Temel olarak tek kod yazıp bu kodun tüm platformlar üzerinde çalışmasını sağlar.\n" +
                "Render kavramı ile arayüz uyumluluğu rahatlıkla  sağlanabilir. Sadece tek katmanda\n" +
                "kod yazarız.\n" +
                "\n" +
                "\n" +
                "            Proje Oluştururken Dikkat !! \n" +
                "\n" +
                "Portable alanında WebServis referans gösterebiliyoken Shared alanında gösteremiyoruz.\n" +
                "\n" +
                "* Xamarinde C# kodları platformların kendi dillerine nasıl dönüştürülüyor ?\n" +
                "\n" +
                "AHeadOfTime --> iOS ta kodları dönüştürmek için kullanılır\n" +
                "JustInTime  --> Androidde kodları dönüştürmek için kullanılır\n" +
                "\n" +
                "* Platformların hangi versiyonları destekleniyor?\n" +
                "\n" +
                "Android için 4.0 ve üzeri versiyonlar\n" +
                "iOS için 6.1 ve üzeri versiyonlar\n" +
                "Windows Phone için 8 ve üzeri versiyonlar desteklenmektedir\n" +
                "\n" +
                "* Platformlara yeni güncellemeler geldiğinde Xamarine de aynı gün içerisinde güncelleme\n" +
                "gelmektedir.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "                                    İÇERİK \n" +
                "\n" +
                "\n" +
                "-Xaml ile arayüz kontrolü\n" +
                "-Navigasyon\n" +
                "-40 tan fazla sayfa ve Kontrol içeriği\n" +
                "-Animasyon API'si\n" +
                "-Dependency Servis\n" +
                "-Messaging Center kullanılabilir.\n" +
                "\n" +
                "* 2200 Tip ve versiyon cihaz için renderer sayesinde cross platform şeklinde\n" +
                "paylaşım vardır.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "                                     YAPILAR \n" +
                "\n" +
                "\n" +
                "* Sayfa Yapıları :\n" +
                "\n" +
                "- Content\n" +
                "- MasterDetail\n" +
                "- Navigation\n" +
                "- Tabbed\n" +
                "- Carousel en sık kullanılanlardır.\n" +
                "\n" +
                "* Tasarım Yapıları :\n" +
                "\n" +
                "- Stack\n" +
                "- Absolute\n" +
                "- Relative\n" +
                "- Grid\n" +
                "- ContentView\n" +
                "- ScrollView\n" +
                "- Frame\n" +
                "\n" +
                "* Kontrol Yapıları :\n" +
                "\n" +
                "- ActivityIndicator\n" +
                "- BoxView\n" +
                "- Button\n" +
                "- DataPicker\n" +
                "- Map\n" +
                "- Editor\n" +
                "- ListView\n" +
                "- Label\n" +
                "- Image\n" +
                "- Entry\n" +
                "- OpenGlView\n" +
                "- Picker\n" +
                "- ProgressBar\n" +
                "- Slider\n" +
                "- SearchBar\n" +
                "- Stepper\n" +
                "- TableView\n" +
                "- TimePicker\n" +
                "- WebView\n" +
                "- EntryCell\n" +
                "- ImageCell\n" +
                "- SwitchCell\n" +
                "- TextCell\n" +
                "- ViewCell\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "                             PROJELERE BAŞLARKEN \n" +
                "\n" +
                "\n" +
                "\n" +
                "* Portable katmanında çalışacağız . Burası bizim kodlarımızı paylaştığımız\n" +
                "alan . Platformlar kodları buradan alıp kendi dillerine çevirirler.\n" +
                "Böylece Cross Platform oluşmuş olur . \n" +
                "\n" +
                "* Proje içinde dönüşümün teknik olarak yapılışını özetlemek gerekirse örneğin\n" +
                "Androidde Activity içinde onCreate metodunda proje çalışmaya başlar . Xamarinde \n" +
                "androidin bu kısmına geldiğimizde ;\n" +
                " LoadApplication(new App()); diye bir yer görürüz. Yani aşama aşama \n" +
                "\n" +
                "1.adım : Program\n" +
                "2.adım : AnaActivity\n" +
                "3.adım : onCreate Metodu\n" +
                "4.adım : LoadApplication(new App());\n" +
                "\n" +
                "\n" +
                " Bu şekilde Portable'dan gelen App çalışmış oluyor. New App in üzerinde tıklayıp\n" +
                "Go To Defiition dediğimizde Portable ımızda ana projemize gidebiliriz . (F12)\n" +
                "\n" +
                "\n" +
                "* Application Sınıfı Hakkında (App.cs) ;\n" +
                "\n" +
                " İlk çalıştırılacak kodlarımızı belirlerken kullanacağımız sınıftır. İçerisinde\n" +
                "bir Page MainPage {get; set;} propertisi vardır. Biz bu sınıfı kullanarak sayfaları \n" +
                "oluşturuyoruz.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "                               İLK PROJEMİZ \n" +
                "\n" +
                "\n" +
                "* Yeni bir proje açarken Cross-Platform içinde Xamarin Forms kısmını\n" +
                "daha sonra da Android,iOS,.Net kutucuklarını işaretledim.\n" +
                "\n" +
                "* Projeyi ilk açtığımızda App ve MainPage sayfalarının olduğunu görürüz \n" +
                "App default ayarlama sayfası , MainPage ise bize ait sayfadır.\n" +
                "\n" +
                "  App.xaml.cs içinde ;\n" +
                "\n" +
                "<--Kod Örneği--\n" +
                "\n" +
                "namespace FirstProject\n" +
                "{\n" +
                "\tpublic partial class App : Application\n" +
                "\t{\n" +
                "\t\tpublic App ()\n" +
                "\t\t{\n" +
                "\t\t\tInitializeComponent();\n" +
                "\n" +
                "\t\t\tMainPage = new MainPage(); \n" +
                "\t\t}\n" +
                "\t.\n" +
                "\t.\t\n" +
                "\t.\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "--Kod Örneği -->\n" +
                "\n" +
                "* Bu kodun anlamı ilk çalıştırılacak sayfanın MainPage olduğudur.\n" +
                "İstersek yeni bir sayfa açıp o sayfanın ismini eşitliğin sağ tarafındaki\n" +
                "MainPage in yerine yazarak başlangıçta çalışacak sayfa olarak belirleriz.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "  MainPage.xaml.cs içerisinde ;\n" +
                "\n" +
                "\n" +
                "namespace FirstProject\n" +
                "{\n" +
                "\tpublic partial class MainPage : ContentPage\n" +
                "\t{\n" +
                "\t\tpublic MainPage()\n" +
                "\t\t{\n" +
                "\t\t\tInitializeComponent();\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "\n" +
                "* Bizim kendi sayfamızın sınıf tarafıdır . Metodlarımızı buraya kodlayacağız.\n" +
                "Genel olarak bu kısım görsellik sağlama için kullanılmaz . Ancak görsellikte\n" +
                "işlev kazanacağımız örnek vermek gerekirse bir butona tıklandığında  ne \n" +
                "olacağını burada belirleriz . Örnekler yaptıkça kalıp oturacaktır.\n" +
                "\n" +
                "* public partial class MainPage : ContentPage  kısmında sayfamızın ContentPage\n" +
                "yapısından türetildiğini görebiliriz. Bu bir zorunluluktur.\n" +
                "\n" +
                "\n" +
                " MainPage.xaml içerisinde ;\n" +
                "\n" +
                "\n" +
                "<ContentPage xmlns=\"http://xamarin.com/schemas/2014/forms\"\n" +
                "             xmlns:x=\"http://schemas.microsoft.com/winfx/2009/xaml\"\n" +
                "             xmlns:local=\"clr-namespace:FirstProject\"\n" +
                "             x:Class=\"FirstProject.MainPage\">\n" +
                "\n" +
                "    <StackLayout>\n" +
                "        <!-- Place new controls here -->\n" +
                "    \t<Label Text=\"Welcome to Xamarin.Forms!\" \n" +
                "           HorizontalOptions=\"Center\"\n" +
                "           VerticalOptions=\"CenterAndExpand\" />\n" +
                "    </StackLayout>\n" +
                "\n" +
                "</ContentPage>\n" +
                "\n" +
                "*  Sayfa Yapılarından Yapılar kısmında hangilerinin kullanıldığını görmüştük.\n" +
                "Bu sayfamızın default olarak Content sayfa yapısıyla geldiğini görüyoruz.\n" +
                "*  Burası bizim standart görsel işlemler yapmamızı sağlayan xaml kısmımız.\n" +
                "Hangi projede hangi sınıfa ait olduğunu x:Class=\"FirstProject.MainPage\"\n" +
                "alanında görüyoruz.\n" +
                "*  Sayfada bir Stack tasarım yapısı ve Label kontrol yapısı içerisinde\n" +
                "bir Text belirtilmiş \"Welcome to Xamarin.Forms!\" . Horizontal ve Vertical\n" +
                "optionlar ise bu labelın konumunu ayarlamamız için Dikeyde ve Yatayda konumu\n" +
                "belirtilmek için kullanılmış. Çalıştırdığımızda ekran ortasında yazımızı\n" +
                "görebiliriz.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "                    SINIF İÇİNDE GÖRSEL TASARIM\n" +
                "\n" +
                "\n" +
                "* Sağ tarafta Solution Explorerın içinde en üstte proje ismimizin üzerinde sağ \n" +
                "tıklayıp Add --> New Item --> Class diyelim İsmini MyContentPage koyalım.\n" +
                "\n" +
                "* Burada amacımız xaml sayfamız olmadan görsel oluşturmaktır.\n" +
                "\n" +
                "* Sınıfımızı başka alanlardan ona ulaşabilmek için Public olarak ayarlayacağız.\n" +
                "\n" +
                "* Bir Content Sayfa Yapısında olduğunu belirtmek için inherit alacağız yani\n" +
                "türeteceğiz. (Burada using Xamarin.Forms eklememiz gerekecektir.)\n" +
                "\n" +
                "* Burada bir Label oluşturalım, içine Hello World yazdıralım, font size ve konum\n" +
                "belirleyelim.\n" +
                "\n" +
                "* Bu sayfamızın çalışması için App.xaml.cs içerisinde main olarak belirtmemiz gerekiyor.\n" +
                "\n" +
                " App.xaml.cs içerisinde ;\n" +
                "\n" +
                "\n" +
                "public partial class App : Application{\n" +
                "\tpublic App ()\n" +
                "\t{\n" +
                "\t\tInitializeComponent();\n" +
                "\t\tMainPage = new MyContentPage();\t// Sayfamızı belirttik \n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "\n" +
                " MyContentPage.cs içerisinde ;\n" +
                "\n" +
                "using Xamarin.Forms;\n" +
                "\n" +
                "namespace FirstProject\n" +
                "{ \n" +
                "    public class MyContentPage : ContentPage\n" +
                "    {\n" +
                "        public MyContenPage()\n" +
                "        {\n" +
                "            Label lblPage = new Label();\n" +
                "            lblPage.Text = \"HELLO WORLD!\";\n" +
                "            lblPage.FontSize = 30;\n" +
                "            lblPage.HorizontalOptions = LayoutOptions.Center;\n" +
                "            lblPage.VerticalOptions = LayoutOptions.Center;\n" +
                "\n" +
                "            Content = lblPage;\n" +
                "        }\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t    TABBED PAGE ÖRNEĞİ\n" +
                "\n" +
                "\n" +
                "* Views dosyamızın içinde MyTabbedPage isminde bir sınıf açalım\n" +
                "\n" +
                "* TabbedSayfalar adında yeni bir dosya oluşturalım\n" +
                "\n" +
                "* TabbedSayfalara sağa tıklayıp MyTab1 ve MyTab2 adında iki sınıf oluşturalım\n" +
                "\n" +
                "* MyTabbedPage sayfamızın içinde MyTab1 ve MyTab2 yi children göstermemiz yeterli \n" +
                "olacaktır.\n" +
                "\n" +
                "* Tabi App içinde MyTabbedPageimizi ana sayfa olarak göstermeyi unutmayalım\n" +
                "\n" +
                "\n" +
                " App.xaml.cs içerisinde ;\n" +
                "\n" +
                "\n" +
                "public partial class App : Application{\n" +
                "\tpublic App ()\n" +
                "\t{\n" +
                "\t\tInitializeComponent();\n" +
                "\t\tMainPage = new MyTabbedPage();\t// Sayfamızı belirttik \n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "\n" +
                " MyTabbedPage.cs içerisinde ;\n" +
                "\n" +
                "\n" +
                "using Xamarin.Forms;\n" +
                "\n" +
                "namespace FirstProject.Views\n" +
                "{\n" +
                "    public class MyTabbedPage : TabbedPage\n" +
                "    {\n" +
                "        public MyTabbedPage()\n" +
                "        {\n" +
                "            Children.Add(new TabbedSayfalar.MyTab1());\n" +
                "            Children.Add(new TabbedSayfalar.MyTab2());\n" +
                "        }\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "\n" +
                "- MyTab1.cs içerisinde ;\n" +
                "\n" +
                "\n" +
                "using Xamarin.Forms;\n" +
                "\n" +
                "namespace FirstProject.TabbedSayfalar\n" +
                "{\n" +
                "    public class MyTab1 : ContentPage\n" +
                "    {\n" +
                "        public MyTab1()\n" +
                "        {\n" +
                "            Label lbl1 = new Label();\n" +
                "            lbl1.Text = \"MyTab1 Sayfam Burası\";\n" +
                "            lbl1.FontSize = 30;\n" +
                "            lbl1.HorizontalOptions = LayoutOptions.Center;\n" +
                "            lbl1.VerticalOptions = LayoutOptions.Center;\n" +
                "            Title = \"Tab1\"; // Başlık verdik\n" +
                "\n" +
                "            Content = lbl1;\n" +
                "        }\n" +
                "\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                " MyTab2.cs içerisinde ;\n" +
                "\n" +
                "\n" +
                "using Xamarin.Forms;\n" +
                "\n" +
                "namespace FirstProject.TabbedSayfalar\n" +
                "{\n" +
                "    public class MyTab2 : ContentPage\n" +
                "    {\n" +
                "        public MyTab2()\n" +
                "        {\n" +
                "            Label lbl2 = new Label();\n" +
                "            lbl2.Text = \"MyTab2 Sayfam Burası\";\n" +
                "            lbl2.FontSize = 30;\n" +
                "            lbl2.HorizontalOptions = LayoutOptions.Center;\n" +
                "            lbl2.VerticalOptions = LayoutOptions.Center;\n" +
                "            Title = \"Tab2\"; // Başlık verdik\n" +
                "\n" +
                "            Content = lbl2;\n" +
                "        }\n" +
                "\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "\n" +
                "* TabbedSayfaların içinde sınıf yerine herangi bir yapıda sayfa da oluşturabilirdik.\n" +
                "Xaml de oynama yapıp tasarımı güzelleştirebiliriz . \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\tMASTER PAGE ÖRNEĞİ\n" +
                "\n" +
                "\n" +
                "* Projemizin üzerinde sağ tıklayalım ve MyMasterPage adında bir sınıf oluşturalım.\n" +
                "Sınıfımızı public yapıp MasterDetailPage ten türetelim.\n" +
                "\n" +
                "* Sırada menü ve detail sayfalarını ekleme var. Burada detail dediğimiz sayfa\n" +
                "projemiz açıldığında karşımıza gelecek default olan sayfadır. Menü ekranı ise sağa \n" +
                "doğru kaydırdığımızda görüntülenecek alandır.\n" +
                "\n" +
                "* MasterSayfalar adında bir dosya açalım içinde MyMenu ve MyDetail adında iki normal\n" +
                "content sayfa oluşturalım.\n" +
                "\n" +
                "\n" +
                " MyMasterPage.cs içerisine ;\n" +
                "\n" +
                "using FirstProject.MasterSayfalar;\n" +
                "using Xamarin.Forms;\n" +
                "\n" +
                "namespace FirstProject\n" +
                "{\n" +
                "    public class MyMasterPage : MasterDetailPage\n" +
                "    {\n" +
                "        public MyMasterPage()\n" +
                "        {\n" +
                "            Master = new MyMenu();\n" +
                "            Detail = new MyDetail();\n" +
                "        }\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "\n" +
                " MyMenu.xaml içerisine ;\n" +
                "\n" +
                "\n" +
                "<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n" +
                "<ContentPage xmlns=\"http://xamarin.com/schemas/2014/forms\"\n" +
                "             xmlns:x=\"http://schemas.microsoft.com/winfx/2009/xaml\"\n" +
                "             x:Class=\"FirstProject.MasterSayfalar.MyMenu\"\n" +
                "             Title=\"Master Sayfası\">  // Bu kısmı atlamayın\n" +
                "    <ContentPage.Content>\n" +
                "        <StackLayout>\n" +
                "            <Label Text=\"MENU ALANI\"\n" +
                "                VerticalOptions=\"StartAndExpand\" \n" +
                "                HorizontalOptions=\"CenterAndExpand\"\n" +
                "                TextColor=\"Orange\"\n" +
                "                FontSize=\"Large\"/>\n" +
                "\n" +
                "            <Label Text=\"Eğitimler\"\n" +
                "                VerticalOptions=\"StartAndExpand\"\n" +
                "                HorizontalOptions=\"CenterAndExpand\"\n" +
                "                TextColor=\"Red\"\n" +
                "                FontSize=\"Medium\"/>\n" +
                "\n" +
                "            <Label Text=\"  ROBOTİK  \"\n" +
                "                VerticalOptions=\"StartAndExpand\"\n" +
                "                HorizontalOptions=\"StartAndExpand\"\n" +
                "                   TextColor=\"Black\"\n" +
                "                   FontSize=\"Small\"/>\n" +
                "            <Label Text=\"  LINUX  \"\n" +
                "                VerticalOptions=\"StartAndExpand\"\n" +
                "                HorizontalOptions=\"StartAndExpand\"\n" +
                "                   TextColor=\"Black\"\n" +
                "                   FontSize=\"Small\"/>\n" +
                "            <Label Text=\"  XAMARIN  \"\n" +
                "                VerticalOptions=\"StartAndExpand\"\n" +
                "                HorizontalOptions=\"StartAndExpand\"\n" +
                "                   TextColor=\"Black\"\n" +
                "                   FontSize=\"Small\"/>\n" +
                "\n" +
                "        </StackLayout>\n" +
                "    </ContentPage.Content>\n" +
                "</ContentPage>\n" +
                "\n" +
                "\n" +
                " MyDetail.xaml içerisine ;\n" +
                "\n" +
                "\n" +
                " <ContentPage.Content>\n" +
                "        <StackLayout>\n" +
                "            <Label Text=\"SAĞA KAYDIR \"\n" +
                "                VerticalOptions=\"CenterAndExpand\" \n" +
                "                HorizontalOptions=\"CenterAndExpand\" />\n" +
                "        </StackLayout>\n" +
                "  </ContentPage.Content>\n" +
                "\n" +
                "\n" +
                "* Son olarak App.xaml.cs içerinde   MainPage = new MyMasterPage(); alanını unutmayalım\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\tBÖLÜM-2\n" +
                "   \n" +
                "\t\t\t\tBUTON KONTROL \t\t\t\n" +
                "\n" +
                "\n" +
                "* ButonKontrol adında bir sayfa oluşturalım . \n" +
                "\n" +
                "* Xaml tarafımızda bir butona onClicked görevi verelim \n" +
                "\n" +
                "* Xaml kısmında aynı zamanda bir activity indicator yaratalım\n" +
                "\n" +
                "* Amacımız butona basıldığında loading ekranının açılması tekrar basıldığında ise \n" +
                "kapanması olsun .\n" +
                "\n" +
                "* Butona Clicked eventi verip bu eventin isminde cs tarafında bir fonksiyon yazınca\n" +
                "butona tıklandığında bu fonksiyon çalışacaktır.\n" +
                "\n" +
                "\n" +
                " ButonKontrol.xaml içerisine ;\n" +
                "\n" +
                "<ContentPage.Content>\n" +
                "        <StackLayout>\n" +
                "        \n" +
                "            <Button Text=\"Tıkla\" Clicked=\"onClicked\"></Button>\n" +
                "            <ActivityIndicator x:Name=\"activity\" IsRunning=\"False\" ></ActivityIndicator>\n" +
                "\n" +
                "        </StackLayout>\n" +
                "</ContentPage.Content>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                " ButonKontrol.xaml.cs içerisine ;\n" +
                "\n" +
                "public partial class ButonKontrol : ContentPage\n" +
                "\t{\n" +
                "\t\tpublic ButonKontrol ()\n" +
                "\t\t{\n" +
                "\t\t\tInitializeComponent ();\n" +
                "\t\t}\n" +
                "\n" +
                "\n" +
                "\t// Butona tıklandığında çalışacak fonksiyonumuz\n" +
                "\n" +
                "        private void onClicked(object sender, EventArgs e)\n" +
                "        {\n" +
                "            if (activity.IsRunning == false)\n" +
                "            {\n" +
                "                activity.IsRunning = true;\n" +
                "            }\n" +
                "\n" +
                "            else\n" +
                "                activity.IsRunning = false;\n" +
                "            \n" +
                "        }\n" +
                "}\n" +
                "\n" +
                "* ActivityIndicator içinde belirlediğimiz name ile onun çalışıp\n" +
                "çalışmama durumunu kontrol ettik. Çalışıyorsa dursun duruyorsa\n" +
                "çalışmaya başlasın mantığında bir kod bloğu yazdık.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\tDATEPICKER KULLANIMI\t\t\n" +
                "\n" +
                "\n" +
                "* Tarih kullanmak için DatePicker yapısını rahatlıkla tercih edebilirsiniz.\n" +
                "\n" +
                "* Aynı proje içinde çalışalım xmal tarafında görünümü sağlayalım daha sonra da cs \n" +
                "tarafına gelip tarih seçimi için bir aralık kısıtı koyalım .\n" +
                "\n" +
                "\n" +
                "- xaml içerisine ;\n" +
                "\n" +
                "<ContentPage.Content>\n" +
                "        <StackLayout>\n" +
                "\n" +
                "            <DatePicker x:Name=\"mydatePicker\" > </DatePicker>\n" +
                "\n" +
                "           \n" +
                "        </StackLayout>\n" +
                "    </ContentPage.Content>\n" +
                "\n" +
                "\n" +
                "- cs içerisine ;\n" +
                "\n" +
                "\n" +
                "public ButonKontrol (){\n" +
                "\tInitializeComponent ();\n" +
                "        mydatePicker.MinimumDate = DateTime.Now.AddYears(-1);\n" +
                "        mydatePicker.MaximumDate = DateTime.Now.AddYears(1);\n" +
                "        mydatePicker.Date = DateTime.Now;\n" +
                "        mydatePicker.Format = \"yyyy-MM-dd\";\n" +
                "}\n" +
                "\n" +
                "\n" +
                "* Böylece formatımızı belirlemiş kısıtlamamızı yapmış olduk.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\t ENTRY KULLANIMI\n" +
                "\n" +
                "\n" +
                "* Entry diğer bir adıyla textbox türüdür . Ufak bir örnekle gösterelim\n" +
                "\n" +
                " Xaml içerisine ;\n" +
                "\n" +
                "\n" +
                "\n" +
                " <Entry    FontAttributes=\"Bold\" FontFamily=\"Calibri\" FontSize=\"24\" \n" +
                "           HorizontalTextAlignment=\"Center\" Text=\"YuksekMuhendislik\"\n" +
                "           TextColor=\"Blue\" HorizontalOptions=\"CenterAndExpand\"\n" +
                "\t   VerticalOptions=\"CenterAndExpand\">\n" +
                " </Entry>\n" +
                "\n" +
                "\n" +
                " <Entry   FontAttributes=\"Bold\" FontFamily=\"Calibri\" FontSize=\"24\" \n" +
                "          HorizontalTextAlignment=\"Center\" Placeholder=\"Şifrenizi Giriniz\"\n" +
                "          PlaceholderColor=\"Red\" TextColor=\"Blue\" Keyboard=\"Numeric\" \n" +
                "          IsPassword=\"True\" HorizontalOptions=\"CenterAndExpand\" \n" +
                "\t  VerticalOptions=\"CenterAndExpand\">\n" +
                " </Entry>\n" +
                "\n" +
                "\n" +
                "\n" +
                "* Entrynin özellikleriyle placeholder kullanarak yazı üstüne tıklanınca kaybolmasını\n" +
                "sağladık . Pozisyonunu yazı büyüklüğünü rengini yazı tipini belirledik .\n" +
                "\n" +
                "* Keyboard kısmı ile yazılabilecek karakterleri sayılarla kısıtladık\n" +
                "\n" +
                "* IsPassword ile de yazıldıktan sonra görünümü noktaya dönüştüren efekt ekledik.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\tPICKER KULLANIMI\n" +
                "\n" +
                "\n" +
                "* Bir nesnenin veya  varlığın sayısını bildirmek istiyoruz diyelim. Nesnenin üzerine\n" +
                "tıklandığında sayaca benzer bi yapıda alt alta sayılar çıksın. Bu görünümü xaml \n" +
                "içinde sağlayalayalım.\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Xaml içerisine ;\n" +
                "\n" +
                "<ContentPage.Content>\n" +
                "        <StackLayout>\n" +
                "            <Picker Title=\"Eleman Sayısı\" >\n" +
                "                <Picker.Items>\n" +
                "                    <x:String>1</x:String>\n" +
                "                    <x:String>2</x:String>\n" +
                "                    <x:String>3</x:String>\n" +
                "                    <x:String>4</x:String>\n" +
                "                    <x:String>5</x:String>\n" +
                "                </Picker.Items>\n" +
                "            </Picker>\n" +
                "        </StackLayout>\n" +
                "</ContentPage.Content>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\tPROGRESSBAR OLUŞTURMAK\n" +
                "\n" +
                "\n" +
                "* ProgresBar default olarak 10 parçaya ayrılmıştır\n" +
                "\n" +
                "* Biz projemizde 3 noktasındaki bir progressbarı bir buton vasıtasıyla animasyon\n" +
                "vererek 8 noktasına sürükleyelim\n" +
                "\n" +
                "\n" +
                " Xaml içerisine ;\n" +
                "\n" +
                "<ContentPage.Content>\n" +
                "        <StackLayout>\n" +
                "            <ProgressBar x:Name=\"myProgressBar\" Progress=\".3\" >\n" +
                "             \n" +
                "            </ProgressBar>\n" +
                "\n" +
                "            <Button Text=\"Tıkla\" Clicked=\"onClicked\"></Button>\n" +
                "        </StackLayout>\n" +
                " </ContentPage.Content>\n" +
                "\n" +
                "\n" +
                " Cs içerisine ;\n" +
                "\n" +
                "private void onClicked(object sender , EventArgs e){\n" +
                "\n" +
                "      myProgressBar.ProgressTo(.8, 2550, Easing.SpringIn);\n" +
                "\n" +
                "      // Hangi noktaya , Hangi hızla , Hangi animasyonla\t\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\tSLIDER OLUŞTURMAK\n" +
                "\n" +
                "\n" +
                "* Slider tipine elle kontrol edilebilen progress bar diyebiliriz aslında .\n" +
                "\n" +
                "* Slider içinde minimum maksimum değerler verelim default bir değer belirleyelim.\n" +
                "\n" +
                "\n" +
                "\n" +
                "-- Xaml içerisine ;\n" +
                "\n" +
                "\n" +
                " <ContentPage.Content>\n" +
                "        <StackLayout>\n" +
                "            \n" +
                "            <Slider x:Name=\"mySlider\" Minimum=\"0\" Maximum=\"100\" Value=\"50\" >\n" +
                "            </Slider>\n" +
                "            \n" +
                "            <Label BindingContext=\"{x:Reference mySlider}\" Text=\"{Binding Value}\"\n" +
                "                   FontSize=\"Large\" HorizontalOptions=\"CenterAndExpand\" \n" +
                "                   VerticalOptions=\"CenterAndExpand\">\n" +
                "            </Label>\n" +
                "            \n" +
                "        </StackLayout>\n" +
                " </ContentPage.Content>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\tSWITCH KULLANIMI\n" +
                "\n" +
                "\n" +
                "* Sağa sola oynatabildiğimiz genelde açık kapalı özelliklerini taşımak için \n" +
                "kullanılan bir yapıdır. Kodlaması da oldukça basittir .\n" +
                "\n" +
                "* Xaml tarafında yine görünümünü sağlayıp cs için eventini verelim\n" +
                "\n" +
                "\n" +
                "-- Xaml içerisine ;\n" +
                "\n" +
                "<ContentPage.Content>\n" +
                "        <StackLayout>\n" +
                "            <Switch IsToggled=\"False\" Toggled=\"onToggled\" ></Switch>\n" +
                "        </StackLayout>\n" +
                "</ContentPage.Content>\n" +
                "\n" +
                "\n" +
                "-- Cs içerisine ;\n" +
                "\n" +
                "\n" +
                "private async void onToggled(object sender , ToggledEventArgs e){\n" +
                " \n" +
                "         bool isOk= await DisplayAlert(\"Switch\", e.Value.ToString(), \"OK\", \"CANCEL\");\n" +
                "\n" +
                "          if (isOk)\n" +
                "          {\n" +
                "             // okeye basıldı\n" +
                "          }\n" +
                "          else\n" +
                "          {\n" +
                "            // okeye basılmadı\n" +
                "      }\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\tTIMEPICKER OLUŞTURMAK\n" +
                "\n" +
                "\n" +
                "* Zamanı göstermek veya ayarlamak için kullanılabilecek bir görünüm\n" +
                "\n" +
                "* Yapmamız gereken tek şey ise xaml de <TimePicker></TimePicker> yazmak bu kadar kolay\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\tWEBVIEW OLUŞTURMAK\n" +
                "\n" +
                "\n" +
                "* WebView bir url bilgisi sayesinde internet üzerinde bir sayfayı ekranda \n" +
                "görüntülememizi sağlayan yapıdır.\n" +
                "\n" +
                "* Bu örnekte görselliği de cs dosyası içinde ayarlayalım . Bir başlık ve web \n" +
                "sayfasından oluşsun.\n" +
                "\n" +
                " Cs içerisinde ;\n" +
                "\n" +
                "public partial class ButonKontrol : ContentPage{\n" +
                "\tpublic ButonKontrol (){\n" +
                "\t\tInitializeComponent ();\n" +
                "                Label header = new Label{\n" +
                "                   Text = \"WebView\",\n" +
                "                   FontSize = 50,\n" +
                "                   FontAttributes = FontAttributes.Bold,\n" +
                "                   HorizontalOptions = LayoutOptions.Center\n" +
                "                };\n" +
                "\n" +
                "                WebView wView = new WebView{\n" +
                "                   Source = new UrlWebViewSource{\n" +
                "                       Url = \"www.frknyldz.com\"\n" +
                "                   },\n" +
                "                   VerticalOptions = LayoutOptions.FillAndExpand\n" +
                "                };\n" +
                "   \n" +
                "               this.Content = new StackLayout\n" +
                "               {\n" +
                "                   Children =\n" +
                "                {\n" +
                "                    header,\n" +
                "                    wView\n" +
                "                }\n" +
                "            };\n" +
                "        }        \n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\tÖZEL KONTROL ÖRNEKLERİ\n" +
                "\n" +
                "\n" +
                "* Xaml kısmında kullanabileceğiniz bir tasarım örneği ;\n" +
                "\n" +
                "<ContentPage.Content>\n" +
                "        <TableView Intent=\"Form\" HorizontalOptions=\"Center\" VerticalOptions=\"CenterAndExpand\">\n" +
                "            <TableRoot>\n" +
                "            <TableSection Title=\"Furkan Yıldız\">\n" +
                "                <SwitchCell Text=\"Xamarin Dersleri\" On=\"True\">\n" +
                "                </SwitchCell>\n" +
                "\n" +
                "                <EntryCell Label=\"İnternet Adresiniz\"\n" +
                "                           Placeholder=\"Buraya Girin\"\n" +
                "                           Keyboard=\"Url\">\n" +
                "                </EntryCell>\n" +
                "                <TextCell Text=\"Xamarin\" TextColor=\"Red\"\n" +
                "                          Detail=\"Blog Yazıyorum\" >\n" +
                "                </TextCell>\n" +
                "            </TableSection>\n" +
                "            </TableRoot>    \n" +
                "        </TableView>\n" +
                "    </ContentPage.Content>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\tGÖRSELLER İÇİN ORTAK KAYNAK OLUŞTURMAK \n" +
                "\n" +
                "\n" +
                "* Elimizde 100 tane label ve bu labelların yazıları olsun . Bu yazıların da her \n" +
                "birinin ayrı ayrı rengini boyutunu türünü belirtmemiz gereksin ve bunların hepsi \n" +
                "aslında aynı özellikler olsun .\n" +
                "\n" +
                "* İşte tamda burda bu işlemler devreye girmeli.\n" +
                "\n" +
                "* OrtakKaynakDeneme adında bir sayfa açalım\n" +
                "\n" +
                "-- App dosyamızın xaml kısmında ;\n" +
                "\n" +
                "\n" +
                "<Application xmlns=\"http://xamarin.com/schemas/2014/forms\"\n" +
                "             xmlns:x=\"http://schemas.microsoft.com/winfx/2009/xaml\"\n" +
                "             x:Class=\"FirstProject.App\"> // buraya kendi projenizin adını verin\n" +
                "\t<Application.Resources>\n" +
                "        <ResourceDictionary>\n" +
                "            \n" +
                "            <Style x:Key=\"LabelStyle\" TargetType=\"Label\">\n" +
                "                <Setter Property=\"TextColor\" Value=\"Red\">\n" +
                "                </Setter>\n" +
                "                <Setter Property=\"FontSize\" Value=\"Large\">\n" +
                "                </Setter>\n" +
                "                <Setter Property=\"HorizontalTextAlignment\" Value=\"Center\">\n" +
                "                </Setter>\n" +
                "            </Style>\n" +
                "\n" +
                "            <Style x:Key=\"LabelFont\" TargetType=\"Label\" BasedOn=\"{StaticResource LabelStyle}\">\n" +
                "                <Setter Property=\"FontAttributes\" Value=\"Bold\"></Setter>\n" +
                "            </Style>\n" +
                "            \n" +
                "        </ResourceDictionary>\n" +
                "\t</Application.Resources>\n" +
                "</Application>\n" +
                "\n" +
                "\n" +
                "\n" +
                "-- OrtakKaynakDeneme.xaml içerisine ;\n" +
                "\n" +
                "\n" +
                "<ContentPage xmlns=\"http://xamarin.com/schemas/2014/forms\"\n" +
                "             xmlns:x=\"http://schemas.microsoft.com/winfx/2009/xaml\"\n" +
                "             x:Class=\"FirstProject.OrtakKaynakDeneme\">\n" +
                "\n" +
                "    <ContentPage.Content>\n" +
                "        <StackLayout>\n" +
                "            <Label Text=\"Welcome to Xamarin.Forms!\"\n" +
                "                   Style=\"{StaticResource LabelStyle,LabelFont}\"\n" +
                "                    VerticalOptions=\"CenterAndExpand\" \n" +
                "                    HorizontalOptions=\"CenterAndExpand\" />\n" +
                "        </StackLayout>\n" +
                "    </ContentPage.Content>\n" +
                "\n" +
                "</ContentPage>\n" +
                "\n" +
                "\n" +
                "\n" +
                "* Ortak kaynakta belirlediğimiz hazır özellikleri kullandık . \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "   BÖLÜM-3\n" +
                "\t\n" +
                "\t\t\t\tLISTVIEW KULLANIMI\t\t\t\n" +
                "\n" +
                "\n" +
                "* Bir sınıfla çalışalım . Bu sınıfa 1-2 bilgi gönderebilelim . Xaml da oluşturduğumuz\n" +
                "listemizde bu bilgilerden birini göstererek sıralayalım\n" +
                "\n" +
                "* Aynı örnek üzeerinden gidelim yeni proje açmayalım.\n" +
                "\n" +
                "* Bu koddaki görevin aynısını xaml tarafında yapabilmek için xamlde ;\n" +
                "\n" +
                " <ListView x:Name=\"lstView\" ItemSource=\"{Binding .}\" demeliyiz . \n" +
                "\n" +
                "* Buradaki \".\" işareti obje listesi oluyor . Aşağıda Name buraya set edilmiş gözüküyor\n" +
                "Tabi cs tarafında da ;\n" +
                "\n" +
                "  BindingContext = ymt ;\n" +
                "\n" +
                "dememiz gerekiyor .\n" +
                "\n" +
                "-- Xaml  içerisine ;\n" +
                "\n" +
                "<ContentPage.Content>\n" +
                "        <StackLayout Orientation=\"Vertical\">\n" +
                "            <ListView x:Name=\"lstView\">\n" +
                "                <ListView.ItemTemplate>\n" +
                "                    <DataTemplate>\n" +
                "                        <ViewCell>\n" +
                "                            <Label Text=\"{Binding NAME}\">\n" +
                "                                \n" +
                "                            </Label>\n" +
                "                        </ViewCell>\n" +
                "                    </DataTemplate>\n" +
                "                </ListView.ItemTemplate>\n" +
                "            </ListView>\n" +
                "        </StackLayout>\n" +
                "    </ContentPage.Content>\n" +
                "\n" +
                "\n" +
                "-- Cs içerisine ;\n" +
                "\n" +
                "public class YuksekMuhendislik{\n" +
                "   public int ID { get; set; }\n" +
                "   public string NAME { get; set; }\n" +
                "}\n" +
                "\n" +
                "public partial class OrtakKaynakDeneme : ContentPage\n" +
                "{\n" +
                "    public OrtakKaynakDeneme (){\n" +
                "\t  InitializeComponent ();\n" +
                "               \n" +
                "          List<YuksekMuhendislik> ymt = new List<YuksekMuhendislik>();\n" +
                "          ymt.Add(new YuksekMuhendislik { ID = 1, NAME = \"Mustafa Said\" });\n" +
                "          ymt.Add(new YuksekMuhendislik { ID = 2, NAME = \"Furkan\" });\n" +
                "\n" +
                "          lstView.ItemsSource = ymt;\n" +
                "    }\n" +
                "}\n" +
                "   \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\tLISTVIEW İÇİNDE BUTONA EVENT ATAMAK\n" +
                "\n" +
                "\n" +
                "* Elimizde bir listview var . Bu listviewın içinde itemlar itemların içinde ise\n" +
                "butonlar var. Şimdiki amacımız bu itemların içindeki butonlara tıklanma ile görev\n" +
                "vermek .\n" +
                "\n" +
                "* Listeeki elemana tıklanınca onSelected metodu çalışacaktır.\n" +
                "\n" +
                "\n" +
                "-- Xaml içerisine ;\n" +
                "\n" +
                "\n" +
                "   <ListView x:Name=\"lstView\"  ItemSource= \"{Binding .}\"  ItemSelected=\"onSelected\"\n" +
                "       <StackLayout Orientation=\"Horizontal\">\n" +
                "           <Label Text=\"{Binding Name}\" ></Label>\n" +
                "           <Button Text=\"Sil\" Clicked=\"onClicked\" CommandParameter=\"{Binding}\"></Button>\n" +
                "       </StackLayout>\n" +
                "   </ListView>\n" +
                "\n" +
                "\n" +
                "-- Cs içerisine ;\n" +
                "\n" +
                "  \n" +
                "    private void onSelected (object sender , selectedItemChanged EventArgs e){\n" +
                "           if (e. selectedItem == null){\n" +
                "\t\treturn;\n" +
                " \t   }\n" +
                "         \n" +
                "           YuksekMuhendislik selected=(YuksekMuhendislik) e.SelectedItem ;\n" +
                "           DisplayAlert(\"Yüksek Mühendislik\" , selected.Name , \"OK\" );\n" +
                " \t   ListView lstView = (ListView) sender ;\n" +
                "           lstView.selectedItem = null ; // birden fazla tıklanma için \n" +
                "    }\n" +
                "\n" +
                "    \n" +
                "    private void onClicked (object sender , EventArgs e){\n" +
                "           Button btn = (Button) sender ;\n" +
                "           Display(\"Button\" , btn.CommandParameter.ToString() , \"OK\" ); \n" +
                "           // Burada xamlde belirttiğimiz yere ne yazarsak o görüntülenir \n" +
                "    }\n" +
                "           \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "                             LİSTVİEW A BAŞLIK VERMEK\n" +
                "\n" +
                "\n" +
                "   <ListView.Header>\n" +
                "      <ContentView Padding = \"0,5\"  BackgroundColor = \"#fff\" >\n" +
                "          <Label fontsize = \"medium\" TextColor=\"#000\" \n" +
                "                 Text= \"Başlık Buraya\"\n" +
                "                 HorizontalTextAlignment = \"Center\" \n" +
                "                 VerticalOptions = \"Center\" >\n" +
                "          </Label>\n" +
                "      </ContentView> \n" +
                "   </ListView.Header>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\tFOOTER OLUŞTURMAK\n" +
                "\n" +
                "\n" +
                "-- Xaml içerisine ;\n" +
                "\n" +
                "  <ListView.FooterTemplate >\n" +
                "     <ContentView Padding=\"0,5,5,0\">\n" +
                "       <Label Text=\" Footerdayız \" />\n" +
                "     </ContentView>\n" +
                "  </ListView.FooterTemplate >\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\tSAYFA YENİLENMESİ REFRESH OLUŞTURMAK \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "-- Xaml içerisine ;\n" +
                " \n" +
                "  <ListView IsPullToRefreshEnable = \"True\"   // yenilemeyi koyacağımız yer\n" +
                "            Refreshing = \"onRefresh\" >\n" +
                "\n" +
                "\n" +
                "\n" +
                "-- Cs içerisine ;\n" +
                " \n" +
                "  private void onRefresh (object sender , EventArgs e){\n" +
                "         DisplayAlert(\"Refresh\");\n" +
                "         lstMVA.IsRefreshing = false ;\n" +
                "  }\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                " \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "   BÖLÜM-4\n" +
                "\n" +
                "\n" +
                "\t\t\t\tDEPENDENCY SERVİS\n" +
                "\n" +
                "\n" +
                "* Platformlar üzerinde durumlara erişmek amaçla kullanılan bir servistir .\n" +
                "\n" +
                "* Örnek olarak anlatmak gerekirse bir metod yazdığımızda bu mmetodun sonucu olarak\n" +
                "farklı platformların kendilerine özel sonuçlar üretmesini istiyorsak Dependency \n" +
                "servislerden faydalanabiliriz.\n" +
                "\n" +
                "* Helper adında bir dosya oluşturup içine IDeviceHelper adında bir interface ekleyelim.\n" +
                "Daha sonra public özelliği verelim.\n" +
                "\n" +
                "* Android içine gelip yine Helper adında bir dosya açıp içinde DeviceHelper classı \n" +
                "oluşturup bunu public yapalım IDeviceHelper dan türetelim . Projeyi clean edelim .\n" +
                "Hata söz konusu olduğunda projeyi tekrar başlatmanız gerekebilir. \n" +
                "\n" +
                "\n" +
                " Androiddeki DeviceHelper ın içerisine ;\n" +
                "\n" +
                "  public class DeviceHelper : IDeviceHelper {\n" +
                "         public string GetDeviceName(){\n" +
                "                 return \"Droid ortamı çalıştırıldı\" ; \n" +
                "  }\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                " App.cs  içerisine ;\n" +
                "\n" +
                "   public App () {\n" +
                "\tstring deviceName = DependencyService.Get <IDeviceHelper>().GetDeviceName();\n" +
                "        MainPage = new AnaProje (deviceName) ;   \n" +
                "   }\n" +
                "\n" +
                "\n" +
                "\n" +
                "  UYARI!!\n" +
                "\n" +
                "\n" +
                "\n" +
                "   [assembly : Xamarin.Forms.Dependency(type(DeviceHelper))]\n" +
                "   \n" +
                " * Bunu her platformun sayfası içerisinde namespace kısmının hemen üzerinde belirtmemiz\n" +
                "şarttır . \n" +
                "\n" +
                "\n" +
                "\n" +
                " AnaProje nin Xaml kısmında ;\n" +
                "\n" +
                "\n" +
                "  <Label x:Name = \"txtDeviceName\"></Label>\n" +
                "\n" +
                "\n" +
                "\n" +
                " AnaProjenin Cs içerisine ;\n" +
                "\n" +
                "     .\n" +
                "     .\n" +
                "     .\n" +
                "  Initialization();\n" +
                "  txtDeviceName.Text = deviceName ;\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                " * Böylece ana alanda oluşturulmuş bir metodu platforma kıldık . \n" +
                "  \n" +
                " * Aynı işlemleri diğer platformlar için de yapabiliyoruz . \n" +
                " \n" +
                " * Sonuç olarak iOSta şöyle ama androidde böyle olsun olayını gerçekleştirmiş olduk .\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\tRENDERER AÇIKLAMASI\n" +
                "\n" +
                "\n" +
                "* Renderer konusunda çok derine inmeyeceğiz . Yüzeyden bir açıklama ile anlatacağım .\n" +
                "\n" +
                "* Elimizde bir buton olduğunu düşünelim . iOSta çalışsın ama androidde çalışmasın . \n" +
                "Bu özelliği sağlayabildiğimiz aracın adı rendererlardır . \n" +
                "\n" +
                "* Androidde CustomRenderers adında bir klasör açalım . Sonra burada  CustomEntryRenderer\n" +
                "classı oluşturalım . Public özelliği verelim . Son olarak da EntryRendererdan türetelim.\n" +
                "\n" +
                "* Bu olayı her platformda ayrı ayrı yapıp gerekli izinleri aldıktan sonra yine \n" +
                "farklı platformlarda işleri farklı şekilde tek metodla çalıştırabilmiş oluruz .\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\t\t\tSQLITE  KULLANIMI\n" +
                "\n" +
                "\n" +
                "* Projeye başlamadan önce sqlite veritabanı kullanabilmemiz için gerekli indirmeleri\n" +
                "yapalım .\n" +
                "\n" +
                "* Bunun için projeyi açtıktan sonra solution a sağ tıklayıp manage nuget seçeneğini\n" +
                "açalım . \n" +
                "\n" +
                "* Arama kısmından SQLite.Net-PCL yi bulup windows seçeneğini kaldırıp Latest Stable\n" +
                "3.1.1 ayarlayalım . Yüklemeyi başlatalım .\n" +
                "\n" +
                "* SQLite bağlantı bilgileri platformlarda farklı şekillerde olduğundan burada \n" +
                "Dependency Servis kullanarak bağlantı bilgilerini alacağız . \n" +
                "\n" +
                "* Kodlamalardan önce açılacak tüm dosyaları ve proje biçimlerini burada belirtiyim .\n" +
                "\n" +
                " - Portable da Helper adında dosya\n" +
                " - Bu helper içinde ISQLiteConnection adında bir interface\n" +
                " - Yine helperda SQLiteManager adında bir sınıf\n" +
                "\n" +
                " - Portableda ListPage isimli bir ContentPage\n" +
                " - InsertPage adında bir ContentPage\n" +
                " - Models isimli bir dosya \n" +
                " - Models dosyası içinde Kisiler(Projenize göre) adında bir sınıf\n" +
                "\n" +
                " - Droid kısmı altında ConnectionHelper adında bir dosya\n" +
                " - Bu dosya içerisine GetDroidConnection adında bir sınıf\n" +
                "\n" +
                " - iOS kısmı altında ConnectionHelper adında bir dosya\n" +
                " - İçinde GetiOSConnection adında bir sınıf\n" +
                "\n" +
                " \n" +
                "\n" +
                "\n" +
                " ISQLiteConnection  içerisine ;\n" +
                "\n" +
                "using SQLite.Net;\n" +
                "using System;\n" +
                "using System.Collections.Generic;\n" +
                "using System.Text;\n" +
                "\n" +
                "namespace SQLiteProjem.Helper\n" +
                "{\n" +
                "    public interface ISQLiteConnection\n" +
                "    {\n" +
                "\n" +
                "        SQLiteConnection  GetConnection();\n" +
                "\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                " SQLiteManager içerisine ;\n" +
                "\n" +
                "using System;\n" +
                "using System.Collections.Generic;\n" +
                "using System.Text;\n" +
                "using SQLite.Net;\n" +
                "using SQLiteProjem.Models;\n" +
                "using Xamarin.Forms;\n" +
                "\n" +
                "namespace SQLiteProjem.Helper\n" +
                "{\n" +
                "    public class SQLiteManager\n" +
                "    {\n" +
                "        SQLiteConnection _sqlconnection;\n" +
                "\n" +
                "        public SQLiteManager()\n" +
                "        {\n" +
                "            _sqlconnection = DependencyService.Get<ISQLiteConnection>().GetConnection();\n" +
                "            _sqlconnection.CreateTable<Kisiler>();\n" +
                "        }\n" +
                "\n" +
                "        #region CRUD \n" +
                "\n" +
                "        public int Insert(Kisiler k)\n" +
                "        {\n" +
                "            return _sqlconnection.Insert(k);\n" +
                "        }\n" +
                "\n" +
                "        public int Update(Kisiler k)\n" +
                "        {\n" +
                "            return _sqlconnection.Update(k);\n" +
                "        }\n" +
                "         \n" +
                "        public int Delete(int Id)\n" +
                "        {\n" +
                "            return _sqlconnection.Delete<Kisiler>(Id);\n" +
                "        }\n" +
                "\n" +
                "        public IEnumerable<Kisiler> GetAll()\n" +
                "        {\n" +
                "            return _sqlconnection.Table<Kisiler>();\n" +
                "        }\n" +
                "        \n" +
                "\n" +
                "        public Kisiler Get (int Id)\n" +
                "        {\n" +
                "            return _sqlconnection.Table<Kisiler>().Where(x => x.Id == Id).FirstOrDefault();\n" +
                "        }\n" +
                "\n" +
                "        public void Dispose()\n" +
                "        {\n" +
                "            _sqlconnection.Dispose();\n" +
                "        }\n" +
                "\n" +
                "        #endregion\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                " ListPage cs içerisine ;\n" +
                "\n" +
                "using System;\n" +
                "using System.Collections.Generic;\n" +
                "using System.Linq;\n" +
                "using System.Text;\n" +
                "using SQLite.Net;\n" +
                "using System.Threading.Tasks;\n" +
                "\n" +
                "using Xamarin.Forms;\n" +
                "using Xamarin.Forms.Xaml;\n" +
                "using SQLiteProjem.Helper;\n" +
                "using SQLiteProjem.Models;\n" +
                "\n" +
                "namespace SQLiteProjem\n" +
                "{\n" +
                "\t[XamlCompilation(XamlCompilationOptions.Compile)]\n" +
                "\tpublic partial class ListPage : ContentPage\n" +
                "\t{\n" +
                "\n" +
                "        SQLiteManager manager;\n" +
                "\n" +
                "        public ListPage ()\n" +
                "\t\t{\n" +
                "\t\t\tInitializeComponent ();\n" +
                "\n" +
                "            List<Kisiler> kisilerList = new List<Kisiler>();\n" +
                "            manager = new SQLiteManager();\n" +
                "            kisilerList = manager.GetAll().ToList();\n" +
                "\n" +
                "            lstKisiler.BindingContext = kisilerList;\n" +
                "\t\t}\n" +
                "\n" +
                "        private void onMenuInsert(object sender , EventArgs e)\n" +
                "        {\n" +
                "            Navigation.PushAsync(new InsertPage());\n" +
                "        }\n" +
                "\n" +
                "        private void onMenuRefresh(object sender, EventArgs e)\n" +
                "        {\n" +
                "            List<Kisiler> kisilerList = new List<Kisiler>();\n" +
                "            kisilerList =manager.GetAll().ToList();\n" +
                "            lstKisiler.BindingContext = kisilerList;\n" +
                "        }\n" +
                "\n" +
                "        private void onMenuDelete(object sender , EventArgs e)\n" +
                "        {\n" +
                "            var selectedMenuItem = (MenuItem)sender;\n" +
                "            manager.Delete(Convert.ToInt32(selectedMenuItem.CommandParameter.ToString()));\n" +
                "        }\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                " ListPage xaml içerisine ;\n" +
                "\n" +
                "\n" +
                "<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n" +
                "<ContentPage xmlns=\"http://xamarin.com/schemas/2014/forms\"\n" +
                "             xmlns:x=\"http://schemas.microsoft.com/winfx/2009/xaml\"\n" +
                "             x:Class=\"SQLiteProjem.ListPage\">\n" +
                "    \n" +
                "    <ContentPage.ToolbarItems>\n" +
                "        <ToolbarItem Name=\"Yenile\" Activated=\"onMenuRefresh\" Order=\"Primary\" Priority=\"1\"></ToolbarItem>\n" +
                "        <ToolbarItem Name=\"Ekle\" Activated=\"onMenuInsert\" Order=\"Primary\" Priority=\"0\"></ToolbarItem>\n" +
                "    </ContentPage.ToolbarItems>\n" +
                "\n" +
                "    <ContentPage.Content>   \n" +
                "        <StackLayout>\n" +
                "            <ListView x:Name=\"lstKisiler\" ItemsSource=\"{Binding .}\">\n" +
                "                <ListView.ItemTemplate>\n" +
                "                    <DataTemplate>\n" +
                "                        <TextCell Text=\"{Binding Name}\" Detail=\"{Binding Surname}\">\n" +
                "                        \n" +
                "\n" +
                "                        <TextCell.ContextActions>\n" +
                "                            <MenuItem CommandParameter=\"{Binding Id}\" Text=\"Sil\" IsDestructive=\"True\" Clicked=\"onMenuDelete\"></MenuItem>\n" +
                "                        </TextCell.ContextActions>\n" +
                "\n" +
                "                        </TextCell>\n" +
                "                    </DataTemplate>\n" +
                "                </ListView.ItemTemplate>\n" +
                "            </ListView>\n" +
                "        </StackLayout>\n" +
                "    </ContentPage.Content>\n" +
                "\n" +
                "</ContentPage>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                " InsertPage cs içerisine ;\n" +
                "\n" +
                "using System;\n" +
                "using System.Collections.Generic;\n" +
                "using System.Linq;\n" +
                "using System.Text;\n" +
                "using System.Threading.Tasks;\n" +
                "\n" +
                "using Xamarin.Forms;\n" +
                "using SQLite.Net;\n" +
                "using Xamarin.Forms.Xaml;\n" +
                "using SQLiteProjem.Helper;\n" +
                "using SQLiteProjem.Models;\n" +
                "\n" +
                "namespace SQLiteProjem\n" +
                "{\n" +
                "\t[XamlCompilation(XamlCompilationOptions.Compile)]\n" +
                "\tpublic partial class InsertPage : ContentPage\n" +
                "\t{\n" +
                "\t\tpublic InsertPage ()\n" +
                "\t\t{\n" +
                "\t\t\tInitializeComponent ();\n" +
                "\t\t}\n" +
                "\n" +
                "        private void onInsert (object sender , EventArgs e)\n" +
                "        {\n" +
                "            SQLiteManager manager = new SQLiteManager();\n" +
                "            Kisiler _kisiler = new Kisiler();\n" +
                "            _kisiler.Name = txtName.Text;\n" +
                "            _kisiler.Surname = txtSurname.Text;\n" +
                "\n" +
                "\n" +
                "            int isInserted = manager.Insert(_kisiler);\n" +
                "            if (isInserted>0) {\n" +
                "                DisplayAlert(\"BAŞARILI \", _kisiler.Name + \" EKLENDİ\", \"OK\");\n" +
                "            }\n" +
                "            else\n" +
                "            {\n" +
                "                DisplayAlert(\"BAŞARISIZ \", _kisiler.Name + \" EKLENEMEDİ\", \"OK\");\n" +
                "\n" +
                "            }\n" +
                "\n" +
                "        }\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                " InsertPage xaml içerisine ;\n" +
                "\n" +
                "\n" +
                "<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n" +
                "<ContentPage xmlns=\"http://xamarin.com/schemas/2014/forms\"\n" +
                "             xmlns:x=\"http://schemas.microsoft.com/winfx/2009/xaml\"\n" +
                "             x:Class=\"SQLiteProjem.InsertPage\">\n" +
                "    <ContentPage.Content>\n" +
                "        <TableView Intent=\"Form\">\n" +
                "            <TableRoot>\n" +
                "                <TableSection Title=\"Kişi Ekle\">\n" +
                "                    <EntryCell Label=\"Ad\" x:Name=\"txtName\"></EntryCell>\n" +
                "                    <EntryCell Label=\"Soyad\" x:Name=\"txtSurname\"></EntryCell>\n" +
                "                    <ViewCell >\n" +
                "                        <Button Text=\"Ekle\" Clicked=\"onInsert\"></Button>\n" +
                "                    </ViewCell>\n" +
                "                </TableSection>\n" +
                "            </TableRoot>\n" +
                "        </TableView>\n" +
                "    </ContentPage.Content>\n" +
                "</ContentPage>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                " Kisiler içerisine ;\n" +
                "\n" +
                "\n" +
                "using SQLite.Net.Attributes;\n" +
                "using System;\n" +
                "using System.Collections.Generic;\n" +
                "using System.Text;\n" +
                "\n" +
                "namespace SQLiteProjem.Models\n" +
                "{\n" +
                "    public class Kisiler\n" +
                "    {\n" +
                "        [PrimaryKey , AutoIncrement]\n" +
                "        public int Id { get; set; }\n" +
                "        public string Name { get; set; }\n" +
                "        public string Surname  { get; set; }\n" +
                "\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                " GetDroidConnection içerisine ;\n" +
                "\n" +
                "using System;\n" +
                "using System.Collections.Generic;\n" +
                "using System.Linq;\n" +
                "using System.Text;\n" +
                "\n" +
                "using Android.App;\n" +
                "using Android.Content;\n" +
                "using Android.OS;\n" +
                "using Android.Runtime;\n" +
                "using Android.Views;\n" +
                "using Android.Widget;\n" +
                "using SQLite.Net;\n" +
                "using SQLite.Net.Platform.XamarinAndroid;\n" +
                "using SQLiteProjem.Droid.ConnectionHelper;\n" +
                "using SQLiteProjem.Helper;\n" +
                "\n" +
                "[assembly : Xamarin.Forms.Dependency(typeof(GetDroidConnection))]\n" +
                "namespace SQLiteProjem.Droid.ConnectionHelper\n" +
                "\n" +
                "{\n" +
                "\n" +
                "    public class GetDroidConnection : ISQLiteConnection\n" +
                "    {\n" +
                "        public SQLiteConnection GetConnection()\n" +
                "        {\n" +
                "            string documentPath = System.Environment.GetFolderPath(System.Environment.SpecialFolder.Personal);\n" +
                "\n" +
                "            var path = System.IO.Path.Combine(documentPath, App.DbName);\n" +
                "            var platform = new SQLitePlatformAndroid();\n" +
                "            var connection = new SQLiteConnection(platform, path);\n" +
                "            return connection;\n" +
                "        }\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                " GetiOSConnection içerisine ;\n" +
                "\n" +
                "\n" +
                "using System;\n" +
                "using System.Collections.Generic;\n" +
                "using System.Linq;\n" +
                "using System.Text;\n" +
                "using SQLite.Net;\n" +
                "using SQLite.Net.Platform.XamarinIOS;\n" +
                "using SQLiteProjem.iOS.ConnectionHelper;\n" +
                "\n" +
                "\n" +
                "\n" +
                "[assembly: Xamarin.Forms.Dependency(typeof(GetiOSConnection))]\n" +
                "namespace SQLiteProjem.iOS.ConnectionHelper\n" +
                "{\n" +
                "    public class GetiOSConnection : ISQLiteConnection\n" +
                "    {\n" +
                "        public SQLiteConnection GetConnection()\n" +
                "        {\n" +
                "            string documentPath = System.Environment.GetFolderPath(System.Environment.SpecialFolder.Personal);\n" +
                "\n" +
                "            var path = System.IO.Path.Combine(documentPath, \"Veritabanimiz.db3\");\n" +
                "            var platform = new SQLitePlatformIOS();\n" +
                "            var connection = new SQLiteConnection(platform, path);\n" +
                "            return connection;\n" +
                "        }\n" +
                "\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                " App cs içerisine ;\n" +
                "\n" +
                "\n" +
                "using System;\n" +
                "using Xamarin.Forms;\n" +
                "using Xamarin.Forms.Xaml;\n" +
                "\n" +
                "[assembly: XamlCompilation (XamlCompilationOptions.Compile)]\n" +
                "namespace SQLiteProjem\n" +
                "{\n" +
                "\tpublic partial class App : Application\n" +
                "\t{\n" +
                "        public static string DbName { get; set; } = \"Veritabanimiz.db3\";\n" +
                "\n" +
                "\t\tpublic App ()\n" +
                "\t\t{\n" +
                "\t\t\tInitializeComponent();\n" +
                "           \n" +
                "\t\t\tMainPage = new NavigationPage (new ListPage());\n" +
                "\t\t}\n" +
                "\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "  "));

        eduList.add(new DummyItem("5","JAVA DERSLERİ", "\n" +
                "1- PAKET (PACKAGE) KAVRAMI \n" +
                "--------------------------------------------\n" +
                "\n" +
                "* Sınıflar ve Arayüzleri barındırır \n" +
                "* Hiyerarşiyi sağlar\n" +
                "* İş bölümü yaparak sistematik çalışmayı kolaylaştırır \n" +
                "* Paket tanımlaması yapılmassa ' default package' adında paket oluşturulur\n" +
                "* Tanımlama sayfanın en üst kısmında yapılır \n" +
                "\n" +
                "\tpackage com.org.example ;\n" +
                "\n" +
                "* Birden fazla paket kullanmamız gerektiğinde benzer görevleri olan sınıfları\n" +
                "bir paket altında tutmalıyız \n" +
                "\n" +
                "\tpackage example.database ;\n" +
                "\tpackage example.interface ;\n" +
                "\n" +
                "* Paketler proje dizininde 'bin' klasörü altında bulunur\n" +
                "* Örnek olarak database sınıfı altında delete metodunu çağıralım \n" +
                "\n" +
                "\timport example.database.delete \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2- SABİT TANIMLAMA \n" +
                "--------------------------------------------\n" +
                "\n" +
                "* Değeri değiştirilemeyen değişkenler için kullanılır \n" +
                "* Sabit tanımlama final anahtar kelimesi ile yapılır \n" +
                "* İlk değer ataması  (initializing) zorunludur \n" +
                "\n" +
                "\tpublic class Degiskenler\n" +
                "\t{\n" +
                "\t\tfinal String x1 ;\n" +
                "\t\tx1 = \"Metod Dışında\" ;  // ------------HATALI--------\n" +
                "\t\t\n" +
                "\t\tpublic static void main(String [] args ) \n" +
                "\t\t{\n" +
                "\t\t\tfinal String x2 ;\n" +
                "\t\t\tx2 = \" Metod İçinde \" ; // -------DOĞRU--------\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "3- SINIFTAN TÜRETME \n" +
                "--------------------------------------------\n" +
                "\n" +
                "* Bir nesnenin bir sınıfa ait olduğu gösterilir \n" +
                "* Sinif1 ve Sinif2 daha önce üretilmiş sınıflar olsun \n" +
                "\n" +
                "\tSinif1 s1 = new Sinif1();\n" +
                "\tSinif2 s2 = new Sinif2();\n" +
                "\n" +
                "\tif (s2 instanceof Sinif2){\n" +
                "\t\t----------------------\n" +
                "\t}\n" +
                "\telse{\n" +
                "\t\t----------------------\t\n" +
                "\t}\n" +
                "\n" +
                "\n" +
                "\n" +
                "4- DÖNGÜ ve DİZİ \n" +
                "--------------------------------------------\n" +
                "\n" +
                "\tint[] dizi = {1,2,3,4,5};\n" +
                "\tfor ( int i , dizi){\n" +
                "\t\tsystem.out.print(i + \"  \");\n" +
                "\n" +
                "\t// 1  2  3  4  5 \n" +
                "\n" +
                "\n" +
                "\n" +
                "5- STATIC METODLAR \n" +
                "--------------------------------------------\n" +
                "\n" +
                "* Nesne oluşturulmadan sınıf içindeki metoda erişimi sağlar \n" +
                "\n" +
                "\tpublic class StaticMetodlar\n" +
                "\t{\n" +
                "\t\tpublic static int metod (int a , int b)\n" +
                "\t\t{\n" +
                "\t\t\treturn a*b ;\t\t\n" +
                "\t\t}\n" +
                "\t\n" +
                "\t\tpublic static void main(String[] args)\n" +
                "\t\t{\n" +
                "\t\t\tsystem.out.println(StaticMetodlar.metod(3,5));\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\n" +
                "* Math sınıfının metodları static olarak tanımlanmıştır \n" +
                "* Static metodlar her nesne için ayrı ayrı oluşturulmazlar \n" +
                "* Static metod , static olmayan bir metoda erişilemez\n" +
                "* Static metodlar override-overload edilemez \n" +
                "\n" +
                "\n" +
                "\n" +
                "6- KULLANICI VERİ GİRİŞİ\n" +
                "--------------------------------------------\n" +
                "\n" +
                "* Scanner sınıfı kullanıcı veri girişini sağlamaktadır \n" +
                "* Kullanmak için önce çağırmalıyız \n" +
                "\n" +
                "\tjava.util.Scanner \n" +
                "\n" +
                "\tScanner veriAl = new Scanner(System.in);\n" +
                "\tint sayi = veriAl.next();\n" +
                "\n" +
                "* Kullanıcıyla senkronizasyonu ufak bir arayüzle de sağlayabiliriz\n" +
                "* JOption sınıfından yardım alalım çağırıp işleyelim \n" +
                "\n" +
                "\timport javax.swing.JOptionPane ;\n" +
                "\n" +
                "\tpublic class Main {\n" +
                "        \tpublic static void main(String[] args) {\n" +
                "        \t\tJOptionPane.showMessageDialog(null, \"Bilgilendirme Mesajı\",\"Sonuç\",JOptionPane.OK_OPTION);\n" +
                "    \t\t}\n" +
                "\t}\n" +
                "\n" +
                "\n" +
                "\n"));

        eduList.add(new DummyItem("6","REACT JS DERSLERİ", "İçindekiler\n" +
                "\n" +
                "1- ReactJS Nedir ?\n" +
                "2- Component Nedir ?\n" +
                "3- Virtual DOM Mimarisi Nedir ?\n" +
                "4- Kurulum ve İlk Çalıştırma\n" +
                "5- React Dosyaları Hakkında\n" +
                "6- React ve JSX\n" +
                "7- JSX ve JavaScript İfadeleri\n" +
                "8- İlk Componenti Oluşturma\n" +
                "9- React , CSS ve Bootstrap \n" +
                "10- Functional Components\n" +
                "11- Propsların Kullanımı\n" +
                "12- PropTypes ve Default Props\n" +
                "13- User Arayüzü ve Font Awesome\n" +
                "14- State Nedir ve Statelerin Özellikleri\n" +
                "15- State Oluşturma\n" +
                "16- React Eventler\n" +
                "17- State Değiştirme\n" +
                "18- Componentler Arası İletişim\n" +
                "\n" +
                "\n" +
                "\n" +
                "AŞAMA 1- ReactJS Nedir ?\n" +
                "\n" +
                "* Kullanıcı arayüzleri oluşturmak için  Facebook tarafından geliştirilen bi javascript kütüphanesidir\n" +
                "\n" +
                "* MVC deki View katmanına odaklanır\n" +
                "\n" +
                "* Virtual DOM denilen performans artıran sanal alanı kullanır\n" +
                "\n" +
                "* Bu sayede sadece değişiklik yaşandığı zaman DOM güncellenir\n" +
                "\n" +
                "* Component tabanlıdır\n" +
                "\n" +
                "* Her componentin props ve stateleri bulunur\n" +
                "\n" +
                "* ES6 Syntaxı ve JSX formatı kullanılır\n" +
                "\n" +
                "\n" +
                "AŞAMA 2- Component Nedir ?\n" +
                "\n" +
                "* Sayfadaki alanları , yapıları bir class haline döndürüp içeriklerini de props ve stateler halinde gönderip istediğimiz gibi alanlarda kullanmamızı sağlayan yapıdır\n" +
                "\n" +
                "* Örnek olarak navigasyon barı yada arama alanını component şeklinde yani class olarak yazabiliriz\n" +
                "\n" +
                "* Componentler props ( properties) ve statelerden oluşur\n" +
                "\n" +
                "* Propslar kendi componentleri içinde ve de başka componentlere geçirilerek kullanılabilir\n" +
                "\n" +
                "* Component mantığıyla çalışma esnasında yüksek performans görülmesinin sebebi bir değişiklik yaşandığında yalnızca değişikliğin gözlendiği  componentin yenilenmesidir\n" +
                "\n" +
                "* Bu renderlama yoluyla büyük verilerle ve trafikle kolaylıkla başedilir\n" +
                "\n" +
                "\n" +
                "\n" +
                "AŞAMA 3- Virtual DOM Mimarisi Nedir ?\n" +
                "\n" +
                "* Elimizde 2 çeşit DOM bulunur\n" +
                "\n" +
                "* 1.si Real DOM , 2.si Virtual DOM\n" +
                "\n" +
                "* Virtual DOM , Real DOM’un bellekteki kopyasıdır\n" +
                "\n" +
                "* Document objeleri Key-Value ikilileri olarak bulunur\n" +
                "\n" +
                "* Sayfada güncelleme olduğunda değişiklik yapılanlar  yapılmayanlar arasındaki farklar diff algoritması ile çözümlenip bulunur\n" +
                "\n" +
                "* Componentlerde yapılan değişiklikleri de statelere bakarak görürüz\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "AŞAMA 4- Kurulum ve İlk Çalıştırma\n" +
                "\n" +
                "* React projesi oluşturup çalıştırabilmemiz için node ve npm gibi modüllerin bilgisayarımızda kurulu olması gerekmektedir\n" +
                "\n" +
                "* Proje oluştururken hazır bir paket kullanılır\n" +
                "\n" +
                "* npm install  - g  create-react-app diyerek bu paketin kurulumunu konsolumuzdan yapabiliriz\n" +
                "\n" +
                "* Proje dosyamızı oluşturup bu dosyayı kullandığımız ide ile açmalıyız\n" +
                "\n" +
                "* İdemizdeki terminali açıp projemizi oluşturalım\n" +
                "\n" +
                "create-react-app reactapp    (uygulama ismini küçük harflerle yazmanız gerekiyor)\n" +
                "\n" +
                "* Bu işlem birkaç dakika sürebilir\n" +
                "\n" +
                "* Artık dosyamızın içinde react için gerekli dökümanları görebiliriz\n" +
                "\n" +
                "* Projemizi çalıştıralım\n" +
                "\n" +
                "npm start \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "AŞAMA 5- React Dosyaları Hakkında\n" +
                "\n" +
                "* Projemizin isminin , versiyonunun , paket bağımlılıklarının , çalıştırma - debug etme – servera yükleme gibi kodlarının vs bulunduğu dosya package.json dosyasıdır\n" +
                "\n" +
                "* Proje çalıştırıldığında görünen web sayfası public dosyasının içindeki index.html dir\n" +
                "\n" +
                "* Bu html sayfasına baktığımızda id’si root olan bir div görürüz\n" +
                "\n" +
                "* Bu divin içine componentlerimizi ekleyerek projeye devam ederiz\n" +
                "\n" +
                "* Projenin bu dive render edildiğini index.js dosyası içinde ReactDOM’un render edildiği id kısmını inceleyerek görebiliriz\n" +
                "\n" +
                "* Aynı zamanda bu dosya içinde react , dom , css gibi dosyalar da çağırılır\n" +
                "\n" +
                "* App.js içinde default bir component sınıfı oluşturulur\n" +
                "\n" +
                "* JSX formatı döndürüleceği için render fonksiyonu burada kullanılır\n" +
                "\n" +
                "* JSX sayesinde Javascript içinde html yazabiliriz\n" +
                "\n" +
                "\n" +
                "AŞAMA 6- React ve JSX\n" +
                "\n" +
                "* JSX formatı sayesinde Javascript  içinde hml yazarak web sayfası görünümünü elde edebiliyorduk\n" +
                "\n" +
                "* Projeyi ilk başlattığımızda default olarak App.js içinde bir render fonksiyonu basılmıştır\n" +
                "\n" +
                "* Bu render return yardımıyla jsx formatını bize döndürüp html i bize gösteriyor\n" +
                "\n" +
                "* Burada dikkat edilmesi gereken şey bu jsx içinde yalnızca tek bir div yada herangi bir parent döndürülebiliyor\n" +
                "\n" +
                "* İki ayrı div yada bir div ile bir başlık döndürmek için hepsini tek bir div çatısı altına almamız gerekiyor\n" +
                "\n" +
                "* Aynı zamanda bu jsx formatında parentlar içindeki class keywordü yerine className kullanılır\n" +
                "\n" +
                "* For yerine ise htmlFor kullanılır\n" +
                "\n" +
                "\n" +
                "AŞAMA 7- JSX ve JavaScript İfadeleri\n" +
                "\n" +
                "* Render fonksiyonu içinde html yazıyorduk\n" +
                "\n" +
                "* Bu html in içinde de Javascript yazmak istiyorsak süslü parantez kullanacağız\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "* render(){\n" +
                "\treturn(\n" +
                "\t    <div className=”App”>\n" +
                "\t\t<h4> { 0 + 1 } </h4>\n" +
                "\t\t<h4> { “furkan”.toUpperCase() } </h4>\n" +
                "\t    </div>\n" +
                "\t);\n" +
                "}\n" +
                "\n" +
                "*  Render parantezinden sonra const ile değişken tanımlayabiliriz\n" +
                "\n" +
                "* Bu değişkeni de yazdırmak içinsüslü parantez içine almayı unutmayalım\n" +
                "\n" +
                "\n" +
                "\n" +
                "AŞAMA 8 – İlk Componenti Oluşturma\n" +
                "\n" +
                "* Src nin içine components adında bir dosya açalım ki daha düzenli ve anlaşılır bir\n" +
                "proje yapımız olsun .\n" +
                "\n" +
                "* Üzerinde sağ tıklayıp User.js adında bir class componenti oluşturalım .\n" +
                "\n" +
                "* User.js in içine girip rcc yazıp enterlayıp  eklentiler sayesinde kısayoldan sayfanın\n" +
                "ana yapısını oluşturalım . \n" +
                "\n" +
                "* Export kısmını sayfanın altına taşırsak daha iyi olabilir .\n" +
                "\n" +
                "* Bunu başka alanlarda componentimize etki etmek için yaparız diğer classlarda kullanabiliriz\n" +
                "\n" +
                "* User componentimizin default yapısına bakacak olursak  Render fonksiyonu içinde döndürülecek default bir div de geldi .\n" +
                "\n" +
                "* User.js içinde bir form alanı oluşturup burayı App.js içinde kullanalım .\n" +
                "\n" +
                "* App in içinde User ı çağırmamız lazım\n" +
                "\n" +
                "import User from “./components/User”\n" +
                "\n" +
                "* Sonuç olarak kodumuz şu şekli alacak\n" +
                "\n" +
                "User.js\n" +
                "--------\n" +
                "\n" +
                "class User extends Component{\n" +
                "\trender(){\n" +
                "\t\treturn(\n" +
                "\t\t\t<div>\n" +
                "\t\t\t\t<form>\n" +
                "\t\t\t\t\t<input type =”text”/>\n" +
                "\t\t\t\t\t<button> Gönder </button>\n" +
                "\t\t\t\t</form>\n" +
                "\t\t\t</div>\n" +
                "\t\t)\n" +
                "\t}\n" +
                "\t\n" +
                "}\n" +
                "\n" +
                "export default User ;\n" +
                "\t\n" +
                "\n" +
                "App.js\n" +
                "--------\n" +
                "\n" +
                "import User from “./components/User”;\n" +
                "\n" +
                "class App extends Component {\n" +
                "\trender(){\n" +
                "\t\treturn(\n" +
                "\t\t\t<div className= “App”>\n" +
                "\t\t\t\t<h4> App Component </h4>\n" +
                "\t\t\t\t<User/>\n" +
                "\t\t\t\t<User/>\n" +
                "\t\t\t</div>\n" +
                "\t\t)\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "AŞAMA 9 – React CSS ve Bootstrap \n" +
                "\n" +
                "* Reactta inline style şeklinde yani satıra özel css kullanılmak istiyorsak vereceğimiz özelliği iki tane iç içe güzel parantez açtıktan sonra yazıyoruz .\n" +
                "\n" +
                "  <h4 style={{ color:”red” , fontSize:”30px”}}>\n" +
                "  </h4>\n" +
                "\n" +
                "* Bunun dışında className verip external bir css dosyasında da özellik belirtebiliriz .\n" +
                "\n" +
                "* Sayfamızda bootstrap kullanmak için bootstrabın sitesinden linki kopyalayıp index.htmlin içine gömebiliriz .\n" +
                "\n" +
                "* Css i link olarak sayfanın baş kısımlarına , javascripti ise alt kısımlara eklemeliyiz .\n" +
                "\n" +
                "* Test için ana divimizin className ini ‘ container ‘ yapabiliriz .\n" +
                "\n" +
                "\n" +
                "\n" +
                "AŞAMA 10 – Functional Components\n" +
                "\n" +
                "* İki çeşit component mevcuttur ;\n" +
                "\n" +
                "   1- Class Base Component\n" +
                "2- Functional Component \n" +
                "\n" +
                "\n" +
                "* Componentlerimiz içinde Navbar.js (içinde functional component olacak) isminde bir js oluşturalım . Bu navbar ı render etmeyeceğiz . Sadece statesiz bir kalıp sayfa bölümü olarak kullanalım .\n" +
                "\n" +
                "* Navbar.js içinde (rfc kısayolu)\n" +
                "\n" +
                "\n" +
                "import React from “react”;\n" +
                "\n" +
                "function Navbar(){\n" +
                "\treturn(\n" +
                "\t\t<div>\n" +
                "\t\t\t<h3> User App </h3>\n" +
                "\t\t</div>\n" +
                "\t)\n" +
                "} \n" +
                "\t\n" +
                "export default Navbar ;\n" +
                "\n" +
                "* Artık Navigasyon barı bir funtional components olarak app.js miz içerisinde kullanabiliriz .\n" +
                "\n" +
                "\n" +
                "AŞAMA 11 – Propsların Kullanımı \n" +
                "\n" +
                "* Propslar bir componentten başka bir componente veri aktarımı için kullanılır .\n" +
                "\n" +
                "* Kullanımı oldukça kolaydır .\n" +
                "\n" +
                "* User.js sayfasını değiştirip bilgi listesi yapalım .\n" +
                "\n" +
                "* Dışarıdan gelecek olan propslara yer verelim .\n" +
                "\n" +
                "* Ve hatırlatıcı özelliği olan destruction özelliğini kullanalım .\n" +
                "\n" +
                "\n" +
                "Render () {\n" +
                "\tconst{ name , departman , maas } = this.props;\n" +
                "\treturn(\n" +
                "\t\t<div>\n" +
                "\t\t\t<ul>\n" +
                "\t\t\t\t<li> İsim : {name} </li>\n" +
                "\t\t\t\t<li> Departman : {departman} </li>\n" +
                "\t\t\t\t<li> Maaş : {maas} </li>\n" +
                "\t\t\t</ul>\n" +
                "\t\t</div>\n" +
                "\t)\n" +
                "}\n" +
                "\n" +
                "* Böylece gelecek verilere göre  dinamik bir sayfa yapısı oldu .\n" +
                "* Şimdi App ten User sayfasına verilerimizi gönderelim . Kullanıcı oluşturalım .\n" +
                "\n" +
                "<User \n" +
                "\tname = “Furkan Yıldız”\n" +
                "\tdepartman = “Bilgisayar Mühendisliği”\n" +
                "\tmaas = “5000” \n" +
                "/>\n" +
                "\n" +
                "\n" +
                "\n" +
                "AŞAMA 12 – PropTypes ve Deafult Props \n" +
                "\n" +
                "* Aktarılacak olan verilerin türlerini , aktarıldıklarında yerlerinde ne yazacağı , yazılma zorunluluğu olup olmadığını kontrol edebildiğimiz bir mekanizmadır .\n" +
                "\n" +
                "* User.js e gelip PropType kütüphanesini çağıralım (impt kısayolu)\n" +
                "\n" +
                "* Şimdi de alanlara string  olma ve mutlaka dolu olma koşulu koyalım .\n" +
                "\n" +
                "* Eğer gönderilmeyen veri varsa yerlerine “Bilgi Yok” yazdıralım .\n" +
                "\n" +
                "\n" +
                "User.propTypes = {\n" +
                "\tname : PropTypes.string.isRequired ,\n" +
                "\tdepartman : PropTypes.string.isRequired ,\n" +
                "\tmaas : PropTypes.string.isRequired \n" +
                "}\n" +
                "\n" +
                "User.defaultProps = {\n" +
                "\tname : “Bilgi Yok”,\n" +
                "\tdepartman : “Bilgi Yok”,\n" +
                "\tmaas : “Bilgi Yok”\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "AŞAMA 13 – User Arayüzü ve Font Awesome \n" +
                "\n" +
                "* Fontawesome sitesinde kullanışlı ve estetik iconlar bulunuyor  . Ayrıca arayüzü bootstrabı kullanarak özelleştirebiliriz .\n" +
                "\n" +
                "* Projemize icon dahil etmek için fontawesome sitesindeki beğendimiz iconun linkini index.html sayfamıza yerleştirelim .\n" +
                "\n" +
                "* Silme işlemi yapacağımızı düşünürsek Delete iconu diyerek sayfada arama yapıp seçtiğimiz iconun altındaki yazıyı tıklayıp class kısmındaki bootstrap vari kullanımı alacağız .\n" +
                "\n" +
                "* User arayüzümüze dahil edeceğimize göre User.js e girip İsim kısmının yanına ekleyelim .\n" +
                "\n" +
                "* Jsx formatı kullandığımıza göre className dönüşümü yapmamız gerekiyor .\n" +
                "\n" +
                "* Liste kısmını güzelleştirmek için bootstrapta div genişliğini ayarlayıp CardView kullanalım .\n" +
                "\n" +
                "* Silme butonunu sağa kaydırmak için flex justify kullanalım .\n" +
                "\n" +
                "* CardView ın header ve body kısımlarını ayrı ayrı kullanalım .\n" +
                "\n" +
                "* Başlık kısmına isim , body kısmına ise  Maaş ve Departmanı yazdıralım .\n" +
                "\n" +
                "\n" +
                "\n" +
                "AŞAMA 14 – State Nedir ve Statelerin Özellikleri \n" +
                "\n" +
                "* State bir componentin durumlarını gösteren , tutan , değişik propertilerden oluşan javascript objesidir .\n" +
                "\n" +
                "* Her component kendi içinde statelere sahip olabilir . Componentin o anki durumunu temsil eder .\n" +
                "\n" +
                "* Bu componentin üzerine tıklanmış mı ?\n" +
                "   Şu an bu component görünür mü ? \n" +
                "   Componentin içindeki butona tıklanmış mı ? \n" +
                "Gibi aklımıza gelebilecek herşey state olabilir . State objesi içinde barınabilir .\n" +
                "\n" +
                "* Web sayfamızdaki componentte bir state değiştiği zaman bizim virtual dom aracımız  bunu görür .\n" +
                "\n" +
                "* Sonra da bu component tekrar render edilir .  Sayfanın tümü render edilmez .\n" +
                "\n" +
                "* SetState fonksiyonu yardımıyla stateleri değiştirebiliriz .\n" +
                "\n" +
                "* Bir componentin state objesi başka bir componentde props yardımıyla görülebilir .\n" +
                "\n" +
                "\n" +
                "\n" +
                "AŞAMA 15 – State Oluşturma \n" +
                "\n" +
                "* User componentimiz içinde bir state tanımlayalım\n" +
                "\n" +
                "* Bu state ile componentimizin card-body yani başlık dışındaki alanının görünürlüğünü kontrol edelim .\n" +
                "\n" +
                "* State true olduğunda body kısmı görünsün , false olduğunda görünmesin\n" +
                "\n" +
                "* User sınıfının hemen altında state i tanımlayalım . Daha sonra  card-body nin divini bir kontrol alanı içine alalım .\n" +
                "\n" +
                "\n" +
                "class User  extends Component {\n" +
                "\tstate = { isVisible : false }\n" +
                "\t// diğer alanlara dokunmuyoruz \n" +
                "\n" +
                "\trender(){\n" +
                "\t\tconst{ isVisible } = this.state ;\n" +
                "\t\treturn ( \n" +
                "\t\t\t{ isVisible ?\n" +
                "\t\t\t\t<div className = “card-body”>\n" +
                "\t\t\t\t  .\n" +
                "\t\t\t\t  .\n" +
                "\t\t\t\t  .\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t: null \n" +
                "\t\t\t}\n" +
                "\t\t)\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "\n" +
                "* Bu state i tarayıcıda kontrol etmek için tarayıcımızdaki react arayüzüne ( eklentisine ) User kısımlarını seçtiğimizde çıkan isVisible özelliğinin kutusuna tıklayabiliriz . Tıklandığında o user a özel olarak body nin görünür hale geldiğini göreceğiz .\n" +
                "\n" +
                "\n" +
                "\n" +
                "AŞAMA 16 – React Eventler\n" +
                "\n" +
                "* User Componentimizin içinde h4 başlığı içinde bu başlığı içinde bu başlığa tıklandığında bir onClickEvent çalışacağını söyleyelim .\n" +
                "\n" +
                "* Bind yardımıyla bu evente bir sayı gönderelim\n" +
                "\n" +
                "* Render ın üzerinde tıkladığımız onClickEvent fonksiyonunda bu sayıyı alalım ve konsola yazdıralım .\n" +
                "\n" +
                "// diğer kısımlara dokunmayalım \n" +
                "onClickEvent = (number,e) => {\n" +
                "\tconsole.log(number);\n" +
                "}\n" +
                "\n" +
                "render(){\n" +
                "\treturn(\n" +
                "\t\t<h4 className --- onClick={this.onClickEvent.bind(this,34)} >\n" +
                "\t\t</h4>\n" +
                "\t)\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "AŞAMA 17 – State Değiştirme\n" +
                "\n" +
                "* Daha önce yazdığımız h4 içindeki onClick kısmı çalışınca fonksiyona sayı gönderip bu fonksiyonda yazdırıyorduk .\n" +
                "\n" +
                "* Şimdi Bir şey göndermemize gerek yok sadece basıldığında componentin statetindeki isVisible özelliğini not operatörü ile tersine çevirelim .\n" +
                "\n" +
                "* h4 alanımızı düzenleyelim .\n" +
                "\n" +
                "\t<h4 --- onClick={this.onClickEvent}> {name} </h4>\n" +
                "\n" +
                "* Fonksiyonumuzda setState kullanarak componentin stateini değiştirelim .\n" +
                "\n" +
                "\tOnClickEvent =(e)=> {\n" +
                "\t\tthis.setState ({\n" +
                "\t\t\tisVisible :! this.state.isVisible \n" +
                "\t\t})\n" +
                "\t}\n" +
                "\n" +
                "\n" +
                "AŞAMA 18 – Componentler Arası İletişim \n" +
                "\n" +
                "* Bu uygulamada ek bir component açacağız . App componentindeki kişi verilerini state içinde göstereceğiz . Daha sonra state içinde liste halinde isim , departman , maaş gibi bilgileri yazacağız .\n" +
                "\n" +
                "* Components klasörü içinde Users.js i oluşturalım . Burada User componentini kullanacağımız için import edelim .\n" +
                "\n" +
                "* App componenti içinde stateimizi oluşturalım . State içindeki  listenin adı users olsun . Arrayde de her bir User objemiz yer alsın .\n" +
                "\n" +
                "* Artık ana componentimizin altında bir navigasyon componenti  ve User componenti varken , app ile user componenti arasına bir de Users componenti eklemiş olduk .\n" +
                "\n" +
                "* Users a App in içinden users listemizi (state’i) props olarak gönderelim .\n" +
                "\n" +
                "* Users componentine göndereceğimiz propsu App içinde yazalaım .\n" +
                "\n" +
                "class App extends Component{\n" +
                "\tstate = {\n" +
                "\t\tusers : [\n" +
                "\t\t     { \n" +
                "\t\t\tid : 1,\n" +
                "\t\t\tname : “Furkan Yıldız”,\n" +
                "\t\t\tdepartman : “Bilgisayar Mühendisliği” , \n" +
                "\t\t\tmaas : “5000”\n" +
                "\t\t     }\n" +
                "\t\t]\n" +
                "\t}\n" +
                "\trender(){\n" +
                "\t\treturn(\n" +
                "\t\t\t<div className=”container”>\n" +
                "\t\t\t\t<Navbar title =”User App”/>\n" +
                "\t\t\t\t<hr />\n" +
                "\t\t\t\t<Users users={this.state.users}/>\n" +
                "\t\t\t</div>\n" +
                "\t\t);\n" +
                "\t}\n" +
                "}\n" +
                "* Users componentine gelip propsu alalım . Her bir user objesini ayırt etmek için key kullanalım . Bu key uniq olmalı bu yüzden id’yi buraya atayalım . Statein içinde dolaşıp  userları görebilmek için map fonksiyonu kullanacağız  .\n" +
                "\n" +
                "\n" +
                "class Users extends Component {\n" +
                "\trender(){\n" +
                "\t\tconst{users} = this.props;\n" +
                "\t\treturn(\n" +
                "\t\t\t<div>\n" +
                "\t\t\t      {\n" +
                "\t\t\t\tusers.map(users=>{\n" +
                "\t\t\t\t       return(\n" +
                "\t\t\t\t\t<User\n" +
                "\t\t\t\t                  key={user.id}\n" +
                "\t\t\t\t\t      name={user.name}\n" +
                "\t\t\t\t\t      maas={user.maas}\n" +
                "\t\t\t\t\t      departman={user.departman}\n" +
                "\t\t\t\t\t/>\n" +
                "                                                       )\n" +
                "\t\t\t\t})\n" +
                "\t\t\t       }\n" +
                "\t\t\t</div>\n" +
                "\t\t)\n" +
                "\t}\n" +
                "}\n" +
                "\t\t\t"));

        eduList.add(new DummyItem("7","VUE JS DERSLERİ", "İçindekiler \n" +
                "\n" +
                "1- Neden VueJS \n" +
                "2- Kurulum \n" +
                "3- İlk Component \n" +
                "4- Data İçerisinde Tuttuğumuz Veriyi Gösterme\n" +
                "5- Methods Kısmında Datadaki Verileri Birleştirme\n" +
                "6-  V-Model ve  Computed Alanı\n" +
                "7- Click Eventler\n" +
                "8- İf – else Şart Kalıpları \n" +
                "9- Watch ile Değişken Metodlarını Kontrol\n" +
                "10- Bind İşlemleri\n" +
                "11- Router Kullanımı \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "1- Neden VueJS \n" +
                "\n" +
                "* Kullanıcı dostu ,  çok yönlü , performanslı , sürdürülebilir , test edilebilirdir .\n" +
                "* Modern JavaScript Web Frameworklerinden biridir .\n" +
                "* Prograssive bir kütüphanedir . Jquery tarzı kullanılabilir . \n" +
                "* Süreçler işlerin browser üzerinde döndürülmesine en güzel örneklerdendir .\n" +
                "* Birkaç türlü uygulama geliştirilebilir .\n" +
                "* Bakımı kolaydır .\n" +
                "* Kendi içerisinde Core’unu ve Router’ını barındırır .\n" +
                "* Reusable Components desteği sunar .  Bir defa yazıp birçok defa kullanabiliriz .\n" +
                "* Her component başlı başına bir yapı gibi çalışır .\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2- Kurulum \n" +
                "\n" +
                "* VueJS sitesinden script etiketlerini alıp html dosyanızın head blokları içerisine aktarabilirsiniz .\n" +
                "* Dosya kurulumu halinde yapmak isterseniz NodeJS ve NPM yüklemelisiniz .\n" +
                "* Daha sonra ;\n" +
                "    \n" +
                "    $ npm install  -g  vue – cli \n" +
                "    $ vue init webpack projeDosyaAdi \n" +
                "    $ cd  projeDosyaAdi\n" +
                "    $ npm install \n" +
                "    $ npm  run  dev \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "3- İlk Component \n" +
                "\n" +
                "* VueJS te yapıya uymak için her alanın bir component olması idealdir .\n" +
                "* Proje dosyamızın üzerinde sağ tıklayıp yeni dosya diyelim .\n" +
                "* İsmini Calculater.vue koyup tamamlayalım .\n" +
                "* Sayfada “sc” + enter yaptığımızda template-script-style dan oluşan iskelet yüklenecektir .\n" +
                "* Template alanında yapacağımız herşey tek bir tag içinde olmalıdır .\n" +
                "\n" +
                "<template>\n" +
                "\t<div> \n" +
                "\t\tBurası Calculater Componenti\n" +
                "\t</div>\n" +
                "</template>\n" +
                "\n" +
                "<script>\n" +
                "\texport default {\n" +
                "\n" +
                "\t}\n" +
                "</script>\n" +
                "\n" +
                "<style>\n" +
                "</style>\n" +
                "\n" +
                "\n" +
                "* Bu componenti görebilmemiz için App.vue dosyasının içinde çağırmalıyız .\n" +
                "* Bir de çağırdığımız componenti export default alanında components başlığı içinde belirtmeliyiz .\n" +
                "* App.vue içinde ilk script tagının hemen altında import edelim .\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "<template>\n" +
                "\t<div id=\"app\">\n" +
                "\t\t<Calculater/>\n" +
                "\t</div>\n" +
                "</template>\n" +
                "\n" +
                "<script>\n" +
                "import Calculater from './components/Calculater';\n" +
                "\n" +
                "export default {\n" +
                "\tname: 'App',\n" +
                "\n" +
                "\tcomponents:{\n" +
                "\t\t'Calculater' : Calculater,\n" +
                "\t}\n" +
                "}\n" +
                "</script>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "4- Data İçerisinde Tuttuğumuz Veriyi Gösterme\n" +
                "\n" +
                "* Export Default alanında template ler içindeki alanların id leri name\n" +
                "değişkeniyle tutulur .\n" +
                "* Data alanında değişkenler yazılır .\n" +
                "* Methods alanına kullanılacak metodlar yazılır .\n" +
                "* Bunun dışında çağırılan componentleri belirtmek için components vs gibi\n" +
                "birçok bölüm vardır . \n" +
                "* Bizim sayfa içinde Data alanındaki değişkenimizi sayfamızda göstermemiz\n" +
                "oldukça kolaydır .\n" +
                "* Hemen bir değişken tanımlayıp kendime Hoşgeldin yazdırayım .\n" +
                "* Hatta bunu HelloWorld componenti içinde yapıp app e yollayayım .\n" +
                "\n" +
                "\n" +
                "<template>\n" +
                "\t<div id=\"helloWorld\">\n" +
                "\t{{yazi}} <br>\n" +
                "\tHoşgeldin {{isim}} \n" +
                "\t</div>\n" +
                "</template>\n" +
                "\n" +
                "<script>\n" +
                "export default {\n" +
                "\tname : 'helloWorld',\n" +
                "\tdata(){\n" +
                "\t\treturn{\n" +
                "\t\t\tyazi : \"Burası HelloWorld Componenti\",\n" +
                "\t\t\tisim : \"FY\"\n" +
                "\t\t}\n" +
                "\t}\n" +
                "};\n" +
                "</script>\n" +
                "\n" +
                "<style>\n" +
                "</style>\n" +
                "\n" +
                "* Data alanında 2 tane değişken döndürdüm .\n" +
                "* Bunları Template alanında  {{}} içerisinde kullanabildim .\n" +
                "* Data içinde değişkenler arasına virgül koymayı unutmayalım .\n" +
                "* Son olarak App.vue içinde düzenleme yapıp yalnızca HelloWorld\n" +
                "componentini çağırıyorum\n" +
                "\n" +
                "<template>\n" +
                "\t<div id=\"app\">\t\n" +
                "\t\t<HelloWorld/>\n" +
                "\t</div>\n" +
                "</template>\n" +
                "\n" +
                "<script>\n" +
                "import HelloWorld from './components/HelloWorld';\n" +
                "\n" +
                "export default {\n" +
                "\tname: 'App',\n" +
                "\tcomponents:{\n" +
                "\t\t'HelloWorld' : HelloWorld\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "</script>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "5- Methods Kısmında Datadaki Verileri Birleştirme\n" +
                "\n" +
                "* UserList componentinden devam edelim .\n" +
                "* Export default alanında Data içerisinde firstName , lastName ve mailAddress alanları\n" +
                "açıp returnleyelim . \n" +
                "* Name ve Data nın ardından bir de Methods başlığı açıp userInfo adında bir fonksiyon\n" +
                "yaratalım .\n" +
                "* Bu fonksiyonun sonucunda datadaki verileri (this koyarak) çekip birleştirelim .\n" +
                "* Template tagi içini sonuçları daha düzenli görmek için düzenleyelim .\n" +
                "* Burada metod sonucunu göstermek için parantez aç-kapa yapmayı unutmayın .\n" +
                "\n" +
                "<template>\n" +
                "\t<div id=\"userList\">\n" +
                "\t\t<p>First Name :{{firstName}}</p>\n" +
                "\t\t<p>Last Name :{{lastName}}</p>\n" +
                "\t\t<p>Mail Address :{{mailAddress}}</p>\n" +
                "\t\t<p>FULL INFO FROM METHODS :{{userInfo()}}</p> \n" +
                "\t</div>\n" +
                "</template>\n" +
                "\n" +
                "<script>\n" +
                "\texport default {\n" +
                "\t\tname :'userList', \n" +
                "\t\tdata(){\n" +
                "\t\t\treturn{\n" +
                "\t\t\t\tfirstName : \"Furkan\",\n" +
                "\t\t\t\tlastName : \"Yıldız\",\n" +
                "\t\t\t\tmailAddress : \"info@frknyldz.com\"\n" +
                "\t\t\t}\n" +
                "\t\t},\n" +
                "\n" +
                "\tmethods:{\n" +
                "\t\tuserInfo: function(){\n" +
                "\t\t\treturn this.firstName +\" \"+ this.lastName+ \" \"+ this.mailAddress;\n" +
                "\t\t}\n" +
                "\t}\n" +
                "};\n" +
                "</script>\n" +
                "\n" +
                "<style>\n" +
                "</style>\n" +
                "\n" +
                "* App.vue içerisinde herangi bir değişiklik yapmamıza gerek yok .\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "6-  V-Model ve  Computed Alanı \n" +
                "\n" +
                "* V-model yapısı on-load metodları tarzı çalışıp anlık olarak etki yaratmak\n" +
                "için kullanılır .\n" +
                "* Eğer bir input ile data bölümünden bir değişken baz alınırsa inputta\n" +
                "yapılan değişiklik dataya da direkt olarak etki edecektir .\n" +
                "* Bunun için bir örnek yapalım .\n" +
                "* Template alanımızda 2 tane input alanı açıp datamızdaki firstName ve\n" +
                "lastName i v-model ile alalım . \n" +
                "* İnput alanında yaptığımız değişikliğin etkisini görmek için bir computed\n" +
                "alanında bu değişikliği izleyen bir fonksiyon yazalım .\n" +
                "* İnput alanının altına da bir paragrafla bu değişikliği gösterelim .\n" +
                "\n" +
                "<template>\n" +
                "\t<div id=\"userList\">\n" +
                "\t\t<input type=\"text\" v-model=\"firstName\"> \n" +
                "\t\t<input type=\"text\" v-model=\"lastName\">\n" +
                "\t\t<p>{{fullName}}</p>\n" +
                "\t</div>\n" +
                "</template>\n" +
                "\n" +
                "<script>\n" +
                "\texport default {\n" +
                "\t\tname :'userList', \n" +
                "\t\tdata(){\n" +
                "\t\t\treturn{\n" +
                "\t\t\t\tfirstName : \"Furkan\",\n" +
                "\t\t\t\tlastName : \"Yıldız\",\n" +
                "\t\t\t\tmailAddress : \"info@frknyldz.com\"\n" +
                "\t\t\t}\n" +
                "\t\t},\n" +
                "\t\tcomputed:{\n" +
                "\t\t\tfullName:function(){\n" +
                "\t\t\t\treturn this.firstName + \" \" + this.lastName ;\n" +
                "\t\t\t} \n" +
                "\t\t},\n" +
                "\t};\n" +
                "</script>\n" +
                "\n" +
                "<style>\n" +
                "</style>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "7- Click Eventler \n" +
                "\n" +
                "* Calculater componentimize geçip template alanında bir buton oluşturalım .\n" +
                "* Butona v-on:click=”displayNumber” girelim ve butona isim verelim .\n" +
                "* Data nın içinde boş bir total değişkeniyle beraber 2 tane de sayı değişkeni\n" +
                "yazalım . \n" +
                "* Modüler olması için sayıları inputla değiştirilebilir yapalım .\n" +
                "* Şimdi bu sayılları toplayacak olan metodu yazalım .\n" +
                "* Amacaımız butona tıklandığında bir metod çalıştırmak sonuç olarak da toplamlarını\n" +
                "görmek .\n" +
                "* En son string olarak görmemesi için metod içinde parseInt kullanmamız gerekecektir .\n" +
                "* App.vue içinde Calculater componentini çağırmayı unutmayalım .\n" +
                "\n" +
                "\n" +
                "<template>\n" +
                "\t<div id=\"calc\">\n" +
                "\t\t<input type=\"text\" v-model=\"number1\"> \n" +
                "\t\t<input type=\"text\" v-model=\"number2\">\n" +
                "\t\t<button v-on:click=\"sumToNumber\"> TOPLA</button>\n" +
                "\t\t<p>SONUÇ : {{total}}</p>\n" +
                "\t</div>\n" +
                "</template>\n" +
                "\n" +
                "<script>\n" +
                "\texport default {\n" +
                "\t\tname :'calc', \n" +
                "\t\tdata(){\n" +
                "\t\t\treturn{\n" +
                "\t\t\t\tnumber1 : 16,\n" +
                "\t\t\t\tnumber2 : 17,\n" +
                "\t\t\t\ttotal : ''\n" +
                "\t\t\t}\n" +
                "\t\t},\n" +
                "\t\tmethods:{\n" +
                "\t\t\tsumToNumber : function(){\n" +
                "\t\t\t\treturn this.total = parseInt(this.number1)+parseInt(this.number2);\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t};\n" +
                "</script>\n" +
                "\n" +
                "<style>\n" +
                "</style>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "8- If – Else Şart Kalıpları \n" +
                "\n" +
                "* WelcomePage adında yeni bir component oluşturup App.vue içinde çağıralım .\n" +
                "* Show adında true değerinde  ve userName adında birer değişkenimiz olsun .\n" +
                "* Template alanında iki ayrı divimiz için birinin class ismi userBar diğeri de guestBar\n" +
                "olsun .\n" +
                "* Senaryo gereği bir butonumuz show değişken değerini tersine çevirsin .\n" +
                "* Bunu methods alanında bir fonksiyon ile yapacağız .\n" +
                "* Show değeri true olduğunda userBar divimizde userName e Hoşgeldin diyelim .\n" +
                "* False olması durumunda  da guestBar divinde Lütfen Kaydolun yazdıralım .\n" +
                "\n" +
                "\n" +
                "<template>\n" +
                "\t<div>\n" +
                "\t\t<div v-if=\"show\" class=\"userBar\">\n" +
                "\t\t\tHoşgeldiniz {{userName}}\n" +
                "\t\t</div>\n" +
                "\n" +
                "\t\t<div v-else-if=\"!show\" class=\"guestBar\"> \n" +
                "\t\t\tLÜtfen Kaydolun \n" +
                "\t\t</div>\n" +
                "\n" +
                "\t\t<button v-on:click=\"showData\"> GİRİŞ/ÇIKIŞ </button>\n" +
                "\t</div>\n" +
                "</template>\n" +
                "\n" +
                "<script>\n" +
                "\texport default {\n" +
                "\t\tname : \"WelcomePage\",\n" +
                "\t\tdata(){\n" +
                "\t\t\treturn{\n" +
                "\t\t\t\tuserName : \"Furkan Yıldız\",\n" +
                "\t\t\t\tshow : true,\n" +
                "\t\t\t}\n" +
                "\t\t},\n" +
                "\t\tmethods:{\n" +
                "\t\t\tshowData : function (){\n" +
                "\t\t\t\tthis.show = !this.show;\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t}\n" +
                "</script>\n" +
                "\n" +
                "<style>\n" +
                "</style>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "9- Watch ile Değişken Metodlarını Kontrol\n" +
                "\n" +
                "* İki tane input alanımız olduğunu düşünelim .\n" +
                "* Birinde Kilometre değeri alıyoruz diğerinde ise Metre .\n" +
                "* Bu değerleri data olarak saklıyoruz .\n" +
                "* İstiyoruz ki birinde değişiklik yaptığımız anda karşılıklı olarak çevirim yapılsın\n" +
                "ve sonuç diğer inputa yansıtılsın .\n" +
                "* Hadi uygulayalım .\n" +
                "* KmToMeterWatch.vue adında bir component oluşturup App.vue de çağıralım .\n" +
                "\n" +
                "<template>\n" +
                "\t<div>\n" +
                "\t\tKilometre \n" +
                "\t\t<input type=\"text\" v-model=\"kilometers\">\n" +
                "\t\t<br>\n" +
                "\t\t<br>\n" +
                "\t\tMetre\n" +
                "\t\t<input type=\"text\" v-model=\"meters\">\n" +
                "\t</div>\n" +
                "</template>\n" +
                "\n" +
                "<script>\n" +
                "\texport default {\n" +
                "\t\tname : \"KmToM\",\n" +
                "\t\tdata(){\n" +
                "\t\t\treturn{\n" +
                "\t\t\t\tkilometers : 0 ,\n" +
                "\t\t\t\tmeters : 0 \n" +
                "\t\t\t}\n" +
                "\t\t},\n" +
                "\t\twatch:{\n" +
                "\t\t\tkilometers : function(data){\n" +
                "\t\t\t\tthis.kilometers = data ;\n" +
                "\t\t\t\tthis.meters = data*1000;\n" +
                "\t\t\t},\n" +
                "\n" +
                "\t\t\tmeters : function(data){\n" +
                "\t\t\t\tthis.meters = data ;\n" +
                "\t\t\t\tthis.kilometers = data/1000 ;\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t}\n" +
                "</script>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "10- Bind İşlemleri\n" +
                "\n" +
                "* Normal şartlarda örnek olarak datamızın içindeki bir veriyi rahatlıkla\n" +
                "template içinde yazdırabiliyor ve kullanabiliyorduk . \n" +
                "* Bunu yaparken değişken ismini {{}} içerisine alıyorduk .\n" +
                "* Ama öyle zamanlar olacaktır ki biz değişken ismimizi böyle kullanamayacağız .\n" +
                "* Bu tip durumlarda binding işlemleri yardımımıza koşacaktır .\n" +
                "* Hadi bir örnekle ne demek istediğimizi görelim .\n" +
                "* Datalarımız arasında bir web sitesi adresini bir değişkene atayalım .\n" +
                "* Sonra da template içinde a href tagında bu linki kullanalım .\n" +
                "* BindingOrnek adında bir component içine kodlarımı yazıyorum .\n" +
                "* A href tagı içinde href alanını bind ediyorum .\n" +
                "* Normal bir a href ile farkını da görmüş olalım .\n" +
                "\n" +
                "<template>\n" +
                "\t<div id=\"bindingOrnek\">\n" +
                "\t\t<a href=\"https:google.com.tr\">GOOGLE</a>\n" +
                "\t\t<a v-bind:href=\"myLink\">BLOG PAGE</a>\n" +
                "\t</div>\n" +
                "</template>\n" +
                "\n" +
                "<script>\n" +
                "\texport default {\n" +
                "\t\tname : 'bindingOrnek',\n" +
                "\t\tdata(){\n" +
                "\t\t\treturn{\n" +
                "\t\t\t\tmyLink : \"https:www.frknyldz.com\"\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t}\n" +
                "</script>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "11- Router Kullanımı\n" +
                "\n" +
                "* Web sitemizdeki sayfa linklerini kontrol etmek için router kullanırız .\n" +
                "* Anasayfa , hakkımızda ve iletişim sayfalarımızın olduğunu varsayalım .\n" +
                "* Bunlar birer componenttan oluşuyor olsun .\n" +
                "* App.vue de router-link ler aracılığıyla yönlendirme yapacağız .\n" +
                "* Router yönetimi için altına router-view ekleyelim .\n" +
                "\n" +
                "\n" +
                "\n" +
                "<template>\n" +
                "\t<div id=\"app\">\n" +
                "\t\t<router-link to=\"/\">Anasayfa</router-link>\n" +
                "\t\t<router-link to=\"/Hakkımızda\">Hakkımızda</router-link>\n" +
                "\t\t<router-link to=\"/İletisim\">İletisim</router-link>\n" +
                "\n" +
                "\t\t<router-view/>\n" +
                "\t</div>\t\n" +
                "</template>\n" +
                "\n" +
                "<script>\n" +
                "\texport default {\n" +
                "\t\tname: 'App'\n" +
                "\t}\n" +
                "</script>\n" +
                "\n" +
                "\n" +
                "* Buraya kadar tamam ama bizim router kullandığımızı main.js te bildirmemiz lazım .\n" +
                "* Router ı import edip use metodunda kullanacağız .\n" +
                "* Sonra componentlerin pathlerini tek tek vereceğiz .\n" +
                "* En son da render ın altında router diyip bitireceğiz .\n" +
                "\n" +
                "\n" +
                "import Vue from 'vue'\n" +
                "import Router from 'vue-router'\n" +
                "\n" +
                "Vue.use(Router);\n" +
                "\n" +
                "import App from './App'\n" +
                "\n" +
                "import Anasayfa from './components/Anasayfa'\n" +
                "import Hakkımızda from './components/Hakkımızda'\n" +
                "import İletisim from './components/İletisim'\n" +
                "\n" +
                "\n" +
                "const router = new Router({\n" +
                "\troutes : [\n" +
                "\t\t{ path: '/', component:Anasayfa},\n" +
                "\t\t{ path: '/Hakkımızda', component:Hakkımızda},\n" +
                "\t\t{ path: '/İletisim', component:İletisim}\n" +
                "\t],\n" +
                "\tmode : 'history'\n" +
                "})\n" +
                "\n" +
                "\n" +
                "Vue.config.productionTip = false\n" +
                "\n" +
                "new Vue({\n" +
                "\tel: '#app',\n" +
                "\trender: h => h(App),\n" +
                "\trouter\n" +
                "})\n" +
                "\n" +
                "* İşte bu kadar ."));

        eduList.add(new DummyItem("8","JQUERY DERSLERİ", "İçindekiler\n" +
                "\n" +
                "\n" +
                "1- Nesneleri Seçip Metod Kullanmak\n" +
                "2- CSS Metodu ile Nitelik Atama\n" +
                "3- Fonksiyon Sınıfı \n" +
                "4- Click Metodu Kullanımı \n" +
                "5- Trim ile Boşluk Kaldırma  \n" +
                "6- Live ve Append Metodu  \n" +
                "7- Last Filtresi \n" +
                "8- GetJSON Fonksiyonu\n" +
                "9- Each Döngü Metodu\n" +
                "10- Remove \tMetodu\n" +
                "11- Toggle Metodu\n" +
                "12- Slide Metodu\n" +
                "13- Hover Metodu\n" +
                "14- Size Metodu\n" +
                "15- Fade Metodu\n" +
                "16- Eq filtresi ve Eq Metodu\n" +
                "17- Animate Metodu \n" +
                "18- Parent Metodu\n" +
                "19- Serialize Metodu\n" +
                "20- HasClass Metodu\n" +
                "21- Change Metodu\n" +
                "22- Html Metodu\n" +
                "23- Text Metodu  \n" +
                "24- Val Metodu  \n" +
                "25- ToggleClass Metodu \n" +
                "26- Prepend Metodu \n" +
                "27- Focus Metodu \n" +
                "28- Clone Metodu \n" +
                "29- Next Metodu \n" +
                "30- Double Click Metodu \n" +
                "31- Checked Filtresi \n" +
                "32- Width Metodu \n" +
                "33- Height Metodu \n" +
                "34- Load Metodu \n" +
                "35- Error Metodu\n" +
                "36- One Metodu\n" +
                "37- Submit Metodu \n" +
                "38- Ajax Post Metodu ile Veri Çekme \n" +
                "39- Ajax Post Metodu ile Veri Yazma \n" +
                "40- Ajax Get Metodu\n" +
                "41- Ajax Metodu \n" +
                "42- Stop Metodu \n" +
                "43- :Contains Filtresi\n" +
                "44- isNumeric Metodu\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "1- Nesneleri Seçip Metod Kullanmak\n" +
                "\n" +
                "\n" +
                "* Önce html nesnelerinden birini seçeriz\n" +
                "* Sonra da buraya uygulamak istediğimiz metodu yazarız\n" +
                "* Birden fazla nesne de seçebiliriz \n" +
                "* Nesne seçiminde Dolar , Metod uygulamasında Nokta işareti kullanılır\n" +
                "\n" +
                "        <script type=\"text/javascript\" src=\"/jQueryEğitimi/js/jquery-3.3.1.min.js\"></script>\n" +
                "        <script type=\"text/javascript\">\n" +
                "                 \n" +
                "            $(function(){\n" +
                "                $(\"p,a,div.furkan,div#yıldız\").hide(3000);\n" +
                "                //Seçilen nesneleri 3 saniye içinde görünmez hale getirir\n" +
                "\t\t//Gizleneni tekrar göstermek için .show() metodu kullanılır\n" +
                "            });\n" +
                "       \n" +
                "        </script>\n" +
                "\n" +
                "\t<body>\n" +
                "        \t<p>JQuery Eğitimine Başlıyoruz</p>\n" +
                "        \t<a href=\"#\">Ayrıntılı Eğitim İçin Sitemi Ziyaret Edin</a>\n" +
                "        \t<div class=\"furkan\">Furkan</div>\n" +
                "       \t \t<div id=\"yıldız\">Yıldız</div>\n" +
                "    \t</body>\n" +
                "\n" +
                "\n" +
                "2- CSS Metodu ile Nitelik Atama\n" +
                "\n" +
                "\n" +
                "* JQueryde CSS yazmamızı sağlayan metoddur\n" +
                "* Paragrafımızı seçip yazı rengini değiştirelim \n" +
                "* Yazının altını çizelim\n" +
                "* Bir de arka planın rengini değiştirelim \n" +
                "* a nesnesine bir nitelik atayıp href ile siteye gidelim\n" +
                "* Son olarak yazımızın rengini öğrenip alert olarak yazdıralım\n" +
                "\n" +
                "\t<script type=\"text/javascript\">    \n" +
                "            \n" +
                "      $(function(){\n" +
                "         $(\"p\").css({\n" +
                "            \"color\":\"red\",\n" +
                "            \"text-decoration\":\"overline\",\n" +
                "            \"background-color\":\"black\"\n" +
                "         });\n" +
                "\t\t\n" +
                "\t\t\t$(\"a\").attr(\"href\",\"http://www.frknyldz.com\")\n" +
                "            alert($(\"p\").css(\"color\"));\n" +
                "      });\n" +
                "        \n" +
                "   </script>\n" +
                "\n" +
                "\t<body>\n" +
                "      <p>JQuery Eğitimine Başlıyoruz</p>\n" +
                "      <a href=\"#\">Ayrıntılı Eğitim İçin Sitemi Ziyaret Edin</a>\n" +
                "\n" +
                "      <div class=\"furkan\">Furkan</div>\n" +
                "      <div id=\"yıldız\">Yıldız</div>\n" +
                "   </body>\n" +
                "\n" +
                "\n" +
                "3- Fonksiyon Sınıfı \n" +
                "\n" +
                "\n" +
                "* Kendi fonksiyonlarımızı yazabiliriz \n" +
                "* Bu fonksiyonlara birden fazla metod ekleyebiliriz \n" +
                "* Dışarıdan bu metodları çalıştırabilir hatta parametre gönderebiliriz\n" +
                "\n" +
                "\t <script type=\"text/javascript\">\n" +
                "           \n" +
                "      $(function(){\n" +
                "         $.FY ={\n" +
                "            goster : function(){\n" +
                "               alert(\"FY Sınıfından goster() metodu çalıştırıldı\")\n" +
                "            },\n" +
                "\n" +
                "            onayla : function(){\n" +
                "               alert(\"FY Sınıfından onayla() metodu çalıştırıldı\")\n" +
                "            },\n" +
                "\n" +
                "            site : function(url,siteSahibi){\n" +
                "               alert(url + \" \" + siteSahibi);\n" +
                "            }\n" +
                "         } \n" +
                "      });\n" +
                "   \n" +
                "   </script>\n" +
                "\n" +
                "\n" +
                "    <body>\n" +
                "        <input type=\"submit\" onclick=\"$.FY.goster()\"/>\n" +
                "        <input type=\"submit\" onclick=\"$.FY.onayla()\"/>\n" +
                "        <input type=\"submit\" onclick=\"$.FY.site('www.frknyldz.com','Furkan YILDIZ')\"/>\n" +
                "    </body>\n" +
                "\n" +
                "\n" +
                "4- Click Metodu Kullanımı \n" +
                "\n" +
                "\n" +
                "* Bir liste oluşturalım \n" +
                "* Bir de div oluşturalım\n" +
                "* Listenin herangi bir elemanına tıklandığında  div kaybolsun\n" +
                "\n" +
                "\n" +
                "   <script type=\"text/javascript\" src=\"/jQueryEğitimi/js/jquery-3.3.1.min.js\"></script>\n" +
                "\n" +
                "   <script type=\"text/javascript\">  \n" +
                "\n" +
                "      $(function(){\n" +
                "         $(\"ul.FY li\").click(function(){\n" +
                "            $(\"#alan\").hide(3000);\n" +
                "         });\n" +
                "\t\t});\n" +
                "                       \n" +
                "   </script>\n" +
                "\n" +
                "\n" +
                "   <body>\n" +
                "\n" +
                "      <ul class=\"FY\">\n" +
                "         <li>1. ELEMAN</li>\n" +
                "         <li>2. ELEMAN</li>\n" +
                "         <li>3. ELEMAN</li>\n" +
                "         <li>4. ELEMAN</li>\n" +
                "      </ul>\n" +
                "\n" +
                "      <div id=\"alan\"> Bu alan yok olacak ..</div>\n" +
                "\n" +
                "   </body>\n" +
                "\n" +
                "\n" +
                "\n" +
                "5- Trim ile Boşluk Kaldırma  \n" +
                "\n" +
                "\n" +
                "* Bir girdi alanımız olsun \n" +
                "* Bu alanın boş bırakılmasını ve boşluk elemanını kabul etmemeliyiz\n" +
                "\n" +
                " \n" +
                "   <script type=\"text/javascript\" src=\"/jQueryEğitimi/js/jquery-3.3.1.min.js\"></script>\n" +
                "   <script type=\"text/javascript\">\n" +
                "               \n" +
                "      $(function(){\n" +
                "         $(\"button\").click(function(){\n" +
                "            var deger = $(\"input[name=deger]\").val();\n" +
                "            deger = $.trim(deger);\n" +
                "                    \n" +
                "            if(!deger){\n" +
                "               alert(\"Boş Bırakmayınız!\");\n" +
                "            }\n" +
                "         });\n" +
                "\n" +
                "      });\n" +
                "                       \n" +
                "   </script>\n" +
                "\n" +
                "   <body>\n" +
                "      <input type=\"text\" name=\"deger\"/>\n" +
                "\t\t<button>Tıkla</button>  \n" +
                "   </body>\n" +
                "\n" +
                "\n" +
                "6- Live ve Append Metodu  \n" +
                "\n" +
                "\n" +
                "* Normalde sayfaya sonradan dahil edilen alanlar için metodlar çalışmaz\n" +
                "* Diyelim ki bir butona görev verdik , butona tıklandığında yeni bir buton oluşacak\n" +
                "* Bu yeni oluşan butona tıklandığında yine yeni bir buton oluşmayacaktır \n" +
                "* Bu görevi sağlamak için yeni yeni elemana da görevin üstlendirilmesi için Live kullanılır\n" +
                "* live metodunun içinde click , mouseover gibi fonksiyonlar ve bunların içinde de sınıf atama ,silme\n" +
                "\n" +
                "\t<script type=\"text/javascript\">\n" +
                "      $(function(){\n" +
                "         $(\"button\").live(\"click\",function(){\n" +
                "            $(this).after('<button>Bana da Tıkla</button>')\n" +
                "         });\n" +
                "         \n" +
                "\t\t\t$(\"p\").live({\n" +
                "            click: function(){\n" +
                "               $(this).after('<p>Buna da Tıkla</p>');\n" +
                "            },\n" +
                "                    \n" +
                "\t\t\t\tmouseover: function(){\n" +
                "               $(this).addClass(\"deneme\");\n" +
                "            },\n" +
                "           \n" +
                "            mouseout: function(){\n" +
                "               $(this).removeClass(\"deneme\");\n" +
                "            }\n" +
                "         });\n" +
                "\n" +
                "         $(\"a\").click(function(){\n" +
                "            $(\"div#FY\").append(\"<div>Burası Yeni Div</div>\");\n" +
                "         });\n" +
                "      });\n" +
                "                       \n" +
                "   </script>\n" +
                "\n" +
                "   <style>\n" +
                "      p.deneme{background-color: yellow}\n" +
                "   </style>\n" +
                "\n" +
                "\n" +
                "   <body>\n" +
                "      <button>Tıkla</button>\n" +
                "      <p class=\"deneme\">Yazı</p>\n" +
                "      <a href=\"\">Hadi Buna da Tıkla</a>\n" +
                "      <div id=\"FY\"></div> \n" +
                "    </body>\n" +
                " \n" +
                "\n" +
                "7- Last Filtresi \n" +
                "\n" +
                "\n" +
                "* Elimizde bir liste olsun \n" +
                "* Bu listenn son elemanına bir css bileşeni uygulamak istiyoruz\n" +
                "* Adından da anlaşılacağı gibi son elemanı bulmak için last metodu kullanılmalı \n" +
                "\n" +
                "\n" +
                "\t<script type=\"text/javascript\">  \n" +
                "\n" +
                "      $(function(){\n" +
                "         $(\"ul#FY li:last a\").css(\"color\",\"red\");\n" +
                "\t\t});\n" +
                "                       \n" +
                "   </script>\n" +
                "\n" +
                "\t<ul id=\"FY\">\n" +
                "      <li><a href=\"#\">1. Tab</a></li>\n" +
                "      <li><a href=\"#\">2. Tab</a></li>\n" +
                "      <li><a href=\"#\">3. Tab</a></li>\n" +
                "   </ul>\n" +
                "\n" +
                "\n" +
                "8- GetJSON Fonksiyonu\n" +
                "\n" +
                "\n" +
                "* Bu metod JSON formatındaki verileri almaya ve işlemeye yarar \n" +
                "* Örnek olarak facebook un graphlarını kullanabiliriz \n" +
                "\n" +
                "   <script type=\"text/javascript\" src=\"/jQueryEğitimi/js/jquery-3.3.1.min.js\"></script>\n" +
                "   <script type=\"text/javascript\">\n" +
                "               \n" +
                "      $(function(){\n" +
                "         $.getJSON(\"http://graph.facebook.com/furkanyildiz\" , function(veri){\n" +
                "            $(\"#sonuc\").html('<strong>Kullanıcı Adı : </strong>' + veri.username + '<br/></strong>Kullanıcı Linki : </strong><a href=\"'+veri.link+'\">'+veri.link+'</a>'); \n" +
                "\t\t\t});\n" +
                "      });\n" +
                "                       \n" +
                "   </script>\n" +
                "\n" +
                "   <body>\n" +
                "      <div id=\"sonuc\">Yükleniyor...</div>\n" +
                "   </body>\n" +
                "\n" +
                "\n" +
                "9- Each Döngü Metodu\n" +
                "\n" +
                "\n" +
                "* Kullanışlı bir yapısı vardır \n" +
                "* Bir liste üzerinde örnek yapalım\n" +
                "* Liste elemanlarında gezinip index numaralarını kullanı tekrar isimlendirme yapalım\n" +
                "\n" +
                "   <script type=\"text/javascript\" src=\"/jQueryEğitimi/js/jquery-3.3.1.min.js\"></script>\n" +
                "   <script type=\"text/javascript\">\n" +
                "               \n" +
                "      $(function(){\n" +
                "         $(\"ul#liste li\").each(function(index, element){\n" +
                "         \t$(this).text(\"Li -\" + index);\n" +
                "      \t});  \n" +
                "      });\n" +
                "                       \n" +
                "   </script>\n" +
                "\n" +
                "   <body>\n" +
                "      <ul id=\"liste\">\n" +
                "      \t<li><a href=\"#\"> 1. Tab </a></li>\n" +
                "         <li><a href=\"#\"> 2. Tab </a></li>\n" +
                "         <li><a href=\"#\"> 3. Tab </a></li>\n" +
                "         <li><a href=\"#\"> 4. Tab </a></li>\n" +
                "      </ul>\n" +
                "   </body>\n" +
                "\n" +
                "\n" +
                "10- Remove \tMetodu \n" +
                "\n" +
                "\n" +
                "* Hide metodundan farkı kaynaktan komple silmesidir\n" +
                "* Metodu çalıştırdıktan sonra kaynak kodu incelediğimizde o alanı göremeyiz\n" +
                "\n" +
                "\n" +
                "11- Toggle Metodu\n" +
                "\n" +
                "\n" +
                "* Hide metodundan farkı gizlendiğinde alanını işgal etmemesi\n" +
                "* Alan gizlendiğinde altındaki elementler onun yerine kayar\n" +
                "\n" +
                "\t<script type=\"text/javascript\">\n" +
                "         \n" +
                "\t   $(function(){\t\n" +
                "\t\t\t$(\"button\").click(function(){\n" +
                "\t\t\t\t$(\"div.yazi\").toggle();\n" +
                "\t  \t\t });\n" +
                "\t   });\n" +
                "                       \n" +
                "   </script>\n" +
                "\n" +
                "\t<body>\n" +
                "      <div class=\"yazi\"> Gizlenecek Yazıdır... </div>\n" +
                "\t\t<button> Göster/Gizle </button>\n" +
                "   </body>\n" +
                "\n" +
                "\n" +
                "12- Slide Metodu\n" +
                "\n" +
                "\n" +
                "* Slide metodu içinde slideUp,slideDown,slideToggle alt metodları vardır \n" +
                "* Genelde slideToggle kullanılır\n" +
                "* Bunun normal Toggle dan farkı gizlenip açılırken saniye atayarak yavaş yavaş gerçekleştirilir \n" +
                "* Açık/Kapalı şeklinde switch gibi davranır\n" +
                "\n" +
                "\t<script type=\"text/javascript\">\n" +
                "               \n" +
                "\t   $(function(){ \t\n" +
                "\t\t\t$(\"button\").click(function(){\n" +
                "\t\t\t\t$(\"div.yazi\").slideToggle(100);\n" +
                "\t  \t\t });\n" +
                "\t   });\n" +
                "                       \n" +
                "   </script>\n" +
                "\n" +
                "\t<body>\n" +
                "      <div class=\"yazi\"> Gizlenecek Yazıdır... </div>\n" +
                "\t\t<button> Göster/Gizle </button>\n" +
                "   </body>\n" +
                "\n" +
                "\n" +
                "13- Hover Metodu\n" +
                "\n" +
                "\n" +
                "* Seçtiğimiz bir elementin üzerinde mouse ile geldiğimizde farklı bir işlem yapabilmemizi sağlar\n" +
                "* İki tane yazı oluşturalım \n" +
                "* Birini seçip onun üzerine geldiğimizde diğerini kaybedelim\n" +
                "* Tabi mouse üzerinden çekildiğinde yazı geri gelmeli\n" +
                "\n" +
                "\t<script type=\"text/javascript\">\n" +
                "               \n" +
                "\t   $(function(){\n" +
                "\t\t\t$(\"yazi1\").hover(function(){\n" +
                "\t\t\t\t$(\"div.yazi2\").hide();\n" +
                "\t  \t\t }, function(){\n" +
                "\t\t\t\t$(\"div.yazi2\").show();\n" +
                "\t\t\t});\n" +
                "\t   });\n" +
                "                       \n" +
                "   </script>\n" +
                "\n" +
                "\n" +
                "\t<body>\n" +
                "      <div class=\"yazi1\"> Bu yazının üzerine gel.. </div>\n" +
                "      <div class=\"yazi2\"> Bu yazı gizlensin.. </div>\n" +
                "   </body>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "14- Size Metodu\n" +
                "\n" +
                "\n" +
                "* JavaScriptteki length metodunun aynısıdır\n" +
                "* Bir elementten nesneden document içinde kaç tane olduğunu hesaplayabiliriz\n" +
                "\n" +
                "\t<script type=\"text/javascript\">\n" +
                "               \n" +
                "\t   $(function(){    \t\n" +
                "\t\t\tvar toplamDiv = $(\"div\").size();\n" +
                "\t\t\talert(toplamDiv);\n" +
                "\t   });\n" +
                "                       \n" +
                "   </script>\n" +
                "\n" +
                "\n" +
                "\t<body>\n" +
                "      <div class=\"yazi1\"> yazı1 </div>\n" +
                "      <div class=\"yazi2\"> yazı2 </div>\n" +
                "   </body>\n" +
                "\n" +
                "\n" +
                "\n" +
                "15- Fade Metodu\n" +
                "\n" +
                "\n" +
                "* Toggle veya hide dan tek farkı kararıp gizlenmesi veya açılmasıdır \n" +
                "* FadeOut , fadeIn , fadeTo , fadeToggle alt metodları vardır \n" +
                "* Genelde açılıp kapanması için fadeToggle kullanılır \n" +
                "* FadeTo kullanılıp içine opacity yazılırsa tamamen kaybolmaz \n" +
                "\n" +
                "\n" +
                "\t<script type=\"text/javascript\">\n" +
                "               \n" +
                "\t   $(function(){  \t\n" +
                "\t\t\t$(\"button\").click(function(){\n" +
                "\t\t\t\t$(\"div.yazi\").fadeToggle();\n" +
                "\t  \t\t });\n" +
                "\t   });\n" +
                "                       \n" +
                "   </script>\n" +
                "\n" +
                "\n" +
                "\t<body>\n" +
                "      <div class=\"yazi\">  Yazı  </div>\n" +
                "\t\t<button> TIKLA </button>\n" +
                "   </body>\n" +
                "\t\n" +
                "\n" +
                "16- Eq filtresi ve Eq Metodu\n" +
                "\n" +
                "\n" +
                "* :eq girdiğimiz indis değerine sahip nesneyi seçer\n" +
                "* Alt alta dizili li lerden 3. yü seçmek için li:eq(2) diyebiliriz\n" +
                "\n" +
                "\n" +
                "\t<script type=\"text/javascript\">\n" +
                "               \n" +
                "\t   $(function(){\t\n" +
                "\t\t\t$ ( \" ul  li : eq ( 2 ) \" ) . css(\" background-color \" , \" green \");\n" +
                "\t\t\t// Aynı şeyi metoduyla da yapabiliriz \n" +
                "\t\t\t$ ( \" ul li \" ) . eq(4) . css (\"background-color\" , \" green \");\n" +
                "\t   });\n" +
                "                       \n" +
                "   </script>\n" +
                "\n" +
                "\t<body>\n" +
                "      <ul>\n" +
                "\t\t\t<li> liste elemanı 1 </li>\n" +
                "\t\t\t<li> liste elemanı 2 </li>\n" +
                "\t\t\t<li> liste elemanı 3 </li>\n" +
                "\t\t</ul>\n" +
                "   </body>\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "17- Animate Metodu \n" +
                "\n" +
                "\n" +
                "* Elimizde belli bir width , height  ve margin değerleri olan divimiz olsun \n" +
                "* Bu değerleri animate ile animasyon şeklinde değiştirebiliriz \n" +
                "* Bu değişikler için belli bir zaman aralığı da koyabiliriz \n" +
                "\n" +
                "\n" +
                "\t<script type=\"text/javascript\">\n" +
                "               \n" +
                "\t   $(function(){\t\n" +
                "\t\t\t$(\".yazi\").animate({\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\"width\" : \"300px\" ,\n" +
                "\n" +
                "\t\t\t}, 2000).animate({\n" +
                "\n" +
                "\t\t\t\t\"height\" : \"300px\" ,\n" +
                "\n" +
                "\t\t\t}, 2000).animate({\n" +
                "\n" +
                "\t\t\t\t\"marginTop\" : \"300px\" ,\n" +
                "\n" +
                "\t\t\t}, 2000)\n" +
                "\t   \n" +
                "\t   });\n" +
                "                       \n" +
                "   </script>\n" +
                "\n" +
                "\t<style type=\"text/css\">\n" +
                "\t\tdiv.yazi {\n" +
                "\t\t\tpadding : 20px ;\n" +
                "\t\t\tborder : 5px solid #aaa ;\n" +
                "\t\t\tmargin-bottom : 10px ;\n" +
                "\t\t\tcursor : pinter ;\n" +
                "\t\t}\n" +
                "\t</style>\n" +
                "\n" +
                "\n" +
                "\t<body>\n" +
                "      <div class=\"yazi\">  Yazı  </div>\n" +
                "   </body>\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "18- Parent Metodu\n" +
                "\n" +
                "\n" +
                "* Seçilen nesnenin bir üst nesnesini yani parentını bulmamıza yarar  \n" +
                "* Liste elemanının içerisine button koyalım\n" +
                "* Butona tıkladığımız nesnenin listesi komple yok olacak \n" +
                "\n" +
                "\t<script type=\"text/javascript\">      \n" +
                "\n" +
                "\t   $(function(){ \t\n" +
                "\t\t\t$(\"button\").click(function(){\n" +
                "\t\t\t\t$(this).parent().remove();\n" +
                "\t\t\t\t// butonuna bastığım li yok oldu\n" +
                "\t\t\t});\n" +
                "\t   });\n" +
                "                       \n" +
                "   </script>\n" +
                "\n" +
                "\t<body>\n" +
                "      <ul>\n" +
                "\t\t\t<li> liste elemanı 1  \n" +
                "\t\t\t\t<button> Kaldır </button> \n" +
                "\t\t\t</li>\n" +
                "\n" +
                "\t\t\t<li> liste elemanı 2  \n" +
                "\t\t\t\t<button> Kaldır </button> \n" +
                "\t\t\t</li>\n" +
                "\n" +
                "\t\t\t<li> liste elemanı 3  \n" +
                "\t\t\t\t<button> Kaldır </button> \n" +
                "\t\t\t</li>\n" +
                "\n" +
                "\t\t</ul>\n" +
                "\t</body>\n" +
                "\n" +
                "\n" +
                "\n" +
                "19- Serialize Metodu\n" +
                "\n" +
                "\n" +
                "* Bir form alanımız olduğunu düşünelim \n" +
                "* Bu alana girilen verileri belli bir formatta alabilmek için kullanırız\n" +
                "* Butona bastığımızda id sine formdaki veriler  gelsin\n" +
                "\n" +
                "\t<script type=\"text/javascript\">\n" +
                "               \n" +
                "\t   $(function(){\t\n" +
                "\t\t\t$(\"button\").click(function(e){\n" +
                "\t\t\t\tvar deger = $(\"form#form1\").serialize();\n" +
                "\t\t\t\talert(deger);\n" +
                "\t\t\t});\n" +
                "\t   });\n" +
                "                       \n" +
                "   </script>\n" +
                "\n" +
                "\n" +
                "\t<body>\n" +
                "\n" +
                "\t<form action = \" \"    id = \"form1\">\n" +
                "\t\t<table>\n" +
                "\t\t\t<tr>\n" +
                "\t\t\t\t<td> Kullanıcı Adı :</td>\n" +
                "\t\t\t\t<td> <input type =\"text\" name=\"kadi\" /> </td>\t\n" +
                "\t\t\t</tr>\n" +
                "\n" +
                "\t\t\t<tr>\n" +
                "\t\t\t\t<td> E-Posta :</td>\n" +
                "\t\t\t\t<td>  <input type =\"text\" name=\"eposta\" /></td>\t\n" +
                "\t\t\t</tr>\n" +
                "\t\t\n" +
                "\t\t\t<tr>\n" +
                "\t\t\t\t<td> Şifre :</td>\t\n" +
                "\t\t\t\t<td>  <input type =\"password\" name=\"sifre\" /></td>\n" +
                "\t\t\t</tr>\n" +
                "\n" +
                "\t\t\t<tr>\n" +
                "\t\t\t\t<td> Cinsiyet :</td>\t\n" +
                "\t\t\t\t<td>\n" +
                "\n" +
                "\t\t\t\t\t <select name=\"cinsiyet\">  \n" +
                "\t\t\t\t\t\t<option value = \"Erkek\"> Erkek </option> \n" +
                "\t\t\t\t\t\t<option value = \"Kadın\"> Kadın </option>\n" +
                "\t\t\t\t\t</select>\n" +
                "\n" +
                "\t\t\t\t</td>\n" +
                "\t\t\t</tr>\n" +
                "\n" +
                "\t\t\t<tr>\n" +
                "\t\t\t\t<td> </td>\t\n" +
                "\t\t\t\t<td> <button> Kayıt Ol </button></td>\n" +
                "\t\t\t</tr>\n" +
                "\t\t</table>\n" +
                "\t</form>\n" +
                "\n" +
                "\t</body>\n" +
                "\n" +
                "\n" +
                "20- HasClass Metodu\n" +
                "\n" +
                "\n" +
                "* İçerisine girdiğimiz sınıfın olup olmadığını kontrol eden bir metoddur \n" +
                "\n" +
                "\t<script type=\"text/javascript\">\n" +
                "   \n" +
                "\t   $(function(){\n" +
                "\t\t\tif($(\"div\").hasClass(\"yazi\")){\n" +
                "\t\t\t\talert(\" Aranılan Class Divler İçerisinde Bulunuyor ... \");\t\t\t\n" +
                "\t\t\t}\n" +
                "\t   });\n" +
                "                       \n" +
                "   </script>\n" +
                "\n" +
                "\n" +
                "\t<body>\n" +
                "      <div class=\"yazi\">  Yazı  </div>\n" +
                "   </body>\n" +
                "\t\n" +
                "\n" +
                "21- Change Metodu\n" +
                "\n" +
                "\n" +
                "* İki önceki örnekte formumuzun içinde selector vardı\n" +
                "* İçinde kadın ve erkek seçenekleri bulunuyordu \n" +
                "* Mesela orada seçeneklerde değişiklik yaptığımızda bunu change metoduyla yakalayabiliriz \n" +
                "* Ona benzer bir örneği şehirlerle yapalım \n" +
                "* Değerdeğiştiğinde yeni eğeri alert edelim\n" +
                "\n" +
                "\n" +
                "\t<script type=\"text/javascript\">\n" +
                "               \n" +
                "\t   $(function(){\n" +
                "\t\t\t$(\"select\").change(function(e){\n" +
                "\t\t\t\tvar deger = $(this).val();\n" +
                "\t\t\t\talert(deger);\t\t\t\n" +
                "\t\t\t});\n" +
                "\t   });\n" +
                "                       \n" +
                "   </script>\n" +
                "\n" +
                "\t<body>\n" +
                "\t<form action = \" \"    id = \"form1\">\n" +
                "\t\t<table>\n" +
                "\t\t\t<tr>\n" +
                "\t\t\t\t<td> Cinsiyet :</td>\t\n" +
                "\t\t\t\t<td>\n" +
                "\t\t\t\t\t <select name=\"şehirler\">  \n" +
                "\t\t\t\t\t\t<option value = \"İstanbul\"> İstanbul </option> \n" +
                "\t\t\t\t\t\t<option value = \"Ankara\"> Ankara </option>\n" +
                "\t\t\t\t\t\t<option value = \"İzmir\"> İzmir </option> \n" +
                "\t\t\t\t\t\t<option value = \"Adana\"> Adana </option>\n" +
                "\t\t\t\t\t\t<option value = \"Mersin\"> Mersin </option> \n" +
                "\t\t\t\t\t\t<option value = \"Kütahya\"> Kütahya </option>\n" +
                "\t\t\t\t\t</select>\n" +
                "\t\t\t\t</td>\n" +
                "\t\t\t</tr>\n" +
                "\t\t</table>\n" +
                "\t</form>\n" +
                "\t</body>\n" +
                "\n" +
                "\n" +
                "22- Html Metodu\n" +
                "\n" +
                "\n" +
                "* Seçtiğimiz nesnelerin değerlerini almamızı sağlar\n" +
                "* Html metodu form elemanları hariç tüm elemanlardan değer almamızı sağlar\n" +
                "* Bir div içerisinde yazılanları html bloklarıyla beraber almak istiyor olalım \n" +
                "\n" +
                "\t<script type=\"text/javascript\">\n" +
                "\t   $(function(){\n" +
                "\t\t\tvar deger = $('#div').html();\n" +
                "\t\t\talert(deger);\n" +
                "\t   });   \n" +
                "   </script>\n" +
                "\n" +
                "\n" +
                "\t<div id='divimiz' class='fy'>\n" +
                "\t\tbu <strong> deneme </strong> yazısı\n" +
                "\t</div> \n" +
                "\n" +
                "\n" +
                "23- Text Metodu  \n" +
                "\n" +
                "\n" +
                "* Html ve Text'in farkı text metodunda html kodlarının alınmamasıdır\n" +
                "* Bunun aynısını text() metoduyla yapacak olsaydık  ;\n" +
                "\n" +
                "<strong> ve </strong html tagları olduğu için görünmeyeceklerdi\n" +
                "\n" +
                "\n" +
                "24- Val Metodu  \n" +
                "\n" +
                "\n" +
                "* Val metodu ile yalnızca form elemanlarının değerlerini alabiliriz\n" +
                "* Butona tıklandığında input içerisindeki veriyi yazdıralım \n" +
                "\n" +
                "\t$(\"button\").click(function(e) {\n" +
                "\t\talert($(\"input\").val());\n" +
                "\t});\n" +
                "\n" +
                "\n" +
                "25- ToggleClass Metodu \n" +
                "\n" +
                "\n" +
                "* Elimizde iki tane farklı özelliklere sahip class olsun \n" +
                "* Divimiz bunlardan birinin özelliğine sahip iken üzerine tıkladığımızda\n" +
                "diğer classın özelliklerine bürünsün isteyelim \n" +
                "\n" +
                "\t<style> \n" +
                "\t\t.class1 {background : green }\n" +
                "\t\t.class2 {background : blue }\n" +
                "\t</style>\n" +
                "\n" +
                "\t<script>\t\n" +
                "\t\t$(function(){\n" +
                "\t\t\t$(\"#divimiz\").click(function(e){\n" +
                "\t\t\t\t$(this).toggleClass(\"class2\");\n" +
                "\t\t\t});\n" +
                "\t\t});\n" +
                "\t</script>\n" +
                "\n" +
                "\t<body>\n" +
                "\t\t<div class=\"class1\"> Toggle Metodu Uygulanacak </div>\n" +
                "\t</body>\n" +
                "\n" +
                "\n" +
                "26- Prepend Metodu \n" +
                "\n" +
                "\n" +
                "* Bir elementin başına bir nesne eklemek istediğimizde kullanırız\n" +
                "* Append metodu ile sonuna ekleme yapıyorduk\n" +
                "\n" +
                "\t$(\"#divimiz\").prepend('<button>Tıkla</button>');\n" +
                "\n" +
                "\n" +
                "27- Focus Metodu \n" +
                "\n" +
                "\n" +
                "* Focus odaklanmak demektir \n" +
                "* Input alanlarında imlecin otomatik olarak kutuya gelmesi için kullanılabilir\n" +
                "* Hemen örnek kodumuzu yazalım \n" +
                "\n" +
                "\t$(\"input[name=kelime]\").focus(function(){\n" +
                "\t\talert(\" Odaklanıldı \");\n" +
                "\t});\n" +
                "\n" +
                "\t<input type=\"text\" name=\"kelime\"/>\n" +
                "\n" +
                " \n" +
                "28- Clone Metodu \n" +
                "\n" +
                "\n" +
                "* Bir nesnenin birebir aynısının yaratılmasını sağlar\n" +
                "* Bir divimizin hemen ardına aynı divimizi clonelayalım\n" +
                "\n" +
                "\tvar cloneDiv = $(\"#div\").clone();\n" +
                "\t$(\"#div\").after(cloneDiv);\n" +
                "\n" +
                "\n" +
                "29- Next Metodu \n" +
                "\n" +
                "\n" +
                "* Seçilen nesneden sonraki nesne üzerinde işlem yapılmasını sağlar\n" +
                "* Genelde nesnemizden sonraki , tanımlayamadığımız , bilmediğimiz \n" +
                "nesnelerde bulunabilmek için kullanırız\n" +
                "* Elimizde bir input ve sonrasında paragraf nesnemiz olsun \n" +
                "* İnput üzerinden parafraftaki yazıyı gizleyelim\n" +
                "\n" +
                "\t$(\"input#input\").next().hide();\n" +
                "\n" +
                "* Nextin içerisinde özel olarak nesneyi de belirtebilirdik \n" +
                "\n" +
                "\t$(\"input#input\").next(\"p\").hide();\n" +
                "\n" +
                "\n" +
                "30- Double Click Metodu \n" +
                "\n" +
                "\n" +
                "* Mouseumuzun çift tıklanması durumunda bir olay yaratmak istiyorsak\n" +
                "bu metodu kullanabiliriz \n" +
                "* Örnek olarak bir divin arka plan rengini değiştirelim \n" +
                "\n" +
                "\t$(\"#divimiz\").dblclick( function() {\n" +
                "\t\t$(this).css(\"background\" , \"yellow\");\n" +
                "\t});\n" +
                "\n" +
                "\n" +
                "31- Checked Filtresi \n" +
                "\n" +
                "\n" +
                "* CheckBox objesini kontrol etmemize yarayan bir filtredir\n" +
                "* Elimizde bir checkbox tipinde bir input  ve buton olsun \n" +
                "* Butona tıklandığında boxı kontrol edip alert yayınlayalım\n" +
                "\n" +
                "\t$(button).click( funtion() {\n" +
                "\t\tvar deger = $(\"input [type=checkbox] : checked\").val();\n" +
                "\t\tif(deger){\n" +
                "\t\t\talert(\"Kutu işaretli ! \");\n" +
                "\t\t} else{\n" +
                "\t\t\talert(\"Lütfen kutuyu işaretleyin \");\n" +
                "\t\t}\n" +
                "\t});\n" +
                "\n" +
                "* Filtreyi uyguladığımız için işaretli olan kutu geldi \n" +
                "\n" +
                "\n" +
                "32- Width Metodu \n" +
                "\n" +
                "\n" +
                "* Bir divin genişliğini bulmak ve atamak için kullanılır \n" +
                "* Divimizin genişliğini yazdıralım \n" +
                "\n" +
                "\tvar genislik = $(\"#divimiz\").width();\n" +
                "\talert(genislik);\n" +
                "\n" +
                "* Şimdi de değiştirelim \n" +
                "\n" +
                "\t$(\"#divimiz\").width(300);\n" +
                "\tvar genislik = $(\"#divimiz\").width();\n" +
                "\talert(genislik);\n" +
                "\n" +
                "* Metodun içinde değeri vermemiz yeterli oldu\n" +
                "* Daha kısa şekilde yapalım bunu \n" +
                "\n" +
                "\tvar genislik = $(\"#divimiz\").width(300).width();\n" +
                "\talert(genislik);\n" +
                "\n" +
                "\n" +
                "33- Height Metodu \n" +
                "\n" +
                "\n" +
                "* Bir divin yüksekliğini bulmak ve atamak için kullanılır \n" +
                "* Divimizin yüksekliğini yazdıralım \n" +
                "\n" +
                "\tvar yükseklik = $(\"#divimiz\").height();\n" +
                "\talert(yükseklik);\n" +
                "\n" +
                "* Şimdi de değiştirelim \n" +
                "\n" +
                "\t$(\"#divimiz\").height(300);\n" +
                "\tvar yükseklik = $(\"#divimiz\").height();\n" +
                "\talert(yükseklik);\n" +
                "\n" +
                "* Metodun içinde değeri vermemiz yeterli oldu\n" +
                "* Daha kısa şekilde yapalım bunu \n" +
                "\n" +
                "\tvar yükseklik = $(\"#divimiz\").height(300).height();\n" +
                "\talert(yükseklik);\n" +
                "\n" +
                "\n" +
                "34- Load Metodu \n" +
                "\n" +
                "\n" +
                "* Seçtiğimiz nesne sayfada yüklendiğinde çalışır \n" +
                "* Örnek olarak bir resmi verip yüklendiğinde alert yazdıralım \n" +
                "\n" +
                "\t$(\".imgDosyası\").load( function() {\n" +
                "\t\talert(\" Resim Yüklendi \");\n" +
                "\t});\n" +
                "\n" +
                "\n" +
                "35- Error Metodu\n" +
                "\n" +
                "\n" +
                "* Sayfada hata tespitleri için kullanılır\n" +
                "* Mesela bir resim dosyası yüklenmesi sırasında hata oluştuysa\n" +
                "bu metodla kaynak alanını yazdırabiliriz\n" +
                "\n" +
                "\t$(\"img\").error( function () {\n" +
                "\t\talert(\" hata : \" , $(this).attr() );\n" +
                "\t}); \n" +
                "\n" +
                "\n" +
                "36- One Metodu\n" +
                "\n" +
                "\n" +
                "* Olayın yalnızca bir defa yapılmasını sağlar \n" +
                "* Sitede sade bir kez çalışmasını beklediğimiz bir durum varsa \n" +
                "rahatlıkla kullanabiliriz \n" +
                "* Toggle metoduyla butona her bastığımızda nesnede durum değiştirebiliyorduk\n" +
                "* Şimdi sadece bir defa değişsin istiyoruz diyelim \n" +
                "\n" +
                "\t$(\"buton\").one(\"click\" , function() {\n" +
                "\t\t$(\"p\").toggle();\n" +
                "\t});\n" +
                "\n" +
                "* Burada dikkat etmemiz gereken durum butonun click olayını parantez içine \n" +
                "almamızdır \n" +
                "\n" +
                "\n" +
                "37- Submit Metodu \n" +
                " \n" +
                "\n" +
                "* Form alanlarının submit edilmesinde kullanılan metoddur \n" +
                "* Form elemanlarının değerlerini de kontrol edebiliriz submit etmeden \n" +
                "* Bir butonumuz , form alanımız ve içinde input tagımız olsun \n" +
                "* Butona basıldığında input alanını kontrol edip submitleyelim \n" +
                "\n" +
                "\t$(\"buton\").click( function () {\n" +
                "\t\t$(\"form\").submit( function (){\n" +
                "\t\t\tvar deger = $(\"input\").val();\n" +
                "\t\t\t\n" +
                "\t\t\tif(deger === \" \" ){\n" +
                "\t\t\t\talert(\" BOŞ DEĞER \");\n" +
                "\t\t\t\treturn false;\t\t\t\n" +
                "\t\t\t}\n" +
                "\t\t\treturn true;\t\t\t\n" +
                "\t\t}).submit();\t\n" +
                "\t});\n" +
                "\n" +
                "\n" +
                "38- Ajax Post Metodu ile Veri Çekme \n" +
                " \n" +
                "\n" +
                "* Web sayfasına gönderilebilen istek türlerinden birini oluşturmaya\n" +
                "yarar \n" +
                "* Local yada gerçek sunucu kullanabiliriz \n" +
                "* Localde bir örnek yapalım \n" +
                "* Bunun apache ve php kurulumunuzun yapılmış olması gerekiyor \n" +
                "* Genel olarak xampp gibi bir araçla bunları kolaylıkla yapabilirsiniz \n" +
                "* Sunucu klasörümüzde JQuery adında bir dosya açalım \n" +
                "* Burada da bir index.html ve ajax.php dosyaları oluşturalım \n" +
                "* Html dosyamız içerisinde bir buton oluşturacağız \n" +
                "* Aynı zamanda jquery kodlarımızı script içerisinde burada yazıp\n" +
                "php dosyamızdan veri çekelim sonra da bir div nesnesine yazdıralım \n" +
                "* Php dosyamızda sadece echo \" örnek yazsın \"\n" +
                "* Php dosyası ; \n" +
                "\n" +
                "\t<?php \n" +
                "   \techo \" Örnek \" ;\n" +
                "\t?>\n" +
                "\n" +
                "* Html dosyası JQuery kısmı ;\n" +
                "\n" +
                "\t<script type=\"text/javascript\">\n" +
                "      $(function(){\n" +
                "\n" +
                "         $(\"button\").click(function(){\n" +
                "            $.post(\"ajax.php\", function(response){\n" +
                "               $(\"#sonuc\").html(response);\n" +
                "            });\n" +
                "         });\n" +
                "\n" +
                "      });\n" +
                "   </script>\n" +
                "\n" +
                "* Html dosyası kalan kısımlar ;\n" +
                "\n" +
                "\t<body>\n" +
                "   \t<button>AJAX İSTEĞİNİ BAŞLAT</button>\n" +
                "   \t<div id=\"sonuc\"> </div>\n" +
                "\t</body>\n" +
                "\n" +
                "* Burada butona tıkladığımızda post isteğimiz php dosyamıza gitti\n" +
                "* Verileri response halinde aldık \n" +
                "* En son sonuc divimize atadık\n" +
                "\n" +
                "\n" +
                "39- Ajax Post Metodu ile Veri Yazma \n" +
                " \n" +
                "\n" +
                "* Öncelikle php dosyamızı düzenleyip post metoduyla aldıklarımızı \n" +
                "bir değişkene atayalım \n" +
                "* Sonra da değişkeni echoya atalım \n" +
                "* Html dosyamıza da postta göndermek istediğimiz verileri gireceğimiz\n" +
                "bir input alanı oluşturalım\n" +
                "* Post metodunda fonksiyondan önce göndereceğimiz veriyi { } içerisinde\n" +
                "girmeyi unutmayalım  \n" +
                "\n" +
                "* Php dosyası güncel hali ;\n" +
                "\n" +
                "\t<?php \n" +
                "\t\t$q = $_POST[\"q\"];\n" +
                "   \techo $q;\n" +
                "\t?>\n" +
                "\n" +
                "* Html dosyamızda jquery kısmı güncel hali ;\n" +
                "\n" +
                "\t<script type=\"text/javascript\">\n" +
                "   \n" +
                "      $(function(){\n" +
                "         \n" +
                "         $(\"button\").click(function(){\n" +
                "            var q = $(\"input[name=q]\").val();\n" +
                "            $.post(\"ajax.php\",{\"q \":q} ,function(response){\n" +
                "               $(\"#sonuc\").html(response);\n" +
                "            });\n" +
                "\n" +
                "         });\n" +
                "\n" +
                "      });\n" +
                "   \n" +
                "   </script>\n" +
                "\n" +
                "* Html dosyamızda kalan kısımlar  ;   \n" +
                "\n" +
                "\t<body>\n" +
                "   \t<input type=\"text\" name=\"q\"/>\n" +
                "   \t<button>AJAX İSTEĞİNİ BAŞLAT</button>\n" +
                "   \t<div id=\"sonuc\"> </div>\n" +
                "\t</body>\n" +
                "\n" +
                " \n" +
                "40- Ajax Get Metodu\n" +
                " \n" +
                "\n" +
                "* Post metodundan bir farkı yoktur \n" +
                "* Aynı işlemleri yaptırmak için post yazan alanları get ile\n" +
                "değiştirebiliriz \n" +
                "* Farklı olan tek şey veri iletişimi yöntemidir \n" +
                "* Dikkat etmemiz gereken nokta şudur ki verileri nasıl hangi \n" +
                "metodla gönderiyorsak  o metodla almalıyız \n" +
                "\n" +
                "\n" +
                "41- Ajax Metodu \n" +
                "\n" +
                "\n" +
                "* Post ve Get dışında bir de genel bir ajax metodu bulunuyor\n" +
                "* Bir örnekle veri gönderip response dinleyelim \n" +
                "\n" +
                "\t$ajax({\n" +
                "\t\turl: \"ajax.php\",\n" +
                "\t\ttype: \"POST\",\n" +
                "\t\tdata: {\"kullaniciAdi\" : \"FY\" , \"parola\" : \"123\"},\n" +
                "\t\tdataType: \"json\",\n" +
                "\n" +
                "\t\tsuccess: function(response){\n" +
                "\t\t\talert(\"Başarılı İstek : \",response);\n" +
                "\t\t},\n" +
                "\n" +
                "\t\terror : function(response){\n" +
                "\t\t\talert(\"Başarısız İstek : \",response);\n" +
                "\t\t},\n" +
                "\n" +
                "\t\tstatusCode {\n" +
                "\t\t\t404 : function(){\n" +
                "\t\t\t\talert(\"Dosya Bulunamadı..\");\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t});\n" +
                "\n" +
                "* Bu kısmı özetleyecek olursak ajax metodu içerisinde \n" +
                "genel olarak sunucu adresini url içinde , veri alışveriş şeklini type \n" +
                "içerisinde , verilerimizi  datada , gönderdiğimiz veya aldığımız verinin\n" +
                "tipini ise dataType içerisinde yazarız \n" +
                "* Son olarak sunucunun bize gönderdiği cevabı da tabi bir callback şeklinde \n" +
                "fonksiyon içinde alırız \n" +
                "* Örnek olması için bunu success metodu içerisinde gösterdik \n" +
                "* Bunun anlamı ajax isteğinin başarılı olması durumunda yapılacaklar manasına\n" +
                "gelmektedir \n" +
                "* Bu response u istediğimiz gibi kullanabiliriz \n" +
                "* success dışında error metodu da bulunuyor \n" +
                "* İsteğin başarısız olduğu durumu kontrol etmek istiyorsak kullanabiliriz\n" +
                "* statusCode ile hata koduna göre işlem yapmamız örnekte olduğu gibi mümkün hale \n" +
                "geliyor\n" +
                "\n" +
                "\n" +
                "42- Stop Metodu \n" +
                "\n" +
                "\n" +
                "* Çalışan bir metodu durdurmak için kullanılır \n" +
                "* Örnek olarak bir toggle olayı çalıştıran butona ard arda hızlıca \n" +
                "tıklarsan mouse u buton üzerinden çektiğimizde toggle olayı çalışmaya\n" +
                "devam eder \n" +
                "* Bu tip aksiliklerin önüne stop metoduyla geçebiliriz\n" +
                "* İki tane divimiz olsun birinin classı 'ac' diğerinin 'kutu' olsun\n" +
                "* ac divine tıkladığımızda kutu divine slideToggle uygulansın\n" +
                "* Ama belirttiğimiz aksiliğin önüne geçelim \n" +
                "\n" +
                "\t$(\"div.ac\").click(function(){\n" +
                "\t\t\t$(\"div.kutu\").stop().slideToggle();\n" +
                "\t});\n" +
                "\n" +
                "\n" +
                "43- :Contains Filtresi\n" +
                "\n" +
                "\n" +
                "* İçerisine girdiğimiz kelimenin nesne içinde olup olmadığını kontrol\n" +
                "eden filtredir \n" +
                "* Bir liste oluşturup içine meyve isimleri yazalım\n" +
                "* Sonra da bu listede elma kelimelerini bulup arka plan renklerini\n" +
                "değiştirelim\n" +
                "\n" +
                "\t<ul class=\"filtreMeselesi\"> \n" +
                "\t\t<li>Elma</li>\n" +
                "\t\t<li>Vişne</li>\n" +
                "\t\t<li>Armut</li>\n" +
                "\t</ul>\n" +
                "\n" +
                "* Bu kısım liste alanımız ve class olarak filtreMeselesi verdik\n" +
                "* Şimdi jquery kodlarımızı yazalım \n" +
                "\n" +
                "\t$(\"ul.filtreMeselesi li:contains('Elma')\").css(\"color\",\"green\");\n" +
                "\n" +
                "\n" +
                "44- isNumeric Metodu\n" +
                "\n" +
                "\n" +
                "* Verinin sayısal olup olmadığını kontrol eden metoddur \n" +
                "* Name'i 'sayi' olan input alanındaki veriyi kontrol edelim\n" +
                "\n" +
                "\t$(\"#btn\").click(function(){\n" +
                "\t\tvar sayi = $(\"input[name=sayi]\").val();\n" +
                "\t\tif($.isNumeric(sayi)){\n" +
                "\t\t\talert(\"Girdiğiniz veri nümeriktir\");\n" +
                "\t\t}\n" +
                "\t})"));

        // Add some sample items.
        for (int i = 0; i < eduList.size(); i++) {
            addItem(createDummyItem(eduList.get(i).id,eduList.get(i).eduName,eduList.get(i).eduDocument));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(String position , String eduName , String eduDocument) {
        return new DummyItem(String.valueOf(position),' '+ eduName , makeDetails(eduName,eduDocument));
    }

    private static String makeDetails(String eduName, String eduDocument) {
        StringBuilder builder = new StringBuilder();

        builder.append(eduDocument);

        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String eduName;
        public final String eduDocument;


        public DummyItem(String id, String eduName , String eduDocument) {
            this.id = id;
            this.eduName = eduName;
            this.eduDocument = eduDocument;
        }

        @Override
        public String toString() {
            return eduName;
        }
    }
}
