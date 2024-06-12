-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 12, 2024 at 10:55 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kelompok6_2`
--

-- --------------------------------------------------------

--
-- Table structure for table `kondisi_finansial`
--

CREATE TABLE `kondisi_finansial` (
  `id` int(11) NOT NULL,
  `income_Sblm_Covid` varchar(255) NOT NULL,
  `penurunan` varchar(255) DEFAULT NULL,
  `penurunan_lain` varchar(255) DEFAULT NULL,
  `peningkatan` varchar(255) DEFAULT NULL,
  `peningkatan_lain` varchar(255) DEFAULT NULL,
  `upaya_peningkatan` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `kondisi_finansial`
--

INSERT INTO `kondisi_finansial` (`id`, `income_Sblm_Covid`, `penurunan`, `penurunan_lain`, `peningkatan`, `peningkatan_lain`, `upaya_peningkatan`) VALUES
(3, 'Menurun', '<= 20%', '18', '21 - 40%', '25', 'Penambahan modal kerja');

-- --------------------------------------------------------

--
-- Table structure for table `perusahaan`
--

CREATE TABLE `perusahaan` (
  `id_perusahaan` int(11) NOT NULL,
  `nama_usaha` varchar(255) NOT NULL,
  `provinsi` varchar(100) NOT NULL,
  `kota` varchar(100) NOT NULL,
  `produk` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `produk_lain` varchar(100) NOT NULL,
  `kat_usaha` varchar(100) NOT NULL,
  `omset` varchar(50) DEFAULT NULL,
  `jml_Pegawai_Sblm` int(11) NOT NULL,
  `jml_Pegawai_Skrg` int(11) NOT NULL,
  `operasi` varchar(215) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `perusahaan`
--

INSERT INTO `perusahaan` (`id_perusahaan`, `nama_usaha`, `provinsi`, `kota`, `produk`, `produk_lain`, `kat_usaha`, `omset`, `jml_Pegawai_Sblm`, `jml_Pegawai_Skrg`, `operasi`) VALUES
(2, 'cobaa', '12', '12', 'Beras', 'padi', 'Pertanian, Peternakan, Perkebunan, Kehutanan dan Perikanan', '1000000', 100, 80, 'Masih beroperasi seperti biasa'),
(3, 'cobaLagi', '11', '11', 'Buah', 'Apel', 'Pertanian, Peternakan, Perkebunan, Kehutanan dan Perikanan', '505050', 100, 70, 'Masih beroperasi seperti biasa'),
(4, 'coba2', '10', '10', 'cokelat', 'susu', 'Industri Pengolahan', '6000000', 60, 90, 'Beroperasi dengan penerapan WFH (remote atau teleworking ) untuk SEBAGIAN pegawai');

-- --------------------------------------------------------

--
-- Table structure for table `responden`
--

CREATE TABLE `responden` (
  `id_responden` int(11) NOT NULL,
  `jabatan` varchar(255) NOT NULL,
  `umur` int(11) NOT NULL,
  `jenis_kelamin` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `responden`
--

INSERT INTO `responden` (`id_responden`, `jabatan`, `umur`, `jenis_kelamin`) VALUES
(5, 'Pemilik', 30, 'Laki-Laki'),
(6, 'Pemilik', 32, 'Perempuan'),
(7, 'Bukan Pemilik', 30, 'Laki-Laki'),
(8, 'Bukan Pemilik', 20, 'Laki-Laki');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `email` varchar(100) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`email`, `username`, `password`) VALUES
('coba@gmail.com', 'coba', '1234'),
('nazlya@gmail.com', 'nazlya', 'nazlya');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kondisi_finansial`
--
ALTER TABLE `kondisi_finansial`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `perusahaan`
--
ALTER TABLE `perusahaan`
  ADD PRIMARY KEY (`id_perusahaan`);

--
-- Indexes for table `responden`
--
ALTER TABLE `responden`
  ADD PRIMARY KEY (`id_responden`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kondisi_finansial`
--
ALTER TABLE `kondisi_finansial`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `perusahaan`
--
ALTER TABLE `perusahaan`
  MODIFY `id_perusahaan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `responden`
--
ALTER TABLE `responden`
  MODIFY `id_responden` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
