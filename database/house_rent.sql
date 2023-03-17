-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 17, 2023 at 02:56 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `house_rent`
--

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `st_id` int(10) NOT NULL,
  `st_name` varchar(50) NOT NULL,
  `st_add` varchar(100) NOT NULL,
  `st_contact` varchar(20) NOT NULL,
  `st_email` int(20) NOT NULL,
  `st_status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`st_id`, `st_name`, `st_add`, `st_contact`, `st_email`, `st_status`) VALUES
(1, 'Carl Jake TUmampo', 'dasuga III lutopan Toled, city, Cebu', '0943921334', 0, 'single');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_customer`
--

CREATE TABLE `tbl_customer` (
  `t_id` int(20) NOT NULL,
  `t_name` varchar(50) NOT NULL,
  `t_address` varchar(100) NOT NULL,
  `t_gender` varchar(10) NOT NULL,
  `t_age` varchar(10) NOT NULL,
  `t_status` varchar(10) NOT NULL,
  `t_contact` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_customer`
--

INSERT INTO `tbl_customer` (`t_id`, `t_name`, `t_address`, `t_gender`, `t_age`, `t_status`, `t_contact`) VALUES
(1, 'Carl Jake Tumampo', 'Dasugra III, Luropan, Toledo City, Cebu', 'Male', '21', 'complicate', '09058078359'),
(2, 'bensoy oros', 'Mayana,Naga city, Cebu', 'Male', '21', 'single', '09058078351'),
(3, 'Wency V. Sismar', 'Dasuga II, Lutopan, Toledo City, Cebu', 'Male', '22', 'single', '09058078352'),
(4, 'nicoleamante', 'lutopan', 'female', '20', 'married', '09452416822');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_rooms`
--

CREATE TABLE `tbl_rooms` (
  `r_id` int(20) NOT NULL,
  `r_prise` int(11) NOT NULL,
  `r_status` int(11) NOT NULL,
  `r_space` int(11) NOT NULL,
  `r_number` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`st_id`);

--
-- Indexes for table `tbl_customer`
--
ALTER TABLE `tbl_customer`
  ADD PRIMARY KEY (`t_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `st_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tbl_customer`
--
ALTER TABLE `tbl_customer`
  MODIFY `t_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
