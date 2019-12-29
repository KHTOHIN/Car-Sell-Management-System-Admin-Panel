-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 01, 2017 at 09:05 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `car sell management system`
--

-- --------------------------------------------------------

--
-- Table structure for table `car`
--

CREATE TABLE `car` (
  `car_id` int(225) NOT NULL,
  `car_name` varchar(225) NOT NULL,
  `car_model` varchar(225) NOT NULL,
  `car_type` varchar(225) NOT NULL,
  `year` int(225) NOT NULL,
  `price` int(225) NOT NULL,
  `quantity` int(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `car`
--

INSERT INTO `car` (`car_id`, `car_name`, `car_model`, `car_type`, `year`, `price`, `quantity`) VALUES
(1, 'Lamborghini', 'Aventador Sv', 'S', 2016, 200000000, 3),
(2, 'Ferrari', 'Enzo', 'S', 2016, 150000000, 4),
(3, 'McLaran', 'F1XP-5', 'S', 2016, 100000000, 3),
(4, 'Lamborghini', 'Egoista', 'S', 2016, 120000000, 5),
(5, 'Lamborghini', 'Huracan', 'S', 2016, 100000000, 3),
(6, 'Ferrari', 'Update', 'S', 2016, 200000000, 6),
(8, 'dfghjk', 'dfghjkl', 'D', 2016, 85236, 12),
(11, 'kjhgvfc', '74185', 'C', 2016, 200, 2);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(225) NOT NULL,
  `name` varchar(225) NOT NULL,
  `father_name` varchar(225) NOT NULL,
  `phone` varchar(225) NOT NULL,
  `category` varchar(225) NOT NULL,
  `birthdate` varchar(225) NOT NULL,
  `present_address` varchar(225) NOT NULL,
  `permanent_address` varchar(225) NOT NULL,
  `nid` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `name`, `father_name`, `phone`, `category`, `birthdate`, `present_address`, `permanent_address`, `nid`) VALUES
(1, 'Kawsar Hamid', 'Md. Abul Kashem Mia', '1750047354', 'MD', '27/09/1994', 'H:09,R:09,S:10,Uttara,Dhaka', 'H:09,R:09,S:10,Uttara,Dhaka', '19942569874125236548');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(225) NOT NULL,
  `name` varchar(225) NOT NULL,
  `father_name` varchar(225) NOT NULL,
  `phone` int(225) NOT NULL,
  `designation` varchar(225) NOT NULL,
  `birthdate` varchar(225) NOT NULL,
  `present_address` varchar(225) NOT NULL,
  `permanent_address` varchar(225) NOT NULL,
  `nid` int(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `name`, `father_name`, `phone`, `designation`, `birthdate`, `present_address`, `permanent_address`, `nid`) VALUES
(3, 'Kawsar Hamid', 'Md. Abul Kashem Mia', 1750047354, 'MD', '27/09/1994', 'H:09,R:09,S:10,Uttara,Dhaka', 'H:09,R:09,S:10,Uttara,Dhaka', 1992);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(225) NOT NULL,
  `password` varchar(225) NOT NULL,
  `name` varchar(225) NOT NULL,
  `phone` int(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`, `name`, `phone`) VALUES
('Nava', '12345', 'Farjana Amir Nava', 1772394398),
('Shadow', '123456', 'Ashraful Islam Khan', 1833000779),
('Tohin', '621511', 'Kawsar Hamid', 1625043011);

-- --------------------------------------------------------

--
-- Table structure for table `sell`
--

CREATE TABLE `sell` (
  `id` int(225) NOT NULL,
  `name` varchar(225) NOT NULL,
  `address` varchar(500) NOT NULL,
  `nid` int(225) NOT NULL,
  `age` int(225) NOT NULL,
  `car_id` int(225) NOT NULL,
  `type` varchar(225) NOT NULL,
  `color` varchar(225) NOT NULL,
  `chases_no` varchar(225) NOT NULL,
  `price` int(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sell`
--

INSERT INTO `sell` (`id`, `name`, `address`, `nid`, `age`, `car_id`, `type`, `color`, `chases_no`, `price`) VALUES
(5, 'dfghj', 'gcxz', 85239, 25, 10, 'A', 'trrr', '7423', 8000),
(8, 'gfcx', 'fcx', 852369, 35, 7, 'S', 'red', '741852963', 2000),
(25, 'hgfd', 'bvc', 741258, 29, 1, 'C', 'off ', '4123', 8000000),
(52, 'jhvc', 'mnbv', 7458963, 105, 12, 'C', 'red', '4523365', 200),
(256, 'asdfgh', 'asdfghj', 2563, 25, 45, 'B', 'Off White', '741852963', 20000000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `car`
--
ALTER TABLE `car`
  ADD PRIMARY KEY (`car_id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `sell`
--
ALTER TABLE `sell`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `car`
--
ALTER TABLE `car`
  MODIFY `car_id` int(225) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
