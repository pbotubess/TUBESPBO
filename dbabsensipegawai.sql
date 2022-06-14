-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 14, 2022 at 06:29 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbabsensipegawai`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(10) NOT NULL,
  `password` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `tblabsen`
--

CREATE TABLE `tblabsen` (
  `no` int(5) NOT NULL,
  `idpegawai` varchar(10) NOT NULL,
  `izin` varchar(4) NOT NULL,
  `tanggal` date NOT NULL,
  `keterangan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblabsen`
--

INSERT INTO `tblabsen` (`no`, `idpegawai`, `izin`, `tanggal`, `keterangan`) VALUES
(19, '11211001', 'Cuti', '2022-06-14', 'hiling');

-- --------------------------------------------------------

--
-- Table structure for table `tbljabatan`
--

CREATE TABLE `tbljabatan` (
  `idJabatan` varchar(3) NOT NULL,
  `namajabatan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbljabatan`
--

INSERT INTO `tbljabatan` (`idJabatan`, `namajabatan`) VALUES
('B01', 'Manajer Pemasaran'),
('B02', 'Manajer IT'),
('B03', 'Manajer Keuangan'),
('B04', 'Manajer HRD'),
('B05', 'Manajer Produksi'),
('C01', 'Staff IT'),
('C02', 'Staff Keuangan'),
('C03', 'Staff Pemasaran'),
('C04', 'Staff HRD'),
('C05', 'Staff Produksi'),
('D01', 'Office Boy'),
('D02', 'Office Girl');

-- --------------------------------------------------------

--
-- Table structure for table `tbljam`
--

CREATE TABLE `tbljam` (
  `id_jam` varchar(3) NOT NULL,
  `jam_masuk_mulai` time NOT NULL,
  `jam_kerja_mulai` time NOT NULL,
  `jam_kerja_selesai` time NOT NULL,
  `jam_keluar_selesai` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbljam`
--

INSERT INTO `tbljam` (`id_jam`, `jam_masuk_mulai`, `jam_kerja_mulai`, `jam_kerja_selesai`, `jam_keluar_selesai`) VALUES
('1', '07:30:00', '12:12:00', '12:15:00', '15:59:59'),
('2', '15:30:00', '16:00:00', '23:30:00', '23:59:59'),
('3', '23:30:00', '00:00:00', '07:30:00', '07:59:59'),
('D', '07:00:00', '08:00:00', '17:00:00', '17:59:59');

-- --------------------------------------------------------

--
-- Table structure for table `tblkehadiran`
--

CREATE TABLE `tblkehadiran` (
  `no_rec` mediumint(10) NOT NULL,
  `idpegawai` varchar(20) NOT NULL,
  `tanggal` date NOT NULL,
  `jmasuk` time DEFAULT NULL,
  `jkeluar` time DEFAULT NULL,
  `id_jam` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblkehadiran`
--

INSERT INTO `tblkehadiran` (`no_rec`, `idpegawai`, `tanggal`, `jmasuk`, `jkeluar`, `id_jam`) VALUES
(67, '11211064', '2022-06-14', '12:10:12', '12:19:36', '1');

-- --------------------------------------------------------

--
-- Table structure for table `tblpegawai`
--

CREATE TABLE `tblpegawai` (
  `idpegawai` varchar(10) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `jabatan` varchar(3) NOT NULL,
  `foto` varchar(20) NOT NULL,
  `id_jam` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblpegawai`
--

INSERT INTO `tblpegawai` (`idpegawai`, `nama`, `jabatan`, `foto`, `id_jam`) VALUES
('11211001', 'Dimas Ali', 'B01', 'avatar_07', '1'),
('11211064', 'Maulana', 'B02', 'avatar_01.jpg', '1'),
('11211072', 'Tirzah', 'B03', 'avatar_04..jpg', '1'),
('11211076', 'Nia', 'C01', 'avatar_03.jpg', '1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `tblabsen`
--
ALTER TABLE `tblabsen`
  ADD PRIMARY KEY (`no`),
  ADD KEY `idpegawai` (`idpegawai`);

--
-- Indexes for table `tbljabatan`
--
ALTER TABLE `tbljabatan`
  ADD PRIMARY KEY (`idJabatan`);

--
-- Indexes for table `tbljam`
--
ALTER TABLE `tbljam`
  ADD PRIMARY KEY (`id_jam`);

--
-- Indexes for table `tblkehadiran`
--
ALTER TABLE `tblkehadiran`
  ADD PRIMARY KEY (`no_rec`),
  ADD KEY `id pegawai di tbl kehadiran` (`idpegawai`),
  ADD KEY `id_jam` (`id_jam`);

--
-- Indexes for table `tblpegawai`
--
ALTER TABLE `tblpegawai`
  ADD PRIMARY KEY (`idpegawai`),
  ADD KEY `jabatan` (`jabatan`),
  ADD KEY `id_jam` (`id_jam`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tblabsen`
--
ALTER TABLE `tblabsen`
  MODIFY `no` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `tblkehadiran`
--
ALTER TABLE `tblkehadiran`
  MODIFY `no_rec` mediumint(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=68;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tblabsen`
--
ALTER TABLE `tblabsen`
  ADD CONSTRAINT `idpegawai di absen` FOREIGN KEY (`idpegawai`) REFERENCES `tblpegawai` (`idpegawai`);

--
-- Constraints for table `tblkehadiran`
--
ALTER TABLE `tblkehadiran`
  ADD CONSTRAINT `id pegawai di tbl kehadiran` FOREIGN KEY (`idpegawai`) REFERENCES `tblpegawai` (`idpegawai`),
  ADD CONSTRAINT `jam di kehadiran` FOREIGN KEY (`id_jam`) REFERENCES `tbljam` (`id_jam`);

--
-- Constraints for table `tblpegawai`
--
ALTER TABLE `tblpegawai`
  ADD CONSTRAINT `tblpegawai_ibfk_1` FOREIGN KEY (`id_jam`) REFERENCES `tbljam` (`id_jam`),
  ADD CONSTRAINT `tblpegawai_ibfk_2` FOREIGN KEY (`jabatan`) REFERENCES `tbljabatan` (`idJabatan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
