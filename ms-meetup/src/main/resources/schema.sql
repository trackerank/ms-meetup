DROP TABLE IF EXISTS ketchup_event;
DROP TABLE IF EXISTS user_category;
DROP TABLE IF EXISTS user_details;
DROP TABLE IF EXISTS category;
DROP TABLE IF EXISTS location;
DROP TABLE IF EXISTS ms_group;

CREATE TABLE `category` (
  `category_id` INT NOT NULL AUTO_INCREMENT,
  `category_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`category_id`));
  
CREATE TABLE `location` (
  `location_id` INT NOT NULL AUTO_INCREMENT,
  `location_name` VARCHAR(45) NOT NULL,
  `location_desc` VARCHAR(45) NULL,
  PRIMARY KEY (`location_id`));  
  
CREATE TABLE `ms_group` (
  `group_id` INT NOT NULL AUTO_INCREMENT,
  `group_name` VARCHAR(45) NULL,
  `group_desc` VARCHAR(45) NULL,
  `created_by` VARCHAR(45) NULL,
  PRIMARY KEY (`group_id`));
  
  CREATE TABLE `user_details` (
  `user_id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(256) NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `email_id` VARCHAR(45) NOT NULL,
  `location_id` INT NOT NULL,
  PRIMARY KEY (`user_id`),
  CONSTRAINT `location_id`
    FOREIGN KEY (`location_id`)
    REFERENCES `location` (`location_id`));
    
CREATE TABLE `user_category` (
  `user_id` INT NOT NULL,
  `category_id` INT NOT NULL,
  CONSTRAINT `user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `user_details` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `category_id`
    FOREIGN KEY (`category_id`)
    REFERENCES `category` (`category_id`));
    
CREATE TABLE `ketchup_event` (
  `event_id` INT NOT NULL AUTO_INCREMENT,
  `event_name` VARCHAR(45) NOT NULL,
  `event_location` VARCHAR(45) NOT NULL,
  `event_start_time` DATETIME NOT NULL,
  `event_end_time` DATETIME NOT NULL,
  `event_desc` VARCHAR(45) NOT NULL,
  `status` VARCHAR(45) NOT NULL,
  `min_people` INT NOT NULL,
  `max_people` INT NOT NULL,
  `user_id` INT NOT NULL,
  `category_id` INT NOT NULL,
  `location_id` INT NOT NULL,
  PRIMARY KEY (`event_id`),
  CONSTRAINT `event_user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `user_details` (`user_id`),
  CONSTRAINT `event_category_id`
    FOREIGN KEY (`category_id`)
    REFERENCES `category` (`category_id`),
  CONSTRAINT `event_location_id`
    FOREIGN KEY (`location_id`)
    REFERENCES `location` (`location_id`));
