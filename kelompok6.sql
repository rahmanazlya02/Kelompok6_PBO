-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 29, 2024 at 02:35 AM
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
-- Database: `kelompok6`
--

-- --------------------------------------------------------

--
-- Table structure for table `bloka`
--

CREATE TABLE `bloka` (
  `id_perusahaan` int(11) NOT NULL,
  `jabatan` varchar(255) NOT NULL,
  `jenis_kelamin` varchar(50) NOT NULL,
  `umur` int(4) NOT NULL,
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
-- Dumping data for table `bloka`
--

INSERT INTO `bloka` (`id_perusahaan`, `jabatan`, `jenis_kelamin`, `umur`, `nama_usaha`, `provinsi`, `kota`, `produk`, `produk_lain`, `kat_usaha`, `omset`, `jml_Pegawai_Sblm`, `jml_Pegawai_Skrg`, `operasi`) VALUES
(12, 'Bukan Pemilik', 'Laki-Laki', 20, 'aqua', '12', '12', 'akka', 'akak', 'Pertanian; Peternakan; Perkebunan; Kehutanan dan Perikanan', '899999', 99, 99, 'Masih beroperasi seperti biasa');

-- --------------------------------------------------------

--
-- Table structure for table `blokc`
--

CREATE TABLE `blokc` (
  `id_perusahaan` int(11) NOT NULL,
  `income_Sblm_Covid` varchar(255) NOT NULL,
  `penurunan` varchar(255) DEFAULT NULL,
  `penurunan_lain` varchar(255) DEFAULT NULL,
  `peningkatan` varchar(255) DEFAULT NULL,
  `peningkatan_lain` varchar(255) DEFAULT NULL,
  `upaya_peningkatan` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `blokc`
--

INSERT INTO `blokc` (`id_perusahaan`, `income_Sblm_Covid`, `penurunan`, `penurunan_lain`, `peningkatan`, `peningkatan_lain`, `upaya_peningkatan`) VALUES
(12, 'Menurun', '<= 20%', '25', '21 - 40%', '28', 'Peningkatan teknologi');

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
('admin@gmail.com', 'admin', 'admin'),
('coba@gmail.com', 'coba', '1234'),
('nazlya@gmail.com', 'nazlya', 'nazlya');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bloka`
--
ALTER TABLE `bloka`
  ADD PRIMARY KEY (`id_perusahaan`);

--
-- Indexes for table `blokc`
--
ALTER TABLE `blokc`
  ADD PRIMARY KEY (`id_perusahaan`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `blokc`
--
ALTER TABLE `blokc`
  ADD CONSTRAINT `blokc_ibfk_1` FOREIGN KEY (`id_perusahaan`) REFERENCES `bloka` (`id_perusahaan`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
