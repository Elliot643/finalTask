-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Oct 04, 2019 at 11:23 AM
-- Server version: 5.7.24
-- PHP Version: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rpgdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `character_class`
--

CREATE TABLE `character_class` (
  `class_id` int(11) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `race` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `character_class`
--

INSERT INTO `character_class` (`class_id`, `description`, `race`) VALUES
(1, 'This is a Nord', 'Nord'),
(2, 'This is an Argonian', 'Argonian'),
(3, 'This is a Redguard', 'Redguard'),
(4, 'This is a Bosmer', 'Bosmer'),
(5, 'This is an Imperial', 'Imperial');

-- --------------------------------------------------------

--
-- Table structure for table `game_character`
--

CREATE TABLE `game_character` (
  `id` int(11) NOT NULL,
  `class_id` int(11) DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `game_character`
--

INSERT INTO `game_character` (`id`, `class_id`, `level`, `user_id`) VALUES
(1, 1, 67, 4),
(2, 4, 75, 1),
(3, 2, 12, 2),
(4, 5, 95, 6),
(5, 1, 60, 6),
(6, 3, 55, 3);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `pw` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `pw`, `user_name`) VALUES
(1, 'jonasPw', 'Jonas'),
(2, 'password', 'Erik'),
(3, 'passw', 'Sven'),
(4, 'timspwtim', 'Tim'),
(6, 'bestPassword', 'Elliot');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `character_class`
--
ALTER TABLE `character_class`
  ADD PRIMARY KEY (`class_id`);

--
-- Indexes for table `game_character`
--
ALTER TABLE `game_character`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKn2kom57jdbwvtg14ddxrbcgpa` (`class_id`),
  ADD KEY `FKol997ufyapdiwdhupc48okq96` (`user_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `character_class`
--
ALTER TABLE `character_class`
  MODIFY `class_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `game_character`
--
ALTER TABLE `game_character`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
