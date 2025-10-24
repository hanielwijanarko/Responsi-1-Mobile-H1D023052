Nama    : Haniel Wijanarko
NIM     : H1D023052
Shift KRS : F
Shift Akhir : E

💻 Demo Aplikasi

Berikut adalah demonstrasi singkat mengenai fungsionalitas utama aplikasi:
![](DemoResponsi.gif)

🚀 Alur dan Arsitektur Aplikasi

Aplikasi dirancang dengan mengikuti prinsip arsitektur modern (seperti MVVM) untuk memastikan pemisahan tanggung jawab, kemudahan pengujian, dan manajemen data yang efisien.

1. Navigasi Pengguna

Awal Aplikasi: Pengguna disambut dengan Splash Screen sebelum diarahkan ke Menu Utama.
Menu Utama: Menyajikan opsi navigasi ke fitur-fitur utama: Sejarah Klub, Detail Pelatih, atau Daftar Pemain.

2. Proses Pengambilan Data Pemain (Arsitektur Reaktif)

Alur kerja ini secara spesifik berfokus pada pengambilan data Daftar Pemain:
Pemicu API: ViewModel bertindak sebagai perantara yang bertanggung jawab memicu Panggilan API.
Sumber Data: Data pemain diambil dari layanan eksternal terpercaya, yaitu football-data.org.
Pemrosesan Data: Setelah menerima Response JSON dari API, data mentah tersebut segera diproses.
Parsing GSON: Digunakan untuk mengonversi Response JSON menjadi objek data Kotlin yang terstruktur.
Manajemen Status: Objek data yang sudah terstruktur kemudian digunakan untuk memperbarui LiveData. Mekanisme ini memastikan bahwa Daftar Pemain pada antarmuka pengguna (UI) selalu menampilkan data terkini secara reaktif tanpa intervensi manual.
